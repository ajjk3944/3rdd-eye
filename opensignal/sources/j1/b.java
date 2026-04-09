package j1;

import g1.r;
import lq.b0;

/* loaded from: classes.dex */
public final class b extends br.n implements ar.k {

    /* renamed from: g, reason: collision with root package name */
    public static final b f13047g;

    /* renamed from: r, reason: collision with root package name */
    public static final b f13048r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13049d;

    static {
        int i10 = 1;
        f13047g = new b(i10, 0);
        f13048r = new b(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f13049d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f13049d) {
            case 0:
                break;
            default:
                i1.d.g((i1.d) obj, r.f9268f, 0L, 0.0f, 126);
                break;
        }
        return b0.f15562a;
    }
}
