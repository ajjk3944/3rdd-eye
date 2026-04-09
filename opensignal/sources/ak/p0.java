package ak;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f638a;

    public p0(String str) {
        this.f638a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && br.l.a(this.f638a, ((p0) obj).f638a);
    }

    public final int hashCode() {
        String str = this.f638a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("SdkInSdkConfig(priorityList="), this.f638a, ')');
    }
}
