package aj;

import Zi.T;
import bj.K;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.U;

/* loaded from: classes4.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Xi.f f26373a = T.a("kotlinx.serialization.json.JsonUnquotedLiteral", Wi.a.K(U.f51694a));

    public static final AbstractC3866G a(Number number) {
        return number == null ? C3861B.INSTANCE : new x(number, false, null, 4, null);
    }

    public static final AbstractC3866G b(String str) {
        return str == null ? C3861B.INSTANCE : new x(str, true, null, 4, null);
    }

    private static final Void c(j jVar, String str) {
        throw new IllegalArgumentException("Element " + O.b(jVar.getClass()) + " is not a " + str);
    }

    public static final Boolean d(AbstractC3866G abstractC3866G) {
        AbstractC6492s.i(abstractC3866G, "<this>");
        return K.d(abstractC3866G.b());
    }

    public static final String e(AbstractC3866G abstractC3866G) {
        AbstractC6492s.i(abstractC3866G, "<this>");
        if (abstractC3866G instanceof C3861B) {
            return null;
        }
        return abstractC3866G.b();
    }

    public static final double f(AbstractC3866G abstractC3866G) {
        AbstractC6492s.i(abstractC3866G, "<this>");
        return Double.parseDouble(abstractC3866G.b());
    }

    public static final float g(AbstractC3866G abstractC3866G) {
        AbstractC6492s.i(abstractC3866G, "<this>");
        return Float.parseFloat(abstractC3866G.b());
    }

    public static final C3864E h(j jVar) {
        AbstractC6492s.i(jVar, "<this>");
        C3864E c3864e = jVar instanceof C3864E ? (C3864E) jVar : null;
        if (c3864e != null) {
            return c3864e;
        }
        c(jVar, "JsonObject");
        throw new KotlinNothingValueException();
    }

    public static final AbstractC3866G i(j jVar) {
        AbstractC6492s.i(jVar, "<this>");
        AbstractC3866G abstractC3866G = jVar instanceof AbstractC3866G ? (AbstractC3866G) jVar : null;
        if (abstractC3866G != null) {
            return abstractC3866G;
        }
        c(jVar, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final Xi.f j() {
        return f26373a;
    }

    public static final long k(AbstractC3866G abstractC3866G) {
        AbstractC6492s.i(abstractC3866G, "<this>");
        return new bj.H(abstractC3866G.b()).p();
    }
}
