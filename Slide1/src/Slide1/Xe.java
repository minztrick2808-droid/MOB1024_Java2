package Slide1;

public class Xe {
	private String hangXe;
    private int namSanXuat;

    public String getHangXe() {
        return this.hangXe;
    }

    public int getNamSanXuat() {
        return this.namSanXuat;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        return "xe{" + "hangXe=" + hangXe + ", namSanXuat=" + namSanXuat + '}';
    }

   public Xe(String hangXe, int namSanXuat) {
        this.hangXe = hangXe;
        this.namSanXuat = namSanXuat;
    }
    public Xe (){}
}
