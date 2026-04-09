package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Result;
import kotlinx.coroutines.flow.d1;
import y8.s;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public c[] f22470a;

    /* renamed from: b, reason: collision with root package name */
    public int f22471b;

    /* renamed from: c, reason: collision with root package name */
    public int f22472c;

    /* renamed from: d, reason: collision with root package name */
    public p f22473d;

    public final c e() {
        c cVarF;
        p pVar;
        synchronized (this) {
            try {
                c[] cVarArrI = this.f22470a;
                if (cVarArrI == null) {
                    cVarArrI = i(2);
                    this.f22470a = cVarArrI;
                } else if (this.f22471b >= cVarArrI.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(cVarArrI, cVarArrI.length * 2);
                    kotlin.jvm.internal.p.d(objArrCopyOf, "copyOf(...)");
                    this.f22470a = (c[]) objArrCopyOf;
                    cVarArrI = (c[]) objArrCopyOf;
                }
                int i10 = this.f22472c;
                do {
                    cVarF = cVarArrI[i10];
                    if (cVarF == null) {
                        cVarF = f();
                        cVarArrI[i10] = cVarF;
                    }
                    i10++;
                    if (i10 >= cVarArrI.length) {
                        i10 = 0;
                    }
                    kotlin.jvm.internal.p.c(cVarF, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!cVarF.a(this));
                this.f22472c = i10;
                this.f22471b++;
                pVar = this.f22473d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pVar != null) {
            pVar.Z(1);
        }
        return cVarF;
    }

    public abstract c f();

    public final d1 g() {
        p pVar;
        synchronized (this) {
            pVar = this.f22473d;
            if (pVar == null) {
                pVar = new p(this.f22471b);
                this.f22473d = pVar;
            }
        }
        return pVar;
    }

    public abstract c[] i(int i10);

    public final void k(c cVar) {
        p pVar;
        int i10;
        c9.c[] cVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f22471b - 1;
                this.f22471b = i11;
                pVar = this.f22473d;
                if (i11 == 0) {
                    this.f22472c = 0;
                }
                kotlin.jvm.internal.p.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                cVarArrB = cVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (c9.c cVar2 : cVarArrB) {
            if (cVar2 != null) {
                Result.Companion companion = Result.INSTANCE;
                cVar2.resumeWith(Result.b(s.f25199a));
            }
        }
        if (pVar != null) {
            pVar.Z(-1);
        }
    }

    public final int l() {
        return this.f22471b;
    }

    public final c[] m() {
        return this.f22470a;
    }
}
