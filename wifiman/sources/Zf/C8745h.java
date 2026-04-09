package zf;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: zf.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8745h {

    /* renamed from: a, reason: collision with root package name */
    private final S8.d f67272a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f67273b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f67274c;

    public C8745h(S8.d width, boolean z10, s9.d health) {
        AbstractC6492s.i(width, "width");
        AbstractC6492s.i(health, "health");
        this.f67272a = width;
        this.f67273b = z10;
        this.f67274c = health;
    }

    public final s9.d a() {
        return this.f67274c;
    }

    public final boolean b() {
        return this.f67273b;
    }

    public final S8.d c() {
        return this.f67272a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8745h)) {
            return false;
        }
        C8745h c8745h = (C8745h) obj;
        return this.f67272a == c8745h.f67272a && this.f67273b == c8745h.f67273b && AbstractC6492s.d(this.f67274c, c8745h.f67274c);
    }

    public int hashCode() {
        return (((this.f67272a.hashCode() * 31) + Boolean.hashCode(this.f67273b)) * 31) + this.f67274c.hashCode();
    }

    public String toString() {
        return "Model(width=" + this.f67272a + ", selected=" + this.f67273b + ", health=" + this.f67274c + ")";
    }
}
