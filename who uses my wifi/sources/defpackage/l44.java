package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l44 implements CharSequence {
    public char[] f;
    public String g;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.f, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.g == null) {
            this.g = new String(this.f);
        }
        return this.g;
    }
}
