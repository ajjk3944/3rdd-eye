package z7;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q implements x7.e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f38083b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38084c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38085d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f38086e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f38087f;
    public final x7.e g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f38088h;

    /* renamed from: i, reason: collision with root package name */
    public final x7.h f38089i;
    public int j;

    public q(Object obj, x7.e eVar, int i4, int i10, Map map, Class cls, Class cls2, x7.h hVar) {
        t8.f.c(obj, "Argument must not be null");
        this.f38083b = obj;
        this.g = eVar;
        this.f38084c = i4;
        this.f38085d = i10;
        t8.f.c(map, "Argument must not be null");
        this.f38088h = map;
        t8.f.c(cls, "Resource class must not be null");
        this.f38086e = cls;
        t8.f.c(cls2, "Transcode class must not be null");
        this.f38087f = cls2;
        t8.f.c(hVar, "Argument must not be null");
        this.f38089i = hVar;
    }

    @Override // x7.e
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // x7.e
    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f38083b.equals(qVar.f38083b) && this.g.equals(qVar.g) && this.f38085d == qVar.f38085d && this.f38084c == qVar.f38084c && this.f38088h.equals(qVar.f38088h) && this.f38086e.equals(qVar.f38086e) && this.f38087f.equals(qVar.f38087f) && this.f38089i.equals(qVar.f38089i)) {
                return true;
            }
        }
        return false;
    }

    @Override // x7.e
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.f38083b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.f38084c) * 31) + this.f38085d;
            this.j = iHashCode2;
            int iHashCode3 = this.f38088h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.f38086e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f38087f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.f38089i.f37004b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f38083b + ", width=" + this.f38084c + ", height=" + this.f38085d + ", resourceClass=" + this.f38086e + ", transcodeClass=" + this.f38087f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.f38088h + ", options=" + this.f38089i + '}';
    }
}
