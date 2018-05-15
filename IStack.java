public interface IStack {

    public void addPage(String hyperlink);
    public Node removePage();
    public Node backPage();
    public int size();
    public boolean isEmpty();

}
