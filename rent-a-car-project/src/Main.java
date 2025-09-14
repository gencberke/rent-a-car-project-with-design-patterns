import controller.KiralamaController;
import data.repository.AracRepository;
import data.repository.KayitRepository;
import data.repository.MusteriRepository;
import service.KiralamaService;

public class Main {
    public static void main(String[] args) {

        // projemiz restAPI tarzı bir framework'e bağlı olmadığından her uygulamayı çalıştırdığımızda bunların 1 kez ayağa kalkması gerekiyor

        AracRepository aracRepo = new AracRepository();
        MusteriRepository musteriRepo = new MusteriRepository();
        KayitRepository kayitRepo = new KayitRepository();

        KiralamaService servis = new KiralamaService(aracRepo, musteriRepo, kayitRepo);
        KiralamaController controller = new KiralamaController(servis);

        controller.basla();
    }

}