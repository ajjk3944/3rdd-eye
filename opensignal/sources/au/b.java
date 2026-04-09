package au;

import java.util.Arrays;
import lq.b0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public d[] f2316a;

    /* renamed from: d, reason: collision with root package name */
    public int f2317d;

    /* renamed from: g, reason: collision with root package name */
    public int f2318g;

    /* renamed from: r, reason: collision with root package name */
    public y f2319r;

    public final d b() {
        d dVarC;
        y yVar;
        synchronized (this) {
            try {
                d[] dVarArrD = this.f2316a;
                if (dVarArrD == null) {
                    dVarArrD = d();
                    this.f2316a = dVarArrD;
                } else if (this.f2317d >= dVarArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrD, dVarArrD.length * 2);
                    br.l.d(objArrCopyOf, "copyOf(...)");
                    this.f2316a = (d[]) objArrCopyOf;
                    dVarArrD = (d[]) objArrCopyOf;
                }
                int i10 = this.f2318g;
                do {
                    dVarC = dVarArrD[i10];
                    if (dVarC == null) {
                        dVarC = c();
                        dVarArrD[i10] = dVarC;
                    }
                    i10++;
                    if (i10 >= dVarArrD.length) {
                        i10 = 0;
                    }
                } while (!dVarC.a(this));
                this.f2318g = i10;
                this.f2317d++;
                yVar = this.f2319r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (yVar != null) {
            yVar.w(1);
        }
        return dVarC;
    }

    public abstract d c();

    public abstract d[] d();

    public final void e(d dVar) {
        y yVar;
        int i10;
        pq.c[] cVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f2317d - 1;
                this.f2317d = i11;
                yVar = this.f2319r;
                if (i11 == 0) {
                    this.f2318g = 0;
                }
                br.l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                cVarArrB = dVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (pq.c cVar : cVarArrB) {
            if (cVar != null) {
                cVar.g(b0.f15562a);
            }
        }
        if (yVar != null) {
            yVar.w(-1);
        }
    }

    public final y f() {
        y yVar;
        synchronized (this) {
            yVar = this.f2319r;
            if (yVar == null) {
                int i10 = this.f2317d;
                yVar = new y(1, Integer.MAX_VALUE, yt.a.DROP_OLDEST);
                yVar.q(Integer.valueOf(i10));
                this.f2319r = yVar;
            }
        }
        return yVar;
    }
}
