package qu;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import su.k;
import su.l;
import vu.q;

/* loaded from: classes.dex */
public final class f extends ru.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21085f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, String str, int i10) {
        super(str, true);
        this.f21084e = i10;
        this.f21085f = obj;
    }

    @Override // ru.a
    public final long a() throws IOException {
        switch (this.f21084e) {
            case 0:
                g gVar = (g) this.f21085f;
                synchronized (gVar) {
                    if (!gVar.H || gVar.I) {
                        return -1L;
                    }
                    try {
                        gVar.Z();
                    } catch (IOException unused) {
                        gVar.J = true;
                    }
                    try {
                        if (gVar.w()) {
                            gVar.V();
                            gVar.E = 0;
                        }
                    } catch (IOException unused2) {
                        gVar.K = true;
                        gVar.B = a.a.d(new cv.e());
                    }
                    return -1L;
                }
            case 1:
                ((ar.a) this.f21085f).c();
                return -1L;
            case 2:
                l lVar = (l) this.f21085f;
                long jNanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) lVar.f22360e).iterator();
                int i10 = 0;
                long j = Long.MIN_VALUE;
                k kVar = null;
                int i11 = 0;
                while (it.hasNext()) {
                    k kVar2 = (k) it.next();
                    br.l.d(kVar2, "connection");
                    synchronized (kVar2) {
                        if (lVar.b(kVar2, jNanoTime) > 0) {
                            i11++;
                        } else {
                            i10++;
                            long j7 = jNanoTime - kVar2.f22355q;
                            if (j7 > j) {
                                kVar = kVar2;
                                j = j7;
                            }
                        }
                    }
                }
                long j10 = lVar.f22357b;
                if (j < j10 && i10 <= 5) {
                    if (i10 > 0) {
                        return j10 - j;
                    }
                    if (i11 > 0) {
                        return j10;
                    }
                    return -1L;
                }
                br.l.b(kVar);
                synchronized (kVar) {
                    if (!kVar.f22354p.isEmpty()) {
                        return 0L;
                    }
                    if (kVar.f22355q + j != jNanoTime) {
                        return 0L;
                    }
                    kVar.j = true;
                    ((ConcurrentLinkedQueue) lVar.f22360e).remove(kVar);
                    Socket socket = kVar.f22344d;
                    br.l.b(socket);
                    pu.b.e(socket);
                    if (!((ConcurrentLinkedQueue) lVar.f22360e).isEmpty()) {
                        return 0L;
                    }
                    ((ru.b) lVar.f22358c).a();
                    return 0L;
                }
            default:
                q qVar = (q) this.f21085f;
                qVar.getClass();
                try {
                    qVar.S.w(2, false, 0);
                    return -1L;
                } catch (IOException e4) {
                    qVar.f(e4);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(String str, Object obj, int i10) {
        super(str, true);
        this.f21084e = i10;
        this.f21085f = obj;
    }
}
