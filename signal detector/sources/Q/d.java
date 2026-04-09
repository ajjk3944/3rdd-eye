package Q;

import q5.i;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public final Object f3167c;

    public d(int i) {
        super(i);
        this.f3167c = new Object();
    }

    @Override // Q.c, Q.b
    public final boolean d(Object obj) {
        boolean zD;
        i.e(obj, "instance");
        synchronized (this.f3167c) {
            zD = super.d(obj);
        }
        return zD;
    }

    @Override // Q.c, Q.b
    public final Object h() {
        Object objH;
        synchronized (this.f3167c) {
            objH = super.h();
        }
        return objH;
    }
}
