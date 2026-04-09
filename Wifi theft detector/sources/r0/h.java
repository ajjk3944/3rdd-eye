package r0;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Object f24138c;

    public h(int i10) {
        super(i10);
        this.f24138c = new Object();
    }

    @Override // r0.g, r0.f
    public boolean a(Object instance) {
        boolean zA;
        p.e(instance, "instance");
        synchronized (this.f24138c) {
            zA = super.a(instance);
        }
        return zA;
    }

    @Override // r0.g, r0.f
    public Object b() {
        Object objB;
        synchronized (this.f24138c) {
            objB = super.b();
        }
        return objB;
    }
}
