package bc;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2605a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2606b;

    public g(Object obj, String str) {
        this.f2605a = obj;
        this.f2606b = str;
    }

    public final String a() {
        int iIdentityHashCode = System.identityHashCode(this.f2605a);
        String str = this.f2606b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb2.append(str);
        sb2.append("@");
        sb2.append(iIdentityHashCode);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2605a == gVar.f2605a && this.f2606b.equals(gVar.f2606b);
    }

    public final int hashCode() {
        return this.f2606b.hashCode() + (System.identityHashCode(this.f2605a) * 31);
    }
}
