package v;

/* loaded from: classes.dex */
public class i extends c {

    /* renamed from: d, reason: collision with root package name */
    public double f24626d;

    /* renamed from: e, reason: collision with root package name */
    public double f24627e;

    public i(String str) {
        this.f24576a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f24626d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i10 = iIndexOf2 + 1;
        this.f24627e = Double.parseDouble(str.substring(i10, str.indexOf(44, i10)).trim());
    }

    @Override // v.c
    public double a(double d10) {
        return e(d10);
    }

    @Override // v.c
    public double b(double d10) {
        return d(d10);
    }

    public final double d(double d10) {
        double d11 = this.f24627e;
        if (d10 < d11) {
            double d12 = this.f24626d;
            return ((d12 * d11) * d11) / ((((d11 - d10) * d12) + d10) * ((d12 * (d11 - d10)) + d10));
        }
        double d13 = this.f24626d;
        return (((d11 - 1.0d) * d13) * (d11 - 1.0d)) / (((((-d13) * (d11 - d10)) - d10) + 1.0d) * ((((-d13) * (d11 - d10)) - d10) + 1.0d));
    }

    public final double e(double d10) {
        double d11 = this.f24627e;
        return d10 < d11 ? (d11 * d10) / (d10 + (this.f24626d * (d11 - d10))) : ((1.0d - d11) * (d10 - 1.0d)) / ((1.0d - d10) - (this.f24626d * (d11 - d10)));
    }
}
