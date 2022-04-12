import java.util.Arrays;

//Christopher Florance and Julian Matthews
//2022-02-25
//APCS
//Liturgy Class
public class Liturgy
{
    public int randHymn1;
    public int randHymn2;
    public int randHymn3;
    public int [] liturgyArr;
    public Liturgy()
    {
        Hymn hymn1 = new Hymn();
        Hymn hymn2 = new Hymn();
        Hymn hymn3 = new Hymn();

        this.randHymn1 = hymn1.hymnNumber;
        this.randHymn2 = hymn2.hymnNumber;
        this.randHymn3 = hymn3.hymnNumber;
        this.liturgyArr = getLiturgyArr();
    }

    public int [] getLiturgyArr()
    {
        int [] x = createArrayFromNumber(randHymn1);
        int [] y = createArrayFromNumber(randHymn2);
        int [] z = createArrayFromNumber(randHymn3);
        int [] liturgyArr = combineArrays(x,y,z);
        return liturgyArr;
    }


    private static int[] createArrayFromNumber(int number) {
        String str = number + "";
        char[] chArr = str.toCharArray();
        int[] arr = new int[chArr.length];
        for (int i = 0; i< chArr.length; i++) {
            arr[i] = Character.getNumericValue(chArr[i]);
        }
        return arr;
    }
    private static int[] combineArrays(int[] arr1, int[] arr2, int[] arr3) {

        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int arr3Length = arr3.length;

        int[] newArr1 = new int[arr1Length + arr2Length];
        System.arraycopy(arr1, 0, newArr1, 0, arr1Length);
        System.arraycopy(arr2, 0, newArr1, arr1Length, arr2Length);

        int [] newArr2 = new int[newArr1.length + arr3Length];
        System.arraycopy(newArr1, 0, newArr2, 0, newArr1.length);
        System.arraycopy(arr3, 0, newArr2, newArr1.length, arr3Length);

        return newArr2;
    }//z
}

