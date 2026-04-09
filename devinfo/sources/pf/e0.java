package pf;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e0 implements rf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31806a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final xj.a f31807b;

    /* renamed from: c, reason: collision with root package name */
    public final rf.c f31808c;

    public e0(rf.c cVar, rf.d dVar) {
        this.f31808c = cVar;
        this.f31807b = dVar;
    }

    @Override // xj.a
    public final Object get() {
        switch (this.f31806a) {
            case 0:
                return new d0((Context) this.f31808c.f32941a, (h1) this.f31807b.get());
            default:
                return new sf.d((b) this.f31807b.get(), (ck.h) this.f31808c.f32941a);
        }
    }

    public e0(rf.d dVar, rf.c cVar) {
        this.f31807b = dVar;
        this.f31808c = cVar;
    }
}
