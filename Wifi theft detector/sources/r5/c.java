package r5;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import o5.g;
import org.json.JSONException;
import org.json.JSONObject;
import r5.a;
import t5.e;
import t5.h;

/* loaded from: classes3.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final a f24177a;

    public c(a aVar) {
        this.f24177a = aVar;
    }

    @Override // r5.a
    public JSONObject a(View view) throws JSONException {
        JSONObject jSONObjectB = t5.c.b(0, 0, 0, 0);
        t5.c.e(jSONObjectB, e.a());
        return jSONObjectB;
    }

    public ArrayList b() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        q5.c cVarE = q5.c.e();
        if (cVarE != null) {
            Collection collectionA = cVarE.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator it = collectionA.iterator();
            while (it.hasNext()) {
                View viewN = ((g) it.next()).n();
                if (viewN != null && h.g(viewN) && (rootView = viewN.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fD = h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.d((View) arrayList.get(size - 1)) > fD) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // r5.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0476a interfaceC0476a, boolean z10, boolean z11) {
        ArrayList arrayListB = b();
        int size = arrayListB.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListB.get(i10);
            i10++;
            interfaceC0476a.a((View) obj, this.f24177a, jSONObject, z11);
        }
    }
}
