package l7;

import A7.b;
import A7.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l7.h;
import l7.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonExpressionParser.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final A7.a f43875a = new A7.a(Collections.EMPTY_LIST);

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> A7.b<V> a(D7.f fVar, JSONObject jSONObject, String str, j<V> jVar, p9.l<R, V> lVar, l<V> lVar2) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == JSONObject.NULL) {
            objOpt = null;
        }
        Object obj = objOpt;
        if (obj == null) {
            throw z7.e.g(str, jSONObject);
        }
        if (A7.b.c(obj)) {
            return new b.c(str, obj.toString(), lVar, lVar2, fVar.a(), jVar, null);
        }
        try {
            Object objInvoke = lVar.invoke(obj);
            if (objInvoke == null) {
                throw z7.e.e(jSONObject, str, obj);
            }
            if (!jVar.b(objInvoke)) {
                throw z7.e.l(jSONObject, str, obj);
            }
            try {
                if (lVar2.e(objInvoke)) {
                    return objInvoke instanceof String ? new b.d((String) objInvoke) : new b.C0000b(objInvoke);
                }
                throw z7.e.e(jSONObject, str, obj);
            } catch (ClassCastException unused) {
                throw z7.e.l(jSONObject, str, obj);
            }
        } catch (ClassCastException unused2) {
            throw z7.e.l(jSONObject, str, obj);
        } catch (Exception e4) {
            throw z7.e.f(jSONObject, str, obj, e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> A7.b<V> b(D7.f fVar, JSONObject jSONObject, String str, j<V> jVar, p9.l<R, V> lVar, l<V> lVar2, A7.b<V> bVar) {
        Object objOpt = jSONObject.opt(str);
        Object obj = objOpt == JSONObject.NULL ? null : objOpt;
        if (obj == null) {
            return null;
        }
        if (A7.b.c(obj)) {
            return new b.c(str, obj.toString(), lVar, lVar2, fVar.a(), jVar, bVar);
        }
        try {
            Object objInvoke = lVar.invoke(obj);
            if (objInvoke == null) {
                fVar.a().d(z7.e.e(jSONObject, str, obj));
                return null;
            }
            if (!jVar.b(objInvoke)) {
                fVar.a().d(z7.e.l(jSONObject, str, obj));
                return null;
            }
            try {
                if (lVar2.e(objInvoke)) {
                    return objInvoke instanceof String ? new b.d((String) objInvoke) : new b.C0000b(objInvoke);
                }
                fVar.a().d(z7.e.e(jSONObject, str, obj));
                return null;
            } catch (ClassCastException unused) {
                fVar.a().d(z7.e.l(jSONObject, str, obj));
                return null;
            }
        } catch (ClassCastException unused2) {
            fVar.a().d(z7.e.l(jSONObject, str, obj));
            return null;
        } catch (Exception e4) {
            fVar.a().d(z7.e.f(jSONObject, str, obj, e4));
            return null;
        }
    }

    public static A7.c c(D7.f fVar, JSONObject jSONObject, String str, k.b bVar, h.f fVar2, g gVar) {
        int i;
        j6.l lVar = e.f43877a;
        A7.a aVar = f43875a;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List list = Collections.EMPTY_LIST;
            try {
                if (!gVar.a(list)) {
                    fVar.a().d(z7.e.e(jSONObject, str, list));
                    return aVar;
                }
            } catch (ClassCastException unused) {
                fVar.a().d(z7.e.l(jSONObject, str, list));
            }
            return aVar;
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        boolean z10 = false;
        z7.c cVarA = null;
        while (i10 < length) {
            Object objOpt = jSONArrayOptJSONArray.opt(i10);
            Object obj = objOpt == JSONObject.NULL ? null : objOpt;
            if (obj == null) {
                i = i10;
            } else if (A7.b.c(obj)) {
                if (cVarA == null) {
                    cVarA = fVar.a();
                }
                z7.c cVar = cVarA;
                i = i10;
                arrayList.add(new b.c(str + "[" + i10 + "]", obj.toString(), fVar2, lVar, cVar, bVar, null));
                z10 = true;
                cVarA = cVar;
            } else {
                i = i10;
                try {
                    Object objInvoke = fVar2.invoke(obj);
                    if (objInvoke != null) {
                        bVar.getClass();
                        arrayList.add(objInvoke);
                    }
                } catch (ClassCastException unused2) {
                    fVar.a().d(z7.e.k(jSONArrayOptJSONArray, str, i, obj));
                } catch (Exception e4) {
                    fVar.a().d(z7.e.d(jSONArrayOptJSONArray, str, i, obj, e4));
                }
            }
            i10 = i + 1;
        }
        if (!z10) {
            try {
                if (gVar.a(arrayList)) {
                    return new A7.a(arrayList);
                }
                fVar.a().d(z7.e.e(jSONObject, str, arrayList));
                return null;
            } catch (ClassCastException unused3) {
                fVar.a().d(z7.e.l(jSONObject, str, arrayList));
                return null;
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object value = arrayList.get(i11);
            if (!(value instanceof A7.b)) {
                kotlin.jvm.internal.l.f(value, "value");
                arrayList.set(i11, value instanceof String ? new b.d((String) value) : new b.C0000b(value));
            }
        }
        return new A7.e(str, arrayList, gVar, fVar.a());
    }

    public static <V> void d(D7.f fVar, JSONObject jSONObject, String str, A7.b<V> bVar) {
        if (bVar == null) {
            return;
        }
        Object objB = bVar.b();
        try {
            if (bVar instanceof b.c) {
                jSONObject.put(str, objB);
            } else {
                jSONObject.put(str, objB);
            }
        } catch (JSONException e4) {
            fVar.a().d(e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> void e(D7.f fVar, JSONObject jSONObject, String str, A7.b<V> bVar, p9.l<V, R> lVar) {
        if (bVar == null) {
            return;
        }
        Object objB = bVar.b();
        try {
            if (bVar instanceof b.c) {
                jSONObject.put(str, objB);
            } else {
                jSONObject.put(str, lVar.invoke(objB));
            }
        } catch (JSONException e4) {
            fVar.a().d(e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(D7.f fVar, JSONObject jSONObject, A7.c cVar, h.c cVar2) throws JSONException, z7.d {
        if (cVar == null) {
            return;
        }
        boolean z10 = cVar instanceof A7.a;
        d.a aVar = A7.d.f103a;
        int i = 0;
        if (z10) {
            List listB = cVar.b(aVar);
            int size = listB.size();
            JSONArray jSONArray = new JSONArray();
            while (i < size) {
                jSONArray.put(cVar2.invoke(listB.get(i)));
                i++;
            }
            try {
                jSONObject.put("colors", jSONArray);
                return;
            } catch (JSONException e4) {
                fVar.a().d(e4);
                return;
            }
        }
        if (cVar instanceof A7.e) {
            ArrayList arrayList = ((A7.e) cVar).f105b;
            if (arrayList.isEmpty()) {
                return;
            }
            int size2 = arrayList.size();
            JSONArray jSONArray2 = new JSONArray();
            while (i < size2) {
                A7.b bVar = (A7.b) arrayList.get(i);
                if (bVar instanceof b.C0000b) {
                    jSONArray2.put(cVar2.invoke(bVar.a(aVar)));
                } else {
                    jSONArray2.put(bVar.b());
                }
                i++;
            }
            try {
                jSONObject.put("colors", jSONArray2);
            } catch (JSONException e10) {
                fVar.a().d(e10);
            }
        }
    }
}
