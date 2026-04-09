package Y9;

import b9.C1992A;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/* compiled from: RealConnectionPool.kt */
/* loaded from: classes3.dex */
public final class i extends X9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13875e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str) {
        super(str, true);
        this.f13876f = jVar;
    }

    @Override // X9.a
    public final long a() throws IOException {
        int i = 0;
        switch (this.f13875e) {
            case 0:
                j jVar = (j) this.f13876f;
                long jNanoTime = System.nanoTime();
                Iterator<g> it = jVar.f13880d.iterator();
                long j4 = Long.MIN_VALUE;
                g gVar = null;
                int i10 = 0;
                while (it.hasNext()) {
                    g connection = it.next();
                    kotlin.jvm.internal.l.e(connection, "connection");
                    synchronized (connection) {
                        if (jVar.b(connection, jNanoTime) > 0) {
                            i10++;
                        } else {
                            i++;
                            long j10 = jNanoTime - connection.f13871q;
                            if (j10 > j4) {
                                gVar = connection;
                                j4 = j10;
                            }
                            C1992A c1992a = C1992A.f18074a;
                        }
                    }
                }
                long j11 = jVar.f13877a;
                if (j4 < j11 && i <= 5) {
                    if (i > 0) {
                        return j11 - j4;
                    }
                    if (i10 > 0) {
                        return j11;
                    }
                    return -1L;
                }
                kotlin.jvm.internal.l.c(gVar);
                synchronized (gVar) {
                    if (!gVar.f13870p.isEmpty()) {
                        return 0L;
                    }
                    if (gVar.f13871q + j4 != jNanoTime) {
                        return 0L;
                    }
                    gVar.f13864j = true;
                    jVar.f13880d.remove(gVar);
                    Socket socket = gVar.f13859d;
                    kotlin.jvm.internal.l.c(socket);
                    V9.b.d(socket);
                    if (!jVar.f13880d.isEmpty()) {
                        return 0L;
                    }
                    jVar.f13878b.a();
                    return 0L;
                }
            default:
                ba.f fVar = (ba.f) this.f13876f;
                fVar.getClass();
                try {
                    fVar.f18165x.l(2, 0, false);
                } catch (IOException e4) {
                    fVar.c(e4);
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, ba.f fVar) {
        super(str, true);
        this.f13876f = fVar;
    }
}
