package C9;

import C0.C;
import C9.h;
import C9.i;
import C9.s;
import E0.InterfaceC2629g;
import L0.C3174d;
import N.AbstractC3320g;
import N.C3316e;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import W0.t;
import Yg.J;
import androidx.compose.ui.e;
import com.google.ar.core.ImageMetadata;
import f0.c;
import j0.AbstractC6234e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import ma.AbstractC6784a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import s9.InterfaceC7929a;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.C8680c;
import z.W;
import z.Y;
import z.Z;

/* loaded from: classes3.dex */
public abstract class s {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f2429a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f2430b;

        a(InterfaceC6824a interfaceC6824a, InterfaceC3551q0 interfaceC3551q0) {
            this.f2429a = interfaceC6824a;
            this.f2430b = interfaceC3551q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC6824a interfaceC6824a, InterfaceC3551q0 interfaceC3551q0) {
            if (s.j(interfaceC3551q0)) {
                interfaceC6824a.invoke();
            } else {
                s.k(interfaceC3551q0, true);
            }
            return J.f24997a;
        }

        public final void b(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.c(z10) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1754997316, i11, -1, "com.ui.core.ui.component.notifications.UiExpandableNotification.<anonymous>.<anonymous>.<anonymous> (UiNotifications.kt:358)");
            }
            if (z10) {
                interfaceC3540l.U(-1618743087);
                interfaceC3540l.U(-52216212);
                final InterfaceC6824a interfaceC6824a = this.f2429a;
                final InterfaceC3551q0 interfaceC3551q0 = this.f2430b;
                Object objF = interfaceC3540l.f();
                if (objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: C9.r
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return s.a.c(interfaceC6824a, interfaceC3551q0);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                AbstractC3320g.a((InterfaceC6824a) objF, androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(40)), false, null, null, E.h.g(), null, C3316e.f14407a.g(C6733v0.f52951b.d(), 0L, 0L, interfaceC3540l, (C3316e.f14418l << 9) | 6, 6), androidx.compose.foundation.layout.o.a(Y0.h.j(0)), C9.a.f2359a.a(), interfaceC3540l, 905994294, 76);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(-1617695907);
                AbstractC8049c.c(N9.b.f16117a.d(), androidx.compose.foundation.layout.r.v(androidx.compose.foundation.layout.o.i(androidx.compose.ui.e.f28771b0, Y0.h.j(10)), Y0.h.j(20)), C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().i()), null, interfaceC3540l, 48, 4);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b(((Boolean) obj).booleanValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.a f2431a;

        b(i.a aVar) {
            this.f2431a = aVar;
        }

        public final void a(Y Button, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(Button, "$this$Button");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-467163492, i10, -1, "com.ui.core.ui.component.notifications.UiExpandableNotification.<anonymous>.<anonymous> (UiNotifications.kt:410)");
            }
            AbstractC8049c.e(((i.a.C0108a) this.f2431a).a(), androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(20)), null, null, null, null, null, 0.0f, null, interfaceC3540l, 48, 254);
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

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.a f2432a;

        c(i.a aVar) {
            this.f2432a = aVar;
        }

        public final void a(Y TextButton, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(TextButton, "$this$TextButton");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1488483858, i10, -1, "com.ui.core.ui.component.notifications.UiExpandableNotification.<anonymous>.<anonymous> (UiNotifications.kt:426)");
            }
            C3174d c3174dA = AbstractC7930a.a(((i.a.b) this.f2432a).a(), interfaceC3540l, 0);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            a1.c(c3174dA, null, c6562a.a(interfaceC3540l, i11).a().b().f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 3072, 122874);
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

    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f2433a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f2434b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mh.q f2435c;

        d(i iVar, long j10, mh.q qVar) {
            this.f2433a = iVar;
            this.f2434b = j10;
            this.f2435c = qVar;
        }

        public final void a(Y UiNotificationRow, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(UiNotificationRow, "$this$UiNotificationRow");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(UiNotificationRow) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(869179985, i11, -1, "com.ui.core.ui.component.notifications.UiNotificationBase.<anonymous> (UiNotifications.kt:265)");
            }
            InterfaceC7929a interfaceC7929aB = this.f2433a.b();
            e.a aVar = androidx.compose.ui.e.f28771b0;
            AbstractC8049c.e(interfaceC7929aB, androidx.compose.foundation.layout.r.v(androidx.compose.foundation.layout.o.m(aVar, 0.0f, 0.0f, Y0.h.j(8), 0.0f, 11, null), Y0.h.j(20)), null, null, null, null, null, 0.0f, null, interfaceC3540l, 48, 254);
            a1.c(AbstractC7930a.a(this.f2433a.c(), interfaceC3540l, 0), Y.b(UiNotificationRow, aVar, 1.0f, false, 2, null), this.f2434b, 0L, null, null, null, 0L, null, null, 0L, t.f23567a.b(), false, 1, 0, null, null, C6562a.f52458a.c(interfaceC3540l, C6562a.f52459b).b().a(), interfaceC3540l, 0, 3120, 120824);
            this.f2435c.s(UiNotificationRow, interfaceC3540l, Integer.valueOf(i11 & 14));
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

    static final class e implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f2436a;

        e(i iVar) {
            this.f2436a = iVar;
        }

        public final void a(Y UiNotificationBase, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiNotificationBase, "$this$UiNotificationBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(376261625, i10, -1, "com.ui.core.ui.component.notifications.UiRegularNotification.<anonymous> (UiNotifications.kt:204)");
            }
            i.a aVarA = this.f2436a.a();
            if (aVarA instanceof i.a.C0108a) {
                interfaceC3540l.U(-491766163);
                AbstractC8049c.e(((i.a.C0108a) aVarA).a(), androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(20)), null, null, null, null, null, 0.0f, null, interfaceC3540l, 48, 254);
                interfaceC3540l.J();
            } else if (aVarA instanceof i.a.b) {
                interfaceC3540l.U(-491625919);
                C3174d c3174dA = AbstractC7930a.a(((i.a.b) aVarA).a(), interfaceC3540l, 0);
                androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.ui.e.f28771b0, Y0.h.j(8), 0.0f, 2, null);
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                a1.c(c3174dA, eVarK, c6562a.a(interfaceC3540l, i11).a().b().f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 48, 3072, 122872);
                interfaceC3540l.J();
            } else {
                if (aVarA != null) {
                    interfaceC3540l.U(1785249757);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(1785267975);
                interfaceC3540l.J();
            }
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

    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2437a;

        static {
            int[] iArr = new int[i.b.values().length];
            try {
                iArr[i.b.Regular.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.b.Expandable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2437a = iArr;
        }
    }

    private static final g A(h hVar, InterfaceC3540l interfaceC3540l, int i10) {
        Object objZ;
        interfaceC3540l.U(-1958856487);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1958856487, i10, -1, "com.ui.core.ui.component.notifications.rememberNotificationColors (UiNotifications.kt:91)");
        }
        AbstractC6784a abstractC6784aA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b);
        interfaceC3540l.U(-1380933700);
        boolean zT = interfaceC3540l.T(abstractC6784aA);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            if (AbstractC6492s.d(hVar, h.a.f2378a)) {
                objZ = z(abstractC6784aA, false);
            } else {
                if (!AbstractC6492s.d(hVar, h.b.f2379a)) {
                    throw new NoWhenBranchMatchedException();
                }
                objZ = z(abstractC6784aA, true);
            }
            objF = objZ;
            interfaceC3540l.K(objF);
        }
        g gVar = (g) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(androidx.compose.ui.e r48, final C9.i r49, final mh.InterfaceC6824a r50, final mh.InterfaceC6824a r51, boolean r52, boolean r53, C9.h r54, T.InterfaceC3540l r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.s.i(androidx.compose.ui.e, C9.i, mh.a, mh.a, boolean, boolean, C9.h, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(InterfaceC3551q0 interfaceC3551q0) {
        return ((Boolean) interfaceC3551q0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(InterfaceC3551q0 interfaceC3551q0, boolean z10) {
        interfaceC3551q0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J l(InterfaceC3551q0 interfaceC3551q0, k0.l it) {
        AbstractC6492s.i(it, "it");
        interfaceC3551q0.setValue(Boolean.valueOf(it.isFocused()));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m(InterfaceC3551q0 interfaceC3551q0) {
        k(interfaceC3551q0, true);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J n(androidx.compose.ui.e eVar, i iVar, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, boolean z10, boolean z11, h hVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        i(eVar, iVar, interfaceC6824a, interfaceC6824a2, z10, z11, hVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void o(androidx.compose.ui.e r18, final C9.i r19, boolean r20, final mh.InterfaceC6824a r21, final mh.InterfaceC6824a r22, C9.h r23, T.InterfaceC3540l r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.s.o(androidx.compose.ui.e, C9.i, boolean, mh.a, mh.a, C9.h, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(androidx.compose.ui.e eVar, i iVar, boolean z10, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, h hVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        o(eVar, iVar, z10, interfaceC6824a, interfaceC6824a2, hVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    private static final void q(androidx.compose.ui.e eVar, final i iVar, final long j10, final long j11, final InterfaceC6824a interfaceC6824a, final mh.q qVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1337155019);
        int i13 = i11 & 1;
        if (i13 != 0) {
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
            i12 |= interfaceC3540lR.T(iVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.j(j10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.j(j11) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6824a) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((i11 & 32) != 0) {
            i12 |= ImageMetadata.EDGE_MODE;
        } else if ((i10 & ImageMetadata.EDGE_MODE) == 0) {
            i12 |= interfaceC3540lR.l(qVar) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i12) == 74898 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1337155019, i12, -1, "com.ui.core.ui.component.notifications.UiNotificationBase (UiNotifications.kt:258)");
            }
            int i14 = (i12 & 14) | 24576;
            int i15 = i12 >> 3;
            s(eVar3, j10, iVar.a() != null, interfaceC6824a, b0.c.e(869179985, true, new d(iVar, j11, qVar), interfaceC3540lR, 54), interfaceC3540lR, i14 | (i15 & 112) | (i15 & 7168));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar4 = eVar3;
            x0Z.a(new InterfaceC6839p() { // from class: C9.j
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return s.r(eVar4, iVar, j10, j11, interfaceC6824a, qVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J r(androidx.compose.ui.e eVar, i iVar, long j10, long j11, InterfaceC6824a interfaceC6824a, mh.q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        q(eVar, iVar, j10, j11, interfaceC6824a, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    private static final void s(final androidx.compose.ui.e eVar, final long j10, final boolean z10, final InterfaceC6824a interfaceC6824a, final mh.q qVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(180152952);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.j(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6824a) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.l(qVar) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((i11 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(180152952, i11, -1, "com.ui.core.ui.component.notifications.UiNotificationRow (UiNotifications.kt:232)");
            }
            float f10 = 8;
            androidx.compose.ui.e eVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.b.d(AbstractC6234e.a(androidx.compose.foundation.layout.r.b(eVar, 0.0f, Y0.h.j(40), 1, null), E.h.d(Y0.h.j(f10))), j10, null, 2, null), z10, null, null, interfaceC6824a, 6, null);
            c.a aVar = f0.c.f46573a;
            C cH = androidx.compose.foundation.layout.d.h(aVar.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarD);
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
            E1.c(interfaceC3540lA, cH, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.ui.e.f28771b0, Y0.h.j(f10), Y0.h.j(10));
            C cB = W.b(C8680c.f66832a.f(), aVar.i(), interfaceC3540lR, 48);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarJ);
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
            E1.c(interfaceC3540lA2, cB, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            qVar.s(Z.f66823a, interfaceC3540lR, Integer.valueOf(((i11 >> 9) & 112) | 6));
            interfaceC3540lR.R();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: C9.k
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return s.t(eVar, j10, z10, interfaceC6824a, qVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J t(androidx.compose.ui.e eVar, long j10, boolean z10, InterfaceC6824a interfaceC6824a, mh.q qVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        s(eVar, j10, z10, interfaceC6824a, qVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void u(androidx.compose.ui.e r18, final C9.i r19, final mh.InterfaceC6824a r20, C9.h r21, T.InterfaceC3540l r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.s.u(androidx.compose.ui.e, C9.i, mh.a, C9.h, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J v(InterfaceC3551q0 interfaceC3551q0, k0.l it) {
        AbstractC6492s.i(it, "it");
        interfaceC3551q0.setValue(Boolean.valueOf(it.isFocused()));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J w(androidx.compose.ui.e eVar, i iVar, InterfaceC6824a interfaceC6824a, h hVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        u(eVar, iVar, interfaceC6824a, hVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    private static final g z(AbstractC6784a abstractC6784a, boolean z10) {
        if (abstractC6784a instanceof AbstractC6784a.d) {
            return new g(abstractC6784a.f().a(), AbstractC6784a.b.f53648a.f().a(), z10 ? abstractC6784a.a().g().a() : abstractC6784a.a().g().b(), abstractC6784a.f().b(), abstractC6784a.a().g().e(), abstractC6784a.a().g().f(), null);
        }
        if (!(abstractC6784a instanceof AbstractC6784a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return new g(abstractC6784a.f().b(), AbstractC6784a.d.f53661a.f().b(), z10 ? abstractC6784a.a().g().b() : abstractC6784a.a().g().a(), abstractC6784a.f().b(), abstractC6784a.a().g().f(), abstractC6784a.a().g().e(), null);
    }
}
