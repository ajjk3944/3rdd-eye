package T;

import kotlin.KotlinNothingValueException;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f20869i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3557u f20870a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20871b;

    /* renamed from: c, reason: collision with root package name */
    private final n1 f20872c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f20873d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6835l f20874e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20875f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f20876g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20877h = true;

    public I0(AbstractC3557u abstractC3557u, Object obj, boolean z10, n1 n1Var, InterfaceC3551q0 interfaceC3551q0, InterfaceC6835l interfaceC6835l, boolean z11) {
        this.f20870a = abstractC3557u;
        this.f20871b = z10;
        this.f20872c = n1Var;
        this.f20873d = interfaceC3551q0;
        this.f20874e = interfaceC6835l;
        this.f20875f = z11;
        this.f20876g = obj;
    }

    public final boolean a() {
        return this.f20877h;
    }

    public final AbstractC3557u b() {
        return this.f20870a;
    }

    public final InterfaceC6835l c() {
        return this.f20874e;
    }

    public final Object d() {
        if (this.f20871b) {
            return null;
        }
        InterfaceC3551q0 interfaceC3551q0 = this.f20873d;
        if (interfaceC3551q0 != null) {
            return interfaceC3551q0.getValue();
        }
        Object obj = this.f20876g;
        if (obj != null) {
            return obj;
        }
        AbstractC3546o.s("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    public final n1 e() {
        return this.f20872c;
    }

    public final InterfaceC3551q0 f() {
        return this.f20873d;
    }

    public final Object g() {
        return this.f20876g;
    }

    public final I0 h() {
        this.f20877h = false;
        return this;
    }

    public final boolean i() {
        return this.f20875f;
    }

    public final boolean j() {
        return (this.f20871b || g() != null) && !this.f20875f;
    }
}
