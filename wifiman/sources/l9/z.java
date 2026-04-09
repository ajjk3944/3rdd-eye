package L9;

import N.AbstractC3343s;
import N.AbstractC3345t;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.H0;
import T.I0;
import T.InterfaceC3540l;
import T.L0;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import ta.AbstractC8049c;

/* loaded from: classes3.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f11496a = AbstractC3561w.f(a.f11497a);

    static final class a implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11497a = new a();

        a() {
        }

        public final long a() {
            return C6733v0.f52951b.e();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C6733v0.g(a());
        }
    }

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f11498a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f11499b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s9.b f11500c;

        static final class a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s9.b f11501a;

            a(s9.b bVar) {
                this.f11501a = bVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1724597530, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbarIconButton.<anonymous>.<anonymous> (UiToolbarIconButton.kt:33)");
                }
                AbstractC8049c.c(this.f11501a, androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(24)), null, null, interfaceC3540l, 48, 6);
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

        b(boolean z10, long j10, s9.b bVar) {
            this.f11498a = z10;
            this.f11499b = j10;
            this.f11500c = bVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            float fB;
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(681693274, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbarIconButton.<anonymous> (UiToolbarIconButton.kt:28)");
            }
            if (this.f11498a) {
                interfaceC3540l.U(-570587076);
                fB = ((Number) interfaceC3540l.t(AbstractC3343s.a())).floatValue();
            } else {
                interfaceC3540l.U(-570586243);
                fB = N.r.f14715a.b(interfaceC3540l, N.r.f14716b);
            }
            interfaceC3540l.J();
            AbstractC3561w.b(new I0[]{AbstractC3345t.a().d(C6733v0.g(this.f11499b)), AbstractC3343s.a().d(Float.valueOf(fB))}, b0.c.e(1724597530, true, new a(this.f11500c), interfaceC3540l, 54), interfaceC3540l, I0.f20869i | 48);
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final s9.b r18, androidx.compose.ui.e r19, long r20, boolean r22, mh.InterfaceC6824a r23, T.InterfaceC3540l r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L9.z.c(s9.b, androidx.compose.ui.e, long, boolean, mh.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d() {
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(s9.b bVar, androidx.compose.ui.e eVar, long j10, boolean z10, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(bVar, eVar, j10, z10, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    public static final H0 f() {
        return f11496a;
    }
}
