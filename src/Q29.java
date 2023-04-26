import java.util.ArrayList;

public class Q29 {
    public int tiling(int num) {
        // TODO:
        ArrayList<Integer> contTile = new ArrayList<>();
        contTile.add(0);
        contTile.add(1);
        contTile.add(2);
        return aux(num,contTile);
    }

    public int aux(int num, ArrayList<Integer> arrayList){
        if (arrayList.size() > num) return arrayList.get(num);

        arrayList.add(aux(num-1,arrayList)+aux(num-2,arrayList));
        return arrayList.get(num);

    }

}
