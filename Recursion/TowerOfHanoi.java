
import java.util.Scanner;
public class TowerOfHanoi {
    public static void main(String[] args) {
        int n_disk;
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter no of disks: ");
        n_disk=obj.nextInt();
        char source='s',temp='t',destination='d';
        TOH(n_disk,source,temp,destination);

    }    
    static void TOH(int n_disk,char source,char temp,char destination){
        if(n_disk>1){
            TOH(n_disk-1,source,destination,temp);
            System.out.println(n_disk+" Disk "+source+" ->"+destination);
            TOH(n_disk-1,temp,source,destination);
        }
    }
}
