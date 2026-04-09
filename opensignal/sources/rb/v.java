package rb;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final v f21523e = new v(0, 0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f21524a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21525b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21526c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21527d;

    public v(int i10, int i11, int i12, float f10) {
        this.f21524a = i10;
        this.f21525b = i11;
        this.f21526c = i12;
        this.f21527d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f21524a == vVar.f21524a && this.f21525b == vVar.f21525b && this.f21526c == vVar.f21526c && this.f21527d == vVar.f21527d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f21527d) + ((((((217 + this.f21524a) * 31) + this.f21525b) * 31) + this.f21526c) * 31);
    }
}
