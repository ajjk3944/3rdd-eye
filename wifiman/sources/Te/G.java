package Te;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final float f21634a;

    /* renamed from: b, reason: collision with root package name */
    private final float f21635b;

    public G(float f10, float f11) {
        this.f21634a = f10;
        this.f21635b = f11;
    }

    public final float a() {
        return this.f21634a;
    }

    public final float b() {
        return this.f21635b;
    }

    public final float c() {
        return this.f21635b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return Float.compare(this.f21634a, g10.f21634a) == 0 && Float.compare(this.f21635b, g10.f21635b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f21634a) * 31) + Float.hashCode(this.f21635b);
    }

    public String toString() {
        return "Entry(x=" + this.f21634a + ", y=" + this.f21635b + ")";
    }
}
