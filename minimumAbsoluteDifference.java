class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<ArrayList<Integer>> bigList = new ArrayList<>();
        Arrays.sort(arr);
        if(arr.length>4){
        int diff=arr[1]-arr[0];
        int start =arr[2];
        for(int i=3;i<arr.length;i++){
                 if(arr[i]-start=diff){
                    Array.list<Integer> list = new Arraylist<>();
                    list.add(arr[i],start);
                     bigList.add(list);
                     System.out.println(list);
                 }
        }
        }
       
return bigList;
    }
}
