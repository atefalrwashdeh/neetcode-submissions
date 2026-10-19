class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<Integer> set = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0].split("\\+")[0].replaceAll("\\.", "");
            String domain = parts[1];
            set.add((local + "@" + domain).hashCode());
        }
        return set.size();
    }
}