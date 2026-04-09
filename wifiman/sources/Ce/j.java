package Ce;

import Be.AbstractC2466f;
import C0.C;
import Ce.a;
import E0.InterfaceC2629g;
import L0.C3174d;
import L0.U;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import com.google.ar.core.ImageMetadata;
import f0.c;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6778a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import s9.b;
import s9.c;
import ta.AbstractC8049c;
import vf.AbstractC8226f;
import vf.C8225e;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.W;
import z.Y;
import z.Z;
import z.a0;
import z9.AbstractC8722b;

/* loaded from: classes4.dex */
public abstract class j {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.d f2688a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f2689b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f2690c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f2691d;

        /* renamed from: Ce.j$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0131a extends C6490p implements InterfaceC6835l {
            C0131a(Object obj) {
                super(1, obj, C8225e.class, "onClicked", "onClicked(I)V", 0);
            }

            public final void a(int i10) {
                ((C8225e) this.receiver).i(i10);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).intValue());
                return J.f24997a;
            }
        }

        a(a.d dVar, androidx.compose.ui.e eVar, String str, q qVar) {
            this.f2688a = dVar;
            this.f2689b = eVar;
            this.f2690c = str;
            this.f2691d = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            String str;
            q qVar;
            float f10;
            float f11;
            InterfaceC3540l interfaceC3540l2;
            Object obj;
            e.a aVar;
            int i11;
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1538702378, i10, -1, "com.ui.wifiman.ui.component.compliance.CountryBox.<anonymous> (ProductComplianceUi.kt:157)");
            }
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            float f12 = 8;
            androidx.compose.ui.e eVarK = o.k(r.h(aVar2, 0.0f, 1, null), Y0.h.j(f12), 0.0f, 2, null);
            a.d dVar = this.f2688a;
            androidx.compose.ui.e eVar = this.f2689b;
            String str2 = this.f2690c;
            q qVar2 = this.f2691d;
            C8680c c8680c = C8680c.f66832a;
            C8680c.m mVarG = c8680c.g();
            c.a aVar3 = f0.c.f46573a;
            C cA = AbstractC8685h.a(mVarG, aVar3.k(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
            InterfaceC2629g.a aVar4 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar4.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA, cA, aVar4.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar4.g());
            InterfaceC6839p interfaceC6839pB = aVar4.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar4.f());
            C8688k c8688k = C8688k.f66923a;
            interfaceC3540l.U(-2027474750);
            if (dVar != null) {
                androidx.compose.ui.e eVarJ = o.j(r.h(aVar2, 0.0f, 1, null), Y0.h.j(f12), Y0.h.j(16));
                C cA2 = AbstractC8685h.a(c8680c.g(), aVar3.k(), interfaceC3540l, 0);
                int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
                androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarJ);
                InterfaceC6824a interfaceC6824aA2 = aVar4.a();
                if (interfaceC3540l.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540l.u();
                if (interfaceC3540l.o()) {
                    interfaceC3540l.D(interfaceC6824aA2);
                } else {
                    interfaceC3540l.I();
                }
                InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540l);
                E1.c(interfaceC3540lA2, cA2, aVar4.e());
                E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar4.g());
                InterfaceC6839p interfaceC6839pB2 = aVar4.b();
                if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                    interfaceC3540lA2.K(Integer.valueOf(iA2));
                    interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
                }
                E1.c(interfaceC3540lA2, eVarE2, aVar4.f());
                String strB = dVar.b();
                C6562a c6562a = C6562a.f52458a;
                int i12 = C6562a.f52459b;
                str = str2;
                qVar = qVar2;
                f10 = f12;
                a1.b(strB, null, c6562a.a(interfaceC3540l, i12).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i12).a().b(), interfaceC3540l, 0, 0, 65530);
                aVar = aVar2;
                interfaceC3540l2 = interfaceC3540l;
                a0.a(r.i(aVar, Y0.h.j(4)), interfaceC3540l2, 6);
                C3174d c3174d = new C3174d(dVar.a(), null, null, 6, null);
                C8225e c8225eA = AbstractC8226f.a(c3174d, 0L, null, null, interfaceC3540l, 0, 14);
                U uA = c6562a.c(interfaceC3540l2, i12).b().a();
                U uB = uA.b((15204351 & 1) != 0 ? uA.f11108a.g() : c6562a.a(interfaceC3540l2, i12).a().j(), (15204351 & 2) != 0 ? uA.f11108a.k() : 0L, (15204351 & 4) != 0 ? uA.f11108a.n() : null, (15204351 & 8) != 0 ? uA.f11108a.l() : null, (15204351 & 16) != 0 ? uA.f11108a.m() : null, (15204351 & 32) != 0 ? uA.f11108a.i() : null, (15204351 & 64) != 0 ? uA.f11108a.j() : null, (15204351 & 128) != 0 ? uA.f11108a.o() : 0L, (15204351 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? uA.f11108a.e() : null, (15204351 & 512) != 0 ? uA.f11108a.u() : null, (15204351 & 1024) != 0 ? uA.f11108a.p() : null, (15204351 & 2048) != 0 ? uA.f11108a.d() : 0L, (15204351 & 4096) != 0 ? uA.f11108a.s() : null, (15204351 & 8192) != 0 ? uA.f11108a.r() : null, (15204351 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? uA.f11108a.h() : null, (15204351 & 32768) != 0 ? uA.f11109b.h() : 0, (15204351 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? uA.f11109b.i() : 0, (15204351 & 131072) != 0 ? uA.f11109b.e() : 0L, (15204351 & 262144) != 0 ? uA.f11109b.j() : null, (15204351 & ImageMetadata.LENS_APERTURE) != 0 ? uA.f11110c : null, (15204351 & ImageMetadata.SHADING_MODE) != 0 ? uA.f11109b.f() : null, (15204351 & 2097152) != 0 ? uA.f11109b.d() : 0, (15204351 & 4194304) != 0 ? uA.f11109b.c() : 0, (15204351 & 8388608) != 0 ? uA.f11109b.k() : null);
                interfaceC3540l2.U(-1298172246);
                boolean zT = interfaceC3540l2.T(c8225eA);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C0131a(c8225eA);
                    interfaceC3540l2.K(objF);
                }
                interfaceC3540l.J();
                AbstractC2466f.d(c3174d, eVar, uB, false, 0, 0, null, null, (InterfaceC6835l) ((th.g) objF), interfaceC3540l, 0, 248);
                interfaceC3540l.R();
                f11 = 0.0f;
                i11 = 1;
                obj = null;
                AbstractC8722b.b(r.h(aVar, 0.0f, 1, null), c6562a.a(interfaceC3540l2, i12).a().g().f(), 0.0f, 0.0f, 0.0f, interfaceC3540l, 6, 28);
            } else {
                str = str2;
                qVar = qVar2;
                f10 = f12;
                f11 = 0.0f;
                interfaceC3540l2 = interfaceC3540l;
                obj = null;
                aVar = aVar2;
                i11 = 1;
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarJ2 = o.j(r.k(r.h(aVar, f11, i11, obj), Y0.h.j(48), f11, 2, obj), Y0.h.j(f10), Y0.h.j(16));
            C cB = W.b(c8680c.f(), aVar3.i(), interfaceC3540l2, 48);
            int iA3 = AbstractC3536j.a(interfaceC3540l2, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l2, eVarJ2);
            InterfaceC6824a interfaceC6824aA3 = aVar4.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l2.D(interfaceC6824aA3);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA3, cB, aVar4.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar4.g());
            InterfaceC6839p interfaceC6839pB3 = aVar4.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar4.f());
            Z z10 = Z.f66823a;
            C6562a c6562a2 = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            a1.b(str, null, c6562a2.a(interfaceC3540l2, i13).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a2.c(interfaceC3540l2, i13).a().a(), interfaceC3540l, 0, 0, 65530);
            a0.a(r.z(aVar, Y0.h.j(12)), interfaceC3540l, 6);
            qVar.s(z10, interfaceC3540l, 6);
            interfaceC3540l.R();
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.e f2692a;

        b(a.e eVar) {
            this.f2692a = eVar;
        }

        public final void a(Y CountryBox, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(CountryBox, "$this$CountryBox");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(CountryBox) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1231398295, i10, -1, "com.ui.wifiman.ui.component.compliance.ProductComplianceContent.<anonymous>.<anonymous>.<anonymous> (ProductComplianceUi.kt:108)");
            }
            j.p(Y.b(CountryBox, androidx.compose.ui.e.f28771b0, 1.0f, false, 2, null), this.f2692a, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.c f2693a;

        c(a.c cVar) {
            this.f2693a = cVar;
        }

        public final void a(Y CountryBox, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(CountryBox, "$this$CountryBox");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(CountryBox) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1703796384, i10, -1, "com.ui.wifiman.ui.component.compliance.ProductComplianceContent.<anonymous>.<anonymous>.<anonymous> (ProductComplianceUi.kt:118)");
            }
            j.n(Y.b(CountryBox, androidx.compose.ui.e.f28771b0, 1.0f, false, 2, null), this.f2693a, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class d implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.C0130a f2694a;

        d(a.C0130a c0130a) {
            this.f2694a = c0130a;
        }

        public final void a(Y CountryBox, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(CountryBox, "$this$CountryBox");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(CountryBox) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2092999849, i10, -1, "com.ui.wifiman.ui.component.compliance.ProductComplianceContent.<anonymous>.<anonymous>.<anonymous> (ProductComplianceUi.kt:128)");
            }
            j.j(Y.b(CountryBox, androidx.compose.ui.e.f28771b0, 1.0f, false, 2, null), this.f2694a, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class e implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.b f2695a;

        e(a.b bVar) {
            this.f2695a = bVar;
        }

        public final void a(Y CountryBox, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(CountryBox, "$this$CountryBox");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(CountryBox) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2012604716, i10, -1, "com.ui.wifiman.ui.component.compliance.ProductComplianceContent.<anonymous>.<anonymous>.<anonymous> (ProductComplianceUi.kt:137)");
            }
            j.l(Y.b(CountryBox, androidx.compose.ui.e.f28771b0, 1.0f, false, 2, null), this.f2695a, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void h(androidx.compose.ui.e r19, Ce.a.d r20, final java.lang.String r21, final mh.q r22, T.InterfaceC3540l r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ce.j.h(androidx.compose.ui.e, Ce.a$d, java.lang.String, mh.q, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(androidx.compose.ui.e eVar, a.d dVar, String str, q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        h(eVar, dVar, str, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final androidx.compose.ui.e eVar, final a.C0130a c0130a, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1982129479);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(c0130a) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1982129479, i11, -1, "com.ui.wifiman.ui.component.compliance.CountryInfoAU (ProductComplianceUi.kt:305)");
            }
            C cB = W.b(C8680c.f66832a.f(), f0.c.f46573a.i(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            Z z10 = Z.f66823a;
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            a0.a(z10.a(aVar2, 1.0f, true), interfaceC3540lR, 0);
            a0.a(r.z(aVar2, Y0.h.j(12)), interfaceC3540lR, 6);
            interfaceC3540lR.U(-1896039619);
            if (c0130a.a()) {
                AbstractC8049c.c(new b.a(AbstractC6778a.f53263x0, null, null, 6, null), r.i(aVar2, Y0.h.j(56)), C6733v0.g(C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).f().b()), null, interfaceC3540lR, 48, 4);
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ce.i
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return j.k(eVar, c0130a, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k(androidx.compose.ui.e eVar, a.C0130a c0130a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        j(eVar, c0130a, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final androidx.compose.ui.e eVar, final a.b bVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(491420913);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(bVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(491420913, i11, -1, "com.ui.wifiman.ui.component.compliance.CountryInfoBR (ProductComplianceUi.kt:280)");
            }
            c.a aVar = f0.c.f46573a;
            c.InterfaceC1752c interfaceC1752cI = aVar.i();
            C8680c c8680c = C8680c.f66832a;
            C cB = W.b(c8680c.f(), interfaceC1752cI, interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            Z z10 = Z.f66823a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            a0.a(z10.a(aVar3, 1.0f, true), interfaceC3540lR, 0);
            a0.a(r.z(aVar3, Y0.h.j(12)), interfaceC3540lR, 6);
            C cA = AbstractC8685h.a(c8680c.g(), aVar.k(), interfaceC3540lR, 0);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, aVar3);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cA, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            AbstractC8049c.e(new c.a(AbstractC6778a.f53259v0, null, 2, null), r.i(aVar3, Y0.h.j(31)), null, null, null, null, null, 0.0f, null, interfaceC3540lR, 48, 254);
            interfaceC3540l2 = interfaceC3540lR;
            a0.a(r.i(aVar3, Y0.h.j(2)), interfaceC3540l2, 6);
            String strA = bVar.a();
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            a1.b(strA, null, c6562a.a(interfaceC3540l2, i12).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l2, i12).b().a(), interfaceC3540l2, 0, 0, 65530);
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ce.f
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return j.m(eVar, bVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m(androidx.compose.ui.e eVar, a.b bVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        l(eVar, bVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final androidx.compose.ui.e eVar, final a.c cVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-419287539);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(cVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-419287539, i11, -1, "com.ui.wifiman.ui.component.compliance.CountryInfoCA (ProductComplianceUi.kt:251)");
            }
            c.a aVar = f0.c.f46573a;
            c.InterfaceC1752c interfaceC1752cI = aVar.i();
            C8680c c8680c = C8680c.f66832a;
            C cB = W.b(c8680c.f(), interfaceC1752cI, interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            Z z10 = Z.f66823a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            a0.a(z10.a(aVar3, 1.0f, true), interfaceC3540lR, 0);
            a0.a(r.z(aVar3, Y0.h.j(12)), interfaceC3540lR, 6);
            C cA = AbstractC8685h.a(c8680c.g(), aVar.k(), interfaceC3540lR, 0);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, aVar3);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cA, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            String str = String.format(H0.f.a(AbstractC6780c.f53616y0, interfaceC3540lR, 0), Arrays.copyOf(new Object[]{cVar.b()}, 1));
            AbstractC6492s.h(str, "format(...)");
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            a1.b(str, null, c6562a.a(interfaceC3540lR, i12).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540lR, i12).b().a(), interfaceC3540lR, 0, 0, 65530);
            a0.a(r.i(aVar3, Y0.h.j(4)), interfaceC3540lR, 6);
            String str2 = String.format(H0.f.a(AbstractC6780c.f53623z0, interfaceC3540lR, 0), Arrays.copyOf(new Object[]{cVar.a()}, 1));
            AbstractC6492s.h(str2, "format(...)");
            interfaceC3540l2 = interfaceC3540lR;
            a1.b(str2, null, c6562a.a(interfaceC3540lR, i12).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540lR, i12).b().a(), interfaceC3540l2, 0, 0, 65530);
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ce.g
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return j.o(eVar, cVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J o(androidx.compose.ui.e eVar, a.c cVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        n(eVar, cVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final androidx.compose.ui.e eVar, final a.e eVar2, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-280346003);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(eVar2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-280346003, i11, -1, "com.ui.wifiman.ui.component.compliance.CountryInfoUS (ProductComplianceUi.kt:227)");
            }
            C cB = W.b(C8680c.f66832a.f(), f0.c.f46573a.i(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            Z z10 = Z.f66823a;
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            a0.a(z10.a(aVar2, 1.0f, true), interfaceC3540lR, 0);
            s9.b bVarA = Pe.a.f18599a.A();
            androidx.compose.ui.e eVarI = r.i(aVar2, Y0.h.j(28));
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            AbstractC8049c.c(bVarA, eVarI, C6733v0.g(c6562a.a(interfaceC3540lR, i12).f().b()), null, interfaceC3540lR, 54, 4);
            a0.a(r.z(aVar2, Y0.h.j(12)), interfaceC3540lR, 6);
            String str = String.format(H0.f.a(AbstractC6780c.f53270A0, interfaceC3540lR, 0), Arrays.copyOf(new Object[]{eVar2.a()}, 1));
            AbstractC6492s.h(str, "format(...)");
            interfaceC3540l2 = interfaceC3540lR;
            a1.b(str, null, c6562a.a(interfaceC3540lR, i12).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540lR, i12).b().a(), interfaceC3540l2, 0, 0, 65530);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ce.d
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return j.q(eVar, eVar2, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J q(androidx.compose.ui.e eVar, a.e eVar2, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        p(eVar, eVar2, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    private static final void r(final InterfaceC8687j interfaceC8687j, final Ci.c cVar, InterfaceC3540l interfaceC3540l, final int i10) {
        InterfaceC3540l interfaceC3540l2;
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1025302120);
        int i12 = (i10 & 48) == 0 ? (interfaceC3540lR.T(cVar) ? 32 : 16) | i10 : i10;
        if ((i12 & 17) == 16 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1025302120, i12, -1, "com.ui.wifiman.ui.component.compliance.CountryWarningInfo (ProductComplianceUi.kt:323)");
            }
            int i13 = 0;
            for (Object obj : cVar) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC3689v.v();
                }
                String str = (String) obj;
                interfaceC3540lR.U(2014539065);
                if (i13 != 0) {
                    i11 = 1;
                    AbstractC8722b.b(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), 0L, 0.0f, 0.0f, 0.0f, interfaceC3540lR, 6, 30);
                } else {
                    i11 = 1;
                }
                interfaceC3540lR.J();
                androidx.compose.ui.e eVarK = o.k(r.h(androidx.compose.ui.e.f28771b0, 0.0f, i11, null), 0.0f, Y0.h.j(16), i11, null);
                C6562a c6562a = C6562a.f52458a;
                int i15 = C6562a.f52459b;
                InterfaceC3540l interfaceC3540l3 = interfaceC3540lR;
                a1.b(str, eVarK, c6562a.a(interfaceC3540lR, i15).f().c(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.f()), 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540lR, i15).b().f(), interfaceC3540l3, 48, 0, 65016);
                i13 = i14;
                interfaceC3540lR = interfaceC3540l3;
            }
            interfaceC3540l2 = interfaceC3540lR;
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ce.h
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj2, Object obj3) {
                    return j.s(interfaceC8687j, cVar, i10, (InterfaceC3540l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J s(InterfaceC8687j interfaceC8687j, Ci.c cVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        r(interfaceC8687j, cVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void t(androidx.compose.ui.e eVar, final Ce.b vm, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        a.d dVar;
        a.d dVar2;
        int i13;
        a.d dVar3;
        a.d dVar4;
        a.d dVar5;
        a.d dVar6;
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1356869041);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? interfaceC3540lR.T(vm) : interfaceC3540lR.l(vm) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i14 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1356869041, i12, -1, "com.ui.wifiman.ui.component.compliance.ProductComplianceContent (ProductComplianceUi.kt:96)");
            }
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.g(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar3);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            Ce.a aVar2 = (Ce.a) o1.b(vm.z(), null, interfaceC3540lR, 0, 1).getValue();
            a.d dVarD = aVar2.d();
            a.e eVarE2 = aVar2.e();
            interfaceC3540lR.U(-1780608767);
            if (eVarE2 == null) {
                i13 = 6;
            } else {
                if (dVarD != null) {
                    dVar2 = dVarD;
                    dVar = null;
                } else {
                    dVar = dVarD;
                    dVar2 = null;
                }
                Locale US = Locale.US;
                AbstractC6492s.h(US, "US");
                i13 = 6;
                h(null, dVar2, z(US), b0.c.e(1231398295, true, new b(eVarE2), interfaceC3540lR, 54), interfaceC3540lR, 3072, 1);
                interfaceC3540lR.U(-1780600729);
                if (!eVarE2.b().isEmpty()) {
                    r(c8688k, eVarE2.b(), interfaceC3540lR, 6);
                }
                interfaceC3540lR.J();
                a0.a(r.i(androidx.compose.ui.e.f28771b0, Y0.h.j(16)), interfaceC3540lR, 6);
                dVarD = dVar;
            }
            interfaceC3540lR.J();
            a.c cVarC = aVar2.c();
            interfaceC3540lR.U(-1780595131);
            if (cVarC != null) {
                if (dVarD != null) {
                    dVar6 = dVarD;
                    dVar5 = null;
                } else {
                    dVar5 = dVarD;
                    dVar6 = null;
                }
                Locale CANADA = Locale.CANADA;
                AbstractC6492s.h(CANADA, "CANADA");
                h(null, dVar6, z(CANADA), b0.c.e(1703796384, true, new c(cVarC), interfaceC3540lR, 54), interfaceC3540lR, 3072, 1);
                interfaceC3540lR.U(-1780586969);
                if (!cVarC.c().isEmpty()) {
                    r(c8688k, cVarC.c(), interfaceC3540lR, i13);
                }
                interfaceC3540lR.J();
                a0.a(r.i(androidx.compose.ui.e.f28771b0, Y0.h.j(16)), interfaceC3540lR, i13);
                dVarD = dVar5;
            }
            interfaceC3540lR.J();
            a.C0130a c0130aA = aVar2.a();
            interfaceC3540lR.U(-1780581438);
            if (c0130aA != null) {
                if (dVarD != null) {
                    dVar4 = dVarD;
                    dVar3 = null;
                } else {
                    dVar3 = dVarD;
                    dVar4 = null;
                }
                h(null, dVar4, z(new Locale("en", "au")), b0.c.e(2092999849, true, new d(c0130aA), interfaceC3540lR, 54), interfaceC3540lR, 3072, 1);
                a0.a(r.i(androidx.compose.ui.e.f28771b0, Y0.h.j(16)), interfaceC3540lR, i13);
                dVarD = dVar3;
            }
            interfaceC3540lR.J();
            a.b bVarB = aVar2.b();
            interfaceC3540lR.U(-1780569822);
            if (bVarB != null) {
                h(null, dVarD != null ? dVarD : null, z(new Locale("pt", "br")), b0.c.e(2012604716, true, new e(bVarB), interfaceC3540lR, 54), interfaceC3540lR, 3072, 1);
                a0.a(r.i(androidx.compose.ui.e.f28771b0, Y0.h.j(16)), interfaceC3540lR, i13);
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ce.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return j.u(eVar3, vm, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J u(androidx.compose.ui.e eVar, Ce.b bVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        t(eVar, bVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    private static final String z(Locale locale) {
        String displayCountry = locale.getDisplayCountry(Locale.getDefault());
        if (displayCountry != null) {
            return displayCountry;
        }
        throw new IllegalStateException("us locale unavailable");
    }
}
