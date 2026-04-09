package N;

import T.InterfaceC3540l;
import T.z1;
import kotlin.jvm.internal.AbstractC6494u;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.C7043j;
import o0.C7044k;
import o0.InterfaceC7039f;
import y.InterfaceC8558m;

/* renamed from: N.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3352w0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f14827a = Y0.h.j(24);

    /* renamed from: b, reason: collision with root package name */
    private static final float f14828b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f14829c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f14830d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f14831e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f14832f;

    /* renamed from: N.w0$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f14833a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1 f14834b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z1 z1Var, z1 z1Var2) {
            super(1);
            this.f14833a = z1Var;
            this.f14834b = z1Var2;
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            float fD1 = interfaceC7039f.d1(AbstractC3352w0.f14832f);
            float f10 = fD1 / 2;
            InterfaceC7039f.P1(interfaceC7039f, ((C6733v0) this.f14833a.getValue()).u(), interfaceC7039f.d1(AbstractC3352w0.f14830d) - f10, 0L, 0.0f, new C7044k(fD1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
            if (Y0.h.h(((Y0.h) this.f14834b.getValue()).s(), Y0.h.j(0)) > 0) {
                InterfaceC7039f.P1(interfaceC7039f, ((C6733v0) this.f14833a.getValue()).u(), interfaceC7039f.d1(((Y0.h) this.f14834b.getValue()).s()) - f10, 0L, 0.0f, C7043j.f55038a, null, 0, 108, null);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.w0$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f14835a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f14836b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14837c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14838d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f14839e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3348u0 f14840f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f14841g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f14842h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, boolean z11, InterfaceC8558m interfaceC8558m, InterfaceC3348u0 interfaceC3348u0, int i10, int i11) {
            super(2);
            this.f14835a = z10;
            this.f14836b = interfaceC6824a;
            this.f14837c = eVar;
            this.f14838d = z11;
            this.f14839e = interfaceC8558m;
            this.f14840f = interfaceC3348u0;
            this.f14841g = i10;
            this.f14842h = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3352w0.a(this.f14835a, this.f14836b, this.f14837c, this.f14838d, this.f14839e, this.f14840f, interfaceC3540l, T.L0.a(this.f14841g | 1), this.f14842h);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static {
        float f10 = 2;
        f14828b = Y0.h.j(f10);
        float fJ = Y0.h.j(20);
        f14829c = fJ;
        f14830d = Y0.h.j(fJ / f10);
        f14831e = Y0.h.j(12);
        f14832f = Y0.h.j(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r22, mh.InterfaceC6824a r23, androidx.compose.ui.e r24, boolean r25, y.InterfaceC8558m r26, N.InterfaceC3348u0 r27, T.InterfaceC3540l r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3352w0.a(boolean, mh.a, androidx.compose.ui.e, boolean, y.m, N.u0, T.l, int, int):void");
    }
}
