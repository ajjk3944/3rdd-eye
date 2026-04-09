package k6;

import c9.C2097r;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: DivActionTypedArrayMutationHandler.kt */
/* renamed from: k6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5228g {
    public static final JSONArray a(JSONArray jSONArray, p9.l lVar) throws JSONException {
        kotlin.jvm.internal.l.f(jSONArray, "<this>");
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            kotlin.jvm.internal.l.e(obj, "get(i)");
            arrayList.add(obj);
        }
        ArrayList arrayListI0 = C2097r.I0(arrayList);
        lVar.invoke(arrayListI0);
        return new JSONArray((Collection) arrayListI0);
    }
}
