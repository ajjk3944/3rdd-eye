package km;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a0 extends hm.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f28388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, hm.g gVar) {
        super(gVar);
        this.f28388b = b0Var;
    }

    @Override // hm.w
    public final long n(hm.e eVar, long j) throws IOException {
        try {
            nk.k.e(eVar, "sink");
            return this.f25179a.n(eVar, 8192L);
        } catch (IOException e2) {
            this.f28388b.f28395e = e2;
            throw e2;
        }
    }
}
