package F9;

import E0.InterfaceC2629g;
import N.AbstractC3313c0;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.I0;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s9.InterfaceC7929a;
import x9.AbstractC8438h;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes3.dex */
public abstract class I {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6061a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6062b;

        /* renamed from: F9.I$a$a, reason: collision with other inner class name */
        static final class C0240a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f6063a;

            C0240a(boolean z10) {
                this.f6063a = z10;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(750765666, i10, -1, "com.ui.core.ui.component.settings.UiSettingsCheckbox.<anonymous>.<anonymous> (UiSettingsCheckbox.kt:58)");
                }
                AbstractC8438h.m(androidx.compose.ui.e.f28771b0, this.f6063a, null, false, null, interfaceC3540l, 390, 24);
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

        a(String str, boolean z10) {
            this.f6061a = str;
            this.f6062b = z10;
        }

        public final void a(z.Y UiSettingsBase, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiSettingsBase, "$this$UiSettingsBase");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(UiSettingsBase) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1351675102, i10, -1, "com.ui.core.ui.component.settings.UiSettingsCheckbox.<anonymous> (UiSettingsCheckbox.kt:51)");
            }
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(UiSettingsBase.a(androidx.compose.ui.e.f28771b0, 1.0f, false), 0.0f, 0.0f, Y0.h.j(8), 0.0f, 11, null);
            c.b bVarJ = f0.c.f46573a.j();
            String str = this.f6061a;
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), bVarJ, interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarM);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            interfaceC3540l.U(2104406154);
            if (str != null) {
                G9.o.b(null, str, 0, 0, interfaceC3540l, 0, 13);
            }
            interfaceC3540l.J();
            interfaceC3540l.R();
            AbstractC3561w.a(AbstractC3313c0.b().d(Boolean.FALSE), b0.c.e(750765666, true, new C0240a(this.f6062b), interfaceC3540l, 54), interfaceC3540l, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((z.Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6064a;

        b(String str) {
            this.f6064a = str;
        }

        public final void a(z.Y UiSettingsBase, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiSettingsBase, "$this$UiSettingsBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2074303839, i10, -1, "com.ui.core.ui.component.settings.UiSettingsCheckbox.<anonymous> (UiSettingsCheckbox.kt:65)");
            }
            G9.e.b(this.f6064a, androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, 0.0f, 0.0f, 0.0f, Y0.h.j(8), 7, null), interfaceC3540l, 48, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((z.Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r37, final java.lang.String r38, java.lang.String r39, final boolean r40, s9.InterfaceC7929a r41, float r42, final mh.InterfaceC6835l r43, mh.InterfaceC6824a r44, boolean r45, java.lang.String r46, java.lang.String r47, T.InterfaceC3540l r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.I.c(androidx.compose.ui.e, java.lang.String, java.lang.String, boolean, s9.a, float, mh.l, mh.a, boolean, java.lang.String, java.lang.String, T.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(InterfaceC6835l interfaceC6835l, boolean z10) {
        if (interfaceC6835l != null) {
            interfaceC6835l.invoke(Boolean.valueOf(!z10));
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, String str, String str2, boolean z10, InterfaceC7929a interfaceC7929a, float f10, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, boolean z11, String str3, String str4, int i10, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        c(eVar, str, str2, z10, interfaceC7929a, f10, interfaceC6835l, interfaceC6824a, z11, str3, str4, interfaceC3540l, L0.a(i10 | 1), L0.a(i11), i12);
        return Yg.J.f24997a;
    }
}
