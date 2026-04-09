package Tg;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    protected static final byte[] f21960b = {78, 84, 76, 77, 83, 83, 80, 0};

    /* renamed from: c, reason: collision with root package name */
    private static final String f21961c = Rg.a.f19842c;

    /* renamed from: a, reason: collision with root package name */
    private int f21962a;

    static String b() {
        return f21961c;
    }

    static byte[] c(byte[] bArr, int i10) {
        int iE = e(bArr, i10);
        byte[] bArr2 = new byte[iE];
        System.arraycopy(bArr, d(bArr, i10 + 4), bArr2, 0, iE);
        return bArr2;
    }

    static int d(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int e(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    static void g(byte[] bArr, int i10, int i11, byte[] bArr2) {
        int length = bArr2 != null ? bArr2.length : 0;
        if (length == 0) {
            return;
        }
        i(bArr, i10, length);
        i(bArr, i10 + 2, length);
        h(bArr, i10 + 4, i11);
        System.arraycopy(bArr2, 0, bArr, i11, length);
    }

    static void h(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
    }

    static void i(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
    }

    public int a() {
        return this.f21962a;
    }

    public void f(int i10) {
        this.f21962a = i10;
    }
}
