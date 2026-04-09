package r;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class N implements InterfaceC7533i {

    /* renamed from: d, reason: collision with root package name */
    public static final int f59493d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final D f59494a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC7520b0 f59495b;

    /* renamed from: c, reason: collision with root package name */
    private final long f59496c;

    public /* synthetic */ N(D d10, EnumC7520b0 enumC7520b0, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, enumC7520b0, j10);
    }

    @Override // r.InterfaceC7533i
    public v0 a(s0 s0Var) {
        return new C0(this.f59494a.a(s0Var), this.f59495b, this.f59496c, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return AbstractC6492s.d(n10.f59494a, this.f59494a) && n10.f59495b == this.f59495b && k0.d(n10.f59496c, this.f59496c);
    }

    public int hashCode() {
        return (((this.f59494a.hashCode() * 31) + this.f59495b.hashCode()) * 31) + k0.e(this.f59496c);
    }

    private N(D d10, EnumC7520b0 enumC7520b0, long j10) {
        this.f59494a = d10;
        this.f59495b = enumC7520b0;
        this.f59496c = j10;
    }
}
