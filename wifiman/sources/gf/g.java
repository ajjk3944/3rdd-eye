package Gf;

import Be.s0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import android.content.res.Resources;
import ic.EnumC6141b;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class g {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7378a;

        static {
            int[] iArr = new int[EnumC6141b.values().length];
            try {
                iArr[EnumC6141b.NETWORKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6141b.CHANNEL_HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7378a = iArr;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7379a = new b();

        b() {
        }

        public final String a(EnumC6141b it, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-812275147);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-812275147, i10, -1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanFeaturePicker.<anonymous> (WifiScanFeature.kt:46)");
            }
            String strG = g.g(it, interfaceC3540l, i10 & 14);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return strG;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((EnumC6141b) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final void c(androidx.compose.ui.e eVar, final h model, final InterfaceC6835l onFeatureSelected, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        AbstractC6492s.i(model, "model");
        AbstractC6492s.i(onFeatureSelected, "onFeatureSelected");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1431350610);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(onFeatureSelected) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1431350610, i12, -1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanFeaturePicker (WifiScanFeature.kt:34)");
            }
            List listA = model.a();
            interfaceC3540lR.U(1649268814);
            boolean zT = interfaceC3540lR.T(listA);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = Ci.a.h(model.a());
                interfaceC3540lR.K(objF);
            }
            Ci.c cVar = (Ci.c) objF;
            interfaceC3540lR.J();
            EnumC6141b enumC6141bB = model.b();
            interfaceC3540lR.U(1649276146);
            boolean z10 = (i12 & 896) == 256;
            Object objF2 = interfaceC3540lR.f();
            if (z10 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6835l() { // from class: Gf.e
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return g.d(onFeatureSelected, (EnumC6141b) obj);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            s0.e(eVar, enumC6141bB, cVar, (InterfaceC6835l) objF2, b.f7379a, interfaceC3540lR, i12 & 14, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        final androidx.compose.ui.e eVar2 = eVar;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Gf.f
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return g.e(eVar2, model, onFeatureSelected, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(InterfaceC6835l interfaceC6835l, EnumC6141b it) {
        AbstractC6492s.i(it, "it");
        interfaceC6835l.invoke(it);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(androidx.compose.ui.e eVar, h hVar, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, hVar, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(EnumC6141b enumC6141b, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
        String strA;
        interfaceC3540l.U(73175101);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(73175101, i10, -1, "com.ui.wifiman.ui.wifi.scan.component.text (WifiScanFeature.kt:14)");
        }
        int i11 = a.f7378a[enumC6141b.ordinal()];
        if (i11 == 1) {
            interfaceC3540l.U(-1075000493);
            strA = H0.f.a(AbstractC6780c.f53421V4, interfaceC3540l, 0);
            interfaceC3540l.J();
        } else {
            if (i11 != 2) {
                interfaceC3540l.U(-1075001932);
                interfaceC3540l.J();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540l.U(-1074997288);
            strA = H0.f.a(AbstractC6780c.f53414U4, interfaceC3540l, 0);
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return strA;
    }
}
