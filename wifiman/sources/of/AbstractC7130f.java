package of;

import E.h;
import Li.P;
import Li.z;
import T.InterfaceC3540l;
import T.L0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6778a;
import of.C7125a;
import org.kodein.di.DI;
import s.C7846g;
import s9.InterfaceC7929a;
import s9.c;
import s9.d;

/* renamed from: of.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7130f {

    /* renamed from: of.f$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55674a;

        static {
            int[] iArr = new int[C7125a.EnumC2013a.values().length];
            try {
                iArr[C7125a.EnumC2013a.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C7125a.EnumC2013a.LOGGED_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C7125a.EnumC2013a.NO_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C7125a.EnumC2013a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C7125a.EnumC2013a.UNAUTHENTICATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f55674a = iArr;
        }
    }

    /* renamed from: of.f$b */
    public static final class b extends C7125a.c {

        /* renamed from: g, reason: collision with root package name */
        private final z f55675g;

        /* renamed from: h, reason: collision with root package name */
        private final z f55676h;

        /* renamed from: i, reason: collision with root package name */
        private final z f55677i;

        /* renamed from: j, reason: collision with root package name */
        private final z f55678j;

        b(s9.c cVar, C7125a.EnumC2013a enumC2013a, String str, String str2) {
            this.f55675g = P.a(cVar);
            this.f55676h = P.a(enumC2013a);
            this.f55677i = P.a(str != null ? new d.c(str) : null);
            this.f55678j = P.a(str2 != null ? new d.c(str2) : null);
        }

        @Override // org.kodein.di.c
        public DI d() {
            throw new IllegalStateException();
        }

        @Override // of.C7125a.c
        public void r0() {
        }

        @Override // of.C7125a.c
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public z n0() {
            return this.f55676h;
        }

        @Override // of.C7125a.c
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public z o0() {
            return this.f55675g;
        }

        @Override // of.C7125a.c
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public z p0() {
            return this.f55678j;
        }

        @Override // of.C7125a.c
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public z q0() {
            return this.f55677i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.e r22, final of.C7125a.c r23, T.InterfaceC3540l r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: of.AbstractC7130f.e(androidx.compose.ui.e, of.a$c, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(C7125a.c cVar) {
        cVar.r0();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(androidx.compose.ui.e eVar, C7125a.c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(androidx.compose.ui.e r33, final s9.c r34, final s9.InterfaceC7929a.b r35, final boolean r36, final float r37, s.C7846g r38, T.InterfaceC3540l r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: of.AbstractC7130f.h(androidx.compose.ui.e, s9.c, s9.a$b, boolean, float, s.g, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(androidx.compose.ui.graphics.c graphicsLayer) {
        AbstractC6492s.i(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.I1(h.g());
        graphicsLayer.G(true);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(androidx.compose.ui.e eVar, s9.c cVar, InterfaceC7929a.b bVar, boolean z10, float f10, C7846g c7846g, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        h(eVar, cVar, bVar, z10, f10, c7846g, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final C7125a.c k(C7125a c7125a, s9.c avatar, C7125a.EnumC2013a accountState, String str, String str2) {
        AbstractC6492s.i(c7125a, "<this>");
        AbstractC6492s.i(avatar, "avatar");
        AbstractC6492s.i(accountState, "accountState");
        return new b(avatar, accountState, str, str2);
    }

    public static /* synthetic */ C7125a.c l(C7125a c7125a, s9.c cVar, C7125a.EnumC2013a enumC2013a, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = new c.a(AbstractC6778a.f53255t0, null, 2, null);
        }
        if ((i10 & 2) != 0) {
            enumC2013a = C7125a.EnumC2013a.LOGGED_IN;
        }
        if ((i10 & 4) != 0) {
            str = "Robert Pera";
        }
        if ((i10 & 8) != 0) {
            str2 = "robert@ui.com";
        }
        return k(c7125a, cVar, enumC2013a, str, str2);
    }
}
