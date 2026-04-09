package j2;

import android.view.View;
import com.liuzh.deviceinfo.R;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k2 extends nk.l implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2 f27213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mk.e f27214c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(l2 l2Var, mk.e eVar, int i4) {
        super(2);
        this.f27212a = i4;
        this.f27213b = l2Var;
        this.f27214c = eVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27212a) {
            case 0:
                u0.p pVar = (u0.p) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (pVar.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h0.a(this.f27213b.f27221a, this.f27214c, pVar, 0);
                } else {
                    pVar.R();
                }
                break;
            default:
                u0.p pVar2 = (u0.p) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (pVar2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l2 l2Var = this.f27213b;
                    r rVar = l2Var.f27221a;
                    Object tag = rVar.getTag(R.id.inspection_slot_table_set);
                    ck.c cVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof ok.a) && !(tag instanceof ok.e))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = rVar.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof ok.a) && !(tag2 instanceof ok.e))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(pVar2.w());
                        pVar2.f34912q = true;
                        pVar2.C = true;
                        pVar2.f34900c.c();
                        pVar2.H.c();
                        u0.e2 e2Var = pVar2.I;
                        u0.b2 b2Var = e2Var.f34779a;
                        e2Var.f34783e = b2Var.j;
                        e2Var.f34784f = b2Var.f34751k;
                    }
                    boolean zH = pVar2.h(l2Var);
                    Object objL = pVar2.L();
                    u0.e eVar = u0.l.f34851a;
                    if (zH || objL == eVar) {
                        objL = new j2(l2Var, cVar, 0);
                        pVar2.g0(objL);
                    }
                    u0.q.e(rVar, (mk.e) objL, pVar2);
                    boolean zH2 = pVar2.h(l2Var);
                    Object objL2 = pVar2.L();
                    if (zH2 || objL2 == eVar) {
                        objL2 = new j2(l2Var, cVar, 1);
                        pVar2.g0(objL2);
                    }
                    u0.q.e(rVar, (mk.e) objL2, pVar2);
                    u0.q.a(h1.g.f24807a.a(set), c1.n.c(-280240369, new k2(l2Var, this.f27214c, 0), pVar2), pVar2, 56);
                } else {
                    pVar2.R();
                }
                break;
        }
        return yj.u.f37649a;
    }
}
