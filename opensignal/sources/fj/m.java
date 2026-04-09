package fj;

import lq.b0;

/* loaded from: classes.dex */
public final class m extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8934d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f8935g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z10, n nVar) {
        super(0);
        this.f8934d = z10;
        this.f8935g = nVar;
    }

    @Override // ar.a
    public final Object c() {
        if (this.f8934d) {
            n nVar = this.f8935g;
            synchronized (nVar.K) {
                nVar.K.clear();
            }
            n nVar2 = this.f8935g;
            synchronized (nVar2.J) {
                nVar2.J.clear();
            }
            n nVar3 = this.f8935g;
            synchronized (nVar3.L) {
                nVar3.L.clear();
            }
            n nVar4 = this.f8935g;
            synchronized (nVar4.M) {
                nVar4.M.clear();
            }
        }
        n nVar5 = this.f8935g;
        synchronized (nVar5.V) {
            try {
                t tVar = nVar5.I;
                if (tVar != null) {
                    tVar.j();
                }
                nVar5.I = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b0.f15562a;
    }
}
