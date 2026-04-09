package de;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements cf.b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22215c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f22216a = f22215c;

    /* renamed from: b, reason: collision with root package name */
    public volatile cf.b f22217b;

    public m(cf.b bVar) {
        this.f22217b = bVar;
    }

    @Override // cf.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f22216a;
        Object obj3 = f22215c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f22216a;
                if (obj == obj3) {
                    obj = this.f22217b.get();
                    this.f22216a = obj;
                    this.f22217b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
