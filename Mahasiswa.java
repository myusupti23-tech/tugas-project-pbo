public class Mahasiswa<N, NM, C> {
    private N nim;
    private NM name;
    private C clas;

    public void setNim(N nim) {
        this.nim = nim;
    }

    public void setName(NM name) {
        this.name = name;
    }

    public void setClas(C clas) {
        this.clas = clas;
    }

    public N getNim() {
        return nim;
    }

    public NM getName() {
        return name;
    }

    public C getClas() {
        return clas;
    }
}