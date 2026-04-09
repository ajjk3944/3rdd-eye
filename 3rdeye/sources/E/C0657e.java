package E;

import E.z;

/* compiled from: AutoValue_ProcessingNode_In.java */
/* renamed from: E.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657e extends z.a {

    /* renamed from: a, reason: collision with root package name */
    public final N.k<z.b> f1308a;

    /* renamed from: b, reason: collision with root package name */
    public final N.k<z.b> f1309b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1310c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1311d;

    public C0657e(N.k<z.b> kVar, N.k<z.b> kVar2, int i, int i10) {
        this.f1308a = kVar;
        this.f1309b = kVar2;
        this.f1310c = i;
        this.f1311d = i10;
    }

    @Override // E.z.a
    public final N.k<z.b> a() {
        return this.f1308a;
    }

    @Override // E.z.a
    public final int b() {
        return this.f1310c;
    }

    @Override // E.z.a
    public final int c() {
        return this.f1311d;
    }

    @Override // E.z.a
    public final N.k<z.b> d() {
        return this.f1309b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z.a)) {
            return false;
        }
        z.a aVar = (z.a) obj;
        return this.f1308a.equals(aVar.a()) && this.f1309b.equals(aVar.d()) && this.f1310c == aVar.b() && this.f1311d == aVar.c();
    }

    public final int hashCode() {
        return ((((((this.f1308a.hashCode() ^ 1000003) * 1000003) ^ this.f1309b.hashCode()) * 1000003) ^ this.f1310c) * 1000003) ^ this.f1311d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.f1308a);
        sb.append(", postviewEdge=");
        sb.append(this.f1309b);
        sb.append(", inputFormat=");
        sb.append(this.f1310c);
        sb.append(", outputFormat=");
        return B4.i.j(sb, this.f1311d, "}");
    }
}
