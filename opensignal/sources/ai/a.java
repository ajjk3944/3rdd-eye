package ai;

import ar.k;
import br.l;
import br.n;

/* loaded from: classes.dex */
public final class a extends n implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final a f372g;

    /* renamed from: r, reason: collision with root package name */
    public static final a f373r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f374d;

    static {
        int i10 = 1;
        f372g = new a(i10, 0);
        f373r = new a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f374d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f374d) {
            case 0:
                bh.a aVar = (bh.a) obj;
                l.e(aVar, "it");
                return Integer.valueOf(aVar.f2744a);
            default:
                bh.a aVar2 = (bh.a) obj;
                l.e(aVar2, "it");
                return Integer.valueOf(aVar2.f2745b);
        }
    }
}
