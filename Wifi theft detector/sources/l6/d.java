package l6;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import l6.a;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f23180a = new int[2];

    @Override // l6.a
    public JSONObject a(View view) {
        if (view == null) {
            return n6.c.c(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f23180a);
        int[] iArr = this.f23180a;
        return n6.c.c(iArr[0], iArr[1], width, height);
    }

    public final void b(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0434a interfaceC0434a, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            interfaceC0434a.a(viewGroup.getChildAt(i10), this, jSONObject, z10);
        }
    }

    public final void c(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0434a interfaceC0434a, boolean z10) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ArrayList arrayList3 = (ArrayList) map.get((Float) obj);
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                interfaceC0434a.a((View) obj2, this, jSONObject, z10);
            }
        }
    }

    @Override // l6.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0434a interfaceC0434a, boolean z10, boolean z11) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z10) {
                c(viewGroup, jSONObject, interfaceC0434a, z11);
            } else {
                b(viewGroup, jSONObject, interfaceC0434a, z11);
            }
        }
    }
}
