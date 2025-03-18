package ihmsimple.app;

import ihmsimple.ctrl.Controller;
import ihmsimple.services.ServiceDevine;
import ihmsimple.views.View;

public class IhmSimple {

    /**
     * Méthode principale de l'application qui instancie les objets MVC et les relie
     * entre eux.
     * Voir le diagramme de séquence pour l'implémentation e cette méthode.
     * 
     * @param args arguments de la ligne de commande
     */
    public static void main(String[] args) {
        ServiceDevine refServiceDevine = new ServiceDevine();
        View refView = new View();
        Controller refCtrl = new Controller(2, refView, refServiceDevine);
        refCtrl.setRefServiceDevine(refServiceDevine);
        refCtrl.setRefView(refView);
        refView.setRefCtrl(refCtrl);
        refServiceDevine.setRefCtrl(null);
        refCtrl.start();
    }

}
