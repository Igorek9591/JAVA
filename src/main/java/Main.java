import java.util.Scanner;

public class Main {
    
    /** 
     * @author Кириллов Игорь 8 группа 3 курс 
     * Интерфейс для показа возможностей
     */
    public static void main(String[] args) {
        var list = new List<Integer>();
        var action = 1;
        do {
            var tmp = new Scanner(System.in);
            System.out.println("Input command:");
            System.out.print("1: pushBack ");
            System.out.print("2: pushFront ");
            System.out.println("3: popBack  ");
            System.out.print("4: popFront ");
            System.out.print("5: insert    ");
            System.out.println("6: print     ");
            System.out.print("7: delete   ");
            System.out.print("8: get       ");
            System.out.println("0: exit  ");

            action = tmp.nextInt();

            switch (action) {
                case 1: {
                    System.out.println("Input value");
                    var i = tmp.nextInt();
                    list.pushBack(i);
                    break;
                }
                case 2: {
                    System.out.println("Input value");
                    var i = tmp.nextInt();
                    list.pushFront(i);
                    break;
                }
                case 3: {
                    list.popBack();
                    break;

                }
                case 4: {
                    list.popFront();
                    break;
                }
                case 5: {
                    System.out.println("Input position");
                    var position = tmp.nextInt();
                    System.out.println("Input value");
                    var value = tmp.nextInt();
                    list.insert(position, value);
                    break;
                }
                case 6: {
                    list.printList();
                    break;
                }
                case 7: {
                    System.out.println("Input position");
                    var position = tmp.nextInt();
                    list.delete(position);
                    break;
                }
                case 8: {
                    System.out.println("Input position");
                    var position = tmp.nextInt();
                    System.out.println(list.get(position));
                    break;
                }
                default: {
                }
            }

        } while (action != 0);
    }
}
