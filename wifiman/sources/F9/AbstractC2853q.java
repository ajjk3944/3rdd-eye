package F9;

import E0.InterfaceC2629g;
import F9.AbstractC2848l;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.z1;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import f0.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import oh.AbstractC7137b;
import sh.AbstractC7978m;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* renamed from: F9.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2853q {

    /* renamed from: F9.q$a */
    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f6335a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f6336b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Boolean f6337c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6338d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ z.N f6339e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ mh.q f6340f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mh.q f6341g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f6342h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ mh.q f6343i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f6344j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f6345k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f6346l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f6347m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ mh.q f6348n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ AbstractC2848l f6349o;

        a(androidx.compose.ui.e eVar, InterfaceC6824a interfaceC6824a, Boolean bool, boolean z10, z.N n10, mh.q qVar, mh.q qVar2, String str, mh.q qVar3, String str2, long j10, long j11, int i10, mh.q qVar4, AbstractC2848l abstractC2848l) {
            this.f6335a = eVar;
            this.f6336b = interfaceC6824a;
            this.f6337c = bool;
            this.f6338d = z10;
            this.f6339e = n10;
            this.f6340f = qVar;
            this.f6341g = qVar2;
            this.f6342h = str;
            this.f6343i = qVar3;
            this.f6344j = str2;
            this.f6345k = j10;
            this.f6346l = j11;
            this.f6347m = i10;
            this.f6348n = qVar4;
            this.f6349o = abstractC2848l;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            androidx.compose.ui.e eVarD;
            int i11;
            float fJ;
            Object obj;
            boolean z10;
            androidx.compose.ui.e eVarH;
            int i12;
            Object obj2;
            z.Z z11;
            androidx.compose.ui.e eVarA;
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(929248496, i10, -1, "com.ui.core.ui.component.settings.UiSettingsBase.<anonymous> (UiSettingsBase.kt:88)");
            }
            androidx.compose.ui.e eVar = this.f6335a;
            if (this.f6336b != null) {
                e.a aVar = androidx.compose.ui.e.f28771b0;
                Boolean bool = this.f6337c;
                eVarD = androidx.compose.foundation.d.d(aVar, bool != null ? bool.booleanValue() : this.f6338d, null, null, this.f6336b, 6, null);
            } else {
                eVarD = androidx.compose.ui.e.f28771b0;
            }
            androidx.compose.ui.e eVarB0 = eVar.b0(eVarD);
            z.N n10 = this.f6339e;
            mh.q qVar = this.f6340f;
            mh.q qVar2 = this.f6341g;
            String str = this.f6342h;
            mh.q qVar3 = this.f6343i;
            String str2 = this.f6344j;
            long j10 = this.f6345k;
            long j11 = this.f6346l;
            int i13 = this.f6347m;
            boolean z12 = this.f6338d;
            mh.q qVar4 = this.f6348n;
            AbstractC2848l abstractC2848l = this.f6349o;
            C8680c c8680c = C8680c.f66832a;
            C8680c.m mVarG = c8680c.g();
            c.a aVar2 = f0.c.f46573a;
            C0.C cA = AbstractC8685h.a(mVarG, aVar2.k(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarB0);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
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
            E1.c(interfaceC3540lA, cA, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            c.InterfaceC1752c interfaceC1752cI = aVar2.i();
            e.a aVar4 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.o.h(androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.b(aVar4, 0.0f, Y0.h.j(48), 1, null), 0.0f, 1, null), n10);
            C0.C cB = z.W.b(c8680c.f(), interfaceC1752cI, interfaceC3540l, 48);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarH2);
            InterfaceC6824a interfaceC6824aA2 = aVar3.a();
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
            E1.c(interfaceC3540lA2, cB, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
            z.Z z13 = z.Z.f66823a;
            interfaceC3540l.U(-1950066160);
            if (qVar2 != null) {
                C0.C cB2 = z.W.b(c8680c.f(), aVar2.i(), interfaceC3540l, 48);
                int iA3 = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG3 = interfaceC3540l.G();
                androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l, aVar4);
                InterfaceC6824a interfaceC6824aA3 = aVar3.a();
                if (interfaceC3540l.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540l.u();
                if (interfaceC3540l.o()) {
                    interfaceC3540l.D(interfaceC6824aA3);
                } else {
                    interfaceC3540l.I();
                }
                InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540l);
                E1.c(interfaceC3540lA3, cB2, aVar3.e());
                E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar3.g());
                InterfaceC6839p interfaceC6839pB3 = aVar3.b();
                if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                    interfaceC3540lA3.K(Integer.valueOf(iA3));
                    interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
                }
                E1.c(interfaceC3540lA3, eVarE3, aVar3.f());
                qVar2.s(z13, interfaceC3540l, 6);
                interfaceC3540l.R();
                Yg.J j12 = Yg.J.f24997a;
            }
            interfaceC3540l.J();
            if (qVar2 == null || str == null) {
                i11 = 0;
                fJ = Y0.h.j(0);
            } else {
                fJ = Y0.h.j(8);
                i11 = 0;
            }
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(aVar4, fJ, 0.0f, Y0.h.j((qVar3 == null || str == null) ? i11 : 8), 0.0f, 10, null);
            boolean z14 = abstractC2848l instanceof AbstractC2848l.b;
            if (z14) {
                eVarH = z13.a(eVarM, 1.0f, true);
                obj = null;
                z10 = false;
            } else {
                if (!(abstractC2848l instanceof AbstractC2848l.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = null;
                z10 = false;
                eVarH = androidx.compose.foundation.layout.r.H(AbstractC2853q.k(eVarM, ((AbstractC2848l.a) abstractC2848l).a()), null, false, 3, null);
            }
            AbstractC2853q.e(eVarH, str2, str, j10, j11, i13, z12, qVar4, interfaceC3540l, 0, 0);
            interfaceC3540l.U(-1950014425);
            if (qVar3 == null) {
                z11 = z13;
                i12 = 0;
                obj2 = null;
            } else {
                if (z14) {
                    i12 = 0;
                    obj2 = null;
                    eVarA = androidx.compose.foundation.layout.r.H(AbstractC2853q.k(aVar4, ((AbstractC2848l.b) abstractC2848l).a()), null, false, 3, null);
                    z11 = z13;
                } else {
                    i12 = 0;
                    obj2 = null;
                    if (!(abstractC2848l instanceof AbstractC2848l.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z11 = z13;
                    eVarA = z11.a(aVar4, 1.0f, true);
                }
                C0.C cB3 = z.W.b(c8680c.c(), aVar2.i(), interfaceC3540l, 54);
                int iA4 = AbstractC3536j.a(interfaceC3540l, i12);
                InterfaceC3563x interfaceC3563xG4 = interfaceC3540l.G();
                androidx.compose.ui.e eVarE4 = androidx.compose.ui.c.e(interfaceC3540l, eVarA);
                InterfaceC6824a interfaceC6824aA4 = aVar3.a();
                if (interfaceC3540l.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540l.u();
                if (interfaceC3540l.o()) {
                    interfaceC3540l.D(interfaceC6824aA4);
                } else {
                    interfaceC3540l.I();
                }
                InterfaceC3540l interfaceC3540lA4 = E1.a(interfaceC3540l);
                E1.c(interfaceC3540lA4, cB3, aVar3.e());
                E1.c(interfaceC3540lA4, interfaceC3563xG4, aVar3.g());
                InterfaceC6839p interfaceC6839pB4 = aVar3.b();
                if (interfaceC3540lA4.o() || !AbstractC6492s.d(interfaceC3540lA4.f(), Integer.valueOf(iA4))) {
                    interfaceC3540lA4.K(Integer.valueOf(iA4));
                    interfaceC3540lA4.Q(Integer.valueOf(iA4), interfaceC6839pB4);
                }
                E1.c(interfaceC3540lA4, eVarE4, aVar3.f());
                qVar3.s(z11, interfaceC3540l, 6);
                interfaceC3540l.R();
                Yg.J j13 = Yg.J.f24997a;
            }
            interfaceC3540l.J();
            interfaceC3540l.R();
            interfaceC3540l.U(49926479);
            if (qVar != null) {
                androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(aVar4, Y0.h.j(16), 0.0f, 2, obj2);
                C0.C cB4 = z.W.b(c8680c.f(), aVar2.i(), interfaceC3540l, 48);
                int iA5 = AbstractC3536j.a(interfaceC3540l, i12);
                InterfaceC3563x interfaceC3563xG5 = interfaceC3540l.G();
                androidx.compose.ui.e eVarE5 = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
                InterfaceC6824a interfaceC6824aA5 = aVar3.a();
                if (interfaceC3540l.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540l.u();
                if (interfaceC3540l.o()) {
                    interfaceC3540l.D(interfaceC6824aA5);
                } else {
                    interfaceC3540l.I();
                }
                InterfaceC3540l interfaceC3540lA5 = E1.a(interfaceC3540l);
                E1.c(interfaceC3540lA5, cB4, aVar3.e());
                E1.c(interfaceC3540lA5, interfaceC3563xG5, aVar3.g());
                InterfaceC6839p interfaceC6839pB5 = aVar3.b();
                if (interfaceC3540lA5.o() || !AbstractC6492s.d(interfaceC3540lA5.f(), Integer.valueOf(iA5))) {
                    interfaceC3540lA5.K(Integer.valueOf(iA5));
                    interfaceC3540lA5.Q(Integer.valueOf(iA5), interfaceC6839pB5);
                }
                E1.c(interfaceC3540lA5, eVarE5, aVar3.f());
                qVar.s(z11, interfaceC3540l, 6);
                interfaceC3540l.R();
                Yg.J j14 = Yg.J.f24997a;
            }
            interfaceC3540l.J();
            interfaceC3540l.R();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final androidx.compose.ui.e r36, final java.lang.String r37, final java.lang.String r38, final long r39, final long r41, final int r43, final boolean r44, mh.q r45, T.InterfaceC3540l r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.AbstractC2853q.e(androidx.compose.ui.e, java.lang.String, java.lang.String, long, long, int, boolean, mh.q, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(androidx.compose.ui.e eVar, String str, String str2, long j10, long j11, int i10, boolean z10, mh.q qVar, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        e(eVar, str, str2, j10, j11, i10, z10, qVar, interfaceC3540l, L0.a(i11 | 1), i12);
        return Yg.J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(androidx.compose.ui.e r32, final java.lang.String r33, java.lang.String r34, long r35, long r37, long r39, int r41, mh.q r42, mh.q r43, mh.q r44, mh.q r45, z.N r46, boolean r47, java.lang.Boolean r48, F9.AbstractC2848l r49, mh.InterfaceC6824a r50, T.InterfaceC3540l r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.AbstractC2853q.g(androidx.compose.ui.e, java.lang.String, java.lang.String, long, long, long, int, mh.q, mh.q, mh.q, mh.q, z.N, boolean, java.lang.Boolean, F9.l, mh.a, T.l, int, int, int):void");
    }

    private static final float h(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(androidx.compose.ui.e eVar, String str, String str2, long j10, long j11, long j12, int i10, mh.q qVar, mh.q qVar2, mh.q qVar3, mh.q qVar4, z.N n10, boolean z10, Boolean bool, AbstractC2848l abstractC2848l, InterfaceC6824a interfaceC6824a, int i11, int i12, int i13, InterfaceC3540l interfaceC3540l, int i14) {
        g(eVar, str, str2, j10, j11, j12, i10, qVar, qVar2, qVar3, qVar4, n10, z10, bool, abstractC2848l, interfaceC6824a, interfaceC3540l, L0.a(i11 | 1), L0.a(i12), i13);
        return Yg.J.f24997a;
    }

    public static final androidx.compose.ui.e k(androidx.compose.ui.e eVar, final float f10) {
        AbstractC6492s.i(eVar, "<this>");
        return androidx.compose.ui.layout.g.a(eVar, new mh.q() { // from class: F9.n
            @Override // mh.q
            public final Object s(Object obj, Object obj2, Object obj3) {
                return AbstractC2853q.l(f10, (androidx.compose.ui.layout.m) obj, (C0.B) obj2, (Y0.b) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0.D l(float f10, androidx.compose.ui.layout.m layout, C0.B measurable, Y0.b bVar) {
        AbstractC6492s.i(layout, "$this$layout");
        AbstractC6492s.i(measurable, "measurable");
        int iG = AbstractC7978m.g(measurable.S(Y0.b.k(bVar.r())), AbstractC7137b.e(Y0.b.l(bVar.r()) * f10));
        final androidx.compose.ui.layout.t tVarT = measurable.T(Y0.c.a(Y0.b.n(bVar.r()), iG, Y0.b.m(bVar.r()), Y0.b.k(bVar.r())));
        return androidx.compose.ui.layout.m.x0(layout, iG, tVarT.C0(), null, new InterfaceC6835l() { // from class: F9.p
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC2853q.m(tVarT, (t.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J m(androidx.compose.ui.layout.t tVar, t.a layout) {
        AbstractC6492s.i(layout, "$this$layout");
        t.a.l(layout, tVar, 0, 0, 0.0f, 4, null);
        return Yg.J.f24997a;
    }
}
