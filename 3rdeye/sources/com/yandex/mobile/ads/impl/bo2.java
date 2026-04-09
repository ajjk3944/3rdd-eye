package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.kn2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bo2 implements kn2 {

    /* renamed from: a, reason: collision with root package name */
    private final kn2 f25357a;

    public bo2(fo2 fo2Var) {
        this.f25357a = fo2Var;
    }

    @Override // com.yandex.mobile.ads.impl.kn2
    public final JSONObject a(View view) {
        return vn2.a(0, 0, 0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.kn2
    public final void a(View view, JSONObject jSONObject, kn2.a aVar, boolean z10, boolean z11) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        jn2 jn2VarA = jn2.a();
        if (jn2VarA != null) {
            Collection<in2> collectionC = jn2VarA.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionC.size() * 2) + 3);
            Iterator<in2> it = collectionC.iterator();
            while (it.hasNext()) {
                View viewF = it.next().f();
                if (viewF != null && no2.b(viewF) && (rootView = viewF.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fA = no2.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && no2.a((View) arrayList.get(size - 1)) > fA) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((t62) aVar).a((View) it2.next(), this.f25357a, jSONObject, z11);
        }
    }
}
