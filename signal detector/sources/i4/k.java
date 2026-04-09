package i4;

/* loaded from: classes.dex */
public final class k extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f20607a;

    public k(String str) {
        this.f20607a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f20607a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f20607a.equals(((k) obj).f20607a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f20607a);
    }

    public final int hashCode() {
        return this.f20607a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f20607a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return i.i(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f20607a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return i.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f20607a;
    }
}
