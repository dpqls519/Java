import java.util.Arrays;

public class SimpleHeap {
	int last = -1, MaxHeapSize = 4;
	int heap[] = new int[MaxHeapSize];

	private void resize() {
		MaxHeapSize *= 2;
		heap = Arrays.copyOf(heap, MaxHeapSize);
	}

	private void swap(int m, int n) {
		int temp = heap[m];
		heap[m] = heap[n];
		heap[n] = temp;
	}

	public void add(Integer data) {
		if (last + 1 == MaxHeapSize)
			resize();
		heap[++last] = data; // heap�� ������ ��� ���� ��ġ�� �� �ڷ� ����
		for (int child = last; child > 0;) { // ������ ��带 heapify-up
			int parent = (child - 1) / 2;
			if (heap[child] <= heap[parent])
				break; // �ִ������� �˻�
			swap(child, parent); // ���� �Ҹ��� �� ��ȯ
			child = parent;
		}
	}

	public int remove() {
		if (last < 0)
			throw new RuntimeException("heap empty");
		int data = heap[0]; // root ��� �ڷ� ����
		heap[0] = heap[last--]; // ������ ��� root�� �̵� & ũ�� 1 ����
		for (int parent = 0, child = 2 * parent + 1; child <= last; parent = child, child = 2 * parent + 1) { // root��
																												// heapify-down
			if (child < last && heap[child] < heap[child + 1])
				child++;
			if (heap[child] <= heap[parent])
				break;
			swap(child, parent);
		}
		return data;
	}

	@Override
	public String toString() {
		return Arrays.toString(heap);
	}
}