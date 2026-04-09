package j$.time.format;

/* loaded from: classes2.dex */
public final class o implements j$.time.temporal.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.b f26157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j$.time.temporal.n f26158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.m f26159c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j$.time.v f26160d;

    @Override // j$.time.temporal.n
    public final /* synthetic */ int i(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    public o(j$.time.chrono.b bVar, j$.time.temporal.n nVar, j$.time.chrono.m mVar, j$.time.v vVar) {
        this.f26157a = bVar;
        this.f26158b = nVar;
        this.f26159c = mVar;
        this.f26160d = vVar;
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        j$.time.chrono.b bVar = this.f26157a;
        if (bVar != null && qVar.isDateBased()) {
            return bVar.e(qVar);
        }
        return this.f26158b.e(qVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        j$.time.chrono.b bVar = this.f26157a;
        if (bVar != null && qVar.isDateBased()) {
            return bVar.k(qVar);
        }
        return this.f26158b.k(qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        j$.time.chrono.b bVar = this.f26157a;
        if (bVar != null && qVar.isDateBased()) {
            return bVar.w(qVar);
        }
        return this.f26158b.w(qVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(a aVar) {
        if (aVar == j$.time.temporal.r.f26223b) {
            return this.f26159c;
        }
        if (aVar == j$.time.temporal.r.f26222a) {
            return this.f26160d;
        }
        if (aVar == j$.time.temporal.r.f26224c) {
            return this.f26158b.l(aVar);
        }
        return aVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.f26159c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        j$.time.v vVar = this.f26160d;
        if (vVar != null) {
            str2 = " with zone " + vVar;
        }
        return this.f26158b + str + str2;
    }
}
