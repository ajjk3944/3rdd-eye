package pb;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class q0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f20405a;

    /* renamed from: d, reason: collision with root package name */
    public final na.c f20406d;

    /* renamed from: g, reason: collision with root package name */
    public final int f20407g;

    /* renamed from: r, reason: collision with root package name */
    public final t0 f20408r;

    /* renamed from: x, reason: collision with root package name */
    public final p0 f20409x;

    /* renamed from: y, reason: collision with root package name */
    public volatile Object f20410y;

    public q0(n nVar, Uri uri, int i10, p0 p0Var) {
        Map map = Collections.EMPTY_MAP;
        qb.b.l(uri, "The uri must be set.");
        na.c cVar = new na.c(uri, 1, null, map, 0L, -1L, null, 1);
        this.f20408r = new t0(nVar);
        this.f20406d = cVar;
        this.f20407g = i10;
        this.f20409x = p0Var;
        this.f20405a = ya.m.f26107e.getAndIncrement();
    }

    @Override // pb.j0
    public final void c() {
        this.f20408r.f20431d = 0L;
        b5.j jVar = new b5.j(this.f20408r, this.f20406d);
        try {
            jVar.b();
            Uri uriO = this.f20408r.f20430a.o();
            uriO.getClass();
            this.f20410y = this.f20409x.parse(uriO, jVar);
            try {
                jVar.close();
            } catch (IOException unused) {
            }
        } finally {
            int i10 = qb.v.f20828a;
            try {
                jVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // pb.j0
    public final void d() {
    }
}
