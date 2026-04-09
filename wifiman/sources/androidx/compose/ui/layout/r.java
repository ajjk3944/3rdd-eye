package androidx.compose.ui.layout;

import E0.A;
import androidx.compose.ui.e;
import mh.InterfaceC6835l;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
final class r extends e.c implements A {

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC6835l f29057n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f29058o = true;

    /* renamed from: p, reason: collision with root package name */
    private long f29059p = Y0.s.a(PduHandle.NONE, PduHandle.NONE);

    public r(InterfaceC6835l interfaceC6835l) {
        this.f29057n = interfaceC6835l;
    }

    public final void D2(InterfaceC6835l interfaceC6835l) {
        this.f29057n = interfaceC6835l;
        this.f29059p = Y0.s.a(PduHandle.NONE, PduHandle.NONE);
    }

    @Override // E0.A
    public void a0(long j10) {
        if (Y0.r.e(this.f29059p, j10)) {
            return;
        }
        this.f29057n.invoke(Y0.r.b(j10));
        this.f29059p = j10;
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return this.f29058o;
    }
}
