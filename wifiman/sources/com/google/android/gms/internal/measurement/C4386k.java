package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import org.snmp4j.util.SnmpConfigurator;

/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4386k implements InterfaceC4449s {

    /* renamed from: a, reason: collision with root package name */
    private final Double f35276a;

    public C4386k(Double d10) {
        if (d10 == null) {
            this.f35276a = Double.valueOf(Double.NaN);
        } else {
            this.f35276a = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s e(String str, Z2 z22, List list) {
        if ("toString".equals(str)) {
            return new C4465u(zzf());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzf(), str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4386k) {
            return this.f35276a.equals(((C4386k) obj).f35276a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35276a.hashCode();
    }

    public final String toString() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s zzc() {
        return new C4386k(this.f35276a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Boolean zzd() {
        return Boolean.valueOf((Double.isNaN(this.f35276a.doubleValue()) || this.f35276a.doubleValue() == 0.0d) ? false : true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Double zze() {
        return this.f35276a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final String zzf() throws NumberFormatException {
        if (Double.isNaN(this.f35276a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f35276a.doubleValue())) {
            return this.f35276a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f35276a.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : AbstractC4378j.a(bigDecimalValueOf);
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf(SnmpConfigurator.O_CONTEXT_ENGINE_ID);
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace(SnmpConfigurator.O_CONTEXT_ENGINE_ID, "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Iterator zzh() {
        return null;
    }
}
