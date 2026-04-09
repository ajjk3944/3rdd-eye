package n1;

import java.security.MessageDigest;
import java.util.Map;
import l1.InterfaceC2639e;

/* loaded from: classes.dex */
public final class r implements InterfaceC2639e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f22279b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22280c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22281d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f22282e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f22283f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2639e f22284g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f22285h;
    public final l1.h i;

    /* renamed from: j, reason: collision with root package name */
    public int f22286j;

    public r(Object obj, InterfaceC2639e interfaceC2639e, int i, int i3, Map map, Class cls, Class cls2, l1.h hVar) {
        H1.g.c(obj, "Argument must not be null");
        this.f22279b = obj;
        this.f22284g = interfaceC2639e;
        this.f22280c = i;
        this.f22281d = i3;
        H1.g.c(map, "Argument must not be null");
        this.f22285h = map;
        H1.g.c(cls, "Resource class must not be null");
        this.f22282e = cls;
        H1.g.c(cls2, "Transcode class must not be null");
        this.f22283f = cls2;
        H1.g.c(hVar, "Argument must not be null");
        this.i = hVar;
    }

    @Override // l1.InterfaceC2639e
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // l1.InterfaceC2639e
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f22279b.equals(rVar.f22279b) && this.f22284g.equals(rVar.f22284g) && this.f22281d == rVar.f22281d && this.f22280c == rVar.f22280c && this.f22285h.equals(rVar.f22285h) && this.f22282e.equals(rVar.f22282e) && this.f22283f.equals(rVar.f22283f) && this.i.equals(rVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // l1.InterfaceC2639e
    public final int hashCode() {
        if (this.f22286j == 0) {
            int iHashCode = this.f22279b.hashCode();
            this.f22286j = iHashCode;
            int iHashCode2 = ((((this.f22284g.hashCode() + (iHashCode * 31)) * 31) + this.f22280c) * 31) + this.f22281d;
            this.f22286j = iHashCode2;
            int iHashCode3 = this.f22285h.hashCode() + (iHashCode2 * 31);
            this.f22286j = iHashCode3;
            int iHashCode4 = this.f22282e.hashCode() + (iHashCode3 * 31);
            this.f22286j = iHashCode4;
            int iHashCode5 = this.f22283f.hashCode() + (iHashCode4 * 31);
            this.f22286j = iHashCode5;
            this.f22286j = this.i.f21823b.hashCode() + (iHashCode5 * 31);
        }
        return this.f22286j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f22279b + ", width=" + this.f22280c + ", height=" + this.f22281d + ", resourceClass=" + this.f22282e + ", transcodeClass=" + this.f22283f + ", signature=" + this.f22284g + ", hashCode=" + this.f22286j + ", transformations=" + this.f22285h + ", options=" + this.i + '}';
    }
}
