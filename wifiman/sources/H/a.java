package H;

import F.D;
import J0.w;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class a implements b {

    /* renamed from: b, reason: collision with root package name */
    private final b f7538b;

    /* renamed from: c, reason: collision with root package name */
    private final b f7539c;

    public a(b bVar, b bVar2) {
        this.f7538b = bVar;
        this.f7539c = bVar2;
    }

    @Override // H.b
    public void a(f fVar) {
        this.f7538b.a(fVar);
        this.f7539c.a(fVar);
    }

    @Override // H.b
    public D b() {
        D dC;
        D dB = this.f7539c.b();
        return (dB == null || (dC = dB.c(this.f7538b.b())) == null) ? this.f7538b.b() : dC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f7538b, aVar.f7538b) && AbstractC6492s.d(this.f7539c, aVar.f7539c) && AbstractC6492s.d(b(), aVar.b());
    }

    public int hashCode() {
        int iHashCode = ((this.f7538b.hashCode() * 31) + this.f7539c.hashCode()) * 32;
        D dB = b();
        return iHashCode + (dB != null ? dB.hashCode() : 0);
    }

    @Override // H.b
    public void q(w wVar) {
        this.f7538b.q(wVar);
        this.f7539c.q(wVar);
    }

    public String toString() {
        return this.f7538b + ".then(" + this.f7539c + ')';
    }
}
