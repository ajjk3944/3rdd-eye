package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.z1;
import kotlin.jvm.internal.AbstractC6494u;
import m0.C6733v0;
import mh.InterfaceC6839p;
import r.AbstractC7535j;
import r.o0;

/* loaded from: classes.dex */
final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y0 f14199a = new Y0();

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC3311b0 f14201b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f14202c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f14203d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ mh.q f14204e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f14205f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mh.t f14206g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f14207h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EnumC3311b0 enumC3311b0, long j10, long j11, mh.q qVar, boolean z10, mh.t tVar, int i10) {
            super(2);
            this.f14201b = enumC3311b0;
            this.f14202c = j10;
            this.f14203d = j11;
            this.f14204e = qVar;
            this.f14205f = z10;
            this.f14206g = tVar;
            this.f14207h = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            Y0.this.a(this.f14201b, this.f14202c, this.f14203d, this.f14204e, this.f14205f, this.f14206g, interfaceC3540l, T.L0.a(this.f14207h | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14208a = new b();

        b() {
            super(3);
        }

        public final r.H a(o0.b bVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-32667848);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-32667848, i10, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:328)");
            }
            r.r0 r0VarL = AbstractC7535j.l(150, 0, null, 6, null);
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

    static final class c extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14209a = new c();

        c() {
            super(3);
        }

        public final r.H a(o0.b bVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-611722692);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-611722692, i10, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:280)");
            }
            r.r0 r0VarL = AbstractC7535j.l(150, 0, null, 6, null);
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

    static final class d extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final d f14210a = new d();

        d() {
            super(3);
        }

        public final r.H a(o0.b bVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-130058045);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-130058045, i10, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:318)");
            }
            r.r0 r0VarL = AbstractC7535j.l(150, 0, null, 6, null);
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

    static final class e extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final e f14211a = new e();

        e() {
            super(3);
        }

        public final r.H a(o0.b bVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-1079955085);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1079955085, i10, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:292)");
            }
            EnumC3311b0 enumC3311b0 = EnumC3311b0.Focused;
            EnumC3311b0 enumC3311b02 = EnumC3311b0.UnfocusedEmpty;
            r.H hL = bVar.e(enumC3311b0, enumC3311b02) ? AbstractC7535j.l(67, 0, r.G.d(), 2, null) : (bVar.e(enumC3311b02, enumC3311b0) || bVar.e(EnumC3311b0.UnfocusedNotEmpty, enumC3311b02)) ? AbstractC7535j.k(83, 67, r.G.d()) : AbstractC7535j.j(0.0f, 0.0f, null, 7, null);
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

    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14212a;

        static {
            int[] iArr = new int[EnumC3311b0.values().length];
            try {
                iArr[EnumC3311b0.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3311b0.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3311b0.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14212a = iArr;
        }
    }

    private Y0() {
    }

    private static final float b(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    private static final float c(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    private static final long d(z1 z1Var) {
        return ((C6733v0) z1Var.getValue()).u();
    }

    private static final long e(z1 z1Var) {
        return ((C6733v0) z1Var.getValue()).u();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(N.EnumC3311b0 r27, long r28, long r30, mh.q r32, boolean r33, mh.t r34, T.InterfaceC3540l r35, int r36) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.Y0.a(N.b0, long, long, mh.q, boolean, mh.t, T.l, int):void");
    }
}
