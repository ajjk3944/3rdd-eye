package N;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.z1;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import r.AbstractC7535j;
import r.o0;
import y.InterfaceC8558m;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* renamed from: N.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3327j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f14457a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f14458b;

    /* renamed from: d, reason: collision with root package name */
    private static final float f14460d;

    /* renamed from: g, reason: collision with root package name */
    private static final float f14463g;

    /* renamed from: c, reason: collision with root package name */
    private static final float f14459c = Y0.h.j(16);

    /* renamed from: e, reason: collision with root package name */
    private static final float f14461e = Y0.h.j(112);

    /* renamed from: f, reason: collision with root package name */
    private static final float f14462f = Y0.h.j(280);

    /* renamed from: N.j0$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f14464a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1 f14465b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1 f14466c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3551q0 interfaceC3551q0, z1 z1Var, z1 z1Var2) {
            super(1);
            this.f14464a = interfaceC3551q0;
            this.f14465b = z1Var;
            this.f14466c = z1Var2;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.i(AbstractC3327j0.b(this.f14465b));
            cVar.g(AbstractC3327j0.b(this.f14465b));
            cVar.a(AbstractC3327j0.c(this.f14466c));
            cVar.y1(((androidx.compose.ui.graphics.f) this.f14464a.getValue()).j());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.j0$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14467a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.o f14468b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mh.q f14469c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, androidx.compose.foundation.o oVar, mh.q qVar) {
            super(2);
            this.f14467a = eVar;
            this.f14468b = oVar;
            this.f14469c = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(895555282, i10, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:122)");
            }
            androidx.compose.ui.e eVarD = androidx.compose.foundation.m.d(androidx.compose.foundation.layout.i.b(androidx.compose.foundation.layout.o.k(this.f14467a, 0.0f, AbstractC3327j0.i(), 1, null), z.J.Max), this.f14468b, false, null, false, 14, null);
            mh.q qVar = this.f14469c;
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarD);
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
            qVar.s(C8688k.f66923a, interfaceC3540l, 6);
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

    /* renamed from: N.j0$c */
    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r.W f14470a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f14471b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.o f14472c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14473d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ mh.q f14474e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14475f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f14476g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r.W w10, InterfaceC3551q0 interfaceC3551q0, androidx.compose.foundation.o oVar, androidx.compose.ui.e eVar, mh.q qVar, int i10, int i11) {
            super(2);
            this.f14470a = w10;
            this.f14471b = interfaceC3551q0;
            this.f14472c = oVar;
            this.f14473d = eVar;
            this.f14474e = qVar;
            this.f14475f = i10;
            this.f14476g = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3327j0.a(this.f14470a, this.f14471b, this.f14472c, this.f14473d, this.f14474e, interfaceC3540l, T.L0.a(this.f14475f | 1), this.f14476g);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.j0$d */
    static final class d extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final d f14477a = new d();

        d() {
            super(3);
        }

        public final r.H a(o0.b bVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-2065494304);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2065494304, i10, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:96)");
            }
            r.r0 r0VarL = bVar.e(Boolean.FALSE, Boolean.TRUE) ? AbstractC7535j.l(30, 0, null, 6, null) : AbstractC7535j.l(75, 0, null, 6, null);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return r0VarL;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((o0.b) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: N.j0$e */
    static final class e extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final e f14478a = new e();

        e() {
            super(3);
        }

        public final r.H a(o0.b bVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-800950068);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-800950068, i10, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:70)");
            }
            r.r0 r0VarL = bVar.e(Boolean.FALSE, Boolean.TRUE) ? AbstractC7535j.l(120, 0, r.G.e(), 2, null) : AbstractC7535j.l(1, 74, null, 4, null);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return r0VarL;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((o0.b) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: N.j0$f */
    static final class f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f14479a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.q f14480b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z.Y f14481c;

        /* renamed from: N.j0$f$a */
        static final class a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ mh.q f14482a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z.Y f14483b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(mh.q qVar, z.Y y10) {
                super(2);
                this.f14482a = qVar;
                this.f14483b = y10;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1705995688, i10, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:164)");
                }
                this.f14482a.s(this.f14483b, interfaceC3540l, 0);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, mh.q qVar, z.Y y10) {
            super(2);
            this.f14479a = z10;
            this.f14480b = qVar;
            this.f14481c = y10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            float fB;
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1190489496, i10, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:162)");
            }
            if (this.f14479a) {
                interfaceC3540l.U(-187009902);
                fB = r.f14715a.c(interfaceC3540l, 6);
            } else {
                interfaceC3540l.U(-187009162);
                fB = r.f14715a.b(interfaceC3540l, 6);
            }
            interfaceC3540l.J();
            AbstractC3561w.a(AbstractC3343s.a().d(Float.valueOf(fB)), b0.c.e(-1705995688, true, new a(this.f14480b, this.f14481c), interfaceC3540l, 54), interfaceC3540l, T.I0.f20869i | 48);
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

    /* renamed from: N.j0$g */
    static final class g extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f14484a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14485b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14486c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z.N f14487d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f14488e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ mh.q f14489f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f14490g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f14491h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, boolean z10, z.N n10, InterfaceC8558m interfaceC8558m, mh.q qVar, int i10, int i11) {
            super(2);
            this.f14484a = interfaceC6824a;
            this.f14485b = eVar;
            this.f14486c = z10;
            this.f14487d = n10;
            this.f14488e = interfaceC8558m;
            this.f14489f = qVar;
            this.f14490g = i10;
            this.f14491h = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3327j0.d(this.f14484a, this.f14485b, this.f14486c, this.f14487d, this.f14488e, this.f14489f, interfaceC3540l, T.L0.a(this.f14490g | 1), this.f14491h);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static {
        float f10 = 8;
        f14457a = Y0.h.j(f10);
        float f11 = 48;
        f14458b = Y0.h.j(f11);
        f14460d = Y0.h.j(f10);
        f14463g = Y0.h.j(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(r.W r22, T.InterfaceC3551q0 r23, androidx.compose.foundation.o r24, androidx.compose.ui.e r25, mh.q r26, T.InterfaceC3540l r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3327j0.a(r.W, T.q0, androidx.compose.foundation.o, androidx.compose.ui.e, mh.q, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(mh.InterfaceC6824a r20, androidx.compose.ui.e r21, boolean r22, z.N r23, y.InterfaceC8558m r24, mh.q r25, T.InterfaceC3540l r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3327j0.d(mh.a, androidx.compose.ui.e, boolean, z.N, y.m, mh.q, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long h(Y0.p r5, Y0.p r6) {
        /*
            int r0 = r6.f()
            int r1 = r5.g()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto Lf
        Ld:
            r0 = r3
            goto L49
        Lf:
            int r0 = r6.g()
            int r1 = r5.f()
            if (r0 > r1) goto L1b
            r0 = r2
            goto L49
        L1b:
            int r0 = r6.j()
            if (r0 != 0) goto L22
            goto Ld
        L22:
            int r0 = r5.f()
            int r1 = r6.f()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.g()
            int r4 = r6.g()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.f()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.j()
            float r1 = (float) r1
            float r0 = r0 / r1
        L49:
            int r1 = r6.h()
            int r4 = r5.d()
            if (r1 < r4) goto L55
        L53:
            r2 = r3
            goto L8f
        L55:
            int r1 = r6.d()
            int r4 = r5.h()
            if (r1 > r4) goto L60
            goto L8f
        L60:
            int r1 = r6.e()
            if (r1 != 0) goto L67
            goto L53
        L67:
            int r1 = r5.h()
            int r2 = r6.h()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.d()
            int r2 = r6.d()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.h()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.e()
            float r6 = (float) r6
            float r2 = r5 / r6
        L8f:
            long r5 = m0.p1.a(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3327j0.h(Y0.p, Y0.p):long");
    }

    public static final float i() {
        return f14460d;
    }

    public static final float j() {
        return f14458b;
    }
}
