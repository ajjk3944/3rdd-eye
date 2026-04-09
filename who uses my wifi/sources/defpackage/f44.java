package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f44 extends b44 {
    public final Serializable f;

    public f44(Boolean bool) {
        this.f = bool;
    }

    public static boolean f(f44 f44Var) {
        Serializable serializable = f44Var.f;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // defpackage.b44
    public final String a() {
        Serializable serializable = this.f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return d().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
    }

    public final Number d() {
        Serializable serializable = this.f;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new g44((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final BigInteger e() {
        Serializable serializable = this.f;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (f(this)) {
            return BigInteger.valueOf(d().longValue());
        }
        String strA = a();
        uk2.U(strA);
        return new BigInteger(strA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f44.class != obj.getClass()) {
            return false;
        }
        f44 f44Var = (f44) obj;
        Serializable serializable = f44Var.f;
        Serializable serializable2 = this.f;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (f(this) && f(f44Var)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? e().equals(f44Var.e()) : d().longValue() == f44Var.d().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : uk2.K(a())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : uk2.K(f44Var.a())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? d().doubleValue() : Double.parseDouble(a());
        double dDoubleValue2 = serializable instanceof Number ? f44Var.d().doubleValue() : Double.parseDouble(f44Var.a());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f;
        if (serializable == null) {
            return 31;
        }
        if (f(this)) {
            jDoubleToLongBits = d().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(d().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public f44(String str) {
        this.f = str;
    }

    public f44(uu3 uu3Var) {
        this.f = uu3Var;
    }
}
