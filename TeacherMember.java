public class TeacherMember extends Member {
    private String mataPelajaran;

    public TeacherMember(String nama, String id, String mataPelajaran) {
        super(nama, id);
        this.mataPelajaran = mataPelajaran;
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }
}
