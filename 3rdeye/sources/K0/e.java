package K0;

import kotlin.jvm.internal.l;

/* compiled from: Pools.kt */
/* loaded from: classes.dex */
public final class e<T> extends d {

    /* renamed from: c, reason: collision with root package name */
    public final Object f2944c;

    public e(int i) {
        super(i);
        this.f2944c = new Object();
    }

    @Override // K0.d
    public final T a() {
        T t10;
        synchronized (this.f2944c) {
            t10 = (T) super.a();
        }
        return t10;
    }

    @Override // K0.d
    public final boolean c(T instance) {
        boolean zC;
        l.f(instance, "instance");
        synchronized (this.f2944c) {
            zC = super.c(instance);
        }
        return zC;
    }
}
