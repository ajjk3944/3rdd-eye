package r;

import T.InterfaceC3551q0;
import T.t1;
import T.z1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: r.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7536k implements z1 {

    /* renamed from: a, reason: collision with root package name */
    private final s0 f59721a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f59722b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC7542q f59723c;

    /* renamed from: d, reason: collision with root package name */
    private long f59724d;

    /* renamed from: e, reason: collision with root package name */
    private long f59725e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f59726f;

    public C7536k(s0 s0Var, Object obj, AbstractC7542q abstractC7542q, long j10, long j11, boolean z10) {
        AbstractC7542q abstractC7542qE;
        this.f59721a = s0Var;
        this.f59722b = t1.d(obj, null, 2, null);
        this.f59723c = (abstractC7542q == null || (abstractC7542qE = r.e(abstractC7542q)) == null) ? AbstractC7537l.i(s0Var, obj) : abstractC7542qE;
        this.f59724d = j10;
        this.f59725e = j11;
        this.f59726f = z10;
    }

    public final long g() {
        return this.f59725e;
    }

    @Override // T.z1
    public Object getValue() {
        return this.f59722b.getValue();
    }

    public final long i() {
        return this.f59724d;
    }

    public final s0 j() {
        return this.f59721a;
    }

    public final Object p() {
        return this.f59721a.b().invoke(this.f59723c);
    }

    public final AbstractC7542q q() {
        return this.f59723c;
    }

    public final boolean r() {
        return this.f59726f;
    }

    public final void s(long j10) {
        this.f59725e = j10;
    }

    public final void t(long j10) {
        this.f59724d = j10;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + p() + ", isRunning=" + this.f59726f + ", lastFrameTimeNanos=" + this.f59724d + ", finishedTimeNanos=" + this.f59725e + ')';
    }

    public final void u(boolean z10) {
        this.f59726f = z10;
    }

    public void v(Object obj) {
        this.f59722b.setValue(obj);
    }

    public final void w(AbstractC7542q abstractC7542q) {
        this.f59723c = abstractC7542q;
    }

    public /* synthetic */ C7536k(s0 s0Var, Object obj, AbstractC7542q abstractC7542q, long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s0Var, obj, (i10 & 4) != 0 ? null : abstractC7542q, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }
}
