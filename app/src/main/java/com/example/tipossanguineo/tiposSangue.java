package com.example.tipossanguineo;



public class tiposSangue {
    public class TipoSangue {

        public String pesquisa(String n) {
            String tipo = "";
            switch (n) {
                case "A+":
                    // Pode receber doações de A+, A-, O+ e O-.
                    tipo = "Pode receber doações de:\n A+, A-,\n O+ e O-.";
                    break;
                case "A-":
                    // Pode receber doações de A- e O-.
                    tipo = "Pode receber doações de:\n A- e O-.";
                    break;
                case "B+":
                    // Pode receber doações de B+, B-, O+ e O-.
                    tipo = "Pode receber doações de:\n B+, B-,\n O+ e O-.";
                    break;
                case "B-":
                    // Pode receber doações de B- e O-.
                    tipo = "Pode receber doações de:\n B- \ne O-.";
                    break;
                case "AB+":
                    // Pode receber doações de A+, A-, B+, B-, O+ e O-.
                    tipo = "Pode receber doações de:\n A+, A-,\n B+, B-,\n O+ e O-.";
                    break;
                case "AB-":
                    // Pode receber doações de A-, B- e O-.
                    tipo = "Pode receber doações de:\n A-,\n B- \n e O-.";
                    break;
                case "O+":
                    // Pode receber doações de O+ e O-.
                    tipo = "Pode receber doações de:\n O+ e O-.";
                    break;
                case "O-":
                    // Pode receber doações de O-.
                    tipo = "Pode receber doações de:\n O-.";
                    break;
            }
            return tipo;
        }
    }
}
