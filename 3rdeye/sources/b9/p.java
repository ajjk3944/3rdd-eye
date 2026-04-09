package b9;

import java.io.Serializable;
import p9.InterfaceC5480a;

/* compiled from: LazyJVM.kt */
/* loaded from: classes3.dex */
public final class p<T> implements InterfaceC2000g<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC5480a<? extends T> f18090b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f18091c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18092d;

    public p(InterfaceC5480a initializer) {
        kotlin.jvm.internal.l.f(initializer, "initializer");
        this.f18090b = initializer;
        this.f18091c = x.f18108a;
        this.f18092d = this;
    }

    @Override // b9.InterfaceC2000g
    public final T getValue() {
        T tInvoke;
        T t10 = (T) this.f18091c;
        x xVar = x.f18108a;
        if (t10 != xVar) {
            return t10;
        }
        synchronized (this.f18092d) {
            tInvoke = (T) this.f18091c;
            if (tInvoke == xVar) {
                InterfaceC5480a<? extends T> interfaceC5480a = this.f18090b;
                kotlin.jvm.internal.l.c(interfaceC5480a);
                tInvoke = interfaceC5480a.invoke();
                this.f18091c = tInvoke;
                this.f18090b = null;
            }
        }
        return tInvoke;
    }

    public final String toString() {
        return this.f18091c != x.f18108a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
