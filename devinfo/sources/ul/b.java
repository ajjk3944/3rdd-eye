package ul;

import ec.t0;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import nk.k;
import sl.h;
import vl.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f35534e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f35535f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t0 t0Var, String str) {
        super(str);
        this.f35535f = t0Var;
    }

    @Override // ul.a
    public final long a() {
        n nVar;
        switch (this.f35534e) {
            case 0:
                ((mk.a) this.f35535f).invoke();
                return -1L;
            default:
                t0 t0Var = (t0) this.f35535f;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - t0Var.f23069b) + 1;
                Iterator it = ((ConcurrentLinkedQueue) t0Var.f23072e).iterator();
                k.d(it, "iterator(...)");
                long j8 = Long.MAX_VALUE;
                int i4 = 0;
                int i10 = 0;
                n nVar2 = null;
                n nVar3 = null;
                while (it.hasNext()) {
                    n nVar4 = (n) it.next();
                    k.b(nVar4);
                    synchronized (nVar4) {
                        if (t0Var.a(nVar4, jNanoTime) > 0) {
                            i10++;
                        } else {
                            long j9 = j8;
                            long j10 = nVar4.f36361q;
                            if (j10 < j) {
                                j = j10;
                                nVar2 = nVar4;
                            }
                            i4++;
                            if (j10 < j9) {
                                j8 = j10;
                                nVar3 = nVar4;
                            } else {
                                j8 = j9;
                            }
                        }
                    }
                }
                long j11 = j8;
                if (nVar2 != null) {
                    nVar = nVar2;
                } else if (i4 > 5) {
                    nVar = nVar3;
                    j = j11;
                } else {
                    j = -1;
                    nVar = null;
                }
                if (nVar == null) {
                    if (nVar3 != null) {
                        return (j11 + t0Var.f23069b) - jNanoTime;
                    }
                    if (i10 > 0) {
                        return t0Var.f23069b;
                    }
                    return -1L;
                }
                synchronized (nVar) {
                    if (nVar.f36360p.isEmpty() && nVar.f36361q == j) {
                        nVar.j = true;
                        ((ConcurrentLinkedQueue) t0Var.f23072e).remove(nVar);
                        h.c(nVar.f36351e);
                        if (!((ConcurrentLinkedQueue) t0Var.f23072e).isEmpty()) {
                            return 0L;
                        }
                        ((c) t0Var.f23070c).a();
                        return 0L;
                    }
                    return 0L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, mk.a aVar) {
        super(str);
        this.f35535f = aVar;
    }
}
