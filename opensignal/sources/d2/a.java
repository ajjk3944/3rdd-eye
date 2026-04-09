package d2;

import ar.k;
import br.n;
import w.g;

/* loaded from: classes.dex */
public final class a extends n implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final a f6759g;

    /* renamed from: r, reason: collision with root package name */
    public static final a f6760r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6761d;

    static {
        int i10 = 1;
        f6759g = new a(i10, 0);
        f6760r = new a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f6761d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f6761d) {
            case 0:
                throw null;
            default:
                g.p(obj);
                throw null;
        }
    }
}
