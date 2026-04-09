package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class g extends i {
    public final boolean g;

    public g(j$.time.temporal.q qVar, int i4, int i10, boolean z3, int i11) {
        super(qVar, i4, i10, u.NOT_NEGATIVE, i11);
        this.g = z3;
    }

    @Override // j$.time.format.i
    public final i a() {
        if (this.f26139e == -1) {
            return this;
        }
        return new g(this.f26135a, this.f26136b, this.f26137c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i b(int i4) {
        return new g(this.f26135a, this.f26136b, this.f26137c, this.g, this.f26139e + i4);
    }

    @Override // j$.time.format.i, j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb2) {
        j$.time.temporal.q qVar = this.f26135a;
        Long lA = pVar.a(qVar);
        if (lA == null) {
            return false;
        }
        s sVar = pVar.f26162b.f26124c;
        long jLongValue = lA.longValue();
        j$.time.temporal.u uVarK = qVar.k();
        uVarK.b(jLongValue, qVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(uVarK.f26228a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(uVarK.f26231d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z3 = this.g;
        int i4 = this.f26136b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i4), this.f26137c), roundingMode).toPlainString().substring(2);
            sVar.getClass();
            if (z3) {
                sb2.append('.');
            }
            sb2.append(strSubstring);
            return true;
        }
        if (i4 > 0) {
            if (z3) {
                sVar.getClass();
                sb2.append('.');
            }
            for (int i10 = 0; i10 < i4; i10++) {
                sVar.getClass();
                sb2.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f26135a + "," + this.f26136b + "," + this.f26137c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
