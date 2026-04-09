package oh;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final float f19478a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19479b;

    public m(float f10, float f11) {
        this.f19478a = f10;
        this.f19479b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f19478a, mVar.f19478a) == 0 && Float.compare(this.f19479b, mVar.f19479b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19479b) + (Float.hashCode(this.f19478a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoPlaybackParameters(pitch=");
        sb2.append(this.f19478a);
        sb2.append(", speed=");
        return h0.b.q(sb2, this.f19479b, ')');
    }
}
