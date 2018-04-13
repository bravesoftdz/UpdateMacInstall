package updatemacinstall;

import java.io.IOException;

public class UpdateMacInstall {

    public static void main(String[] args) throws IOException {

        // x -> Forçado.
        // -IBCK -> Sem GUI.
        
        String processToKill = "ConectaBD.exe";
        String sourceLocation = "c:\\mac\\ConectaBD.rar";
        String destLocation = "c:\\Mac";
        
        try {
            Runtime.getRuntime().exec("taskkill /F /IM " + processToKill);
            Runtime.getRuntime().exec("\"C:\\Program Files\\WinRAR\\unrar.exe\" x -IBCK " + sourceLocation + "  *.* " + destLocation + " ");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
