package z9;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.k0;

/* loaded from: classes4.dex */
public abstract class g {
    public static final kotlinx.serialization.json.c a(Boolean bool) {
        return bool == null ? JsonNull.f22952c : new l(bool, false);
    }

    public static final kotlinx.serialization.json.c b(Number number) {
        return number == null ? JsonNull.f22952c : new l(number, false);
    }

    public static final kotlinx.serialization.json.c c(String str) {
        return str == null ? JsonNull.f22952c : new l(str, true);
    }

    public static final Void d(kotlinx.serialization.json.b bVar, String str) {
        throw new IllegalArgumentException("Element " + t.b(bVar.getClass()) + " is not a " + str);
    }

    public static final Boolean e(kotlinx.serialization.json.c cVar) {
        kotlin.jvm.internal.p.e(cVar, "<this>");
        return k0.d(cVar.c());
    }

    public static final String f(kotlinx.serialization.json.c cVar) {
        kotlin.jvm.internal.p.e(cVar, "<this>");
        if (cVar instanceof JsonNull) {
            return null;
        }
        return cVar.c();
    }

    public static final double g(kotlinx.serialization.json.c cVar) {
        kotlin.jvm.internal.p.e(cVar, "<this>");
        return Double.parseDouble(cVar.c());
    }

    public static final Double h(kotlinx.serialization.json.c cVar) {
        kotlin.jvm.internal.p.e(cVar, "<this>");
        return s9.p.m(cVar.c());
    }

    public static final float i(kotlinx.serialization.json.c cVar) {
        kotlin.jvm.internal.p.e(cVar, "<this>");
        return Float.parseFloat(cVar.c());
    }

    public static final int j(kotlinx.serialization.json.c cVar) {
        kotlin.jvm.internal.p.e(cVar, "<this>");
        return Integer.parseInt(cVar.c());
    }

    public static final JsonObject k(kotlinx.serialization.json.b bVar) {
        kotlin.jvm.internal.p.e(bVar, "<this>");
        JsonObject jsonObject = bVar instanceof JsonObject ? (JsonObject) bVar : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        d(bVar, "JsonObject");
        throw new KotlinNothingValueException();
    }

    public static final kotlinx.serialization.json.c l(kotlinx.serialization.json.b bVar) {
        kotlin.jvm.internal.p.e(bVar, "<this>");
        kotlinx.serialization.json.c cVar = bVar instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVar : null;
        if (cVar != null) {
            return cVar;
        }
        d(bVar, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final long m(kotlinx.serialization.json.c cVar) {
        kotlin.jvm.internal.p.e(cVar, "<this>");
        return Long.parseLong(cVar.c());
    }

    public static final Long n(kotlinx.serialization.json.c cVar) {
        kotlin.jvm.internal.p.e(cVar, "<this>");
        return s9.q.q(cVar.c());
    }
}
