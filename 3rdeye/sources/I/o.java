package I;

import X9.d;
import b9.C1992A;
import java.util.logging.Level;
import t4.C5606d;

/* compiled from: ListFuture.java */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2370c;

    public /* synthetic */ o(Object obj, int i) {
        this.f2369b = i;
        this.f2370c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        X9.a aVarC;
        long jNanoTime;
        switch (this.f2369b) {
            case 0:
                q qVar = (q) this.f2370c;
                qVar.f2375c = null;
                qVar.f2374b = null;
                return;
        }
        while (true) {
            X9.d dVar = (X9.d) this.f2370c;
            synchronized (dVar) {
                aVarC = dVar.c();
            }
            if (aVarC == null) {
                return;
            }
            X9.c cVar = aVarC.f13670c;
            kotlin.jvm.internal.l.c(cVar);
            X9.d dVar2 = (X9.d) this.f2370c;
            boolean zIsLoggable = X9.d.i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                d.a aVar = cVar.f13673a.f13680a;
                jNanoTime = System.nanoTime();
                C5606d.f(aVarC, cVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                try {
                    X9.d.a(dVar2, aVarC);
                    C1992A c1992a = C1992A.f18074a;
                    if (zIsLoggable) {
                        d.a aVar2 = cVar.f13673a.f13680a;
                        C5606d.f(aVarC, cVar, "finished run in ".concat(C5606d.t(System.nanoTime() - jNanoTime)));
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (zIsLoggable) {
                    d.a aVar3 = cVar.f13673a.f13680a;
                    C5606d.f(aVarC, cVar, "failed a run in ".concat(C5606d.t(System.nanoTime() - jNanoTime)));
                }
                throw th;
            }
        }
    }
}
