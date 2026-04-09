package c;

import java.util.ListIterator;
import lq.b0;

/* loaded from: classes.dex */
public final class p extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3038d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f3039g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(w wVar, int i10) {
        super(0);
        this.f3038d = i10;
        this.f3039g = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // ar.a
    public final Object c() {
        am.d dVarPrevious;
        switch (this.f3038d) {
            case 0:
                this.f3039g.b();
                break;
            case 1:
                w wVar = this.f3039g;
                am.d dVar = wVar.f3056c;
                if (dVar == null) {
                    mq.k kVar = wVar.f3055b;
                    ListIterator listIterator = kVar.listIterator(kVar.a());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            dVarPrevious = listIterator.previous();
                            if (((am.d) dVarPrevious).f858a) {
                            }
                        } else {
                            dVarPrevious = 0;
                        }
                    }
                    dVar = dVarPrevious;
                }
                wVar.f3056c = null;
                if (dVar != null) {
                    dVar.a();
                }
                break;
            default:
                this.f3039g.b();
                break;
        }
        return b0.f15562a;
    }
}
