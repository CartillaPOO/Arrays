import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args)
    {
        int[][] A;
        int [] B;
        int[] C;
        int m,n;
        int pares, impares;
        String rta = "Resultados:\n\n";

        // Input
        m = Integer.parseInt(JOptionPane.showInputDialog("Número de filas:"));
        n = Integer.parseInt(JOptionPane.showInputDialog("Número de columnas:"));

        // Processing
        A = new int[m][n];

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                A[i][j] = (int)(Math.random()*9+1);
            }
        }

        // Contar pares e impares en A
        pares = 0;
        impares = 0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(A[i][j]%2==0)
                {
                    pares++;
                }
                else
                {
                    impares++;
                }
            }
        }

        // Inicializo los vectores B y C
        B = new int[pares];
        C = new int[impares];

        // Llenado de vectores B y C
        int iB = 0;
        int iC = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if (esPar(A[i][j]))
                {
                    B[iB] = A[i][j];
                    iB ++;
                }
                else
                {
                    C[iC] = A[i][j];
                    iC ++;
                }
            }
        }

        // Output
        rta = rta + "Matriz A:\n";
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                rta = rta + A [i][j] + " ";
            }
            rta = rta + "\n";
        }
        rta = rta + "\nVector B:\n";
        for(int i=0; i<B.length; i++)
        {
            rta = rta + B[i] + " ";
        }
        rta = rta + "\nVector C:\n";
        for(int i=0; i<C.length; i++)
        {
            rta = rta + C[i] + " ";
        }

        // Output
        JOptionPane.showMessageDialog(null, rta);
    }

    // Método auxiliar
    public static boolean esPar(int x)
    {
        if(x%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}