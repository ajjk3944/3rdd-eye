package E1;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: c, reason: collision with root package name */
    private final Object f4015c;

    public g(int i10) {
        super(i10);
        this.f4015c = new Object();
    }

    @Override // E1.f, E1.e
    public boolean a(Object instance) {
        boolean zA;
        AbstractC6492s.i(instance, "instance");
        synchronized (this.f4015c) {
            zA = super.a(instance);
        }
        return zA;
    }

    @Override // E1.f, E1.e
    public Object b() {
        Object objB;
        synchronized (this.f4015c) {
            objB = super.b();
        }
        return objB;
    }
}
