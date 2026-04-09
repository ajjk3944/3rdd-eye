package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g44 extends Number {
    public final String f;

    public g44(String str) {
        this.f = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g44) {
            return this.f.equals(((g44) obj).f);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return uk2.K(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return uk2.K(str).longValue();
        }
    }

    public final String toString() {
        return this.f;
    }
}
