public class Heaps {
	public static String toString(int[] heap) {
		StringBuilder s = new StringBuilder();
		int enNivel = 1;
		int finNivel = 1;
		for (int i = 0; i < heap.length; i++) {
			s.append(heap[i]);

			if (i != heap.length -1)
				if (i == finNivel-1) {
					s.append("] [");
					enNivel *= 2;
					finNivel += enNivel;
				} else
					s.append(", ");
		}
		s.append("]");
		return "Heap: [" + s.toString() + " - size: " + heap.length;
	}

	/**
	 * @return -1 if the queue contains a MinHeap, +1 if it is a maxHeap, or = if its empty.
	 */
	public static int typeOfHeap(int [] data) {
		// TODO EJERCICIO 1
	}
	
	/** Sinks the element in the position p, assuming that v is a minHeap */
	private static void sink(int[] v, int p, int size) {
		// TODO EJERCICIO 2
	}

	/**C onverts an unsorted vector into a maxHeap.**/
	public static void maxHeapify (int[] v) {
		// TODO EJERCIO 3
	}
	
	/** Sorts the vector v using the heapsort algorithm **/
	static public void heapsort (int [] v) {
		// TODO EJERICIO 4
	}
}
