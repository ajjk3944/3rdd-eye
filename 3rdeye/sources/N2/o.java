package N2;

import java.security.MessageDigest;
import t4.C5606d;

/* compiled from: EngineKey.java */
/* loaded from: classes.dex */
public final class o implements L2.f {

    /* renamed from: b, reason: collision with root package name */
    public final Object f4607b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4608c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4609d;

    /* renamed from: e, reason: collision with root package name */
    public final Class<?> f4610e;

    /* renamed from: f, reason: collision with root package name */
    public final Class<?> f4611f;

    /* renamed from: g, reason: collision with root package name */
    public final L2.f f4612g;

    /* renamed from: h, reason: collision with root package name */
    public final h3.b f4613h;
    public final L2.h i;

    /* renamed from: j, reason: collision with root package name */
    public int f4614j;

    public o(Object obj, L2.f fVar, int i, int i10, h3.b bVar, Class cls, Class cls2, L2.h hVar) {
        C5606d.l(obj, "Argument must not be null");
        this.f4607b = obj;
        C5606d.l(fVar, "Signature must not be null");
        this.f4612g = fVar;
        this.f4608c = i;
        this.f4609d = i10;
        C5606d.l(bVar, "Argument must not be null");
        this.f4613h = bVar;
        C5606d.l(cls, "Resource class must not be null");
        this.f4610e = cls;
        C5606d.l(cls2, "Transcode class must not be null");
        this.f4611f = cls2;
        C5606d.l(hVar, "Argument must not be null");
        this.i = hVar;
    }

    @Override // L2.f
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // L2.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f4607b.equals(oVar.f4607b) && this.f4612g.equals(oVar.f4612g) && this.f4609d == oVar.f4609d && this.f4608c == oVar.f4608c && this.f4613h.equals(oVar.f4613h) && this.f4610e.equals(oVar.f4610e) && this.f4611f.equals(oVar.f4611f) && this.i.equals(oVar.i);
    }

    @Override // L2.f
    public final int hashCode() {
        if (this.f4614j == 0) {
            int iHashCode = this.f4607b.hashCode();
            this.f4614j = iHashCode;
            int iHashCode2 = ((((this.f4612g.hashCode() + (iHashCode * 31)) * 31) + this.f4608c) * 31) + this.f4609d;
            this.f4614j = iHashCode2;
            int iHashCode3 = this.f4613h.hashCode() + (iHashCode2 * 31);
            this.f4614j = iHashCode3;
            int iHashCode4 = this.f4610e.hashCode() + (iHashCode3 * 31);
            this.f4614j = iHashCode4;
            int iHashCode5 = this.f4611f.hashCode() + (iHashCode4 * 31);
            this.f4614j = iHashCode5;
            this.f4614j = this.i.f4033b.hashCode() + (iHashCode5 * 31);
        }
        return this.f4614j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f4607b + ", width=" + this.f4608c + ", height=" + this.f4609d + ", resourceClass=" + this.f4610e + ", transcodeClass=" + this.f4611f + ", signature=" + this.f4612g + ", hashCode=" + this.f4614j + ", transformations=" + this.f4613h + ", options=" + this.i + '}';
    }
}
