package Y9;

import U9.C1604a;
import U9.H;
import Y9.e;
import b9.C1992A;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: RealConnectionPool.kt */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f13877a;

    /* renamed from: b, reason: collision with root package name */
    public final X9.c f13878b;

    /* renamed from: c, reason: collision with root package name */
    public final i f13879c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue<g> f13880d;

    public j(X9.d taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        kotlin.jvm.internal.l.f(taskRunner, "taskRunner");
        kotlin.jvm.internal.l.f(timeUnit, "timeUnit");
        this.f13877a = timeUnit.toNanos(5L);
        this.f13878b = taskRunner.e();
        this.f13879c = new i(this, B4.f.c(new StringBuilder(), V9.b.f13059g, " ConnectionPool"));
        this.f13880d = new ConcurrentLinkedQueue<>();
    }

    public final boolean a(C1604a c1604a, e call, List<H> list, boolean z10) {
        kotlin.jvm.internal.l.f(call, "call");
        Iterator<g> it = this.f13880d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            g connection = it.next();
            kotlin.jvm.internal.l.e(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    if (connection.f13862g != null) {
                    }
                    C1992A c1992a = C1992A.f18074a;
                }
                if (connection.i(c1604a, list)) {
                    call.b(connection);
                    return true;
                }
                C1992A c1992a2 = C1992A.f18074a;
            }
        }
    }

    public final int b(g gVar, long j4) {
        byte[] bArr = V9.b.f13053a;
        ArrayList arrayList = gVar.f13870p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + gVar.f13857b.f12594a.f12604h + " was leaked. Did you forget to close a response body?";
                da.h hVar = da.h.f37600a;
                da.h.f37600a.k(((e.b) reference).f13855a, str);
                arrayList.remove(i);
                gVar.f13864j = true;
                if (arrayList.isEmpty()) {
                    gVar.f13871q = j4 - this.f13877a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
