package xi;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f25355a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25356b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25357c;

    public o(String str, long j, long j7) {
        br.l.e(str, "name");
        this.f25355a = j;
        this.f25356b = str;
        this.f25357c = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f25355a == oVar.f25355a && br.l.a(this.f25356b, oVar.f25356b) && this.f25357c == oVar.f25357c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25357c) + c7.a.g(this.f25356b, Long.hashCode(this.f25355a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaskData(id=");
        sb2.append(this.f25355a);
        sb2.append(", name=");
        sb2.append(this.f25356b);
        sb2.append(", insertedAt=");
        return w.g.h(sb2, this.f25357c, ')');
    }
}
