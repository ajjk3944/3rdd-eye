package o4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.d f18805a;

    public i0(androidx.fragment.app.d dVar) {
        this.f18805a = dVar;
    }

    @Override // o4.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        androidx.fragment.app.d dVar = this.f18805a;
        ArrayList arrayList3 = dVar.f1447n;
        if (androidx.fragment.app.d.K(2)) {
            Objects.toString(dVar.f1436a);
        }
        boolean zU = false;
        if (!dVar.f1439d.isEmpty()) {
            a aVar = (a) h0.b.f(1, dVar.f1439d);
            dVar.f1443h = aVar;
            Iterator it = aVar.f18758a.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.b bVar = ((o0) it.next()).f18827b;
                if (bVar != null) {
                    bVar.J = true;
                }
            }
            zU = dVar.U(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(androidx.fragment.app.d.G((a) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zU;
    }
}
