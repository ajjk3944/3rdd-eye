package y6;

import b7.r;
import ck.i;
import nk.k;
import pf.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final z6.f f37347a;

    public b(z6.f fVar) {
        k.e(fVar, "tracker");
        this.f37347a = fVar;
    }

    @Override // y6.d
    public final boolean b(r rVar) {
        return a(rVar) && e(this.f37347a.a());
    }

    @Override // y6.d
    public final al.c c(t6.e eVar) {
        k.e(eVar, "constraints");
        return new al.c(new n(this, null, 13), i.f2898a, -2, zk.a.f38322a);
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
