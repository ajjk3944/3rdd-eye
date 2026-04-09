package Q0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class N implements InterfaceC3433j {

    /* renamed from: a, reason: collision with root package name */
    private final int f19000a;

    /* renamed from: b, reason: collision with root package name */
    private final A f19001b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19002c;

    /* renamed from: d, reason: collision with root package name */
    private final z f19003d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19004e;

    public /* synthetic */ N(int i10, A a10, int i11, z zVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, a10, i11, zVar, i12);
    }

    @Override // Q0.InterfaceC3433j
    public int a() {
        return this.f19004e;
    }

    @Override // Q0.InterfaceC3433j
    public A b() {
        return this.f19001b;
    }

    @Override // Q0.InterfaceC3433j
    public int c() {
        return this.f19002c;
    }

    public final int d() {
        return this.f19000a;
    }

    public final z e() {
        return this.f19003d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return this.f19000a == n10.f19000a && AbstractC6492s.d(b(), n10.b()) && v.f(c(), n10.c()) && AbstractC6492s.d(this.f19003d, n10.f19003d) && AbstractC3442t.e(a(), n10.a());
    }

    public int hashCode() {
        return (((((((this.f19000a * 31) + b().hashCode()) * 31) + v.g(c())) * 31) + AbstractC3442t.f(a())) * 31) + this.f19003d.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f19000a + ", weight=" + b() + ", style=" + ((Object) v.h(c())) + ", loadingStrategy=" + ((Object) AbstractC3442t.g(a())) + ')';
    }

    private N(int i10, A a10, int i11, z zVar, int i12) {
        this.f19000a = i10;
        this.f19001b = a10;
        this.f19002c = i11;
        this.f19003d = zVar;
        this.f19004e = i12;
    }
}
