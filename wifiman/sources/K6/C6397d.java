package k6;

import Zg.AbstractC3689v;
import java.util.List;
import k6.InterfaceC6395b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x6.b;

/* renamed from: k6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6397d implements InterfaceC6395b {

    /* renamed from: f, reason: collision with root package name */
    private static final a f51240f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Float f51241a;

    /* renamed from: b, reason: collision with root package name */
    private Float f51242b;

    /* renamed from: c, reason: collision with root package name */
    private Float f51243c;

    /* renamed from: d, reason: collision with root package name */
    private Float f51244d;

    /* renamed from: e, reason: collision with root package name */
    private x6.b f51245e = f51240f.a();

    /* renamed from: k6.d$a */
    private static final class a {

        /* renamed from: k6.d$a$a, reason: collision with other inner class name */
        public static final class C1894a implements x6.b {

            /* renamed from: b, reason: collision with root package name */
            private final float f51247b;

            /* renamed from: c, reason: collision with root package name */
            private final float f51248c;

            /* renamed from: d, reason: collision with root package name */
            private final float f51249d;

            /* renamed from: e, reason: collision with root package name */
            private final float f51250e;

            /* renamed from: f, reason: collision with root package name */
            private final float f51251f;

            /* renamed from: g, reason: collision with root package name */
            private final float f51252g;

            /* renamed from: a, reason: collision with root package name */
            private final List f51246a = AbstractC3689v.l();

            /* renamed from: h, reason: collision with root package name */
            private final float f51253h = 1.0f;

            C1894a() {
            }

            @Override // x6.b
            public float a() {
                return this.f51250e;
            }

            @Override // x6.b
            public float b() {
                return this.f51248c;
            }

            @Override // x6.b
            public float c() {
                return this.f51249d;
            }

            @Override // x6.b
            public float d() {
                return this.f51253h;
            }

            @Override // x6.b
            public float e() {
                return this.f51247b;
            }

            @Override // x6.b
            public List f() {
                return this.f51246a;
            }

            @Override // x6.b
            public float g() {
                return this.f51252g;
            }

            @Override // x6.b
            public int getId() {
                return b.a.a(this);
            }

            @Override // x6.b
            public float h() {
                return this.f51251f;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x6.b a() {
            return new C1894a();
        }

        private a() {
        }
    }

    public static /* synthetic */ C6397d l(C6397d c6397d, Float f10, Float f11, Float f12, Float f13, x6.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        if ((i10 & 4) != 0) {
            f12 = null;
        }
        if ((i10 & 8) != 0) {
            f13 = null;
        }
        if ((i10 & 16) != 0) {
            bVar = c6397d.f();
        }
        return c6397d.k(f10, f11, f12, f13, bVar);
    }

    @Override // k6.InterfaceC6395b
    public float a() {
        Float f10 = this.f51244d;
        if (f10 != null) {
            return f10.floatValue();
        }
        return 0.0f;
    }

    @Override // k6.InterfaceC6395b
    public float b() {
        Float f10 = this.f51242b;
        if (f10 != null) {
            return f10.floatValue();
        }
        return 0.0f;
    }

    @Override // k6.InterfaceC6395b
    public float c() {
        Float f10 = this.f51243c;
        if (f10 != null) {
            return f10.floatValue();
        }
        return 0.0f;
    }

    @Override // k6.InterfaceC6395b
    public float d() {
        return f().d();
    }

    @Override // k6.InterfaceC6395b
    public float e() {
        Float f10 = this.f51241a;
        if (f10 != null) {
            return f10.floatValue();
        }
        return 0.0f;
    }

    public x6.b f() {
        return this.f51245e;
    }

    public int g() {
        return InterfaceC6395b.a.a(this);
    }

    public final boolean h() {
        return (this.f51241a == null && this.f51242b == null && this.f51243c == null && this.f51244d == null) ? false : true;
    }

    public final void i() {
        this.f51241a = null;
        this.f51242b = null;
        this.f51243c = null;
        this.f51244d = null;
        j(f51240f.a());
    }

    public void j(x6.b bVar) {
        AbstractC6492s.i(bVar, "<set-?>");
        this.f51245e = bVar;
    }

    public final C6397d k(Float f10, Float f11, Float f12, Float f13, x6.b chartEntryModel) {
        AbstractC6492s.i(chartEntryModel, "chartEntryModel");
        if (f10 != null) {
            if (this.f51241a != null) {
                f10 = Float.valueOf(Math.min(e(), f10.floatValue()));
            }
            this.f51241a = f10;
        }
        if (f11 != null) {
            if (this.f51242b != null) {
                f11 = Float.valueOf(Math.max(b(), f11.floatValue()));
            }
            this.f51242b = f11;
        }
        if (f12 != null) {
            if (this.f51243c != null) {
                f12 = Float.valueOf(Math.min(c(), f12.floatValue()));
            }
            this.f51243c = f12;
        }
        if (f13 != null) {
            if (this.f51244d != null) {
                f13 = Float.valueOf(Math.max(a(), f13.floatValue()));
            }
            this.f51244d = f13;
        }
        j(chartEntryModel);
        return this;
    }
}
