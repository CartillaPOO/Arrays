import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args)
    {
        //
        // Declaración de variables
        //

        int[] calorias = new int[7]; // 7 indica el número de elementos del arreglo
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        double promedio = 0;
        int auxcalorias = 0;
        String auxdias = new String();
        String tabla = new String();

        // Input
        for (int i = 0; i < calorias.length; i++)
        {
            calorias[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las calorías del día " + dias[i]));
            promedio += calorias[i];
        }

        // Processing
        promedio /= calorias.length;

        for (int i = 0; i < calorias.length; i++) // Se ordena el arreglo de menor a mayor
        {
            for (int j = 0; j < calorias.length - 1; j++)
            {
                if (calorias[j] > calorias[j + 1])
                {
                    auxcalorias = calorias[j];
                    auxdias = dias[j];
                    
                    // Ambas listas se ordenan de la misma manera para que no se pierda la relación entre los días y las calorías
                    dias[j] = dias[j + 1];
                    calorias[j] = calorias[j + 1];
                    dias[j + 1] = auxdias;
                    calorias[j + 1] = auxcalorias;
                }
            }
        }

        for(int i = 0; i<dias.length; i++)
        {
            tabla += dias[i] + ": " + calorias[i] + "\n"; // Se crea una tabla con los días y las calorías previamente ordenadas
        }
        
        // Output
        JOptionPane.showMessageDialog(null, "Tabla ascendente de calorías:\n" + tabla + "\nPromedio de calorías: " + promedio);

        System.exit(0);
    }
}
