package Pb1;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Clasa MainApp contine metode pentru citirea de date
 * despre perechi de numere dintr-un fisier JSON
 */
public class MainApp
{
    /**
     * Citeste o lista de perechi de numere dintr-un fisier JSON.
     * @return O lista de perechi de numere citite din fisier
     */
    public static List<PerecheNumere> citire()
    {
        try
        {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File("C:\\Users\\ghile\\IdeaProjects\\Laborator5Ghilezan\\src\\main\\resources\\perechi.json"), new TypeReference<List<PerecheNumere>>() {});
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
    /**
     * Metoda principala citeste perechile de numere din fisierul Json
     * si le afiseaza pe ecran.
     * @param args Argumentele liniei de comanda
     */
    public static void main(String[] args)
    {
        List<PerecheNumere> readPerechi = citire();
        System.out.println("Citire Perechi din JSON:");
        for (PerecheNumere pair : readPerechi)
        {
            System.out.println(pair);
        }
    }
}
