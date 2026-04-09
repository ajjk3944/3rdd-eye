package W9;

import U9.C1606c;
import ia.C;
import ia.C4468d;
import ia.D;
import ia.v;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;

/* compiled from: CacheInterceptor.kt */
/* loaded from: classes3.dex */
public final class b implements C {

    /* renamed from: b, reason: collision with root package name */
    public boolean f13361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ia.g f13362c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1606c.d f13363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f13364e;

    public b(ia.g gVar, C1606c.d dVar, v vVar) {
        this.f13362c = gVar;
        this.f13363d = dVar;
        this.f13364e = vVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f13361b) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!V9.b.g(this)) {
                this.f13361b = true;
                this.f13363d.a();
            }
        }
        this.f13362c.close();
    }

    @Override // ia.C
    public final long read(C4468d sink, long j4) throws Throwable {
        l.f(sink, "sink");
        try {
            long j10 = this.f13362c.read(sink, j4);
            v vVar = this.f13364e;
            if (j10 == -1) {
                if (!this.f13361b) {
                    this.f13361b = true;
                    vVar.close();
                }
                return -1L;
            }
            sink.k(vVar.f38682c, sink.f38643c - j10, j10);
            vVar.c();
            return j10;
        } catch (IOException e4) {
            if (this.f13361b) {
                throw e4;
            }
            this.f13361b = true;
            this.f13363d.a();
            throw e4;
        }
    }

    @Override // ia.C
    public final D timeout() {
        return this.f13362c.timeout();
    }
}
