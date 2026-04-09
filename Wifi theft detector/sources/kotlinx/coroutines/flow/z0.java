package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public final class z0 extends kotlinx.coroutines.flow.internal.c {

    /* renamed from: a, reason: collision with root package name */
    public long f22493a = -1;

    /* renamed from: b, reason: collision with root package name */
    public c9.c f22494b;

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(SharedFlowImpl sharedFlowImpl) {
        if (this.f22493a >= 0) {
            return false;
        }
        this.f22493a = sharedFlowImpl.X();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c9.c[] b(SharedFlowImpl sharedFlowImpl) {
        long j10 = this.f22493a;
        this.f22493a = -1L;
        this.f22494b = null;
        return sharedFlowImpl.W(j10);
    }
}
