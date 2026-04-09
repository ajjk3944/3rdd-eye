package Be;

import Be.H0;
import L0.C3174d;
import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.InterfaceC3923h0;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import q.InterfaceC7386e;
import s9.InterfaceC7929a;
import vf.C8221a;
import z.InterfaceC8675A;

/* loaded from: classes4.dex */
public abstract class H0 {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A0 f1431a;

        a(A0 a02) {
            this.f1431a = a02;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1230044192, i10, -1, "com.ui.wifiman.ui.component.WirelessSignal.<anonymous>.<anonymous> (WirelessSignal.kt:67)");
            }
            InterfaceC7929a interfaceC7929aE = this.f1431a.e();
            if (interfaceC7929aE != null) {
                AbstractC2487w.b(interfaceC7929aE, androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(40)), null, null, null, 0.0f, 0L, interfaceC3540l, 48, 62);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f1432a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3923h0 f1433b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3174d f1434c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f1435d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ A0 f1436e;

        b(boolean z10, InterfaceC3923h0 interfaceC3923h0, C3174d c3174d, Context context, A0 a02) {
            this.f1432a = z10;
            this.f1433b = interfaceC3923h0;
            this.f1434c = c3174d;
            this.f1435d = context;
            this.f1436e = a02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J e(InterfaceC3923h0 interfaceC3923h0, C3174d c3174d, Context context) {
            interfaceC3923h0.b(c3174d);
            C8221a.f63590a.a(context);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J f() {
            return Yg.J.f24997a;
        }

        public final void c(InterfaceC8675A FlowRow, InterfaceC3540l interfaceC3540l, int i10) {
            long jC;
            AbstractC6492s.i(FlowRow, "$this$FlowRow");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1330500377, i10, -1, "com.ui.wifiman.ui.component.WirelessSignal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WirelessSignal.kt:91)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            boolean z10 = this.f1432a;
            interfaceC3540l.U(779999527);
            boolean zL = interfaceC3540l.l(this.f1433b) | interfaceC3540l.T(this.f1434c) | interfaceC3540l.l(this.f1435d);
            final InterfaceC3923h0 interfaceC3923h0 = this.f1433b;
            final C3174d c3174d = this.f1434c;
            final Context context = this.f1435d;
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Be.I0
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return H0.b.e(interfaceC3923h0, c3174d, context);
                    }
                };
                interfaceC3540l.K(objF);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF;
            interfaceC3540l.J();
            interfaceC3540l.U(780006339);
            Object objF2 = interfaceC3540l.f();
            if (objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6824a() { // from class: Be.J0
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return H0.b.f();
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarG = androidx.compose.foundation.d.g(aVar, (46 & 1) != 0 ? true : z10, (46 & 2) != 0 ? null : null, (46 & 4) != 0 ? null : null, (46 & 8) != 0 ? null : null, (46 & 16) != 0 ? null : interfaceC6824a, (46 & 32) != 0 ? null : null, (InterfaceC6824a) objF2);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            L0.U uB = c6562a.c(interfaceC3540l, i11).b().b();
            boolean zD = this.f1436e.d();
            if (zD) {
                interfaceC3540l.U(780016729);
                jC = c6562a.a(interfaceC3540l, i11).f().a();
                interfaceC3540l.J();
            } else {
                if (zD) {
                    interfaceC3540l.U(780014273);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(780018649);
                jC = c6562a.a(interfaceC3540l, i11).f().c();
                interfaceC3540l.J();
            }
            long j10 = jC;
            a1.c(this.f1434c, eVarG, j10, 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, uB, interfaceC3540l, 0, 3120, 120824);
            Iterator it = this.f1436e.g().iterator();
            while (it.hasNext()) {
                ((De.g) it.next()).c(interfaceC3540l, 0);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            c((InterfaceC8675A) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0362  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final androidx.compose.ui.e r41, final Be.A0 r42, boolean r43, T.InterfaceC3540l r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Be.H0.d(androidx.compose.ui.e, Be.A0, boolean, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, A0 a02, boolean z10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        d(eVar, a02, z10, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(InterfaceC3923h0 interfaceC3923h0, C3174d c3174d) {
        interfaceC3923h0.b(c3174d);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g() {
        return Yg.J.f24997a;
    }
}
