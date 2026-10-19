class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Node,Node>  map = new HashMap<>();
        return cloneDFS(map,node);
        
    }

    public Node cloneDFS(HashMap<Node,Node> map,Node node){
        if(map.containsKey(node)) return map.get(node);
        Node cloneNode = new Node(node.val);
        map.put(node, cloneNode);
        for(Node nei: node.neighbors){
            cloneNode.neighbors.add(cloneDFS(map, nei));
        }
        return cloneNode;
    }
}