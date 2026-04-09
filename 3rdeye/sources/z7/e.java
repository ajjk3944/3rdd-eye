package z7;

import N7.B8;
import N7.C1154e9;
import kotlin.jvm.internal.l;
import o7.C5430a;
import o7.C5431b;
import org.json.JSONArray;
import org.json.JSONObject;
import y9.r;

/* compiled from: ParsingException.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f48479a = new d(f.MISSING_VARIABLE, "", null, null, null, 28);

    public static final d a(JSONArray jSONArray, String key, int i, Exception exc) {
        l.f(key, "key");
        return new d(f.DEPENDENCY_FAILED, "Value at " + i + " position of '" + key + "' is failed to create", exc, new C5430a(jSONArray), B7.d.B(jSONArray));
    }

    public static final d b(JSONObject json, String key, Exception exc) {
        l.f(json, "json");
        l.f(key, "key");
        return new d(f.DEPENDENCY_FAILED, C1154e9.i("Value for key '", key, "' is failed to create"), exc, new C5431b(json), B7.d.C(json));
    }

    public static final d c(Object obj, String path) {
        l.f(path, "path");
        return new d(f.INVALID_VALUE, "Value '" + i(obj) + "' at path '" + path + "' is not valid", null, null, null, 28);
    }

    public static final d d(JSONArray jSONArray, String key, int i, Object obj, Exception exc) {
        l.f(key, "key");
        f fVar = f.INVALID_VALUE;
        StringBuilder sb = new StringBuilder("Value '");
        sb.append(i(obj));
        sb.append("' at ");
        sb.append(i);
        sb.append(" position of '");
        return new d(fVar, B4.f.c(sb, key, "' is not valid"), exc, new C5430a(jSONArray), null, 16);
    }

    public static final <T> d e(JSONObject json, String key, T t10) {
        l.f(json, "json");
        l.f(key, "key");
        return new d(f.INVALID_VALUE, "Value '" + i(t10) + "' for key '" + key + "' is not valid", null, new C5431b(json), B7.d.C(json), 4);
    }

    public static final d f(JSONObject json, String key, Object obj, Exception exc) {
        l.f(json, "json");
        l.f(key, "key");
        return new d(f.INVALID_VALUE, "Value '" + i(obj) + "' for key '" + key + "' is not valid", exc, new C5431b(json), null, 16);
    }

    public static final d g(String key, JSONObject json) {
        l.f(json, "json");
        l.f(key, "key");
        return new d(f.MISSING_VALUE, C1154e9.i("Value for key '", key, "' is missing"), null, new C5431b(json), B7.d.C(json), 4);
    }

    public static final d h(String key, Object obj, Exception exc) {
        l.f(key, "key");
        return new d(f.INVALID_VALUE, "Value '" + i(obj) + "' for key '" + key + "' could not be resolved", exc, null, null, 24);
    }

    public static final String i(Object obj) {
        String strValueOf = String.valueOf(obj);
        return strValueOf.length() > 100 ? r.z0(97, strValueOf).concat("...") : strValueOf;
    }

    public static final d j(String expressionKey, String rawExpression, Object obj, ClassCastException classCastException) {
        l.f(expressionKey, "expressionKey");
        l.f(rawExpression, "rawExpression");
        f fVar = f.TYPE_MISMATCH;
        StringBuilder sbD = j6.l.d("Expression '", expressionKey, "': '", rawExpression, "' received value of wrong type: '");
        sbD.append(obj);
        sbD.append('\'');
        return new d(fVar, sbD.toString(), classCastException, null, null, 24);
    }

    public static final d k(JSONArray jSONArray, String key, int i, Object obj) {
        l.f(key, "key");
        return new d(f.TYPE_MISMATCH, "Value at " + i + " position of '" + key + "' has wrong type " + obj.getClass().getName(), null, new C5430a(jSONArray), B7.d.B(jSONArray), 4);
    }

    public static final d l(JSONObject json, String key, Object value) {
        l.f(json, "json");
        l.f(key, "key");
        l.f(value, "value");
        f fVar = f.TYPE_MISMATCH;
        StringBuilder sbK = B8.k("Value for key '", key, "' has wrong type ");
        sbK.append(value.getClass().getName());
        return new d(fVar, sbK.toString(), null, new C5431b(json), B7.d.C(json), 4);
    }
}
