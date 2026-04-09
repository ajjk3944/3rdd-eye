package k5;

import a0.x0;
import al.i1;
import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import b5.f1;
import b5.g1;
import b5.i0;
import b5.n;
import b5.u0;
import d.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import je.u;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f27955a;

    public i(j jVar) {
        this.f27955a = jVar;
    }

    public final void onBackCancelled() {
        j jVar = this.f27955a;
        x0 x0Var = jVar.f27939a;
        if (x0Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!jVar.f27940b) {
            x0Var.n(jVar, null);
        }
        e eVar = (e) x0Var.f145b;
        eVar.getClass();
        if (jVar.equals(eVar.f27947h) && -1 == eVar.g) {
            y yVarC = eVar.f27946f;
            if (yVarC == null) {
                yVarC = eVar.c(-1);
            }
            eVar.f27946f = null;
            eVar.g = 0;
            eVar.f27947h = null;
            if (yVarC != null) {
                yVarC.a();
            }
            i1 i1Var = eVar.f27941a;
            i1Var.getClass();
            i1Var.j(null, f.f27953a);
        }
        jVar.f27940b = false;
    }

    public final void onBackInvoked() {
        this.f27955a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        k.e(backEvent, "backEvent");
        b bVarA = f4.d.a(backEvent);
        j jVar = this.f27955a;
        x0 x0Var = jVar.f27939a;
        if (x0Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (jVar.f27940b) {
            e eVar = (e) x0Var.f145b;
            eVar.getClass();
            if (jVar.equals(eVar.f27947h) && -1 == eVar.g) {
                y yVarC = eVar.f27946f;
                if (yVarC == null) {
                    yVarC = eVar.c(-1);
                }
                if (yVarC != null) {
                    i0 i0Var = yVarC.f21643d;
                    d.a aVar = new d.a(bVarA.f27934c, bVarA.f27935d, bVarA.f27933b, bVarA.f27932a, bVarA.f27936e);
                    u0 u0Var = (u0) i0Var.f1823d;
                    if (u0.K(2)) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + u0Var);
                    }
                    if (u0Var.f1883h != null) {
                        Iterator it = u0Var.f(new ArrayList(Collections.singletonList(u0Var.f1883h)), 0, 1).iterator();
                        while (it.hasNext()) {
                            n nVar = (n) it.next();
                            nVar.getClass();
                            if (u0.K(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + aVar.f21572c);
                            }
                            ArrayList arrayList = nVar.f1839c;
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                zj.n.W(arrayList2, ((g1) obj).f1807k);
                            }
                            List listR0 = zj.n.r0(zj.n.v0(arrayList2));
                            int size2 = listR0.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                ((f1) listR0.get(i10)).c(aVar, nVar.f1837a);
                            }
                        }
                        Iterator it2 = u0Var.f1889o.iterator();
                        if (it2.hasNext()) {
                            throw u.o(it2);
                        }
                    }
                }
                i1 i1Var = eVar.f27941a;
                g gVar = new g(bVarA);
                i1Var.getClass();
                i1Var.j(null, gVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        k.e(backEvent, "backEvent");
        b bVarA = f4.d.a(backEvent);
        j jVar = this.f27955a;
        x0 x0Var = jVar.f27939a;
        if (x0Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (jVar.f27940b) {
            return;
        }
        x0Var.n(jVar, bVarA);
        jVar.f27940b = true;
    }
}
