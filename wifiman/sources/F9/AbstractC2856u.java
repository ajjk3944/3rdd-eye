package F9;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.InterfaceC7929a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* renamed from: F9.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2856u {

    /* renamed from: F9.u$a */
    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s9.b f6398a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6399b;

        a(s9.b bVar, String str) {
            this.f6398a = bVar;
            this.f6399b = str;
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
                AbstractC3546o.Q(323689977, i10, -1, "com.ui.core.ui.component.settings.UiSettingsButton.<anonymous> (UiSettingsButton.kt:83)");
            }
            androidx.compose.ui.e eVarA = UiSettingsBase.a(androidx.compose.ui.e.f28771b0, 1.0f, false);
            c.b bVarJ = f0.c.f46573a.j();
            String str = this.f6399b;
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), bVarJ, interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarA);
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
            interfaceC3540l.U(638084281);
            if (str != null) {
                G9.o.b(null, str, 0, 0, interfaceC3540l, 0, 13);
            }
            interfaceC3540l.J();
            interfaceC3540l.R();
            s9.b bVar = this.f6398a;
            if (bVar != null) {
                G9.m.b(bVar, interfaceC3540l, 0, 0);
            }
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

    /* renamed from: F9.u$b */
    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6400a;

        b(String str) {
            this.f6400a = str;
        }

        public final void a(z.Y UiSettingsBase, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiSettingsBase, "$this$UiSettingsBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-223149448, i10, -1, "com.ui.core.ui.component.settings.UiSettingsButton.<anonymous> (UiSettingsButton.kt:92)");
            }
            G9.e.b(this.f6400a, androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, 0.0f, 0.0f, 0.0f, Y0.h.j(8), 7, null), interfaceC3540l, 48, 0);
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

    /* renamed from: F9.u$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6401a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.DEFAULT_WITH_BLUE_ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.RED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6401a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r39, s9.InterfaceC7929a r40, final java.lang.String r41, java.lang.String r42, java.lang.String r43, s9.b r44, F9.r r45, boolean r46, java.lang.Boolean r47, java.lang.String r48, mh.InterfaceC6824a r49, mh.InterfaceC6824a r50, float r51, mh.q r52, T.InterfaceC3540l r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.AbstractC2856u.c(androidx.compose.ui.e, s9.a, java.lang.String, java.lang.String, java.lang.String, s9.b, F9.r, boolean, java.lang.Boolean, java.lang.String, mh.a, mh.a, float, mh.q, T.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d() {
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, InterfaceC7929a interfaceC7929a, String str, String str2, String str3, s9.b bVar, r rVar, boolean z10, Boolean bool, String str4, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, float f10, mh.q qVar, int i10, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        c(eVar, interfaceC7929a, str, str2, str3, bVar, rVar, z10, bool, str4, interfaceC6824a, interfaceC6824a2, f10, qVar, interfaceC3540l, L0.a(i10 | 1), L0.a(i11), i12);
        return Yg.J.f24997a;
    }
}
