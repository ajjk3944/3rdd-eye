package t5;

import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class g extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f61763a;

    public g(String str) {
        this.f61763a = str;
    }

    private BigDecimal a() {
        return i.b(this.f61763a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f61763a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f61763a.equals(((g) obj).f61763a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f61763a);
    }

    public int hashCode() {
        return this.f61763a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f61763a);
            } catch (NumberFormatException unused) {
                return a().intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f61763a);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f61763a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f61763a;
    }
}
