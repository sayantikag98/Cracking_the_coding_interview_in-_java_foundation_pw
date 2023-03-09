public class Lecture {
    public static void main(String[] args) {
        int[] ages = new int [4];
        ages[0] = 2;
        ages[1] = 3;
        System.out.println(ages[3]);

        float[] weights = new float [2];
        System.out.println(weights[0]);

        double[] weight = new double [3];
        System.out.println(weight[0]);

        String[] names = new String [3];
        System.out.println(names[0]);

        char[] ch = new char[3];
        System.out.println(ch[0]);

        // double dimensional array
        int[][] dd = new int [3][4];
        dd[0][0] = 1;
        System.out.println(dd[1][0]);

        int[][] demo = {{1,2}, {3,4}, {5,6}};
        System.out.println(demo[1][0]);

        System.out.println(demo[0].length);

        int[] demoAges = {15, 20, 25, 30, 35};

        for(int i = 0; i<demoAges.length; i++){
            System.out.print(demoAges[i]+" ");
        }
        System.out.println();
        for (int i: demoAges) {
            System.out.print(i+ " ");
        }
        System.out.println();

        int k = 0;
        while(k<demoAges.length){
            System.out.print(demoAges[k]+ " ");
            k++;
        }
        System.out.println();

        // traversing double dimensional array

        int[][] demoDDArray = {{2, 3}, {1, 4, 5}};
        for(int i = 0; i<demoDDArray.length; i++){
            for(int j = 0; j<demoDDArray[i].length; j++){
                System.out.print(demoDDArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
