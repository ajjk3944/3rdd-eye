package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1938p0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f17926a = C2092m.W(new a7.j(EnumC1667d.DICT, false), new a7.j(EnumC1667d.STRING, true));

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f17927b = EnumC1667d.INTEGER;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        long jLongValue;
        Object objR = A9.I.r(c(), list, j());
        if (objR instanceof Integer) {
            jLongValue = ((Number) objR).intValue();
        } else {
            if (!(objR instanceof Long)) {
                if (objR instanceof BigInteger) {
                    A9.I.D(list, j(), c(), "Integer overflow.");
                    throw null;
                }
                if (objR instanceof BigDecimal) {
                    A9.I.D(list, j(), c(), "Cannot convert value to integer.");
                    throw null;
                }
                if (!(objR instanceof Double)) {
                    A9.I.E(c(), list, this.f17927b, objR, j());
                    throw null;
                }
                Number number = (Number) objR;
                if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
                    A9.I.D(list, j(), c(), "Integer overflow.");
                    throw null;
                }
                long jZ = com.google.gson.internal.c.z(number.doubleValue());
                if (number.doubleValue() - jZ == 0.0d) {
                    return Long.valueOf(jZ);
                }
                A9.I.D(list, j(), c(), "Cannot convert value to integer.");
                throw null;
            }
            jLongValue = ((Number) objR).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17926a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17927b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }

    public boolean j() {
        return false;
    }
}
