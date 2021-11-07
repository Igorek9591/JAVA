import java.util.Objects;

class Node<T> {
    T data;
    Node<T> next;
   /** 
     * Звено списка (ключ и ссылка на следующий)
     */
    public Node(T key) {
        data = key;
        next = null;
    }
   
    
    /** 
     * @return String Вывод значений в виде string
     */
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    
    /** 
     * @param CompObj  Обьект с которым будет проведенно сравнение
     * @return boolean Результат сравнения
     */
    @Override
    public boolean equals(Object CompObj) {
        if (this == CompObj) return true;
        if (CompObj == null || getClass() != CompObj.getClass()) return false;
        Node<?> node = (Node<?>) CompObj;
        return Objects.equals(data, node.data) && Objects.equals(next, node.next);
    }

    

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }
}