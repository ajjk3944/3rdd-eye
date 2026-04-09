package Nf;

import com.ui.wmw.WMWizard;
import i9.InterfaceC6137a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public abstract class a {
    private static final InterfaceC6137a a() {
        return WMWizard.f45247a.b();
    }

    public static final void b(InterfaceC6824a message, Throwable th2) {
        AbstractC6492s.i(message, "message");
        InterfaceC6137a interfaceC6137aA = a();
        if (interfaceC6137aA != null) {
            interfaceC6137aA.a((String) message.invoke(), th2);
        }
    }

    public static /* synthetic */ void c(InterfaceC6824a interfaceC6824a, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        b(interfaceC6824a, th2);
    }

    public static final void d(InterfaceC6824a message) {
        AbstractC6492s.i(message, "message");
        InterfaceC6137a interfaceC6137aA = a();
        if (interfaceC6137aA != null) {
            interfaceC6137aA.b((String) message.invoke());
        }
    }

    public static final void e(InterfaceC6824a message, Throwable th2) {
        AbstractC6492s.i(message, "message");
        InterfaceC6137a interfaceC6137aA = a();
        if (interfaceC6137aA != null) {
            interfaceC6137aA.c((String) message.invoke(), th2);
        }
    }

    public static /* synthetic */ void f(InterfaceC6824a interfaceC6824a, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        e(interfaceC6824a, th2);
    }
}
