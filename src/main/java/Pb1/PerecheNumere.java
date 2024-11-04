package Pb1;
/**
 * Clasa PerecheNumere reprezinta o pereche de numere intregi
 * si  diverse metode pentru a efectua operatii cu acestea
 */
public class PerecheNumere
{
    private int primul;
    private int alDoilea;
    /**
     * Constructor implicit
     */
    public PerecheNumere()
    {
    }
    /**
     * Constructor pentru a initializa o pereche de numere
     * cu valorile date.
     * @param primul Primul numar din pereche
     * @param alDoilea Al doilea numar din pereche
     */
    public PerecheNumere(int primul, int alDoilea)
    {
        this.primul = primul;
        this.alDoilea = alDoilea;
    }
    /**
     * Getter pentru primul numar.
     * @return Primul numar din pereche
     */
    public int getPrimul()
    {
        return primul;
    }
    /**
     * Setter pentru primul numar.
     * @param primul Primul numar din pereche
     */
    public void setPrimul(int primul)
    {
        this.primul = primul;
    }
    /**
     * Getter pentru al doilea numar.
     * @return Al doilea numar din pereche
     */
    public int getAlDoilea()
    {
        return alDoilea;
    }
    /**
     * Setter pentru al doilea numar.
     * @param alDoilea Al doilea numar din pereche
     */
    public void setAlDoilea(int alDoilea)
    {
        this.alDoilea = alDoilea;
    }
    /**
     * Verifica daca cele doua numere sunt consecutive in
     * sirul Fibonacci.
     * @return true daca sunt consecutive, false altfel
     */
    public boolean suntFibonacciConsecutive()
    {
        return EsteFibonacci(primul) && EsteFibonacci(alDoilea) && Math.abs(indiceFibonacci(primul) - indiceFibonacci(alDoilea)) == 1;
    }
    /**
     * Calculeaza indicele unui numar in sirul Fibonacci.
     * @param num Numarul a carui indice in sirul Fibonacci va fi calculat
     * @return Indicele numarului in sirul Fibonacci sau -1 daca nu este un numar Fibonacci
     */
    private int indiceFibonacci(int num) {
        int a = 0, b = 1, indice = 0;
        while (b < num) {
            int temp = a + b;
            a = b;
            b = temp;
            indice++;
        }
        if (b == num) {
            return indice + 1;
        } else {
            return -1;
        }
    }
    /**
     * Verifica daca un numar este parte din sirul Fibonacci.
     * @param num Numarul de verificat
     * @return true daca numarul este Fibonacci, false altfel
     */
    private boolean EsteFibonacci(int num)
    {
        int a = 0, b = 1;
        while (b < num) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == num;
    }

    /**
     * Calculeaza cel mai mic multiplu comun al celor doua numere.
     * @return Cel mai mic multiplu comun
     */
    public int CelMaiMicMultipluComun()
    {
        return (primul * alDoilea) / CelMaiMareDivizorComun(primul, alDoilea);
    }
    /**
     * Calculeaza cel mai mare divizor comun al doua numere.
     * @param a Primul numar
     * @param b Al doilea numar
     * @return Cel mai mare divizor comun
     */
    private int CelMaiMareDivizorComun(int a, int b)
    {
        if (b == 0)
        {
            return a;
        } else
        {
            return CelMaiMareDivizorComun(b, a % b);
        }
    }
    /**
     * Verifica daca suma cifrelor celor doua numere este egala.
     * @return true daca suma cifrelor este egala, false altfel
     */
    public boolean sumaCifrelorEsteEgala()
    {
        return sumaCifrelor(primul) == sumaCifrelor(alDoilea);
    }
    /**
     * Calculeaza suma cifrelor unui numar.
     * @param num Numarul pentru care se calculeaza suma cifrelor
     * @return Suma cifrelor numarului
     */
    private int sumaCifrelor(int num)
    {
        int suma = 0;
        while (num != 0)
        {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
    /**
     * Verifica daca cele doua numere au un numar egal de cifre pare.
     * @return true daca numarul de cifre pare este egal, false altfel
     */
    public boolean numarCifrePareEgale()
    {
        return numarCifrePare(primul) == numarCifrePare(alDoilea);
    }
    /**
     * Calculeaza numarul de cifre pare dintr-un numar.
     * @param num Numarul pentru care se calculeaza numarul de cifre pare
     * @return Numarul de cifre pare
     */
    private int numarCifrePare(int num)
    {
        int count = 0;
        while (num != 0) {
            if ((num % 10) % 2 == 0)
            {
                count++;
            }
            num /= 10;
        }
        return count;
    }
    /**
     * @return Reprezentarea perechii de numere
     */
    @Override
    public String toString()
    {
        return "PerecheNumere{" + "primul=" + primul + ", alDoilea=" + alDoilea + '}';
    }
}
