package dt;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final qs.b f7487a;

    /* renamed from: b, reason: collision with root package name */
    public final f f7488b;

    public h(qs.b bVar, f fVar) {
        br.l.e(bVar, "classId");
        this.f7487a = bVar;
        this.f7488b = fVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return br.l.a(this.f7487a, ((h) obj).f7487a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7487a.hashCode();
    }
}
