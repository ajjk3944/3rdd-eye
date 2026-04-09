package lu;

import ku.c1;
import ku.p0;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ku.a0 f15950a = p0.a(c1.f14534a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final Boolean a(a0 a0Var) {
        String strA = a0Var.a();
        String[] strArr = mu.a0.f17006a;
        br.l.e(strA, "<this>");
        if (strA.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strA.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int b(a0 a0Var) {
        try {
            long jO = new bj.c(a0Var.a()).o();
            if (-2147483648L <= jO && jO <= 2147483647L) {
                return (int) jO;
            }
            throw new NumberFormatException(a0Var.a() + " is not an Int");
        } catch (mu.h e4) {
            throw new NumberFormatException(e4.getMessage());
        }
    }

    public static final a0 c(l lVar) {
        a0 a0Var = lVar instanceof a0 ? (a0) lVar : null;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalArgumentException("Element " + br.x.f2918a.b(lVar.getClass()) + " is not a JsonPrimitive");
    }
}
