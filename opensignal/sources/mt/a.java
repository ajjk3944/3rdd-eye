package mt;

import ar.k;
import br.l;
import br.n;
import ft.u;
import ht.c1;
import rr.i;
import rr.r0;

/* loaded from: classes.dex */
public final class a extends n implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final a f16998g;

    /* renamed from: r, reason: collision with root package name */
    public static final a f16999r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17000d;

    static {
        int i10 = 1;
        f16998g = new a(i10, 0);
        f16999r = new a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f17000d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f17000d) {
            case 0:
                c1 c1Var = (c1) obj;
                l.e(c1Var, "it");
                i iVarP = c1Var.Z().p();
                boolean z10 = false;
                if (iVarP != null && (iVarP instanceof r0) && (((r0) iVarP).o() instanceof u)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                c1 c1Var2 = (c1) obj;
                l.e(c1Var2, "it");
                i iVarP2 = c1Var2.Z().p();
                boolean z11 = false;
                if (iVarP2 != null && ((iVarP2 instanceof u) || (iVarP2 instanceof r0))) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
        }
    }
}
