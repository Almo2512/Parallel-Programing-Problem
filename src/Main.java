public class Main {
    public static void main(String[] args) {
        Mechaniker[] mechanikers = new Mechaniker[6];
        Schraubschlussel[] scshruapschlussels = new Schraubschlussel[mechanikers.length];

        for (int i = 0; i < scshruapschlussels.length; i++) {
            scshruapschlussels[i] = new Schraubschlussel();
        }

        for (int i = 0; i < mechanikers.length; i++) {
            Schraubschlussel leftSchraubschlussel = scshruapschlussels[i];
            Schraubschlussel rightSchraubschlussel = scshruapschlussels[(i + 1) % scshruapschlussels.length];

            mechanikers[i] = new Mechaniker(leftSchraubschlussel, rightSchraubschlussel);

            Thread t
                    = new Thread(mechanikers[i], "Mechaniker " + (i + 1));
            t.start();
        }
    }
}
