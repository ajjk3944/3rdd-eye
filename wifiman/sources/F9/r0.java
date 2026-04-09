package F9;

import N.AbstractC3343s;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import androidx.compose.ui.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import s9.InterfaceC7929a;

/* loaded from: classes3.dex */
public abstract class r0 {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6733v0 f6356a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6733v0 f6357b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s9.b f6358c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC2847k f6359d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6360e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f6361f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f6362g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f6363h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f6364i;

        /* renamed from: F9.r0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0247a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f6365a;

            static {
                int[] iArr = new int[EnumC2847k.values().length];
                try {
                    iArr[EnumC2847k.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2847k.END.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f6365a = iArr;
            }
        }

        a(C6733v0 c6733v0, C6733v0 c6733v02, s9.b bVar, EnumC2847k enumC2847k, boolean z10, InterfaceC6824a interfaceC6824a, String str, InterfaceC6824a interfaceC6824a2, int i10) {
            this.f6356a = c6733v0;
            this.f6357b = c6733v02;
            this.f6358c = bVar;
            this.f6359d = enumC2847k;
            this.f6360e = z10;
            this.f6361f = interfaceC6824a;
            this.f6362g = str;
            this.f6363h = interfaceC6824a2;
            this.f6364i = i10;
        }

        public final void a(z.Y UiSettingsBase, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(UiSettingsBase, "$this$UiSettingsBase");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(UiSettingsBase) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1592430882, i11, -1, "com.ui.core.ui.component.settings.UiSettingsTextValue.<anonymous> (UiSettingsTextValue.kt:157)");
            }
            C6733v0 c6733v0 = this.f6356a;
            interfaceC3540l.U(-396188338);
            long jC = c6733v0 == null ? C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().c() : c6733v0.u();
            interfaceC3540l.J();
            long jK = C6733v0.k(jC, ((Number) interfaceC3540l.t(AbstractC3343s.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            C6733v0 c6733v02 = this.f6357b;
            if (c6733v02 == null) {
                c6733v02 = this.f6356a;
            }
            interfaceC3540l.U(-396184320);
            long jC2 = c6733v02 == null ? C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().c() : c6733v02.u();
            interfaceC3540l.J();
            long jK2 = C6733v0.k(jC2, ((Number) interfaceC3540l.t(AbstractC3343s.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            if (this.f6358c != null) {
                interfaceC3540l.U(603378310);
                int i12 = C0247a.f6365a[this.f6359d.ordinal()];
                if (i12 == 1) {
                    interfaceC3540l.U(603426546);
                    r0.i(this.f6358c, jK2, this.f6360e, this.f6361f, interfaceC3540l, 0, 0);
                    if (this.f6362g != null) {
                        e.a aVar = androidx.compose.ui.e.f28771b0;
                        z.a0.a(androidx.compose.foundation.layout.r.z(aVar, Y0.h.j(4)), interfaceC3540l, 6);
                        r0.h(z.Y.b(UiSettingsBase, aVar, 1.0f, false, 2, null), this.f6362g, jK, this.f6360e, this.f6363h, this.f6364i, interfaceC3540l, 0, 0);
                    }
                    interfaceC3540l.J();
                } else {
                    if (i12 != 2) {
                        interfaceC3540l.U(-396177636);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(604095185);
                    interfaceC3540l.U(-396154360);
                    if (this.f6362g != null) {
                        e.a aVar2 = androidx.compose.ui.e.f28771b0;
                        r0.h(z.Y.b(UiSettingsBase, aVar2, 1.0f, false, 2, null), this.f6362g, jK, this.f6360e, this.f6363h, this.f6364i, interfaceC3540l, 0, 0);
                        z.a0.a(androidx.compose.foundation.layout.r.z(aVar2, Y0.h.j(4)), interfaceC3540l, 6);
                    }
                    interfaceC3540l.J();
                    r0.i(this.f6358c, jK2, this.f6360e, this.f6361f, interfaceC3540l, 0, 0);
                    interfaceC3540l.J();
                }
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(604765374);
                String str = this.f6362g;
                if (str != null) {
                    r0.h(null, str, jK, this.f6360e, this.f6363h, this.f6364i, interfaceC3540l, 0, 1);
                }
                interfaceC3540l.J();
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

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6366a;

        b(String str) {
            this.f6366a = str;
        }

        public final void a(z.Y UiSettingsBase, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiSettingsBase, "$this$UiSettingsBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1820277891, i10, -1, "com.ui.core.ui.component.settings.UiSettingsTextValue.<anonymous> (UiSettingsTextValue.kt:207)");
            }
            G9.e.b(this.f6366a, androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, 0.0f, 0.0f, 0.0f, Y0.h.j(8), 7, null), interfaceC3540l, 48, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(androidx.compose.ui.e r39, final java.lang.String r40, java.lang.String r41, final java.lang.String r42, m0.C6733v0 r43, int r44, s9.b r45, m0.C6733v0 r46, F9.EnumC2847k r47, boolean r48, java.lang.String r49, mh.InterfaceC6824a r50, mh.InterfaceC6824a r51, mh.InterfaceC6824a r52, s9.InterfaceC7929a r53, T.InterfaceC3540l r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.r0.f(androidx.compose.ui.e, java.lang.String, java.lang.String, java.lang.String, m0.v0, int, s9.b, m0.v0, F9.k, boolean, java.lang.String, mh.a, mh.a, mh.a, s9.a, T.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(androidx.compose.ui.e eVar, String str, String str2, String str3, C6733v0 c6733v0, int i10, s9.b bVar, C6733v0 c6733v02, EnumC2847k enumC2847k, boolean z10, String str4, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3, InterfaceC7929a interfaceC7929a, int i11, int i12, int i13, InterfaceC3540l interfaceC3540l, int i14) {
        f(eVar, str, str2, str3, c6733v0, i10, bVar, c6733v02, enumC2847k, z10, str4, interfaceC6824a, interfaceC6824a2, interfaceC6824a3, interfaceC7929a, interfaceC3540l, L0.a(i11 | 1), L0.a(i12), i13);
        return Yg.J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(androidx.compose.ui.e r29, final java.lang.String r30, final long r31, boolean r33, mh.InterfaceC6824a r34, final int r35, T.InterfaceC3540l r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.r0.h(androidx.compose.ui.e, java.lang.String, long, boolean, mh.a, int, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(s9.b r17, final long r18, boolean r20, mh.InterfaceC6824a r21, T.InterfaceC3540l r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.r0.i(s9.b, long, boolean, mh.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J j(InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a != null) {
            interfaceC6824a.invoke();
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J k(s9.b bVar, long j10, boolean z10, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        i(bVar, j10, z10, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J l(InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a != null) {
            interfaceC6824a.invoke();
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J m(androidx.compose.ui.e eVar, String str, long j10, boolean z10, InterfaceC6824a interfaceC6824a, int i10, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        h(eVar, str, j10, z10, interfaceC6824a, i10, interfaceC3540l, L0.a(i11 | 1), i12);
        return Yg.J.f24997a;
    }
}
