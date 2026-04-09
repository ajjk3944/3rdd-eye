package androidx.compose.animation;

import Y0.r;
import Y0.s;
import j0.AbstractC6234e;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import r.AbstractC7535j;
import r.H;
import r.I0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final long f27573a = s.a(PduHandle.NONE, PduHandle.NONE);

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, H h10, InterfaceC6839p interfaceC6839p) {
        return AbstractC6234e.b(eVar).b0(new SizeAnimationModifierElement(h10, f0.c.f46573a.o(), interfaceC6839p));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, H h10, InterfaceC6839p interfaceC6839p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h10 = AbstractC7535j.j(0.0f, 400.0f, r.b(I0.d(r.f24545b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC6839p = null;
        }
        return a(eVar, h10, interfaceC6839p);
    }

    public static final long c() {
        return f27573a;
    }

    public static final boolean d(long j10) {
        return !r.e(j10, f27573a);
    }
}
