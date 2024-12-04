import java.util.*;
class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
       List<Integer> result = new ArrayList<>();
        int i =0,j=0,k=0;
        while(i<arr1.size() && j<arr2.size() && k<arr3.size()){
            
            if (arr1.get(i).equals(arr2.get(j)) && arr2.get(j).equals(arr3.get(k))) {
                  if (result.isEmpty() || !result.get(result.size() - 1).equals(arr1.get(i))) {
                    result.add(arr1.get(i));
                }
               
                
                int common = arr1.get(i);
                while(i<arr1.size() && common == arr1.get(i)) i++;
                while(j<arr2.size() && common == arr2.get(j)) j++;
                while(k<arr3.size() && common == arr3.get(k)) k++;
            }else if(arr1.get(i)<arr2.get(j)){
                i++;
            }else if(arr2.get(j)<arr3.get(k)){
                j++;
            }else{
                k++;
            }
        }
        if(result.isEmpty()){
            result.add(-1);
        }
        return result;
    }
}