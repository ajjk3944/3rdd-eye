package k0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f13914a = g1.r.f9269g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return g1.r.c(this.f13914a, ((l) obj).f13914a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = g1.r.f9270h;
        return Long.hashCode(this.f13914a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) g1.r.i(this.f13914a)) + ", rippleAlpha=null)";
    }
}
