package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Wb implements InterfaceC4521c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4573e0 f40331a;

    /* renamed from: b, reason: collision with root package name */
    public final C5084xn f40332b = new C5084xn();

    public Wb(InterfaceC4573e0 interfaceC4573e0) {
        this.f40331a = interfaceC4573e0;
    }

    public static final void a(Wb wb, U u8) {
        wb.f40331a.a(u8);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4521c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArrB;
        C5084xn c5084xn = this.f40332b;
        Thread threadA = c5084xn.f42092a.a();
        try {
            stackTraceElementArrB = c5084xn.f42092a.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        U u8 = new U((C4907qn) c5084xn.f42093b.apply(threadA, stackTraceElementArrB), c5084xn.a(threadA, null), c5084xn.f42094c.b());
        ((S9) C5065x4.l().f42014c.a()).f40100b.post(new B.a(25, this, u8));
    }
}
