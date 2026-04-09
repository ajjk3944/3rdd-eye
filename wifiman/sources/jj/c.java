package Jj;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: e, reason: collision with root package name */
    private static final org.tensorflow.lite.a f10239e = org.tensorflow.lite.a.UINT8;

    c(int[] iArr) {
        super(iArr);
    }

    @Override // Jj.a
    public org.tensorflow.lite.a h() {
        return f10239e;
    }

    @Override // Jj.a
    public float[] i() {
        this.f10233a.rewind();
        this.f10233a.get(new byte[this.f10235c]);
        float[] fArr = new float[this.f10235c];
        for (int i10 = 0; i10 < this.f10235c; i10++) {
            fArr[i10] = r0[i10] & 255;
        }
        return fArr;
    }

    @Override // Jj.a
    public int[] j() {
        this.f10233a.rewind();
        byte[] bArr = new byte[this.f10235c];
        this.f10233a.get(bArr);
        int[] iArr = new int[this.f10235c];
        for (int i10 = 0; i10 < this.f10235c; i10++) {
            iArr[i10] = bArr[i10] & 255;
        }
        return iArr;
    }

    @Override // Jj.a
    public int l() {
        return f10239e.byteSize();
    }

    @Override // Jj.a
    public void o(float[] fArr, int[] iArr) {
        Ij.a.c(fArr, "The array to be loaded cannot be null.");
        int i10 = 0;
        Ij.a.b(fArr.length == a.c(iArr), "The size of the array to be loaded does not match the specified shape.");
        r(iArr);
        this.f10233a.rewind();
        byte[] bArr = new byte[fArr.length];
        int length = fArr.length;
        int i11 = 0;
        while (i10 < length) {
            bArr[i11] = (byte) Math.max(Math.min(fArr[i10], 255.0d), 0.0d);
            i10++;
            i11++;
        }
        this.f10233a.put(bArr);
    }

    @Override // Jj.a
    public void p(int[] iArr, int[] iArr2) {
        Ij.a.c(iArr, "The array to be loaded cannot be null.");
        int i10 = 0;
        Ij.a.b(iArr.length == a.c(iArr2), "The size of the array to be loaded does not match the specified shape.");
        r(iArr2);
        this.f10233a.rewind();
        byte[] bArr = new byte[iArr.length];
        int length = iArr.length;
        int i11 = 0;
        while (i10 < length) {
            bArr[i11] = (byte) Math.max(Math.min(iArr[i10], 255.0f), 0.0f);
            i10++;
            i11++;
        }
        this.f10233a.put(bArr);
    }

    c() {
    }
}
