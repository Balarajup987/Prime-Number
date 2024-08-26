public static int kthLargest(int n, int[] arr, int k) {
		// Write your code here
		PriorityQueue<Integer> pq1=new PriorityQueue<>();
		for(int i=0;i<k;i++){
			pq1.add(arr[i]);
		}
		for(int i=k;i<n;i++){
			if(arr[i]>pq1.peek()){
				pq1.poll();
				pq1.add(arr[i]);
			}
		}
		return pq1.peek();
	}
