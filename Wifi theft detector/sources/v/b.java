package v;

/* loaded from: classes.dex */
public abstract class b {

    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public double f24572a;

        /* renamed from: b, reason: collision with root package name */
        public double[] f24573b;

        public a(double d10, double[] dArr) {
            this.f24572a = d10;
            this.f24573b = dArr;
        }

        @Override // v.b
        public double c(double d10, int i10) {
            return this.f24573b[i10];
        }

        @Override // v.b
        public void d(double d10, double[] dArr) {
            double[] dArr2 = this.f24573b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // v.b
        public void e(double d10, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f24573b;
                if (i10 >= dArr.length) {
                    return;
                }
                fArr[i10] = (float) dArr[i10];
                i10++;
            }
        }

        @Override // v.b
        public void f(double d10, double[] dArr) {
            for (int i10 = 0; i10 < this.f24573b.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        @Override // v.b
        public double[] g() {
            return new double[]{this.f24572a};
        }
    }

    public static b a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        return i10 != 0 ? i10 != 2 ? new f(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new g(dArr, dArr2);
    }

    public static b b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new v.a(iArr, dArr, dArr2);
    }

    public abstract double c(double d10, int i10);

    public abstract void d(double d10, double[] dArr);

    public abstract void e(double d10, float[] fArr);

    public abstract void f(double d10, double[] dArr);

    public abstract double[] g();
}
