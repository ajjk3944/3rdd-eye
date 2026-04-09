package l2;

import ar.k;
import br.n;
import lq.b0;

/* loaded from: classes.dex */
public final class d extends n implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final d f14653g;

    /* renamed from: r, reason: collision with root package name */
    public static final d f14654r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14655d;

    static {
        int i10 = 1;
        f14653g = new d(i10, 0);
        f14654r = new d(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f14655d = i11;
    }

    @Override // ar.k
    public final /* synthetic */ Object a(Object obj) {
        switch (this.f14655d) {
            case 0:
                return b0.f15562a;
            default:
                throw null;
        }
    }
}
