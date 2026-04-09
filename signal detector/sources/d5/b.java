package D5;

import c5.C0412i;
import com.google.android.gms.internal.ads.C1636oL;
import com.google.android.gms.internal.ads.OK;
import com.google.android.gms.internal.ads.RK;
import h5.InterfaceC2370d;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public int f1294a;

    /* renamed from: b, reason: collision with root package name */
    public int f1295b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1296c;

    public static RK i(int i, int i3, byte[] bArr) {
        RK rk = new RK(i, i3, bArr);
        try {
            rk.H(i3);
            return rk;
        } catch (C1636oL e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static int l(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long m(long j6) {
        return (j6 >>> 1) ^ (-(1 & j6));
    }

    public abstract OK A();

    public abstract int B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract int F();

    public abstract long G();

    public abstract int H(int i);

    public d b() {
        d dVarC;
        synchronized (this) {
            try {
                d[] dVarArrD = (d[]) this.f1296c;
                if (dVarArrD == null) {
                    dVarArrD = d();
                    this.f1296c = dVarArrD;
                } else if (this.f1294a >= dVarArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrD, dVarArrD.length * 2);
                    q5.i.d(objArrCopyOf, "copyOf(...)");
                    this.f1296c = (d[]) objArrCopyOf;
                    dVarArrD = (d[]) objArrCopyOf;
                }
                int i = this.f1295b;
                do {
                    dVarC = dVarArrD[i];
                    if (dVarC == null) {
                        dVarC = c();
                        dVarArrD[i] = dVarC;
                    }
                    i++;
                    if (i >= dVarArrD.length) {
                        i = 0;
                    }
                } while (!dVarC.a(this));
                this.f1295b = i;
                this.f1294a++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarC;
    }

    public abstract d c();

    public abstract d[] d();

    public void e(d dVar) {
        int i;
        InterfaceC2370d[] interfaceC2370dArrB;
        synchronized (this) {
            try {
                int i3 = this.f1294a - 1;
                this.f1294a = i3;
                if (i3 == 0) {
                    this.f1295b = 0;
                }
                q5.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC2370dArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC2370d interfaceC2370d : interfaceC2370dArrB) {
            if (interfaceC2370d != null) {
                interfaceC2370d.e(C0412i.f5929a);
            }
        }
    }

    public abstract void f(int i);

    public abstract boolean g();

    public abstract int h();

    public void j() throws C1636oL {
        int iN;
        do {
            iN = n();
            if (iN == 0) {
                return;
            }
            int i = this.f1294a;
            int i3 = this.f1295b;
            if (i + i3 >= 100) {
                throw new C1636oL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f1295b = i3 + 1;
            this.f1295b--;
        } while (p(iN));
    }

    public abstract int n();

    public abstract void o(int i);

    public abstract boolean p(int i);

    public abstract double q();

    public abstract float r();

    public abstract long s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract boolean x();

    public abstract String y();

    public abstract String z();
}
