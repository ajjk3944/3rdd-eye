package b7;

import N7.C1154e9;
import a7.C1666c;
import a7.EnumC1667d;
import b9.m;
import c9.C2097r;
import d7.C4278a;
import d7.C4280c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1902i {
    public static final void a(String str, List<? extends Object> list, boolean z10) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
        int length = ((JSONArray) obj).length();
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        if (jLongValue < length) {
            return;
        }
        f(list, z10, str, "Requested index (" + jLongValue + ") out of bounds array size (" + length + ").");
        throw null;
    }

    public static final Object b(String functionName, List<? extends Object> list, boolean z10) throws JSONException {
        kotlin.jvm.internal.l.f(functionName, "functionName");
        a(functionName, list, z10);
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Long");
        Object obj3 = ((JSONArray) obj).get((int) ((Long) obj2).longValue());
        kotlin.jvm.internal.l.e(obj3, "array.get(index.toInt())");
        return obj3;
    }

    public static final Object c(String functionName, List<? extends Object> list) {
        Object objA;
        kotlin.jvm.internal.l.f(functionName, "functionName");
        try {
            a(functionName, list, false);
            Object obj = list.get(0);
            kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj2 = list.get(1);
            kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Long");
            objA = ((JSONArray) obj).get((int) ((Long) obj2).longValue());
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (objA instanceof m.a) {
            return null;
        }
        return objA;
    }

    public static final C4278a d(String str) {
        Object objA;
        if (str == null) {
            return null;
        }
        try {
            objA = new C4278a(C4278a.C0440a.a(str));
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        return (C4278a) (objA instanceof m.a ? null : objA);
    }

    public static final String e(String str) {
        Object objA;
        if (str == null) {
            return null;
        }
        try {
            try {
                new URL(str);
                objA = new C4280c(str);
            } catch (MalformedURLException unused) {
                throw new IllegalArgumentException("Invalid url ".concat(str));
            }
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        C4280c c4280c = (C4280c) objA;
        if (c4280c != null) {
            return c4280c.f37533a;
        }
        return null;
    }

    public static final void f(List list, boolean z10, String functionName, String message) {
        kotlin.jvm.internal.l.f(functionName, "functionName");
        kotlin.jvm.internal.l.f(message, "message");
        i("array", functionName, list, message, z10);
        throw null;
    }

    public static /* synthetic */ void g(String str, String str2, List list) {
        f(list, false, str, str2);
        throw null;
    }

    public static final void h(String functionName, List<? extends Object> list, EnumC1667d expected, Object obj, boolean z10) {
        kotlin.jvm.internal.l.f(functionName, "functionName");
        kotlin.jvm.internal.l.f(expected, "expected");
        f(list, z10, functionName, "Incorrect value type: expected " + expected.getTypeName$div_evaluable() + ", got " + (!obj.equals(JSONObject.NULL) ? !(obj instanceof Number) ? !(obj instanceof JSONObject) ? obj instanceof JSONArray ? "Array" : obj.getClass().getSimpleName() : "Dict" : "Number" : "Null") + '.');
        throw null;
    }

    public static final void i(String str, String functionName, List list, String message, boolean z10) {
        kotlin.jvm.internal.l.f(functionName, "functionName");
        kotlin.jvm.internal.l.f(message, "message");
        String strI = z10 ? "" : C1154e9.i("<", str, ">, ");
        C1666c.c(C2097r.u0(list.subList(1, list.size()), null, functionName + '(' + strI, ")", C1897h.f17797g, 25), message, null);
        throw null;
    }
}
