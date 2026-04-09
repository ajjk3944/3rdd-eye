package y1;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class h0 extends br.n implements ar.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25691d = 1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p0 f25692g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ar.n f25693r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Owner f25694x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Owner owner, p0 p0Var, ar.n nVar, int i10) {
        super(2);
        this.f25694x = owner;
        this.f25692g = p0Var;
        this.f25693r = nVar;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f25691d) {
            case 0:
                n0.p pVar = (n0.p) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (pVar.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1.a((AndroidComposeView) this.f25694x, this.f25692g, this.f25693r, pVar, 0);
                } else {
                    pVar.N();
                }
                break;
            default:
                ((Number) obj2).intValue();
                c1.a(this.f25694x, this.f25692g, this.f25693r, (n0.p) obj, n0.w.m(1));
                break;
        }
        return lq.b0.f15562a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(AndroidComposeView androidComposeView, p0 p0Var, ar.n nVar) {
        super(2);
        this.f25694x = androidComposeView;
        this.f25692g = p0Var;
        this.f25693r = nVar;
    }
}
