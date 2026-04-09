package l8;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import t7.e;
import x7.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28621a;

    public c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new e(jSONObjectOptJSONObject));
                }
            }
        }
        this.f28621a = arrayList;
    }

    public synchronized a a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return d.f28622b;
        }
        ArrayList arrayList = this.f28621a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            b bVar = (b) obj;
            if (bVar.f28618a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f28619b)) {
                return bVar.f28620c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized k b(Class cls) {
        int size = this.f28621a.size();
        for (int i4 = 0; i4 < size; i4++) {
            o8.e eVar = (o8.e) this.f28621a.get(i4);
            if (eVar.f30431a.isAssignableFrom(cls)) {
                return eVar.f30432b;
            }
        }
        return null;
    }

    public synchronized ArrayList c(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.f28621a;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            b bVar = (b) obj;
            if ((bVar.f28618a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f28619b)) && !arrayList.contains(bVar.f28619b)) {
                arrayList.add(bVar.f28619b);
            }
        }
        return arrayList;
    }

    public c(int i4) {
        switch (i4) {
            case 1:
                this.f28621a = new ArrayList();
                break;
            default:
                this.f28621a = new ArrayList();
                break;
        }
    }
}
