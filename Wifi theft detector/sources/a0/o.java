package a0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.c;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class o implements Comparable {

    /* renamed from: t, reason: collision with root package name */
    public static String[] f72t = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: a, reason: collision with root package name */
    public v.c f73a;

    /* renamed from: c, reason: collision with root package name */
    public float f75c;

    /* renamed from: d, reason: collision with root package name */
    public float f76d;

    /* renamed from: e, reason: collision with root package name */
    public float f77e;

    /* renamed from: f, reason: collision with root package name */
    public float f78f;

    /* renamed from: g, reason: collision with root package name */
    public float f79g;

    /* renamed from: h, reason: collision with root package name */
    public float f80h;

    /* renamed from: k, reason: collision with root package name */
    public int f83k;

    /* renamed from: l, reason: collision with root package name */
    public int f84l;

    /* renamed from: m, reason: collision with root package name */
    public float f85m;

    /* renamed from: n, reason: collision with root package name */
    public l f86n;

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashMap f87o;

    /* renamed from: p, reason: collision with root package name */
    public int f88p;

    /* renamed from: q, reason: collision with root package name */
    public int f89q;

    /* renamed from: r, reason: collision with root package name */
    public double[] f90r;

    /* renamed from: s, reason: collision with root package name */
    public double[] f91s;

    /* renamed from: b, reason: collision with root package name */
    public int f74b = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f81i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f82j = Float.NaN;

    public o() {
        int i10 = c.f12a;
        this.f83k = i10;
        this.f84l = i10;
        this.f85m = Float.NaN;
        this.f86n = null;
        this.f87o = new LinkedHashMap();
        this.f88p = 0;
        this.f90r = new double[18];
        this.f91s = new double[18];
    }

    public void a(c.a aVar) {
        this.f73a = v.c.c(aVar.f2201d.f2265d);
        c.C0014c c0014c = aVar.f2201d;
        this.f83k = c0014c.f2266e;
        this.f84l = c0014c.f2263b;
        this.f81i = c0014c.f2270i;
        this.f74b = c0014c.f2267f;
        this.f89q = c0014c.f2264c;
        this.f82j = aVar.f2200c.f2280e;
        this.f85m = aVar.f2202e.C;
        for (String str : aVar.f2204g.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) aVar.f2204g.get(str);
            if (constraintAttribute != null && constraintAttribute.e()) {
                this.f87o.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(o oVar) {
        return Float.compare(this.f76d, oVar.f76d);
    }

    public final boolean c(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    public void d(o oVar, boolean[] zArr, String[] strArr, boolean z10) {
        boolean zC = c(this.f77e, oVar.f77e);
        boolean zC2 = c(this.f78f, oVar.f78f);
        zArr[0] = zArr[0] | c(this.f76d, oVar.f76d);
        boolean z11 = zC | zC2 | z10;
        zArr[1] = zArr[1] | z11;
        zArr[2] = z11 | zArr[2];
        zArr[3] = zArr[3] | c(this.f79g, oVar.f79g);
        zArr[4] = c(this.f80h, oVar.f80h) | zArr[4];
    }

    public void f(double[] dArr, int[] iArr) {
        float[] fArr = {this.f76d, this.f77e, this.f78f, this.f79g, this.f80h, this.f81i};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 6) {
                dArr[i10] = fArr[r1];
                i10++;
            }
        }
    }

    public void g(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f77e;
        float fCos = this.f78f;
        float f10 = this.f79g;
        float f11 = this.f80h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f12;
            } else if (i12 == 2) {
                fCos = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        l lVar = this.f86n;
        if (lVar != null) {
            float[] fArr2 = new float[2];
            lVar.h(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - (f10 / 2.0f));
            fCos = (float) ((f14 - (d12 * Math.cos(d13))) - (f11 / 2.0f));
        }
        fArr[i10] = fSin + (f10 / 2.0f) + 0.0f;
        fArr[i10 + 1] = fCos + (f11 / 2.0f) + 0.0f;
    }

    public void h(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        float fSin = this.f77e;
        float fCos = this.f78f;
        float f11 = this.f79g;
        float f12 = this.f80h;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f17 = (float) dArr[i10];
            float f18 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                fSin = f17;
                f13 = f18;
            } else if (i11 == 2) {
                fCos = f17;
                f15 = f18;
            } else if (i11 == 3) {
                f11 = f17;
                f14 = f18;
            } else if (i11 == 4) {
                f12 = f17;
                f16 = f18;
            }
        }
        float f19 = (f14 / 2.0f) + f13;
        float fCos2 = (f16 / 2.0f) + f15;
        l lVar = this.f86n;
        if (lVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            lVar.h(d10, fArr3, fArr4);
            float f20 = fArr3[0];
            float f21 = fArr3[1];
            float f22 = fArr4[0];
            float f23 = fArr4[1];
            f10 = 2.0f;
            double d11 = fSin;
            double d12 = fCos;
            fSin = (float) ((f20 + (Math.sin(d12) * d11)) - (f11 / 2.0f));
            fCos = (float) ((f21 - (Math.cos(d12) * d11)) - (f12 / 2.0f));
            double d13 = f13;
            double dSin = f22 + (Math.sin(d12) * d13);
            double d14 = f15;
            float fCos3 = (float) (dSin + (Math.cos(d12) * d14));
            fCos2 = (float) ((f23 - (d13 * Math.cos(d12))) + (Math.sin(d12) * d14));
            f19 = fCos3;
        } else {
            f10 = 2.0f;
        }
        fArr[0] = fSin + (f11 / f10) + 0.0f;
        fArr[1] = fCos + (f12 / f10) + 0.0f;
        fArr2[0] = f19;
        fArr2[1] = fCos2;
    }

    public int i(String str, double[] dArr, int i10) {
        ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f87o.get(str);
        int i11 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.f() == 1) {
            dArr[i10] = constraintAttribute.c();
            return 1;
        }
        int iF = constraintAttribute.f();
        constraintAttribute.d(new float[iF]);
        while (i11 < iF) {
            dArr[i10] = r2[i11];
            i11++;
            i10++;
        }
        return iF;
    }

    public int j(String str) {
        ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f87o.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.f();
    }

    public void k(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f77e;
        float fCos = this.f78f;
        float f11 = this.f79g;
        float f12 = this.f80h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f13;
            } else if (i12 == 2) {
                fCos = f13;
            } else if (i12 == 3) {
                f11 = f13;
            } else if (i12 == 4) {
                f12 = f13;
            }
        }
        l lVar = this.f86n;
        if (lVar != null) {
            float fI = lVar.i();
            float fJ = this.f86n.j();
            double d10 = f10;
            double d11 = fCos;
            float fSin = (float) ((fI + (Math.sin(d11) * d10)) - (f11 / 2.0f));
            fCos = (float) ((fJ - (d10 * Math.cos(d11))) - (f12 / 2.0f));
            f10 = fSin;
        }
        float f14 = f11 + f10;
        float f15 = f12 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i10] = f10 + 0.0f;
        fArr[i10 + 1] = fCos + 0.0f;
        fArr[i10 + 2] = f14 + 0.0f;
        fArr[i10 + 3] = fCos + 0.0f;
        fArr[i10 + 4] = f14 + 0.0f;
        fArr[i10 + 5] = f15 + 0.0f;
        fArr[i10 + 6] = f10 + 0.0f;
        fArr[i10 + 7] = f15 + 0.0f;
    }

    public boolean l(String str) {
        return this.f87o.containsKey(str);
    }

    public void m(float f10, float f11, float f12, float f13) {
        this.f77e = f10;
        this.f78f = f11;
        this.f79g = f12;
        this.f80h = f13;
    }

    public void n(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (f17 * (1.0f - f10)) + (((f13 * 1.0f) + f17) * f10) + 0.0f;
        fArr[1] = (f18 * (1.0f - f11)) + (((f15 * 1.0f) + f18) * f11) + 0.0f;
    }

    public void o(float f10, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f11;
        float fSin = this.f77e;
        float fCos = this.f78f;
        float f12 = this.f79g;
        float f13 = this.f80h;
        if (iArr.length != 0 && this.f90r.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.f90r = new double[i10];
            this.f91s = new double[i10];
        }
        Arrays.fill(this.f90r, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.f90r;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.f91s[i12] = dArr2[i11];
        }
        float f14 = Float.NaN;
        int i13 = 0;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (true) {
            double[] dArr5 = this.f90r;
            if (i13 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f11 = f14;
            } else {
                double d10 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.f90r[i13])) {
                    d10 = this.f90r[i13] + d10;
                }
                f11 = f14;
                float f19 = (float) d10;
                float f20 = (float) this.f91s[i13];
                if (i13 == 1) {
                    f14 = f11;
                    f15 = f20;
                    fSin = f19;
                } else if (i13 == 2) {
                    f14 = f11;
                    f16 = f20;
                    fCos = f19;
                } else if (i13 == 3) {
                    f14 = f11;
                    f17 = f20;
                    f12 = f19;
                } else if (i13 == 4) {
                    f14 = f11;
                    f18 = f20;
                    f13 = f19;
                } else if (i13 == 5) {
                    f14 = f19;
                }
                i13++;
            }
            f14 = f11;
            i13++;
        }
        float f21 = f14;
        l lVar = this.f86n;
        if (lVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            lVar.h(f10, fArr, fArr2);
            float f22 = fArr[0];
            float f23 = fArr[1];
            float f24 = fArr2[0];
            float f25 = fArr2[1];
            double d11 = f22;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - (f12 / 2.0f));
            fCos = (float) ((f23 - (Math.cos(d13) * d12)) - (f13 / 2.0f));
            double d14 = f24;
            double d15 = f15;
            double dSin = d14 + (Math.sin(d13) * d15);
            double dCos = Math.cos(d13) * d12;
            double d16 = f16;
            float f26 = (float) (dSin + (dCos * d16));
            float fCos2 = (float) ((f25 - (d15 * Math.cos(d13))) + (Math.sin(d13) * d12 * d16));
            if (dArr2.length >= 2) {
                dArr2[0] = f26;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f21)) {
                view.setRotation((float) (f21 + Math.toDegrees(Math.atan2(fCos2, f26))));
            }
        } else if (!Float.isNaN(f21)) {
            view.setRotation((float) (0.0f + f21 + Math.toDegrees(Math.atan2(f16 + (f18 / 2.0f), f15 + (f17 / 2.0f)))));
        }
        float f27 = fSin + 0.5f;
        int i14 = (int) f27;
        float f28 = fCos + 0.5f;
        int i15 = (int) f28;
        int i16 = (int) (f27 + f12);
        int i17 = (int) (f28 + f13);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (i18 != view.getMeasuredWidth() || i19 != view.getMeasuredHeight()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
        view.layout(i14, i15, i16, i17);
    }

    public void p(l lVar, o oVar) {
        double d10 = ((this.f77e + (this.f79g / 2.0f)) - oVar.f77e) - (oVar.f79g / 2.0f);
        double d11 = ((this.f78f + (this.f80h / 2.0f)) - oVar.f78f) - (oVar.f80h / 2.0f);
        this.f86n = lVar;
        this.f77e = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f85m)) {
            this.f78f = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f78f = (float) Math.toRadians(this.f85m);
        }
    }
}
