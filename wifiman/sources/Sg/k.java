package Sg;

/* loaded from: classes4.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    int f20698a;

    /* renamed from: b, reason: collision with root package name */
    int f20699b;

    static void b(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
    }

    int a(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        bArr[i10] = (byte) this.f20698a;
        int i12 = this.f20699b;
        if (i12 > 65535) {
            bArr[i11] = 1;
        }
        b(i12, bArr, i10 + 2);
        return 4;
    }

    abstract int c(byte[] bArr, int i10);

    public int d(byte[] bArr, int i10) {
        this.f20699b = c(bArr, i10 + 4);
        a(bArr, i10);
        return this.f20699b + 4;
    }
}
