package y3;

import v3.AbstractC5678d;
import v3.C5675a;
import v3.C5677c;

/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes.dex */
public final class i extends q {

    /* renamed from: a, reason: collision with root package name */
    public final j f48070a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48071b;

    /* renamed from: c, reason: collision with root package name */
    public final C5675a f48072c;

    /* renamed from: d, reason: collision with root package name */
    public final v3.g<?, byte[]> f48073d;

    /* renamed from: e, reason: collision with root package name */
    public final C5677c f48074e;

    public i(j jVar, String str, C5675a c5675a, v3.g gVar, C5677c c5677c) {
        this.f48070a = jVar;
        this.f48071b = str;
        this.f48072c = c5675a;
        this.f48073d = gVar;
        this.f48074e = c5677c;
    }

    @Override // y3.q
    public final C5677c a() {
        return this.f48074e;
    }

    @Override // y3.q
    public final AbstractC5678d<?> b() {
        return this.f48072c;
    }

    @Override // y3.q
    public final v3.g<?, byte[]> c() {
        return this.f48073d;
    }

    @Override // y3.q
    public final r d() {
        return this.f48070a;
    }

    @Override // y3.q
    public final String e() {
        return this.f48071b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f48070a.equals(qVar.d()) && this.f48071b.equals(qVar.e()) && this.f48072c.equals(qVar.b()) && this.f48073d.equals(qVar.c()) && this.f48074e.equals(qVar.a());
    }

    public final int hashCode() {
        return ((((((((this.f48070a.hashCode() ^ 1000003) * 1000003) ^ this.f48071b.hashCode()) * 1000003) ^ this.f48072c.hashCode()) * 1000003) ^ this.f48073d.hashCode()) * 1000003) ^ this.f48074e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f48070a + ", transportName=" + this.f48071b + ", event=" + this.f48072c + ", transformer=" + this.f48073d + ", encoding=" + this.f48074e + "}";
    }
}
