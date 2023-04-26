import java.util.*;
public class Q26 {
    public ArrayList<String> dfs(tree node) {
        // TODO:
        ArrayList<String> treeList = new ArrayList<>();
        treeList.add(node.value);

        if(node.getChildrenNode() != null){
            for (int i = 0; i < node.getChildrenNode().size(); i++) {
                ArrayList<String> subList = dfs(node.getChildrenNode().get(i));
                treeList.addAll(subList);
            }
        }
        return treeList;
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
