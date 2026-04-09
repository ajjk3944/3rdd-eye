package Yg;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
final class x implements m, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC6824a f25025a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f25026b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f25027c;

    public x(InterfaceC6824a initializer, Object obj) {
        AbstractC6492s.i(initializer, "initializer");
        this.f25025a = initializer;
        this.f25026b = G.f24991a;
        this.f25027c = obj == null ? this : obj;
    }

    @Override // Yg.m
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f25026b;
        G g10 = G.f24991a;
        if (obj != g10) {
            return obj;
        }
        synchronized (this.f25027c) {
            objInvoke = this.f25026b;
            if (objInvoke == g10) {
                InterfaceC6824a interfaceC6824a = this.f25025a;
                AbstractC6492s.f(interfaceC6824a);
                objInvoke = interfaceC6824a.invoke();
                this.f25026b = objInvoke;
                this.f25025a = null;
            }
        }
        return objInvoke;
    }

    @Override // Yg.m
    public boolean m() {
        return this.f25026b != G.f24991a;
    }

    public String toString() {
        return m() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ x(InterfaceC6824a interfaceC6824a, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6824a, (i10 & 2) != 0 ? null : obj);
    }
}
