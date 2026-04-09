package A9;

import A9.InterfaceC0594o0;
import f9.InterfaceC4350h;
import java.util.concurrent.CancellationException;

/* compiled from: EventLoop.common.kt */
/* renamed from: A9.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0572d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final F9.y f241a = new F9.y("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    public static final F9.y f242b = new F9.y("CLOSED_EMPTY");

    public static C0599r0 a() {
        return new C0599r0(null);
    }

    public static final void b(InterfaceC4350h interfaceC4350h, CancellationException cancellationException) {
        InterfaceC0594o0 interfaceC0594o0 = (InterfaceC0594o0) interfaceC4350h.get(InterfaceC0594o0.a.f263b);
        if (interfaceC0594o0 != null) {
            interfaceC0594o0.c(cancellationException);
        }
    }

    public static final void c(InterfaceC4350h interfaceC4350h) {
        InterfaceC0594o0 interfaceC0594o0 = (InterfaceC0594o0) interfaceC4350h.get(InterfaceC0594o0.a.f263b);
        if (interfaceC0594o0 != null && !interfaceC0594o0.isActive()) {
            throw interfaceC0594o0.A();
        }
    }

    public static W d(InterfaceC0594o0 interfaceC0594o0, boolean z10, AbstractC0603t0 abstractC0603t0, int i) {
        if ((i & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i & 2) != 0;
        return interfaceC0594o0 instanceof C0605u0 ? ((C0605u0) interfaceC0594o0).P(z10, z11, abstractC0603t0) : interfaceC0594o0.n(z10, z11, new C0601s0(1, abstractC0603t0, InterfaceC0588l0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }
}
