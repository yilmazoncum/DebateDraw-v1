import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kac Salon : ");
        int roomNum = Integer.parseInt(sc.nextLine());

        CompleteTeamsDraw(roomNum);


        }




    static void CompleteTeamsDraw(int roomNum){

        Scanner sc = new Scanner(System.in);
        ArrayList<DebaterManager> debaters = new ArrayList<DebaterManager>();
        String[] positions = new String[]{"HA", "MA", "HK", "MK"};
        ArrayList<DebaterManager> jurors = new ArrayList<DebaterManager>();


        System.out.print("Chair Kurası Çekilecek mi ( E / H ) : ");
        String juryDecision = sc.nextLine();
        if(juryDecision.equals("e") || juryDecision.equals("E") || juryDecision.equals("evet")) {
            for (int i = 0; i < roomNum; i++) {
                System.out.print((i + 1) + ".Chair : ");
                jurors.add(new DebaterManager(sc.nextLine()));
            }
            Collections.shuffle(jurors);

        }

        for (int i = 0; i < (roomNum * 4); i++) {
            System.out.print((i + 1) + ".Takim : ");
            debaters.add(new DebaterManager(sc.nextLine()));
        }


        Collections.shuffle(debaters);

        for (int i = 0; i < roomNum; i++) {
            System.out.println();
            System.out.println((i + 1) + ".Salon : ");
            if (!jurors.isEmpty()){
                System.out.println(jurors.get(i).teamName + "(C)");

            }
            int positionsIndex = 0;
            for (int n = 0; n < 4; n++) {
                System.out.println(positions[positionsIndex] + " - " + debaters.get(n+(i*4)).teamName);
                positionsIndex++;
            }

        }
    }


















}


