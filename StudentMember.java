public class StudentMember extends Member {
    private String kelas;

    public StudentMember(String nama, String id, String kelas) {
        super(nama, id);
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }
}
