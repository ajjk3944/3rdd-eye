package Mi;

import Li.N;
import Yg.J;
import Yg.u;
import dh.InterfaceC5380e;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Mi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3305a {

    /* renamed from: a, reason: collision with root package name */
    private c[] f13231a;

    /* renamed from: b, reason: collision with root package name */
    private int f13232b;

    /* renamed from: c, reason: collision with root package name */
    private int f13233c;

    /* renamed from: d, reason: collision with root package name */
    private z f13234d;

    protected final c g() {
        c cVarI;
        z zVar;
        synchronized (this) {
            try {
                c[] cVarArrK = this.f13231a;
                if (cVarArrK == null) {
                    cVarArrK = k(2);
                    this.f13231a = cVarArrK;
                } else if (this.f13232b >= cVarArrK.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(cVarArrK, cVarArrK.length * 2);
                    AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
                    this.f13231a = (c[]) objArrCopyOf;
                    cVarArrK = (c[]) objArrCopyOf;
                }
                int i10 = this.f13233c;
                do {
                    cVarI = cVarArrK[i10];
                    if (cVarI == null) {
                        cVarI = i();
                        cVarArrK[i10] = cVarI;
                    }
                    i10++;
                    if (i10 >= cVarArrK.length) {
                        i10 = 0;
                    }
                    AbstractC6492s.g(cVarI, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!cVarI.a(this));
                this.f13233c = i10;
                this.f13232b++;
                zVar = this.f13234d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zVar != null) {
            zVar.b0(1);
        }
        return cVarI;
    }

    protected abstract c i();

    protected abstract c[] k(int i10);

    public final N l() {
        z zVar;
        synchronized (this) {
            zVar = this.f13234d;
            if (zVar == null) {
                zVar = new z(this.f13232b);
                this.f13234d = zVar;
            }
        }
        return zVar;
    }

    protected final void m(c cVar) {
        z zVar;
        int i10;
        InterfaceC5380e[] interfaceC5380eArrB;
        synchronized (this) {
            try {
                int i11 = this.f13232b - 1;
                this.f13232b = i11;
                zVar = this.f13234d;
                if (i11 == 0) {
                    this.f13233c = 0;
                }
                AbstractC6492s.g(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC5380eArrB = cVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC5380e interfaceC5380e : interfaceC5380eArrB) {
            if (interfaceC5380e != null) {
                u.a aVar = Yg.u.f25017b;
                interfaceC5380e.resumeWith(Yg.u.c(J.f24997a));
            }
        }
        if (zVar != null) {
            zVar.b0(-1);
        }
    }

    protected final int n() {
        return this.f13232b;
    }

    protected final c[] o() {
        return this.f13231a;
    }
}
