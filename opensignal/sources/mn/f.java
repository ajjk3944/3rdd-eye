package mn;

import bf.n;
import bh.i;
import bh.j;
import bh.k;
import com.staircase3.opensignal.viewcontrollers.Tab_Overview;
import com.staircase3.opensignal.viewcontrollers.TestsFragment;
import ir.f0;
import java.util.List;
import qm.l;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements ah.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f16897b;

    public /* synthetic */ f(l lVar, int i10) {
        this.f16896a = i10;
        this.f16897b = lVar;
    }

    @Override // ah.b
    public final void a(k kVar) {
        bn.d cVar;
        switch (this.f16896a) {
            case 0:
                Tab_Overview tab_Overview = (Tab_Overview) this.f16897b;
                if (kVar instanceof bh.h) {
                    bh.h hVar = (bh.h) kVar;
                    tab_Overview.l0(new bn.a(hVar.f2754b, hVar.f2753a));
                    return;
                } else if (kVar instanceof j) {
                    j jVar = (j) kVar;
                    tab_Overview.l0(new bn.c(jVar.f2759b, jVar.f2758a));
                    return;
                } else {
                    i iVar = (i) kVar;
                    List list = iVar.f2755a;
                    tab_Overview.l0(f0.d(iVar.f2756b, iVar.f2757c, list));
                    return;
                }
            case 1:
                Tab_Overview tab_Overview2 = (Tab_Overview) this.f16897b;
                if (kVar instanceof bh.h) {
                    bh.h hVar2 = (bh.h) kVar;
                    tab_Overview2.l0(new bn.a(hVar2.f2754b, hVar2.f2753a));
                    return;
                } else if (kVar instanceof j) {
                    j jVar2 = (j) kVar;
                    tab_Overview2.l0(new bn.c(jVar2.f2759b, jVar2.f2758a));
                    return;
                } else {
                    i iVar2 = (i) kVar;
                    List list2 = iVar2.f2755a;
                    tab_Overview2.l0(f0.d(iVar2.f2756b, iVar2.f2757c, list2));
                    return;
                }
            default:
                TestsFragment testsFragment = (TestsFragment) this.f16897b;
                if (kVar instanceof bh.h) {
                    bh.h hVar3 = (bh.h) kVar;
                    cVar = new bn.a(hVar3.f2754b, hVar3.f2753a);
                } else if (kVar instanceof i) {
                    i iVar3 = (i) kVar;
                    List list3 = iVar3.f2755a;
                    cVar = f0.d(iVar3.f2756b, iVar3.f2757c, list3);
                } else {
                    if (!(kVar instanceof j)) {
                        throw new n();
                    }
                    j jVar3 = (j) kVar;
                    cVar = new bn.c(jVar3.f2759b, jVar3.f2758a);
                }
                al.c cVar2 = testsFragment.I0;
                if (cVar2 == null) {
                    br.l.l("presenter");
                    throw null;
                }
                bn.e eVar = (bn.e) cVar2.f824f;
                eVar.getClass();
                eVar.f2839a = cVar;
                eVar.f2840b = true;
                ((TestsFragment) cVar2.f820b).i0(cVar);
                return;
        }
    }
}
