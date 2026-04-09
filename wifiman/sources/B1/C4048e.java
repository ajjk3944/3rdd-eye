package b1;

import b1.AbstractC4052i;
import b1.s;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import ph.AbstractC7332b;

/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4048e {

    /* renamed from: C, reason: collision with root package name */
    static final /* synthetic */ th.l[] f32688C = {O.f(new kotlin.jvm.internal.z(C4048e.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "scaleX", "getScaleX()F", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "scaleY", "getScaleY()F", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "rotationX", "getRotationX()F", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "rotationY", "getRotationY()F", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "rotationZ", "getRotationZ()F", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "translationX", "getTranslationX-D9Ej5fM()F", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "translationY", "getTranslationY-D9Ej5fM()F", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "pivotX", "getPivotX()F", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "pivotY", "getPivotY()F", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0)), O.f(new kotlin.jvm.internal.z(C4048e.class, "verticalChainWeight", "getVerticalChainWeight()F", 0))};

    /* renamed from: A, reason: collision with root package name */
    private float f32689A;

    /* renamed from: B, reason: collision with root package name */
    private float f32690B;

    /* renamed from: a, reason: collision with root package name */
    private final Object f32691a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.constraintlayout.core.parser.d f32692b;

    /* renamed from: c, reason: collision with root package name */
    private final C4049f f32693c = new C4049f("parent");

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4042D f32694d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4042D f32695e;

    /* renamed from: f, reason: collision with root package name */
    private final v f32696f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC4042D f32697g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC4042D f32698h;

    /* renamed from: i, reason: collision with root package name */
    private final v f32699i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC4047d f32700j;

    /* renamed from: k, reason: collision with root package name */
    private final a f32701k;

    /* renamed from: l, reason: collision with root package name */
    private final a f32702l;

    /* renamed from: m, reason: collision with root package name */
    private final d f32703m;

    /* renamed from: n, reason: collision with root package name */
    private float f32704n;

    /* renamed from: o, reason: collision with root package name */
    private final c f32705o;

    /* renamed from: p, reason: collision with root package name */
    private final c f32706p;

    /* renamed from: q, reason: collision with root package name */
    private final c f32707q;

    /* renamed from: r, reason: collision with root package name */
    private final c f32708r;

    /* renamed from: s, reason: collision with root package name */
    private final c f32709s;

    /* renamed from: t, reason: collision with root package name */
    private final b f32710t;

    /* renamed from: u, reason: collision with root package name */
    private final b f32711u;

    /* renamed from: v, reason: collision with root package name */
    private final b f32712v;

    /* renamed from: w, reason: collision with root package name */
    private final c f32713w;

    /* renamed from: x, reason: collision with root package name */
    private final c f32714x;

    /* renamed from: y, reason: collision with root package name */
    private final c f32715y;

    /* renamed from: z, reason: collision with root package name */
    private final c f32716z;

    /* renamed from: b1.e$a */
    private final class a extends AbstractC7332b {
        public a(s sVar) {
            super(sVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ph.AbstractC7332b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(th.l lVar, s sVar, s sVar2) {
            androidx.constraintlayout.core.parser.d dVarE = C4048e.this.e();
            String name = lVar.getName();
            AbstractC6492s.g(sVar2, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
            dVarE.a0(name, ((t) sVar2).a());
        }
    }

    /* renamed from: b1.e$b */
    private final class b extends AbstractC7332b {

        /* renamed from: b, reason: collision with root package name */
        private final String f32718b;

        public /* synthetic */ b(C4048e c4048e, float f10, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, str);
        }

        @Override // ph.AbstractC7332b
        public /* bridge */ /* synthetic */ void c(th.l lVar, Object obj, Object obj2) {
            e(lVar, ((Y0.h) obj).s(), ((Y0.h) obj2).s());
        }

        protected void e(th.l lVar, float f10, float f11) {
            if (Float.isNaN(f11)) {
                return;
            }
            androidx.constraintlayout.core.parser.d dVarE = C4048e.this.e();
            String name = this.f32718b;
            if (name == null) {
                name = lVar.getName();
            }
            dVarE.c0(name, f11);
        }

        private b(float f10, String str) {
            super(Y0.h.d(f10));
            this.f32718b = str;
        }

        public /* synthetic */ b(C4048e c4048e, float f10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(c4048e, f10, (i10 & 2) != 0 ? null : str, null);
        }
    }

    /* renamed from: b1.e$d */
    public static final class d extends AbstractC7332b {
        d(C4043E c4043e) {
            super(c4043e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ph.AbstractC7332b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(th.l lVar, C4043E c4043e, C4043E c4043e2) {
            C4048e.this.e().e0(lVar.getName(), c4043e2.b());
        }
    }

    public C4048e(Object obj, androidx.constraintlayout.core.parser.d dVar) {
        this.f32691a = obj;
        this.f32692b = dVar;
        this.f32694d = new q(-2, dVar);
        this.f32695e = new q(0, dVar);
        this.f32696f = new C4051h(0, dVar);
        this.f32697g = new q(-1, dVar);
        this.f32698h = new q(1, dVar);
        this.f32699i = new C4051h(1, dVar);
        this.f32700j = new C4050g(dVar);
        s.b bVar = s.f32772a;
        this.f32701k = new a(bVar.b());
        this.f32702l = new a(bVar.b());
        this.f32703m = new d(C4043E.f32678b.a());
        this.f32704n = 1.0f;
        int i10 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        this.f32705o = new c(this, 1.0f, str, i10, defaultConstructorMarker);
        int i11 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        String str2 = null;
        this.f32706p = new c(this, 1.0f, str2, i11, defaultConstructorMarker2);
        float f10 = 0.0f;
        this.f32707q = new c(this, f10, str, i10, defaultConstructorMarker);
        this.f32708r = new c(this, 0.0f, str2, i11, defaultConstructorMarker2);
        this.f32709s = new c(this, f10, str, i10, defaultConstructorMarker);
        float f11 = 0;
        this.f32710t = new b(this, Y0.h.j(f11), str2, i11, defaultConstructorMarker2);
        int i12 = 2;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        String str3 = null;
        this.f32711u = new b(this, Y0.h.j(f11), str3, i12, defaultConstructorMarker3);
        int i13 = 2;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        String str4 = null;
        this.f32712v = new b(this, Y0.h.j(f11), str4, i13, defaultConstructorMarker4);
        this.f32713w = new c(this, 0.5f, str3, i12, defaultConstructorMarker3);
        this.f32714x = new c(this, 0.5f, str4, i13, defaultConstructorMarker4);
        this.f32715y = new c(Float.NaN, "hWeight");
        this.f32716z = new c(Float.NaN, "vWeight");
        this.f32689A = 0.5f;
        this.f32690B = 0.5f;
    }

    public static /* synthetic */ void b(C4048e c4048e, C4049f c4049f, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.5f;
        }
        c4048e.a(c4049f, f10);
    }

    public static /* synthetic */ void m(C4048e c4048e, AbstractC4052i.c cVar, AbstractC4052i.c cVar2, float f10, float f11, float f12, float f13, float f14, int i10, Object obj) {
        c4048e.k(cVar, cVar2, (i10 & 4) != 0 ? Y0.h.j(0) : f10, (i10 & 8) != 0 ? Y0.h.j(0) : f11, (i10 & 16) != 0 ? Y0.h.j(0) : f12, (i10 & 32) != 0 ? Y0.h.j(0) : f13, (i10 & 64) != 0 ? 0.5f : f14);
    }

    public final void a(C4049f c4049f, float f10) {
        m(this, c4049f.e(), c4049f.d(), 0.0f, 0.0f, 0.0f, 0.0f, f10, 60, null);
    }

    public final InterfaceC4047d c() {
        return this.f32700j;
    }

    public final v d() {
        return this.f32699i;
    }

    public final androidx.constraintlayout.core.parser.d e() {
        return this.f32692b;
    }

    public final InterfaceC4042D f() {
        return this.f32697g;
    }

    public final C4049f g() {
        return this.f32693c;
    }

    public final InterfaceC4042D h() {
        return this.f32694d;
    }

    public final v i() {
        return this.f32696f;
    }

    public final void j(AbstractC4052i.b bVar, AbstractC4052i.b bVar2, float f10, float f11, float f12, float f13, float f14) {
        this.f32696f.b(bVar, f10, f12);
        this.f32699i.b(bVar2, f11, f13);
        this.f32692b.c0("vBias", f14);
    }

    public final void k(AbstractC4052i.c cVar, AbstractC4052i.c cVar2, float f10, float f11, float f12, float f13, float f14) {
        this.f32694d.a(cVar, f10, f12);
        this.f32697g.a(cVar2, f11, f13);
        this.f32692b.c0("hRtlBias", f14);
    }

    public final void n(s sVar) {
        this.f32702l.b(this, f32688C[1], sVar);
    }

    public final void o(s sVar) {
        this.f32701k.b(this, f32688C[0], sVar);
    }

    /* renamed from: b1.e$c */
    private final class c extends AbstractC7332b {

        /* renamed from: b, reason: collision with root package name */
        private final String f32720b;

        public c(float f10, String str) {
            super(Float.valueOf(f10));
            this.f32720b = str;
        }

        @Override // ph.AbstractC7332b
        public /* bridge */ /* synthetic */ void c(th.l lVar, Object obj, Object obj2) {
            e(lVar, ((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }

        protected void e(th.l lVar, float f10, float f11) {
            if (Float.isNaN(f11)) {
                return;
            }
            androidx.constraintlayout.core.parser.d dVarE = C4048e.this.e();
            String name = this.f32720b;
            if (name == null) {
                name = lVar.getName();
            }
            dVarE.c0(name, f11);
        }

        public /* synthetic */ c(C4048e c4048e, float f10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, (i10 & 2) != 0 ? null : str);
        }
    }
}
