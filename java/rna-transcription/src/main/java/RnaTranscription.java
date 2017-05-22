public class RnaTranscription {
    public String ofDna(String dnaString) { 
        char[] c = dnaString.toCharArray();
        for (int i = 0; i < c.length; i++) {
            c[i] = getComplement(c[i]);
        }
        return new String(c);
    }

    private char getComplement(char c) {
        switch (c) {
            case 'G': return 'C';
            case 'C': return 'G';
            case 'T': return 'A';
            case 'A': return 'U';
            default:
                throw new IllegalArgumentException(c + " is not a valid DNA nucleotide");
        }
    }
}
