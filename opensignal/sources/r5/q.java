package r5;

import a5.d0;
import android.net.Uri;
import b5.a0;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class q implements k {

    /* renamed from: a, reason: collision with root package name */
    public final long f21253a;

    /* renamed from: d, reason: collision with root package name */
    public final b5.k f21254d;

    /* renamed from: g, reason: collision with root package name */
    public final int f21255g;

    /* renamed from: r, reason: collision with root package name */
    public final a0 f21256r;

    /* renamed from: x, reason: collision with root package name */
    public final p f21257x;

    /* renamed from: y, reason: collision with root package name */
    public volatile Object f21258y;

    public q(b5.h hVar, Uri uri, int i10, p pVar) {
        Map map = Collections.EMPTY_MAP;
        a5.a.k(uri, "The uri must be set.");
        b5.k kVar = new b5.k(uri, 1, null, map, 0L, -1L, null, 1);
        this.f21256r = new a0(hVar);
        this.f21254d = kVar;
        this.f21255g = i10;
        this.f21257x = pVar;
        this.f21253a = o5.q.f19025e.getAndIncrement();
    }

    @Override // r5.k, pb.j0
    public final void c() {
        this.f21256r.f2420d = 0L;
        b5.j jVar = new b5.j(this.f21256r, this.f21254d);
        try {
            jVar.b();
            Uri uriO = this.f21256r.f2419a.o();
            uriO.getClass();
            this.f21258y = this.f21257x.parse(uriO, jVar);
            try {
                jVar.close();
            } catch (IOException unused) {
            }
        } finally {
            int i10 = d0.f105a;
            try {
                jVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // r5.k, pb.j0
    public final void d() {
    }
}
