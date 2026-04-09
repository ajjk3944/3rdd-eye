package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zc4 extends IllegalStateException {
    public final int f;
    public final int g;

    public zc4(int i, int i2) {
        super(i != 0 ? i != 1 ? i != 2 ? i != 3 ? ga1.k(new StringBuilder(String.valueOf(i2).length() + 31), "Player stuck suppressed for ", i2, " ms") : ga1.k(new StringBuilder(String.valueOf(i2).length() + 43), "Player stuck playing without ending for ", i2, " ms") : ga1.k(new StringBuilder(String.valueOf(i2).length() + 45), "Player stuck playing with no progress for ", i2, " ms") : ga1.k(new StringBuilder(String.valueOf(i2).length() + 47), "Player stuck buffering with no progress for ", i2, " ms") : ga1.k(new StringBuilder(String.valueOf(i2).length() + 46), "Player stuck buffering and not loading for ", i2, " ms"));
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zc4.class != obj.getClass()) {
            return false;
        }
        zc4 zc4Var = (zc4) obj;
        return this.f == zc4Var.f && this.g == zc4Var.g;
    }

    public final int hashCode() {
        return ((this.f + 527) * 31) + this.g;
    }
}
