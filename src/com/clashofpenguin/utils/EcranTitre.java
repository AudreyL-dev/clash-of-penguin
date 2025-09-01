package com.clashofpenguin.utils;

public class EcranTitre {
    // --- ANSI (désactivez en mettant USE_COLOR=false) ---
    private static final boolean USE_COLOR = true;
    private static final String RESET = USE_COLOR ? "\u001B[0m" : "";
    private static final String BOLD  = USE_COLOR ? "\u001B[1m" : "";
    private static final String CYAN  = USE_COLOR ? "\u001B[36m" : "";

    // --- Titre en ASCII art ---
    public static final String TITLE = BOLD + CYAN + """
            ██████╗██╗      █████╗ ███████╗██╗  ██╗        ██████╗ ██████╗     ██████╗ ███████╗ ███╗   ██╗ ██████╗ ██╗   ██╗██╗███╗   ██╗
           ██╔════╝██║     ██╔══██╗██╔════╝██║  ██║       ██╔═══██╗██╔═══╝     ██╔══██╗██╔════╝ ████╗  ██║██╔════╝ ██║   ██║██║████╗  ██║
           ██║     ██║     ███████║███████╗███████║       ██║   ██║██████╗     ██████╔╝█████╗   ██╔██╗ ██║██║  ███╗██║   ██║██║██╔██╗ ██║
           ██║     ██║     ██╔══██║╚════██║██╔══██║       ██║   ██║██╔═══╝     ██╔═══╝ ██╔══╝   ██║╚██╗██║██║   ██║██║   ██║██║██║ ██║██║
           ╚██████╗███████╗██║  ██║███████║██║  ██║       ╚██████╔╝██║         ██║     ███████╗ ██║ ╚████║╚██████╔╝████████║██║██║ ╚████║
            ╚═════╝╚══════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝        ╚═════╝ ╚═╝         ╚═╝     ╚══════╝ ╚═╝  ╚═══╝ ╚═════╝   ╚═════╝╚═╝╚═╝  ╚═══╝

                                                     🐧 ❄️  CLASH OF PENGUIN ❄️ 🐧
                                                     

                                               Le choc givré commence… Préparez vos sardines !
          """ + RESET;

    // Méthode pour afficher
    public static void showTitle() {
    	System.out.println();
        System.out.println(TITLE);
    }
}
