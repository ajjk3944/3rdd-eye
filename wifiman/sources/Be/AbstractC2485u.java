package Be;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import android.content.Context;
import android.text.Html;
import h4.C5948a;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.AbstractC6737x0;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: Be.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2485u {
    public static final void d(final androidx.compose.ui.e modifier, final String text, final long j10, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(text, "text");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1603067198);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(text) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.j(j10) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1603067198, i11, -1, "com.ui.wifiman.ui.component.HtmlText (HtmlText.kt:17)");
            }
            final long jF = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).a().b().f();
            interfaceC3540lR.U(-296114464);
            boolean zJ = ((i11 & 896) == 256) | interfaceC3540lR.j(jF);
            Object objF = interfaceC3540lR.f();
            if (zJ || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: Be.r
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC2485u.e(j10, jF, (Context) obj);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            InterfaceC6835l interfaceC6835l = (InterfaceC6835l) objF;
            interfaceC3540lR.J();
            interfaceC3540lR.U(-296105250);
            boolean z10 = (i11 & 112) == 32;
            Object objF2 = interfaceC3540lR.f();
            if (z10 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6835l() { // from class: Be.s
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC2485u.f(text, (C5948a) obj);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            androidx.compose.ui.viewinterop.e.a(interfaceC6835l, modifier, (InterfaceC6835l) objF2, interfaceC3540lR, (i11 << 3) & 112, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Be.t
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2485u.g(modifier, text, j10, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5948a e(long j10, long j11, Context it) {
        AbstractC6492s.i(it, "it");
        C5948a c5948a = new C5948a(it);
        c5948a.setAutoLinkMask(1);
        c5948a.setLinksClickable(true);
        c5948a.setTextColor(AbstractC6737x0.j(j10));
        c5948a.setLinkTextColor(AbstractC6737x0.j(j11));
        return c5948a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(String str, C5948a it) {
        AbstractC6492s.i(it, "it");
        it.setText(Html.fromHtml(str, 0));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(androidx.compose.ui.e eVar, String str, long j10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(eVar, str, j10, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
