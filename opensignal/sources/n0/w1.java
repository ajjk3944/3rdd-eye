package n0;

/* loaded from: classes.dex */
public final class w1 extends x0.v {

    /* renamed from: c, reason: collision with root package name */
    public float f17357c;

    public w1(long j, float f10) {
        super(j);
        this.f17357c = f10;
    }

    @Override // x0.v
    public final void a(x0.v vVar) {
        br.l.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f17357c = ((w1) vVar).f17357c;
    }

    @Override // x0.v
    public final x0.v b(long j) {
        return new w1(j, this.f17357c);
    }
}
