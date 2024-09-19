class Dosen extends Karyawan {
    private String NIDN;

    public Dosen(String kodeKaryawan, String NIDN, String nama) {
        super(kodeKaryawan, nama);
        this.NIDN = NIDN;
    }

    public void setNIDN(String NIDN) { this.NIDN = NIDN;
    }

    public void getNIDN() { System.out.println("NIDN: " + this.NIDN);
    }

    public void ngajar() { System.out.println(this.nama + ": sedang mengajar");
    }

    @Override // method getInfo() akan menimpa getInfo() parent
    public void getInfo() {
        super.getInfo();
        System.out.println("NIDN: " + this.NIDN);
    }
}
