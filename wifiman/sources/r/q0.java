package r;

import T.InterfaceC3551q0;
import T.t1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3551q0 f59856a;

    public /* synthetic */ q0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object a();

    public abstract Object b();

    public final boolean c() {
        return ((Boolean) this.f59856a.getValue()).booleanValue();
    }

    public abstract void d(Object obj);

    public final void e(boolean z10) {
        this.f59856a.setValue(Boolean.valueOf(z10));
    }

    public abstract void f(o0 o0Var);

    public abstract void g();

    private q0() {
        this.f59856a = t1.d(Boolean.FALSE, null, 2, null);
    }
}
