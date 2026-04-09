package androidx.media3.common;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f1733a;

    public p0(p pVar) {
        this.f1733a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            return this.f1733a.equals(((p0) obj).f1733a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1733a.hashCode();
    }
}
