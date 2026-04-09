package mk;

import ar.k;
import br.n;
import cj.l;
import lq.b0;

/* loaded from: classes.dex */
public final class e extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16860d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f16861g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f16862r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f16863x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, long j, String str, String str2) {
        super(1);
        this.f16860d = i10;
        this.f16861g = j;
        this.f16862r = str;
        this.f16863x = str2;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f16860d) {
            case 0:
                l lVar = (l) obj;
                br.l.e(lVar, "listener");
                lVar.L(this.f16861g, this.f16862r, this.f16863x);
                break;
            default:
                l lVar2 = (l) obj;
                br.l.e(lVar2, "listener");
                lVar2.K(this.f16861g, this.f16862r, this.f16863x);
                break;
        }
        return b0.f15562a;
    }
}
