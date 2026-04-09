package fh;

import ch.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f8867a;

    /* renamed from: b, reason: collision with root package name */
    public final d[] f8868b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8869c;

    /* renamed from: d, reason: collision with root package name */
    public int f8870d;

    public e(String str, d[] dVarArr, long j, int i10) {
        this.f8867a = str;
        this.f8868b = dVarArr;
        this.f8869c = j;
        this.f8870d = i10;
    }

    public static String a(ArrayList arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                eVar.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("NAME", eVar.f8867a);
                    jSONObject.put("TIME", eVar.f8869c);
                    d[] dVarArr = eVar.f8868b;
                    if (dVarArr != null && dVarArr.length != 0) {
                        for (d dVar : dVarArr) {
                            jSONObject.put(dVar.f8865a, dVar.f8866b);
                        }
                        int i10 = eVar.f8870d;
                        if (i10 > 0) {
                            jSONObject.put("OCCURRENCES", i10);
                        }
                    }
                } catch (JSONException e4) {
                    n.e("Event", e4);
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f8867a.equals(eVar.f8867a)) {
            return Arrays.equals(this.f8868b, eVar.f8868b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8868b) + (this.f8867a.hashCode() * 31);
    }
}
