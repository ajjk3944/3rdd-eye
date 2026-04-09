package de;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o implements cf.b {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.gson.internal.b f22220c = new com.google.gson.internal.b(8);

    /* renamed from: d, reason: collision with root package name */
    public static final e f22221d = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public cf.a f22222a;

    /* renamed from: b, reason: collision with root package name */
    public volatile cf.b f22223b;

    public o(com.google.gson.internal.b bVar, cf.b bVar2) {
        this.f22222a = bVar;
        this.f22223b = bVar2;
    }

    public final void a(cf.a aVar) {
        cf.b bVar;
        cf.b bVar2;
        cf.b bVar3 = this.f22223b;
        e eVar = f22221d;
        if (bVar3 != eVar) {
            aVar.d(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f22223b;
            if (bVar != eVar) {
                bVar2 = bVar;
            } else {
                this.f22222a = new com.applovin.impl.sdk.ad.f(3, this.f22222a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.d(bVar);
        }
    }

    @Override // cf.b
    public final Object get() {
        return this.f22223b.get();
    }
}
