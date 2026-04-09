package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import org.json.JSONException;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes.dex */
public abstract class r extends AbstractC1892g {
    public r() {
        super(EnumC1667d.INTEGER);
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException {
        Object objB = C1902i.b(c(), list, j());
        if (objB instanceof Integer) {
            return Long.valueOf(((Number) objB).intValue());
        }
        if (objB instanceof Long) {
            return objB;
        }
        if (objB instanceof BigInteger) {
            C1902i.g(c(), "Integer overflow.", list);
            throw null;
        }
        if (objB instanceof BigDecimal) {
            C1902i.g(c(), "Cannot convert value to integer.", list);
            throw null;
        }
        if (!(objB instanceof Double)) {
            C1902i.h(c(), list, this.f17781a, objB, j());
            throw null;
        }
        Number number = (Number) objB;
        if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
            C1902i.g(c(), "Integer overflow.", list);
            throw null;
        }
        long jZ = com.google.gson.internal.c.z(number.doubleValue());
        if (number.doubleValue() - jZ == 0.0d) {
            return Long.valueOf(jZ);
        }
        C1902i.g(c(), "Cannot convert value to integer.", list);
        throw null;
    }
}
