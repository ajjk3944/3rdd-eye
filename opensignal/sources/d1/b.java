package d1;

import ar.k;
import br.n;
import lq.b0;
import v1.u;
import v1.v;

/* loaded from: classes.dex */
public final class b extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6757d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f6758g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(v vVar, int i10) {
        super(1);
        this.f6757d = i10;
        this.f6758g = vVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f6757d) {
            case 0:
                u.h((u) obj, this.f6758g, 0, 0);
                break;
            case 1:
                u.j((u) obj, this.f6758g, 0, 0);
                break;
            default:
                u.e((u) obj, this.f6758g, 0, 0);
                break;
        }
        return b0.f15562a;
    }
}
