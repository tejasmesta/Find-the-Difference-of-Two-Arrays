class Solution {
    public List<List<Integer>> findDifference(int[] num1, int[] num2)
    {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        
        for(int i:num1)
        {
            s1.add(i);
        }
        
        for(int i:num2)
        {
            s2.add(i);
        }
        
        for(int i:num1)
        {
            if(!s2.contains(i) && l1.indexOf(i)==-1)
                l1.add(i);
        }
        
        for(int i:num2)
        {
            if(!s1.contains(i) && l2.indexOf(i)==-1)
                l2.add(i);
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        ans.add(l1);
        ans.add(l2);
        
        return ans;
    }
}
