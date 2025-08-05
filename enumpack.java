

// public class enumpack {
//     public static void main(String[] args) {
//         enum days{
//             monday,tuesday,wednesday,thursday,friday,saturday,sunday
//         }
//         days today= days.monday;
//         System.out.println("today is:"+today);
//     }
    
// }

public class enumpack{
    public static void main(String[] args) {
        enum relation{
            son,dad,mom
        }
        relation rel=relation.son;

        switch(rel) {
            case son:
            System.out.println("son it is");
                break;
            case mom:
            System.out.println("mom it is");
            break;
            case dad:
            System.out.println("dad it is");
            default:
            System.out.println("no relation");
        }
    }
}
