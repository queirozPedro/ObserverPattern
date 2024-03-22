public interface Subject {

    /**
     * O método de atachar observers, recebe um observer adiciona na lista
     * @param observer
     */
    public void attach(Observer observer);

    /**
     * Um método que remove um observer
     * @param observer
     */
    public void deattach(Observer observer);

    /**
     * Esse método é responsável por percorrer os observers e passar a atualização
     * dos dados
     */
    public void nofityAllObservers();
}
