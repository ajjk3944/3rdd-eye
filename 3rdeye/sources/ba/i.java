package ba;

import b9.C1992A;
import ba.f;
import java.io.IOException;
import kotlin.jvm.internal.w;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class i extends X9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f.c f18191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f18192f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, f.c cVar, t tVar) {
        super(str, true);
        this.f18191e = cVar;
        this.f18192f = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, ba.t] */
    @Override // X9.a
    public final long a() {
        long jA;
        int i;
        p[] pVarArr;
        f.c cVar = this.f18191e;
        t tVar = this.f18192f;
        cVar.getClass();
        w wVar = new w();
        f fVar = f.this;
        synchronized (fVar.f18165x) {
            synchronized (fVar) {
                try {
                    t tVar2 = fVar.f18159r;
                    ?? tVar3 = new t();
                    tVar3.b(tVar2);
                    tVar3.b(tVar);
                    wVar.f43660b = tVar3;
                    jA = tVar3.a() - tVar2.a();
                    pVarArr = (jA == 0 || fVar.f18145c.isEmpty()) ? null : (p[]) fVar.f18145c.values().toArray(new p[0]);
                    t tVar4 = (t) wVar.f43660b;
                    kotlin.jvm.internal.l.f(tVar4, "<set-?>");
                    fVar.f18159r = tVar4;
                    fVar.f18152k.c(new g(fVar.f18146d + " onSettings", fVar, wVar), 0L);
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                fVar.f18165x.a((t) wVar.f43660b);
            } catch (IOException e4) {
                fVar.c(e4);
            }
            C1992A c1992a2 = C1992A.f18074a;
        }
        if (pVarArr == null) {
            return -1L;
        }
        for (p pVar : pVarArr) {
            synchronized (pVar) {
                pVar.f18228f += jA;
                if (jA > 0) {
                    pVar.notifyAll();
                }
                C1992A c1992a3 = C1992A.f18074a;
            }
        }
        return -1L;
    }
}
