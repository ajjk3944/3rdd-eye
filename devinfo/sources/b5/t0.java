package b5;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f1875a;

    public t0(u0 u0Var) {
        this.f1875a = u0Var;
    }

    @Override // b5.r0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zU;
        u0 u0Var = this.f1875a;
        ArrayList arrayList3 = u0Var.f1889o;
        if (u0.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + u0Var.f1877a);
        }
        int i4 = 0;
        if (u0Var.f1880d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zU = false;
        } else {
            a aVar = (a) je.u.p(1, u0Var.f1880d);
            u0Var.f1883h = aVar;
            ArrayList arrayList4 = aVar.f1710c;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                z zVar = ((c1) obj).f1755b;
                if (zVar != null) {
                    zVar.f1940n = true;
                }
            }
            zU = u0Var.U(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                linkedHashSet.addAll(u0.F((a) obj2));
            }
            int size3 = arrayList3.size();
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return zU;
    }
}
