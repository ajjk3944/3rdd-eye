package tl;

import al.c;
import bf.n;
import bh.h;
import bh.i;
import bh.j;
import bh.k;
import bn.d;
import bn.e;
import com.staircase3.opensignal.viewcontrollers.TestsFragment;
import ir.f0;
import java.util.List;
import xu.l;

/* loaded from: classes.dex */
public final class b implements ah.b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22880a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f22881b;

    public b(c cVar) {
        this.f22881b = cVar;
    }

    @Override // ah.b
    public final void a(k kVar) {
        d cVar;
        c cVar2 = this.f22881b;
        ll.c cVar3 = (ll.c) cVar2.f823e;
        TestsFragment testsFragment = (TestsFragment) cVar2.f820b;
        e eVar = (e) cVar2.f824f;
        if (eVar.f2841c) {
            return;
        }
        kVar.toString();
        boolean z10 = kVar instanceof h;
        if (z10 && this.f22880a) {
            this.f22880a = false;
            ((wm.a) cVar2.j).a((b) cVar2.k);
            return;
        }
        this.f22880a = true;
        if (z10) {
            h hVar = (h) kVar;
            cVar = new bn.a(hVar.f2754b, hVar.f2753a);
        } else if (kVar instanceof i) {
            i iVar = (i) kVar;
            List list = iVar.f2755a;
            cVar = f0.d(iVar.f2756b, iVar.f2757c, list);
        } else {
            if (!(kVar instanceof j)) {
                throw new n();
            }
            j jVar = (j) kVar;
            cVar = new bn.c(jVar.f2759b, jVar.f2758a);
        }
        d dVar = cVar;
        ((bl.a) cVar2.f826h).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - eVar.f2842d;
        eVar.f2840b = false;
        ((an.a) cVar2.f825g).c(dVar, jCurrentTimeMillis, false, false);
        testsFragment.i0(dVar);
        testsFragment.g0(l.i(dVar, cVar3.a()));
        eVar.getClass();
        eVar.f2839a = dVar;
        if (dVar instanceof bn.b) {
            testsFragment.g0(l.i((bn.b) dVar, cVar3.a()));
        }
    }
}
