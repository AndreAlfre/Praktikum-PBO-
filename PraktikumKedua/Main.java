public class Main {
    public static void main(String[] args) throws Exception {
        Karyawan Ridho = new Karyawan("123345", "Ridho");
        Karyawan Melan = new Karyawan("123346", "Melan");

        Ridho.getInfo();
        Ridho.absenPagi();
        Ridho.kerja();
        Ridho.absenPulang();

        Melan.getInfo();
        Melan.absenPagi();
        Melan.kerja();
        Melan.absenPulang();

        Dosen Andiani = new Dosen("23455", "332211", "Andiani");
        Dosen Ionia = new Dosen("23456", "332212", "Ionia");

        Andiani.getInfo();
        Andiani.absenPagi();
        Andiani.kerja();
        Andiani.ngajar();
        Andiani.absenPulang();

        Ionia.getInfo();
        Ionia.absenPagi();
        Ionia.kerja();
        Ionia.ngajar();
        Ionia.absenPulang();
    }
}
