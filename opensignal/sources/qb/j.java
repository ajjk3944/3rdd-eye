package qb;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20778a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.media3.common.o f20779b = new androidx.media3.common.o(1);

    /* renamed from: c, reason: collision with root package name */
    public boolean f20780c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20781d;

    public j(Object obj) {
        this.f20778a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return this.f20778a.equals(((j) obj).f20778a);
    }

    public final int hashCode() {
        return this.f20778a.hashCode();
    }
}
