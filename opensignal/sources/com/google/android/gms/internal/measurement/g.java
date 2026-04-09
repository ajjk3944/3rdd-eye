package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Double f5036a;

    public g(Double d6) {
        if (d6 == null) {
            this.f5036a = Double.valueOf(Double.NaN);
        } else {
            this.f5036a = d6;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        Double d6 = this.f5036a;
        boolean z10 = false;
        if (!Double.isNaN(d6.doubleValue()) && d6.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double c() {
        return this.f5036a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f5036a.equals(((g) obj).f5036a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, kg.r rVar, ArrayList arrayList) throws NumberFormatException {
        if ("toString".equals(str)) {
            return new q(l());
        }
        throw new IllegalArgumentException(l() + "." + str + " is not a function.");
    }

    public final int hashCode() {
        return this.f5036a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() throws NumberFormatException {
        Double d6 = this.f5036a;
        if (Double.isNaN(d6.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d6.doubleValue())) {
            return d6.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d6.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n m() {
        return new g(this.f5036a);
    }

    public final String toString() {
        return l();
    }
}
