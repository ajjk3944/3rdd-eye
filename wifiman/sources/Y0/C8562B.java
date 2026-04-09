package y0;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;

/* renamed from: y0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8562B {

    /* renamed from: a, reason: collision with root package name */
    private final long f66198a;

    /* renamed from: b, reason: collision with root package name */
    private final long f66199b;

    /* renamed from: c, reason: collision with root package name */
    private final long f66200c;

    /* renamed from: d, reason: collision with root package name */
    private final long f66201d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f66202e;

    /* renamed from: f, reason: collision with root package name */
    private final float f66203f;

    /* renamed from: g, reason: collision with root package name */
    private final int f66204g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f66205h;

    /* renamed from: i, reason: collision with root package name */
    private final List f66206i;

    /* renamed from: j, reason: collision with root package name */
    private final long f66207j;

    /* renamed from: k, reason: collision with root package name */
    private final long f66208k;

    public /* synthetic */ C8562B(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15);
    }

    public final boolean a() {
        return this.f66205h;
    }

    public final boolean b() {
        return this.f66202e;
    }

    public final List c() {
        return this.f66206i;
    }

    public final long d() {
        return this.f66198a;
    }

    public final long e() {
        return this.f66208k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8562B)) {
            return false;
        }
        C8562B c8562b = (C8562B) obj;
        return C8603x.d(this.f66198a, c8562b.f66198a) && this.f66199b == c8562b.f66199b && C6531g.j(this.f66200c, c8562b.f66200c) && C6531g.j(this.f66201d, c8562b.f66201d) && this.f66202e == c8562b.f66202e && Float.compare(this.f66203f, c8562b.f66203f) == 0 && AbstractC8572L.g(this.f66204g, c8562b.f66204g) && this.f66205h == c8562b.f66205h && AbstractC6492s.d(this.f66206i, c8562b.f66206i) && C6531g.j(this.f66207j, c8562b.f66207j) && C6531g.j(this.f66208k, c8562b.f66208k);
    }

    public final long f() {
        return this.f66201d;
    }

    public final long g() {
        return this.f66200c;
    }

    public final float h() {
        return this.f66203f;
    }

    public int hashCode() {
        return (((((((((((((((((((C8603x.e(this.f66198a) * 31) + Long.hashCode(this.f66199b)) * 31) + C6531g.o(this.f66200c)) * 31) + C6531g.o(this.f66201d)) * 31) + Boolean.hashCode(this.f66202e)) * 31) + Float.hashCode(this.f66203f)) * 31) + AbstractC8572L.h(this.f66204g)) * 31) + Boolean.hashCode(this.f66205h)) * 31) + this.f66206i.hashCode()) * 31) + C6531g.o(this.f66207j)) * 31) + C6531g.o(this.f66208k);
    }

    public final long i() {
        return this.f66207j;
    }

    public final int j() {
        return this.f66204g;
    }

    public final long k() {
        return this.f66199b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) C8603x.f(this.f66198a)) + ", uptime=" + this.f66199b + ", positionOnScreen=" + ((Object) C6531g.t(this.f66200c)) + ", position=" + ((Object) C6531g.t(this.f66201d)) + ", down=" + this.f66202e + ", pressure=" + this.f66203f + ", type=" + ((Object) AbstractC8572L.i(this.f66204g)) + ", activeHover=" + this.f66205h + ", historical=" + this.f66206i + ", scrollDelta=" + ((Object) C6531g.t(this.f66207j)) + ", originalEventPosition=" + ((Object) C6531g.t(this.f66208k)) + ')';
    }

    private C8562B(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15) {
        this.f66198a = j10;
        this.f66199b = j11;
        this.f66200c = j12;
        this.f66201d = j13;
        this.f66202e = z10;
        this.f66203f = f10;
        this.f66204g = i10;
        this.f66205h = z11;
        this.f66206i = list;
        this.f66207j = j14;
        this.f66208k = j15;
    }
}
