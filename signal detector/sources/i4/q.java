package i4;

/* loaded from: classes.dex */
public final class q implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public char[] f20627a;

    /* renamed from: b, reason: collision with root package name */
    public String f20628b;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f20627a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f20627a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i3) {
        return new String(this.f20627a, i, i3 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f20628b == null) {
            this.f20628b = new String(this.f20627a);
        }
        return this.f20628b;
    }
}
