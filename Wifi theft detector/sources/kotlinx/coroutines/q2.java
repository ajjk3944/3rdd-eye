package kotlinx.coroutines;

/* loaded from: classes4.dex */
public final class q2 extends kotlinx.coroutines.internal.y implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f22593e;

    public q2(long j10, c9.c cVar) {
        super(cVar.getContext(), cVar);
        this.f22593e = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        L(TimeoutKt.a(this.f22593e, r0.c(getContext()), this));
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.y1
    public String v0() {
        return super.v0() + "(timeMillis=" + this.f22593e + ')';
    }
}
