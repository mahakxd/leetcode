class Solution {
    public int compareVersion(String version1, String version2) {
        String[] firstVersion = version1.split("\\.");
        String[] secondVersion = version2.split("\\.");

        int len = Math.max(firstVersion.length, secondVersion.length);

        for(int i = 0; i < len ; i++){
            Integer v1 = i < firstVersion.length ? Integer.parseInt(firstVersion[i]) : 0;
            Integer v2 = i < secondVersion.length ? Integer.parseInt(secondVersion[i]) : 0;
            
            int compare = v1.compareTo(v2);
            if(compare != 0){
                return compare;
            }
        }
        return 0;
    }
}