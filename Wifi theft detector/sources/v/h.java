package v;

import java.util.Arrays;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public double[] f24620c;

    /* renamed from: d, reason: collision with root package name */
    public String f24621d;

    /* renamed from: e, reason: collision with root package name */
    public g f24622e;

    /* renamed from: f, reason: collision with root package name */
    public int f24623f;

    /* renamed from: a, reason: collision with root package name */
    public float[] f24618a = new float[0];

    /* renamed from: b, reason: collision with root package name */
    public double[] f24619b = new double[0];

    /* renamed from: g, reason: collision with root package name */
    public double f24624g = 6.283185307179586d;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24625h = false;

    public void a(double d10, float f10) {
        int length = this.f24618a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f24619b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f24619b = Arrays.copyOf(this.f24619b, length);
        this.f24618a = Arrays.copyOf(this.f24618a, length);
        this.f24620c = new double[length];
        double[] dArr = this.f24619b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f24619b[iBinarySearch] = d10;
        this.f24618a[iBinarySearch] = f10;
        this.f24625h = false;
    }

    public double b(double d10) {
        if (d10 < 0.0d) {
            d10 = 0.0d;
        } else if (d10 > 1.0d) {
            d10 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f24619b, d10);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i10 = -iBinarySearch;
        int i11 = i10 - 1;
        float[] fArr = this.f24618a;
        float f10 = fArr[i11];
        int i12 = i10 - 2;
        float f11 = fArr[i12];
        double[] dArr = this.f24619b;
        double d11 = dArr[i11];
        double d12 = dArr[i12];
        double d13 = (f10 - f11) / (d11 - d12);
        return this.f24620c[i12] + ((f11 - (d13 * d12)) * (d10 - d12)) + ((d13 * ((d10 * d10) - (d12 * d12))) / 2.0d);
    }

    public double c(double d10, double d11) {
        double dAbs;
        double dB = b(d10) + d11;
        switch (this.f24623f) {
            case 1:
                return Math.signum(0.5d - (dB % 1.0d));
            case 2:
                dAbs = Math.abs((((dB * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dB * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dB * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f24624g * (d11 + dB));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dB * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f24622e.c(dB % 1.0d, 0);
            default:
                return Math.sin(this.f24624g * dB);
        }
        return 1.0d - dAbs;
    }

    public void d() {
        double d10 = 0.0d;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f24618a.length) {
                break;
            }
            d10 += r7[i10];
            i10++;
        }
        double d11 = 0.0d;
        int i11 = 1;
        while (true) {
            float[] fArr = this.f24618a;
            if (i11 >= fArr.length) {
                break;
            }
            int i12 = i11 - 1;
            float f10 = (fArr[i12] + fArr[i11]) / 2.0f;
            double[] dArr = this.f24619b;
            d11 += (dArr[i11] - dArr[i12]) * f10;
            i11++;
        }
        int i13 = 0;
        while (true) {
            float[] fArr2 = this.f24618a;
            if (i13 >= fArr2.length) {
                break;
            }
            fArr2[i13] = (float) (fArr2[i13] * (d10 / d11));
            i13++;
        }
        this.f24620c[0] = 0.0d;
        int i14 = 1;
        while (true) {
            float[] fArr3 = this.f24618a;
            if (i14 >= fArr3.length) {
                this.f24625h = true;
                return;
            }
            int i15 = i14 - 1;
            float f11 = (fArr3[i15] + fArr3[i14]) / 2.0f;
            double[] dArr2 = this.f24619b;
            double d12 = dArr2[i14] - dArr2[i15];
            double[] dArr3 = this.f24620c;
            dArr3[i14] = dArr3[i15] + (d12 * f11);
            i14++;
        }
    }

    public void e(int i10, String str) {
        this.f24623f = i10;
        this.f24621d = str;
        if (str != null) {
            this.f24622e = g.h(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f24619b) + " period=" + Arrays.toString(this.f24618a);
    }
}
