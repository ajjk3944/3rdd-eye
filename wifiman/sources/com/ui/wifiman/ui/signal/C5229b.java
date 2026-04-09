package com.ui.wifiman.ui.signal;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Te.K0;
import kotlin.jvm.internal.AbstractC6492s;
import z9.AbstractC8722b;

/* renamed from: com.ui.wifiman.ui.signal.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5229b {

    /* renamed from: a, reason: collision with root package name */
    public static final C5229b f44798a = new C5229b();

    /* renamed from: b, reason: collision with root package name */
    public static mh.r f44799b = b0.c.c(-1378177529, false, a.f44800a);

    /* renamed from: com.ui.wifiman.ui.signal.b$a */
    static final class a implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44800a = new a();

        a() {
        }

        public final void a(androidx.compose.ui.e mdf, K0 item, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(mdf, "mdf");
            AbstractC6492s.i(item, "item");
            if ((i10 & 6) == 0) {
                i11 = (interfaceC3540l.T(mdf) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? interfaceC3540l.T(item) : interfaceC3540l.l(item) ? 32 : 16;
            }
            if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1378177529, i11, -1, "com.ui.wifiman.ui.signal.ComposableSingletons$SignalTabSignalStrengthUiKt.lambda-1.<anonymous> (SignalTabSignalStrengthUi.kt:52)");
            }
            if (item instanceof K0.i) {
                interfaceC3540l.U(-602922840);
                AbstractC8722b.b(androidx.compose.foundation.layout.r.h(mdf, 0.0f, 1, null), 0L, 0.0f, Y0.h.j(64), Y0.h.j(16), interfaceC3540l, 27648, 6);
                interfaceC3540l.J();
            } else if (item instanceof K0.c) {
                interfaceC3540l.U(-1510467945);
                if (((K0.c) item).b() > 0) {
                    float f10 = 16;
                    AbstractC8722b.b(androidx.compose.foundation.layout.r.h(mdf, 0.0f, 1, null), 0L, 0.0f, Y0.h.j(f10), Y0.h.j(f10), interfaceC3540l, 27648, 6);
                }
                interfaceC3540l.J();
            } else if ((item instanceof K0.l) || (item instanceof K0.b) || (item instanceof K0.k) || (item instanceof K0.d)) {
                interfaceC3540l.U(-1509932420);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(-602894246);
                float f11 = 16;
                AbstractC8722b.b(androidx.compose.foundation.layout.r.h(mdf, 0.0f, 1, null), 0L, 0.0f, Y0.h.j(f11), Y0.h.j(f11), interfaceC3540l, 27648, 6);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((androidx.compose.ui.e) obj, (K0) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return Yg.J.f24997a;
        }
    }

    public final mh.r a() {
        return f44799b;
    }
}
