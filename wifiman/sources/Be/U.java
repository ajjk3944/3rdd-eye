package Be;

import Be.N;
import Be.U;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import Zg.AbstractC3689v;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import z.InterfaceC8687j;
import z9.AbstractC8722b;

/* loaded from: classes4.dex */
public abstract class U {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ci.c f1500a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f1501b;

        a(Ci.c cVar, InterfaceC6835l interfaceC6835l) {
            this.f1500a = cVar;
            this.f1501b = interfaceC6835l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(InterfaceC6835l interfaceC6835l, N.a aVar) {
            interfaceC6835l.invoke(aVar.c());
            return Yg.J.f24997a;
        }

        public final void b(InterfaceC8687j DropdownMenu, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(DropdownMenu, "$this$DropdownMenu");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(139792087, i10, -1, "com.ui.wifiman.ui.component.UiDropdownMenu.<anonymous> (UiDropdownMenu.kt:77)");
            }
            Ci.c cVar = this.f1500a;
            final InterfaceC6835l interfaceC6835l = this.f1501b;
            int i11 = 0;
            for (Object obj : cVar) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC3689v.v();
                }
                final N.a aVar = (N.a) obj;
                interfaceC3540l.U(-1732236353);
                if (i11 != 0) {
                    AbstractC8722b.b(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), 0L, 0.0f, 0.0f, 0.0f, interfaceC3540l, 6, 30);
                }
                interfaceC3540l.J();
                interfaceC3540l.U(-1119702606);
                boolean zT = interfaceC3540l.T(interfaceC6835l) | interfaceC3540l.T(aVar);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: Be.T
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return U.a.c(interfaceC6835l, aVar);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                U.f(null, aVar, null, (InterfaceC6824a) objF, interfaceC3540l, 0, 5);
                i11 = i12;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1502a;

        static {
            int[] iArr = new int[N.a.EnumC0068a.values().length];
            try {
                iArr[N.a.EnumC0068a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N.a.EnumC0068a.DESTRUCTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1502a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.e r22, final boolean r23, final mh.InterfaceC6824a r24, long r25, androidx.compose.foundation.o r27, mh.InterfaceC6835l r28, final Ci.c r29, T.InterfaceC3540l r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Be.U.e(androidx.compose.ui.e, boolean, mh.a, long, androidx.compose.foundation.o, mh.l, Ci.c, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(androidx.compose.ui.e r38, final Be.N.a r39, z.N r40, mh.InterfaceC6824a r41, T.InterfaceC3540l r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Be.U.f(androidx.compose.ui.e, Be.N$a, z.N, mh.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g() {
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J h(androidx.compose.ui.e eVar, N.a aVar, z.N n10, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        f(eVar, aVar, n10, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(String it) {
        AbstractC6492s.i(it, "it");
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J j(androidx.compose.ui.e eVar, boolean z10, InterfaceC6824a interfaceC6824a, long j10, androidx.compose.foundation.o oVar, InterfaceC6835l interfaceC6835l, Ci.c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, z10, interfaceC6824a, j10, oVar, interfaceC6835l, cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
