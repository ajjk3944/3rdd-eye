package Jj;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    private static final org.tensorflow.lite.a f10238e = org.tensorflow.lite.a.FLOAT32;

    b(int[] iArr) {
        super(iArr);
    }

    @Override // Jj.a
    public org.tensorflow.lite.a h() {
        return f10238e;
    }

    @Override // Jj.a
    public float[] i() {
        this.f10233a.rewind();
        float[] fArr = new float[this.f10235c];
        this.f10233a.asFloatBuffer().get(fArr);
        return fArr;
    }

    @Override // Jj.a
    public int[] j() {
        this.f10233a.rewind();
        float[] fArr = new float[this.f10235c];
        this.f10233a.asFloatBuffer().get(fArr);
        int[] iArr = new int[this.f10235c];
        for (int i10 = 0; i10 < this.f10235c; i10++) {
            iArr[i10] = (int) fArr[i10];
        }
        return iArr;
    }

    @Override // Jj.a
    public int l() {
        return f10238e.byteSize();
    }

    @Override // Jj.a
    public void o(float[] fArr, int[] iArr) {
        Ij.a.c(fArr, "The array to be loaded cannot be null.");
        Ij.a.b(fArr.length == a.c(iArr), "The size of the array to be loaded does not match the specified shape.");
        r(iArr);
        this.f10233a.rewind();
        this.f10233a.asFloatBuffer().put(fArr);
    }

    @Override // Jj.a
    public void p(int[] iArr, int[] iArr2) {
        Ij.a.c(iArr, "The array to be loaded cannot be null.");
        int i10 = 0;
        Ij.a.b(iArr.length == a.c(iArr2), "The size of the array to be loaded does not match the specified shape.");
        r(iArr2);
        this.f10233a.rewind();
        float[] fArr = new float[iArr.length];
        int length = iArr.length;
        int i11 = 0;
        while (i10 < length) {
            fArr[i11] = iArr[i10];
            i10++;
            i11++;
        }
        this.f10233a.asFloatBuffer().put(fArr);
    }

    b() {
    }
}
