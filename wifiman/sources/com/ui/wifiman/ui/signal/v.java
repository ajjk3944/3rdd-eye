package com.ui.wifiman.ui.signal;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import com.ui.wifiman.ui.signal.AbstractC5239l;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class v {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5239l f44876a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5240m f44877b;

        a(AbstractC5239l abstractC5239l, AbstractC5240m abstractC5240m) {
            this.f44876a = abstractC5239l;
            this.f44877b = abstractC5240m;
        }

        public final void a(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1771957989, i10, -1, "com.ui.wifiman.ui.signal.SignalTabFloorplanUi.<anonymous> (SignalTabFloorplanUi.kt:22)");
            }
            AbstractC5239l abstractC5239l = this.f44876a;
            if (abstractC5239l instanceof AbstractC5239l.a) {
                interfaceC3540l.U(-941807339);
                r.e(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), this.f44877b, (AbstractC5239l.a) this.f44876a, interfaceC3540l, 6, 0);
                interfaceC3540l.J();
            } else {
                if (!(abstractC5239l instanceof AbstractC5239l.b)) {
                    interfaceC3540l.U(-941809468);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(-941800705);
                AbstractC5246t.b(null, (AbstractC5239l.b) this.f44876a, this.f44877b, interfaceC3540l, 0, 1);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a(((Boolean) obj).booleanValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final com.ui.wifiman.ui.signal.AbstractC5240m r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.signal.v.b(androidx.compose.ui.e, com.ui.wifiman.ui.signal.m, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, AbstractC5240m abstractC5240m, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, abstractC5240m, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
