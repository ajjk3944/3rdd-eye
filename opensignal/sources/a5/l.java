package a5;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f128a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.media3.common.o f129b = new androidx.media3.common.o(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f130c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f131d;

    public l(Object obj) {
        this.f128a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f128a.equals(((l) obj).f128a);
    }

    public final int hashCode() {
        return this.f128a.hashCode();
    }
}
