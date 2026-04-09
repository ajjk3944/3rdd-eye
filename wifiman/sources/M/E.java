package M;

import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class E implements x {

    /* renamed from: f, reason: collision with root package name */
    public static final a f12077f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12078a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12079b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12080c;

    /* renamed from: d, reason: collision with root package name */
    private final C3243l f12081d;

    /* renamed from: e, reason: collision with root package name */
    private final C3242k f12082e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public E(boolean z10, int i10, int i11, C3243l c3243l, C3242k c3242k) {
        this.f12078a = z10;
        this.f12079b = i10;
        this.f12080c = i11;
        this.f12081d = c3243l;
        this.f12082e = c3242k;
    }

    @Override // M.x
    public int a() {
        return 1;
    }

    @Override // M.x
    public boolean b() {
        return this.f12078a;
    }

    @Override // M.x
    public C3242k c() {
        return this.f12082e;
    }

    @Override // M.x
    public C3243l d() {
        return this.f12081d;
    }

    @Override // M.x
    public C3242k e() {
        return this.f12082e;
    }

    @Override // M.x
    public void f(InterfaceC6835l interfaceC6835l) {
    }

    @Override // M.x
    public int g() {
        return this.f12080c;
    }

    @Override // M.x
    public C3242k h() {
        return this.f12082e;
    }

    @Override // M.x
    public EnumC3236e i() {
        return l() < g() ? EnumC3236e.NOT_CROSSED : l() > g() ? EnumC3236e.CROSSED : this.f12082e.d();
    }

    @Override // M.x
    public boolean j(x xVar) {
        if (d() != null && xVar != null && (xVar instanceof E)) {
            E e10 = (E) xVar;
            if (l() == e10.l() && g() == e10.g() && b() == e10.b() && !this.f12082e.m(e10.f12082e)) {
                return false;
            }
        }
        return true;
    }

    @Override // M.x
    public C3242k k() {
        return this.f12082e;
    }

    @Override // M.x
    public int l() {
        return this.f12079b;
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + b() + ", crossed=" + i() + ", info=\n\t" + this.f12082e + ')';
    }
}
