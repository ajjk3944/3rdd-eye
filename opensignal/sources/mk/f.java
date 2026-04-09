package mk;

import ar.k;
import br.n;
import cj.l;
import hk.h;
import lq.b0;

/* loaded from: classes.dex */
public final class f extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16864d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f16865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, h hVar) {
        super(1);
        this.f16864d = i10;
        this.f16865g = hVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f16864d) {
            case 0:
                l lVar = (l) obj;
                br.l.e(lVar, "listener");
                h hVar = this.f16865g;
                lVar.n(hVar.f10804a, hVar.f10805b);
                return b0.f15562a;
            case 1:
                l lVar2 = (l) obj;
                br.l.e(lVar2, "listener");
                h hVar2 = this.f16865g;
                lVar2.O(hVar2.f10804a, hVar2.f10805b);
                return b0.f15562a;
            default:
                h hVar3 = (h) obj;
                br.l.e(hVar3, "it");
                return Boolean.valueOf(this.f16865g.f10804a == hVar3.f10804a);
        }
    }
}
