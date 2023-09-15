public class TheBattle {
    OpFirst opFirst = new OpFirst();
    OpSecond opSecond = new OpSecond();

    public void battle() {
        boolean run = true;
        while (opFirst.state && opSecond.state) {
            if (run) {
                opFirst.getHit(opSecond.setHit());
                run = false;
            } else if (!run) ;
            {
                opSecond.getHit(opFirst.setHit());
                run = true;
            }
        }
        if (!opFirst.state) {
            System.out.println(opSecond.name + " победил");
        } else if (!opSecond.state) {
            System.out.println(opFirst.name  + " победил");
        }

    }
}
