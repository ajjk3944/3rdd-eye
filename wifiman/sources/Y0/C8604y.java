package y0;

import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;

/* renamed from: y0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8604y {

    /* renamed from: a, reason: collision with root package name */
    private final long f66334a;

    /* renamed from: b, reason: collision with root package name */
    private final long f66335b;

    /* renamed from: c, reason: collision with root package name */
    private final long f66336c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f66337d;

    /* renamed from: e, reason: collision with root package name */
    private final float f66338e;

    /* renamed from: f, reason: collision with root package name */
    private final long f66339f;

    /* renamed from: g, reason: collision with root package name */
    private final long f66340g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f66341h;

    /* renamed from: i, reason: collision with root package name */
    private final int f66342i;

    /* renamed from: j, reason: collision with root package name */
    private final long f66343j;

    /* renamed from: k, reason: collision with root package name */
    private List f66344k;

    /* renamed from: l, reason: collision with root package name */
    private long f66345l;

    /* renamed from: m, reason: collision with root package name */
    private C8582c f66346m;

    public /* synthetic */ C8604y(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    public final void a() {
        this.f66346m.c(true);
        this.f66346m.d(true);
    }

    public final C8604y b(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15) {
        return d(j10, j11, j12, z10, this.f66338e, j13, j14, z11, i10, list, j15);
    }

    public final C8604y d(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List list, long j15) {
        C8604y c8604y = new C8604y(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, list, j15, this.f66345l, null);
        c8604y.f66346m = this.f66346m;
        return c8604y;
    }

    public final List e() {
        List list = this.f66344k;
        return list == null ? AbstractC3689v.l() : list;
    }

    public final long f() {
        return this.f66334a;
    }

    public final long g() {
        return this.f66345l;
    }

    public final long h() {
        return this.f66336c;
    }

    public final boolean i() {
        return this.f66337d;
    }

    public final float j() {
        return this.f66338e;
    }

    public final long k() {
        return this.f66340g;
    }

    public final boolean l() {
        return this.f66341h;
    }

    public final long m() {
        return this.f66343j;
    }

    public final int n() {
        return this.f66342i;
    }

    public final long o() {
        return this.f66335b;
    }

    public final boolean p() {
        return this.f66346m.a() || this.f66346m.b();
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) C8603x.f(this.f66334a)) + ", uptimeMillis=" + this.f66335b + ", position=" + ((Object) C6531g.t(this.f66336c)) + ", pressed=" + this.f66337d + ", pressure=" + this.f66338e + ", previousUptimeMillis=" + this.f66339f + ", previousPosition=" + ((Object) C6531g.t(this.f66340g)) + ", previousPressed=" + this.f66341h + ", isConsumed=" + p() + ", type=" + ((Object) AbstractC8572L.i(this.f66342i)) + ", historical=" + e() + ",scrollDelta=" + ((Object) C6531g.t(this.f66343j)) + ')';
    }

    public /* synthetic */ C8604y(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, list, j15, j16);
    }

    private C8604y(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f66334a = j10;
        this.f66335b = j11;
        this.f66336c = j12;
        this.f66337d = z10;
        this.f66338e = f10;
        this.f66339f = j13;
        this.f66340g = j14;
        this.f66341h = z11;
        this.f66342i = i10;
        this.f66343j = j15;
        this.f66345l = C6531g.f52335b.c();
        this.f66346m = new C8582c(z12, z12);
    }

    public /* synthetic */ C8604y(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, (i11 & 512) != 0 ? AbstractC8572L.f66233a.d() : i10, (i11 & 1024) != 0 ? C6531g.f52335b.c() : j15, null);
    }

    private C8604y(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, null);
        this.f66344k = list;
        this.f66345l = j16;
    }
}
