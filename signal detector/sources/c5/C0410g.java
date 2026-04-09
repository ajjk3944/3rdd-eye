package c5;

import java.io.Serializable;

/* renamed from: c5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410g implements InterfaceC0405b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public p5.a f5925a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f5926b = C0411h.f5928a;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5927c = this;

    public C0410g(p5.a aVar) {
        this.f5925a = aVar;
    }

    @Override // c5.InterfaceC0405b
    public final Object getValue() {
        Object objB;
        Object obj = this.f5926b;
        C0411h c0411h = C0411h.f5928a;
        if (obj != c0411h) {
            return obj;
        }
        synchronized (this.f5927c) {
            objB = this.f5926b;
            if (objB == c0411h) {
                p5.a aVar = this.f5925a;
                q5.i.b(aVar);
                objB = aVar.b();
                this.f5926b = objB;
                this.f5925a = null;
            }
        }
        return objB;
    }

    public final String toString() {
        return this.f5926b != C0411h.f5928a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
