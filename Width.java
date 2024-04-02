
import java.util.ArrayList;
import java.util.List;

public class Width {
Tree.Node root; //Базовое поле от куда дерево начинает свой отсчёт
  //Классический обход дерева в глубину
  public boolean exist(int value){
    if(root != null){
      Tree.Node node = find (root, value);
      if(node != null){
        return true;
      }

    }
    return false;
  }
  private Tree.Node find(Tree.Node root, int value) {
    List<Tree.Node> Line = new ArrayList<>();
    Line.add(root); //добовляем рут, так как мы начинаем работать с рута
    while (Line.size() > 0) { //пока существуют какие-то дети, мы будем работать
      List<Tree.Node> nextLine = new ArrayList<>();
      for (Tree.Node node : Line) {
        if (node.value == value) {
          return node;
        }
        nextLine.addAll(node.children);
      }
      List<Tree.Node> line = nextLine;
    }
    return null;
  }

  public class Node{
    int value;
    List<Tree.Node> children; //список детей
  }
}
