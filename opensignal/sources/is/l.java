package is;

import ht.c1;
import ht.x;
import lq.b0;
import ur.v;

/* loaded from: classes.dex */
public final class l extends br.n implements ar.k {

    /* renamed from: g, reason: collision with root package name */
    public static final l f12966g;

    /* renamed from: r, reason: collision with root package name */
    public static final l f12967r;

    /* renamed from: x, reason: collision with root package name */
    public static final l f12968x;

    /* renamed from: y, reason: collision with root package name */
    public static final l f12969y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12970d;

    static {
        int i10 = 1;
        f12966g = new l(i10, 0);
        f12967r = new l(i10, 1);
        f12968x = new l(i10, 2);
        f12969y = new l(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, int i11) {
        super(i10);
        this.f12970d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f12970d) {
            case 0:
                rr.i iVarP = ((c1) obj).Z().p();
                if (iVarP == null) {
                    return Boolean.FALSE;
                }
                qs.g name = iVarP.getName();
                qs.c cVar = qr.d.f20970f;
                return Boolean.valueOf(br.l.a(name, cVar.f()) && br.l.a(xs.d.c(iVarP), cVar));
            case 1:
                rr.d dVar = (rr.d) obj;
                br.l.e(dVar, "it");
                v vVarJ0 = dVar.j0();
                br.l.b(vVarJ0);
                return vVarJ0.getType();
            case 2:
                rr.d dVar2 = (rr.d) obj;
                br.l.e(dVar2, "it");
                x xVarI = dVar2.i();
                br.l.b(xVarI);
                return xVarI;
            case 3:
                c1 c1Var = (c1) obj;
                br.l.e(c1Var, "it");
                return Boolean.valueOf(c1Var instanceof fs.h);
            default:
                m mVar = (m) obj;
                br.l.e(mVar, "$this$function");
                String strConcat = "java/util/".concat("Spliterator");
                d dVar3 = j.f12961b;
                mVar.b(strConcat, dVar3, dVar3);
                return b0.f15562a;
        }
    }
}
