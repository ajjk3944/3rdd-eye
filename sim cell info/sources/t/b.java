package t;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f3308e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3309a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3310b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3311c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3312d;

    private b(int i2, int i3, int i4, int i5) {
        this.f3309a = i2;
        this.f3310b = i3;
        this.f3311c = i4;
        this.f3312d = i5;
    }

    public static b a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f3308e : new b(i2, i3, i4, i5);
    }

    public Insets b() {
        return Insets.of(this.f3309a, this.f3310b, this.f3311c, this.f3312d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3312d == bVar.f3312d && this.f3309a == bVar.f3309a && this.f3311c == bVar.f3311c && this.f3310b == bVar.f3310b;
    }

    public int hashCode() {
        return (((((this.f3309a * 31) + this.f3310b) * 31) + this.f3311c) * 31) + this.f3312d;
    }

    public String toString() {
        return "Insets{left=" + this.f3309a + ", top=" + this.f3310b + ", right=" + this.f3311c + ", bottom=" + this.f3312d + '}';
    }
}
