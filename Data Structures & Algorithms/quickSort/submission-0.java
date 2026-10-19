class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        return quickSortPairs(pairs, 0, pairs.size() - 1);
    }

    public List<Pair> quickSortPairs(List<Pair> pairs, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(pairs, start, end);
            quickSortPairs(pairs, start, pivotIndex - 1);
            quickSortPairs(pairs, pivotIndex + 1, end);
        }
        return pairs;
    }

    private int partition(List<Pair> pairs, int start, int end) {
        Pair pivot = pairs.get(end);
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (pairs.get(j).key < pivot.key) {
                i++;
                // swap pairs[i] and pairs[j]
                Pair temp = pairs.get(i);
                pairs.set(i, pairs.get(j));
                pairs.set(j, temp);
            }
        }
        // swap pairs[i + 1] and pairs[end] (or pivot)
        Pair temp = pairs.get(i + 1);
        pairs.set(i + 1, pairs.get(end));
        pairs.set(end, temp);
        return i + 1;
    }
}