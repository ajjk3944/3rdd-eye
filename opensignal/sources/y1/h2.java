package y1;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Set;

/* loaded from: classes.dex */
public final class h2 extends br.n implements ar.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25701d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i2 f25702g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ar.n f25703r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(i2 i2Var, ar.n nVar, int i10) {
        super(2);
        this.f25701d = i10;
        this.f25702g = i2Var;
        this.f25703r = nVar;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f25701d) {
            case 0:
                n0.p pVar = (n0.p) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (pVar.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l0.a(this.f25702g.f25714a, this.f25703r, pVar, 0);
                } else {
                    pVar.N();
                }
                break;
            default:
                n0.p pVar2 = (n0.p) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (pVar2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i2 i2Var = this.f25702g;
                    AndroidComposeView androidComposeView = i2Var.f25714a;
                    Object tag = androidComposeView.getTag(z0.n.inspection_slot_table_set);
                    pq.c cVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof cr.a) && !(tag instanceof cr.d))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = androidComposeView.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(z0.n.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof cr.a) && !(tag2 instanceof cr.d))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        n0.u uVar = pVar2.T;
                        if (uVar == null) {
                            uVar = new n0.u(pVar2.f17261h);
                            pVar2.T = uVar;
                        }
                        set.add(uVar);
                        pVar2.f17268q = true;
                        pVar2.C = true;
                        pVar2.f17256c.b();
                        pVar2.H.b();
                        n0.v1 v1Var = pVar2.I;
                        n0.s1 s1Var = v1Var.f17333a;
                        v1Var.f17337e = s1Var.F;
                        v1Var.f17338f = s1Var.G;
                    }
                    boolean zG = pVar2.g(i2Var);
                    Object objI = pVar2.I();
                    n0.t0 t0Var = n0.j.f17190a;
                    if (zG || objI == t0Var) {
                        objI = new g2(i2Var, cVar, 0);
                        pVar2.b0(objI);
                    }
                    n0.w.d((ar.n) objI, androidComposeView, pVar2);
                    boolean zG2 = pVar2.g(i2Var);
                    Object objI2 = pVar2.I();
                    if (zG2 || objI2 == t0Var) {
                        objI2 = new g2(i2Var, cVar, 1);
                        pVar2.b0(objI2);
                    }
                    n0.w.d((ar.n) objI2, androidComposeView, pVar2);
                    n0.w.a(y0.e.f25617a.a(set), v0.i.d(-280240369, new h2(i2Var, this.f25703r, 0), pVar2), pVar2, 56);
                } else {
                    pVar2.N();
                }
                break;
        }
        return lq.b0.f15562a;
    }
}
