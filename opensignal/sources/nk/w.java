package nk;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class w implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public int f18447a;

    /* renamed from: d, reason: collision with root package name */
    public int[] f18448d = new int[32];

    /* renamed from: g, reason: collision with root package name */
    public String[] f18449g = new String[32];

    /* renamed from: r, reason: collision with root package name */
    public int[] f18450r = new int[32];

    /* renamed from: x, reason: collision with root package name */
    public boolean f18451x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f18452y;

    public abstract double G();

    public abstract int L();

    public abstract long R();

    public abstract String V();

    public abstract void Y();

    public abstract String Z();

    public abstract void b();

    public abstract void f();

    public abstract v f0();

    public abstract void h();

    public abstract void i();

    public abstract void i0();

    public final void n0(int i10) {
        int i11 = this.f18447a;
        int[] iArr = this.f18448d;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new bf.n("Nesting too deep at " + q());
            }
            this.f18448d = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f18449g;
            this.f18449g = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f18450r;
            this.f18450r = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f18448d;
        int i12 = this.f18447a;
        this.f18447a = i12 + 1;
        iArr3[i12] = i10;
    }

    public final Object o0() {
        switch (u.f18446a[f0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                b();
                while (w()) {
                    arrayList.add(o0());
                }
                h();
                return arrayList;
            case 2:
                g0 g0Var = new g0();
                f();
                while (w()) {
                    String strV = V();
                    Object objO0 = o0();
                    Object objPut = g0Var.put(strV, objO0);
                    if (objPut != null) {
                        StringBuilder sbU = c7.a.u("Map key '", strV, "' has multiple values at path ");
                        sbU.append(q());
                        sbU.append(": ");
                        sbU.append(objPut);
                        sbU.append(" and ");
                        sbU.append(objO0);
                        throw new bf.n(sbU.toString());
                    }
                }
                i();
                return g0Var;
            case 3:
                return Z();
            case 4:
                return Double.valueOf(G());
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return Boolean.valueOf(y());
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Y();
                return null;
            default:
                throw new IllegalStateException("Expected a value but was " + f0() + " at path " + q());
        }
    }

    public abstract int p0(io.sentry.t tVar);

    public final String q() {
        return p0.c(this.f18447a, this.f18448d, this.f18449g, this.f18450r);
    }

    public abstract int q0(io.sentry.t tVar);

    public abstract void r0();

    public abstract void s0();

    public final void t0(String str) throws androidx.datastore.preferences.protobuf.m {
        StringBuilder sbL = w.g.l(str, " at path ");
        sbL.append(q());
        throw new androidx.datastore.preferences.protobuf.m(sbL.toString());
    }

    public final bf.n u0(Object obj, Object obj2) {
        if (obj == null) {
            return new bf.n("Expected " + obj2 + " but was null at path " + q());
        }
        return new bf.n("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + q());
    }

    public abstract boolean w();

    public abstract boolean y();
}
