package b6;

import android.view.View;
import b6.a;
import d6.e;
import d6.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import y5.f;

/* loaded from: classes3.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final a f4624a;

    public c(a aVar) {
        this.f4624a = aVar;
    }

    @Override // b6.a
    public JSONObject a(View view) throws JSONException {
        JSONObject jSONObjectC = d6.c.c(0, 0, 0, 0);
        d6.c.e(jSONObjectC, e.a());
        return jSONObjectC;
    }

    public ArrayList b() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        a6.c cVarE = a6.c.e();
        if (cVarE != null) {
            Collection collectionA = cVarE.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator it = collectionA.iterator();
            while (it.hasNext()) {
                View viewH = ((f) it.next()).h();
                if (viewH != null && h.e(viewH) && (rootView = viewH.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fC = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c((View) arrayList.get(size - 1)) > fC) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // b6.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0059a interfaceC0059a, boolean z10, boolean z11) {
        ArrayList arrayListB = b();
        int size = arrayListB.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListB.get(i10);
            i10++;
            interfaceC0059a.a((View) obj, this.f4624a, jSONObject, z11);
        }
    }
}
