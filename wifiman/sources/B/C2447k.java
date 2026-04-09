package B;

import B.C2446j;
import C0.AbstractC2526f;
import C0.InterfaceC2525e;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* renamed from: B.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2447k implements D0.j, InterfaceC2525e {

    /* renamed from: f, reason: collision with root package name */
    public static final b f980f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final a f981g = new a();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2449m f982a;

    /* renamed from: b, reason: collision with root package name */
    private final C2446j f983b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f984c;

    /* renamed from: d, reason: collision with root package name */
    private final Y0.t f985d;

    /* renamed from: e, reason: collision with root package name */
    private final w.q f986e;

    /* renamed from: B.k$a */
    public static final class a implements InterfaceC2525e.a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f987a;

        a() {
        }

        @Override // C0.InterfaceC2525e.a
        public boolean a() {
            return this.f987a;
        }
    }

    /* renamed from: B.k$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: B.k$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f988a;

        static {
            int[] iArr = new int[Y0.t.values().length];
            try {
                iArr[Y0.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y0.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f988a = iArr;
        }
    }

    /* renamed from: B.k$d */
    public static final class d implements InterfaceC2525e.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f990b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f991c;

        d(kotlin.jvm.internal.N n10, int i10) {
            this.f990b = n10;
            this.f991c = i10;
        }

        @Override // C0.InterfaceC2525e.a
        public boolean a() {
            return C2447k.this.f((C2446j.a) this.f990b.f51689a, this.f991c);
        }
    }

    public C2447k(InterfaceC2449m interfaceC2449m, C2446j c2446j, boolean z10, Y0.t tVar, w.q qVar) {
        this.f982a = interfaceC2449m;
        this.f983b = c2446j;
        this.f984c = z10;
        this.f985d = tVar;
        this.f986e = qVar;
    }

    private final C2446j.a d(C2446j.a aVar, int i10) {
        int iB = aVar.b();
        int iA = aVar.a();
        if (g(i10)) {
            iA++;
        } else {
            iB--;
        }
        return this.f983b.a(iB, iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f(C2446j.a aVar, int i10) {
        if (h(i10)) {
            return false;
        }
        if (g(i10)) {
            if (aVar.a() >= this.f982a.a() - 1) {
                return false;
            }
        } else if (aVar.b() <= 0) {
            return false;
        }
        return true;
    }

    private final boolean g(int i10) {
        InterfaceC2525e.b.a aVar = InterfaceC2525e.b.f2133a;
        if (InterfaceC2525e.b.h(i10, aVar.c())) {
            return false;
        }
        if (!InterfaceC2525e.b.h(i10, aVar.b())) {
            if (InterfaceC2525e.b.h(i10, aVar.a())) {
                return this.f984c;
            }
            if (InterfaceC2525e.b.h(i10, aVar.d())) {
                if (this.f984c) {
                    return false;
                }
            } else if (InterfaceC2525e.b.h(i10, aVar.e())) {
                int i11 = c.f988a[this.f985d.ordinal()];
                if (i11 == 1) {
                    return this.f984c;
                }
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f984c) {
                    return false;
                }
            } else {
                if (!InterfaceC2525e.b.h(i10, aVar.f())) {
                    AbstractC2448l.c();
                    throw new KotlinNothingValueException();
                }
                int i12 = c.f988a[this.f985d.ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        return this.f984c;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f984c) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean h(int i10) {
        InterfaceC2525e.b.a aVar = InterfaceC2525e.b.f2133a;
        if (!(InterfaceC2525e.b.h(i10, aVar.a()) ? true : InterfaceC2525e.b.h(i10, aVar.d()))) {
            if (!(InterfaceC2525e.b.h(i10, aVar.e()) ? true : InterfaceC2525e.b.h(i10, aVar.f()))) {
                if (!(InterfaceC2525e.b.h(i10, aVar.c()) ? true : InterfaceC2525e.b.h(i10, aVar.b()))) {
                    AbstractC2448l.c();
                    throw new KotlinNothingValueException();
                }
            } else if (this.f986e == w.q.Vertical) {
                return true;
            }
        } else if (this.f986e == w.q.Horizontal) {
            return true;
        }
        return false;
    }

    @Override // C0.InterfaceC2525e
    public Object a(int i10, InterfaceC6835l interfaceC6835l) {
        if (this.f982a.a() <= 0 || !this.f982a.d()) {
            return interfaceC6835l.invoke(f981g);
        }
        int iB = g(i10) ? this.f982a.b() : this.f982a.e();
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        n10.f51689a = this.f983b.a(iB, iB);
        Object objInvoke = null;
        while (objInvoke == null && f((C2446j.a) n10.f51689a, i10)) {
            C2446j.a aVarD = d((C2446j.a) n10.f51689a, i10);
            this.f983b.e((C2446j.a) n10.f51689a);
            n10.f51689a = aVarD;
            this.f982a.c();
            objInvoke = interfaceC6835l.invoke(new d(n10, i10));
        }
        this.f983b.e((C2446j.a) n10.f51689a);
        this.f982a.c();
        return objInvoke;
    }

    @Override // D0.j
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC2525e getValue() {
        return this;
    }

    @Override // D0.j
    public D0.l getKey() {
        return AbstractC2526f.a();
    }
}
