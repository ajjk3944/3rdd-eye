package ft;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class p extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9102d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ br.n f9103g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(ar.a aVar, int i10) {
        super(0);
        this.f9102d = i10;
        switch (i10) {
            case 1:
                this.f9103g = (br.n) aVar;
                super(0);
                break;
            default:
                this.f9103g = (br.n) aVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ar.a, br.n] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ar.a, br.n] */
    @Override // ar.a
    public final Object c() {
        switch (this.f9102d) {
            case 0:
                return mq.o.U0((Iterable) this.f9103g.c());
            default:
                try {
                    return (List) this.f9103g.c();
                } catch (SSLPeerUnverifiedException unused) {
                    return mq.w.f16945a;
                }
        }
    }
}
