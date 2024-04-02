import java.util.List;
import org.w3c.dom.Node;

public class Tree {
  Node root; //Базовое поле от кудадерево начинает свой отсчёт
  //Классический обход дерева в глубину
  public boolean exist(int value){
    if(root != null){
      Node node = find (root, value);
      if(node != null){
        return true;
      }

    }
    return false;
  }
  private  Node find (Node node, int value){
    if(node.value == value){
      return node;
    }else {
      for (Node child : node.children) {
        Node result = find(child, value);
            if(result != null){
              return  result;
            }
      }
    }
    return null;
  }
    public class Node{
      int value;
      List<Node> children; //список детей
    }
}
