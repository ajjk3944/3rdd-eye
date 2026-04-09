package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import o0.InterfaceC7039f;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC6835l f60957a;

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(InterfaceC7039f interfaceC7039f);

    public InterfaceC6835l b() {
        return this.f60957a;
    }

    public final void c() {
        InterfaceC6835l interfaceC6835lB = b();
        if (interfaceC6835lB != null) {
            interfaceC6835lB.invoke(this);
        }
    }

    public void d(InterfaceC6835l interfaceC6835l) {
        this.f60957a = interfaceC6835l;
    }

    private k() {
    }
}
