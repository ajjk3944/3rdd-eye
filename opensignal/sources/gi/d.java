package gi;

import ar.k;
import br.l;
import br.n;

/* loaded from: classes.dex */
public final class d extends n implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final d f9584g;

    /* renamed from: r, reason: collision with root package name */
    public static final d f9585r;

    /* renamed from: x, reason: collision with root package name */
    public static final d f9586x;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9587d;

    static {
        int i10 = 1;
        f9584g = new d(i10, 0);
        f9585r = new d(i10, 1);
        f9586x = new d(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f9587d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f9587d) {
            case 0:
                String str = (String) obj;
                l.e(str, "it");
                return str;
            case 1:
                vj.b bVar = (vj.b) obj;
                l.e(bVar, "it");
                return bVar.f();
            default:
                ik.a aVar = (ik.a) obj;
                l.e(aVar, "it");
                return aVar.a().name();
        }
    }
}
