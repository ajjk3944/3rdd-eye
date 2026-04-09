package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.z1;
import a1.AbstractC3751b;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6526b;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6537m;
import m0.C6733v0;
import m0.k1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.C7043j;
import o0.C7044k;
import o0.InterfaceC7039f;
import r.AbstractC7535j;
import r.o0;
import y.InterfaceC8558m;

/* renamed from: N.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3330l {

    /* renamed from: b, reason: collision with root package name */
    private static final float f14498b;

    /* renamed from: d, reason: collision with root package name */
    private static final float f14500d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f14501e;

    /* renamed from: a, reason: collision with root package name */
    private static final float f14497a = Y0.h.j(24);

    /* renamed from: c, reason: collision with root package name */
    private static final float f14499c = Y0.h.j(20);

    /* renamed from: N.l$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f14502a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14503b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6835l interfaceC6835l, boolean z10) {
            super(0);
            this.f14502a = interfaceC6835l;
            this.f14503b = z10;
        }

        public final void a() {
            this.f14502a.invoke(Boolean.valueOf(!this.f14503b));
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.l$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f14504a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f14505b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14506c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14507d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f14508e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3326j f14509f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f14510g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f14511h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, InterfaceC6835l interfaceC6835l, androidx.compose.ui.e eVar, boolean z11, InterfaceC8558m interfaceC8558m, InterfaceC3326j interfaceC3326j, int i10, int i11) {
            super(2);
            this.f14504a = z10;
            this.f14505b = interfaceC6835l;
            this.f14506c = eVar;
            this.f14507d = z11;
            this.f14508e = interfaceC8558m;
            this.f14509f = interfaceC3326j;
            this.f14510g = i10;
            this.f14511h = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3330l.a(this.f14504a, this.f14505b, this.f14506c, this.f14507d, this.f14508e, this.f14509f, interfaceC3540l, T.L0.a(this.f14510g | 1), this.f14511h);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.l$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3324i f14512a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1 f14513b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1 f14514c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z1 f14515d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ z1 f14516e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1 f14517f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3324i c3324i, z1 z1Var, z1 z1Var2, z1 z1Var3, z1 z1Var4, z1 z1Var5) {
            super(1);
            this.f14512a = c3324i;
            this.f14513b = z1Var;
            this.f14514c = z1Var2;
            this.f14515d = z1Var3;
            this.f14516e = z1Var4;
            this.f14517f = z1Var5;
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            float fFloor = (float) Math.floor(interfaceC7039f.d1(AbstractC3330l.f14500d));
            AbstractC3330l.s(interfaceC7039f, AbstractC3330l.f(this.f14513b), AbstractC3330l.g(this.f14514c), interfaceC7039f.d1(AbstractC3330l.f14501e), fFloor);
            AbstractC3330l.t(interfaceC7039f, AbstractC3330l.e(this.f14515d), AbstractC3330l.c(this.f14516e), AbstractC3330l.d(this.f14517f), fFloor, this.f14512a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.l$d */
    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f14518a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K0.a f14519b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14520c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3326j f14521d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f14522e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, K0.a aVar, androidx.compose.ui.e eVar, InterfaceC3326j interfaceC3326j, int i10) {
            super(2);
            this.f14518a = z10;
            this.f14519b = aVar;
            this.f14520c = eVar;
            this.f14521d = interfaceC3326j;
            this.f14522e = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3330l.b(this.f14518a, this.f14519b, this.f14520c, this.f14521d, interfaceC3540l, T.L0.a(this.f14522e | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.l$e */
    static final class e extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final e f14523a = new e();

        e() {
            super(3);
        }

        public final r.H a(o0.b bVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(1075283605);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1075283605, i10, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:282)");
            }
            Object objD = bVar.d();
            K0.a aVar = K0.a.Off;
            r.H h10 = objD == aVar ? AbstractC7535j.h(0, 1, null) : bVar.f() == aVar ? AbstractC7535j.g(100) : AbstractC7535j.l(100, 0, null, 6, null);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return h10;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((o0.b) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: N.l$f */
    static final class f extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final f f14524a = new f();

        f() {
            super(3);
        }

        public final r.H a(o0.b bVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-1707702900);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1707702900, i10, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:266)");
            }
            Object objD = bVar.d();
            K0.a aVar = K0.a.Off;
            r.H hL = objD == aVar ? AbstractC7535j.l(100, 0, null, 6, null) : bVar.f() == aVar ? AbstractC7535j.g(100) : AbstractC7535j.j(0.0f, 0.0f, null, 7, null);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return hL;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((o0.b) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: N.l$g */
    static final class g extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K0.a f14525a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f14526b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14527c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14528d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f14529e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3326j f14530f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f14531g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f14532h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(K0.a aVar, InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC3326j interfaceC3326j, int i10, int i11) {
            super(2);
            this.f14525a = aVar;
            this.f14526b = interfaceC6824a;
            this.f14527c = eVar;
            this.f14528d = z10;
            this.f14529e = interfaceC8558m;
            this.f14530f = interfaceC3326j;
            this.f14531g = i10;
            this.f14532h = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3330l.h(this.f14525a, this.f14526b, this.f14527c, this.f14528d, this.f14529e, this.f14530f, interfaceC3540l, T.L0.a(this.f14531g | 1), this.f14532h);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.l$h */
    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14533a;

        static {
            int[] iArr = new int[K0.a.values().length];
            try {
                iArr[K0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K0.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K0.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14533a = iArr;
        }
    }

    static {
        float f10 = 2;
        f14498b = Y0.h.j(f10);
        f14500d = Y0.h.j(f10);
        f14501e = Y0.h.j(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r28, mh.InterfaceC6835l r29, androidx.compose.ui.e r30, boolean r31, y.InterfaceC8558m r32, N.InterfaceC3326j r33, T.InterfaceC3540l r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3330l.a(boolean, mh.l, androidx.compose.ui.e, boolean, y.m, N.j, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(boolean r34, K0.a r35, androidx.compose.ui.e r36, N.InterfaceC3326j r37, T.InterfaceC3540l r38, int r39) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3330l.b(boolean, K0.a, androidx.compose.ui.e, N.j, T.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(z1 z1Var) {
        return ((C6733v0) z1Var.getValue()).u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(z1 z1Var) {
        return ((C6733v0) z1Var.getValue()).u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(z1 z1Var) {
        return ((C6733v0) z1Var.getValue()).u();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(K0.a r24, mh.InterfaceC6824a r25, androidx.compose.ui.e r26, boolean r27, y.InterfaceC8558m r28, N.InterfaceC3326j r29, T.InterfaceC3540l r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3330l.h(K0.a, mh.a, androidx.compose.ui.e, boolean, y.m, N.j, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(InterfaceC7039f interfaceC7039f, long j10, long j11, float f10, float f11) {
        float f12 = f11 / 2.0f;
        C7044k c7044k = new C7044k(f11, 0.0f, 0, 0, null, 30, null);
        float fI = C6537m.i(interfaceC7039f.c());
        if (C6733v0.m(j10, j11)) {
            InterfaceC7039f.b1(interfaceC7039f, j10, 0L, AbstractC6538n.a(fI, fI), AbstractC6526b.b(f10, 0.0f, 2, null), C7043j.f55038a, 0.0f, null, 0, 226, null);
            return;
        }
        float f13 = fI - (2 * f11);
        InterfaceC7039f.b1(interfaceC7039f, j10, AbstractC6532h.a(f11, f11), AbstractC6538n.a(f13, f13), AbstractC6526b.b(Math.max(0.0f, f10 - f11), 0.0f, 2, null), C7043j.f55038a, 0.0f, null, 0, 224, null);
        float f14 = fI - f11;
        InterfaceC7039f.b1(interfaceC7039f, j11, AbstractC6532h.a(f12, f12), AbstractC6538n.a(f14, f14), AbstractC6526b.b(f10 - f12, 0.0f, 2, null), c7044k, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(InterfaceC7039f interfaceC7039f, long j10, float f10, float f11, float f12, C3324i c3324i) {
        C7044k c7044k = new C7044k(f12, 0.0f, k1.f52924a.c(), 0, null, 26, null);
        float fI = C6537m.i(interfaceC7039f.c());
        float fB = AbstractC3751b.b(0.4f, 0.5f, f11);
        float fB2 = AbstractC3751b.b(0.7f, 0.5f, f11);
        float fB3 = AbstractC3751b.b(0.5f, 0.5f, f11);
        float fB4 = AbstractC3751b.b(0.3f, 0.5f, f11);
        c3324i.a().a();
        c3324i.a().n(0.2f * fI, fB3 * fI);
        c3324i.a().u(fB * fI, fB2 * fI);
        c3324i.a().u(0.8f * fI, fI * fB4);
        c3324i.b().a(c3324i.a(), false);
        c3324i.c().a();
        c3324i.b().b(0.0f, c3324i.b().c() * f10, c3324i.c(), true);
        InterfaceC7039f.C1(interfaceC7039f, c3324i.c(), j10, 0.0f, c7044k, null, 0, 52, null);
    }
}
