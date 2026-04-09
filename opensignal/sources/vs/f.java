package vs;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final qs.b f23955a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23956b;

    public f(qs.b bVar, int i10) {
        this.f23955a = bVar;
        this.f23956b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return br.l.a(this.f23955a, fVar.f23955a) && this.f23956b == fVar.f23956b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23956b) + (this.f23955a.hashCode() * 31);
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            i10 = this.f23956b;
            if (i11 >= i10) {
                break;
            }
            sb2.append("kotlin/Array<");
            i11++;
        }
        sb2.append(this.f23955a);
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(">");
        }
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
