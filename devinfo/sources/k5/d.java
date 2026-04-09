package k5;

import a0.x0;
import al.i1;
import android.util.Log;
import b5.c1;
import b5.i0;
import b5.n;
import b5.u0;
import b5.z;
import d.c0;
import d.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public x0 f27939a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27940b;

    public final void a() {
        x0 x0Var = this.f27939a;
        if (x0Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f27940b) {
            x0Var.n(this, null);
        }
        e eVar = (e) x0Var.f145b;
        ca.b bVar = (ca.b) x0Var.f148e;
        eVar.getClass();
        if (equals(eVar.f27947h) && -1 == eVar.g) {
            y yVarC = eVar.f27946f;
            if (yVarC == null) {
                yVarC = eVar.c(-1);
            }
            eVar.f27946f = null;
            eVar.g = 0;
            eVar.f27947h = null;
            if (yVarC == null) {
                ((c0) bVar.f2827b).f21582a.run();
            } else {
                u0 u0Var = (u0) yVarC.f21643d.f1823d;
                if (u0.K(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + u0Var);
                }
                i0 i0Var = u0Var.j;
                ArrayList arrayList = u0Var.f1889o;
                u0Var.f1884i = true;
                u0Var.z(true);
                u0Var.f1884i = false;
                if (u0Var.f1883h != null) {
                    if (!arrayList.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(u0.F(u0Var.f1883h));
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            if (obj != null) {
                                throw new ClassCastException();
                            }
                            Iterator it = linkedHashSet.iterator();
                            if (it.hasNext()) {
                                throw null;
                            }
                        }
                    }
                    ArrayList arrayList2 = u0Var.f1883h.f1710c;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        z zVar = ((c1) obj2).f1755b;
                        if (zVar != null) {
                            zVar.f1940n = false;
                        }
                    }
                    Iterator it2 = u0Var.f(new ArrayList(Collections.singletonList(u0Var.f1883h)), 0, 1).iterator();
                    while (it2.hasNext()) {
                        n nVar = (n) it2.next();
                        ArrayList arrayList3 = nVar.f1839c;
                        if (u0.K(3)) {
                            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                        }
                        nVar.k(arrayList3);
                        nVar.c(arrayList3);
                    }
                    ArrayList arrayList4 = u0Var.f1883h.f1710c;
                    int size3 = arrayList4.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList4.get(i11);
                        i11++;
                        z zVar2 = ((c1) obj3).f1755b;
                        if (zVar2 != null && zVar2.G == null) {
                            u0Var.g(zVar2).k();
                        }
                    }
                    u0Var.f1883h = null;
                    u0Var.i0();
                    if (u0.K(3)) {
                        Log.d("FragmentManager", "Op is being set to null");
                        Log.d("FragmentManager", "OnBackPressedCallback enabled=" + i0Var.f1820a + " for  FragmentManager " + u0Var);
                    }
                } else if (i0Var.f1820a) {
                    if (u0.K(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    u0Var.S();
                } else {
                    if (u0.K(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    u0Var.g.f21584c.a();
                }
            }
            i1 i1Var = eVar.f27941a;
            i1Var.getClass();
            i1Var.j(null, f.f27953a);
        }
        this.f27940b = false;
    }

    public void b(boolean z3) {
    }
}
