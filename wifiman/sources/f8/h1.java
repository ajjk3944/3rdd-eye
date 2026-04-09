package f8;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.os.Bundle;
import d.AbstractC5264b;
import mh.InterfaceC6839p;
import xe.AbstractC8510e;

/* loaded from: classes3.dex */
public abstract class h1 extends g8.l {

    static final class a implements InterfaceC6839p {
        a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(603107565, i10, -1, "com.ubnt.usurvey.ui.WifimanRootActivity.onCreate.<anonymous> (WifimanRootActivity.kt:14)");
            }
            AbstractC8510e.d(androidx.compose.ui.e.f28771b0, new xe.w0(h1.this.d()), interfaceC3540l, 6, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    @Override // g8.l, androidx.fragment.app.AbstractActivityC3999j, c.AbstractActivityC4155j, s1.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC5264b.b(this, null, b0.c.c(603107565, true, new a()), 1, null);
    }
}
