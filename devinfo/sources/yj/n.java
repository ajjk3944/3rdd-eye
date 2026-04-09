package yj;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n implements f, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public mk.a f37645a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f37646b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f37647c;

    public n(mk.a aVar) {
        nk.k.e(aVar, "initializer");
        this.f37645a = aVar;
        this.f37646b = s.f37648a;
        this.f37647c = this;
    }

    public final boolean a() {
        return this.f37646b != s.f37648a;
    }

    @Override // yj.f
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f37646b;
        s sVar = s.f37648a;
        if (obj != sVar) {
            return obj;
        }
        synchronized (this.f37647c) {
            objInvoke = this.f37646b;
            if (objInvoke == sVar) {
                mk.a aVar = this.f37645a;
                nk.k.b(aVar);
                objInvoke = aVar.invoke();
                this.f37646b = objInvoke;
                this.f37645a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
