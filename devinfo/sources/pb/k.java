package pb;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k implements d, b, c {

    /* renamed from: b, reason: collision with root package name */
    public static k f31632b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f31633c = new l(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    public Object f31634a;

    public /* synthetic */ k(Object obj) {
        this.f31634a = obj;
    }

    public static synchronized k b() {
        try {
            if (f31632b == null) {
                f31632b = new k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f31632b;
    }

    @Override // pb.c
    public void O(nb.b bVar) {
        ((ob.h) this.f31634a).O(bVar);
    }

    @Override // pb.b
    public void S(int i4) {
        ((ob.g) this.f31634a).S(i4);
    }

    @Override // pb.b
    public void T() {
        ((ob.g) this.f31634a).T();
    }

    @Override // pb.d
    public void a(nb.b bVar) {
        e eVar = (e) this.f31634a;
        if (bVar.f29885b == 0) {
            eVar.i(null, eVar.s());
            return;
        }
        c cVar = eVar.f31580p;
        if (cVar != null) {
            cVar.O(bVar);
        }
    }

    public k(e eVar) {
        Objects.requireNonNull(eVar);
        this.f31634a = eVar;
    }
}
