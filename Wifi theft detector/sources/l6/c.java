package l6;

import android.view.View;
import i6.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import l6.a;
import n6.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final a f23179a;

    public c(a aVar) {
        this.f23179a = aVar;
    }

    @Override // l6.a
    public JSONObject a(View view) throws JSONException {
        JSONObject jSONObjectC = n6.c.c(0, 0, 0, 0);
        n6.c.e(jSONObjectC, e.a());
        return jSONObjectC;
    }

    public ArrayList b() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        k6.c cVarE = k6.c.e();
        if (cVarE != null) {
            Collection collectionA = cVarE.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator it = collectionA.iterator();
            while (it.hasNext()) {
                View viewL = ((h) it.next()).l();
                if (viewL != null && n6.h.g(viewL) && (rootView = viewL.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fD = n6.h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && n6.h.d((View) arrayList.get(size - 1)) > fD) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // l6.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0434a interfaceC0434a, boolean z10, boolean z11) {
        ArrayList arrayListB = b();
        int size = arrayListB.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListB.get(i10);
            i10++;
            interfaceC0434a.a((View) obj, this.f23179a, jSONObject, z11);
        }
    }
}
