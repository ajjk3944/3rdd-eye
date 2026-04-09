package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Double f19747a;

    public g(Double d10) {
        if (d10 == null) {
            this.f19747a = Double.valueOf(Double.NaN);
        } else {
            this.f19747a = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n N1() {
        return new g(this.f19747a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        Double d10 = this.f19747a;
        boolean z3 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f19747a.equals(((g) obj).f19747a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double f() {
        return this.f19747a;
    }

    public final int hashCode() {
        return this.f19747a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n i(String str, a0.x0 x0Var, ArrayList arrayList) throws NumberFormatException {
        if ("toString".equals(str)) {
            return new q(zzc());
        }
        throw new IllegalArgumentException(zzc() + "." + str + " is not a function.");
    }

    public final String toString() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzc() throws NumberFormatException {
        Double d10 = this.f19747a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d10.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i4 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i4 >= 0 || i4 <= -7) && (i4 < 0 || i4 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }
}
