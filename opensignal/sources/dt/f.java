package dt;

import rr.o0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ns.f f7483a;

    /* renamed from: b, reason: collision with root package name */
    public final ls.j f7484b;

    /* renamed from: c, reason: collision with root package name */
    public final ns.a f7485c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f7486d;

    public f(ns.f fVar, ls.j jVar, ns.a aVar, o0 o0Var) {
        br.l.e(fVar, "nameResolver");
        br.l.e(jVar, "classProto");
        br.l.e(o0Var, "sourceElement");
        this.f7483a = fVar;
        this.f7484b = jVar;
        this.f7485c = aVar;
        this.f7486d = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return br.l.a(this.f7483a, fVar.f7483a) && br.l.a(this.f7484b, fVar.f7484b) && br.l.a(this.f7485c, fVar.f7485c) && br.l.a(this.f7486d, fVar.f7486d);
    }

    public final int hashCode() {
        return this.f7486d.hashCode() + ((this.f7485c.hashCode() + ((this.f7484b.hashCode() + (this.f7483a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f7483a + ", classProto=" + this.f7484b + ", metadataVersion=" + this.f7485c + ", sourceElement=" + this.f7486d + ')';
    }
}
