package a0;

import u0.d1;
import u0.n2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final y4.a f80a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f81b;

    /* renamed from: c, reason: collision with root package name */
    public r f82c;

    /* renamed from: d, reason: collision with root package name */
    public long f83d;

    /* renamed from: e, reason: collision with root package name */
    public long f84e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f85f;

    public /* synthetic */ m(y4.a aVar, Object obj, r rVar, int i4) {
        this(aVar, obj, (i4 & 4) != 0 ? null : rVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // u0.n2
    public final Object getValue() {
        return this.f81b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f81b.getValue() + ", velocity=" + ((mk.c) this.f80a.f37324b).invoke(this.f82c) + ", isRunning=" + this.f85f + ", lastFrameTimeNanos=" + this.f83d + ", finishedTimeNanos=" + this.f84e + ')';
    }

    public m(y4.a aVar, Object obj, r rVar, long j, long j8, boolean z3) {
        r rVarG;
        this.f80a = aVar;
        this.f81b = u0.q.r(obj);
        if (rVar != null) {
            rVarG = f.g(rVar);
        } else {
            rVarG = (r) ((mk.c) aVar.f37323a).invoke(obj);
            rVarG.d();
        }
        this.f82c = rVarG;
        this.f83d = j;
        this.f84e = j8;
        this.f85f = z3;
    }
}
