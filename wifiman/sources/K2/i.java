package K2;

import W2.k;

/* loaded from: classes.dex */
public abstract class i implements E2.c {

    /* renamed from: a, reason: collision with root package name */
    protected final Object f10268a;

    public i(Object obj) {
        this.f10268a = k.d(obj);
    }

    @Override // E2.c
    public final int a() {
        return 1;
    }

    @Override // E2.c
    public void c() {
    }

    @Override // E2.c
    public Class d() {
        return this.f10268a.getClass();
    }

    @Override // E2.c
    public final Object get() {
        return this.f10268a;
    }
}
