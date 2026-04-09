package z7;

import com.google.android.gms.internal.ads.r9;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 implements x7.e {
    public static final r9 j = new r9(2, 50);

    /* renamed from: b, reason: collision with root package name */
    public final a8.g f37977b;

    /* renamed from: c, reason: collision with root package name */
    public final x7.e f37978c;

    /* renamed from: d, reason: collision with root package name */
    public final x7.e f37979d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37980e;

    /* renamed from: f, reason: collision with root package name */
    public final int f37981f;
    public final Class g;

    /* renamed from: h, reason: collision with root package name */
    public final x7.h f37982h;

    /* renamed from: i, reason: collision with root package name */
    public final x7.l f37983i;

    public a0(a8.g gVar, x7.e eVar, x7.e eVar2, int i4, int i10, x7.l lVar, Class cls, x7.h hVar) {
        this.f37977b = gVar;
        this.f37978c = eVar;
        this.f37979d = eVar2;
        this.f37980e = i4;
        this.f37981f = i10;
        this.f37983i = lVar;
        this.g = cls;
        this.f37982h = hVar;
    }

    @Override // x7.e
    public final void b(MessageDigest messageDigest) {
        Object objG;
        a8.g gVar = this.f37977b;
        synchronized (gVar) {
            a8.f fVar = (a8.f) gVar.f231d;
            a8.i iVarC = (a8.i) ((ArrayDeque) fVar.f218b).poll();
            if (iVarC == null) {
                iVarC = fVar.C();
            }
            a8.e eVar = (a8.e) iVarC;
            eVar.f225b = 8;
            eVar.f226c = byte[].class;
            objG = gVar.g(eVar, byte[].class);
        }
        byte[] bArr = (byte[]) objG;
        ByteBuffer.wrap(bArr).putInt(this.f37980e).putInt(this.f37981f).array();
        this.f37979d.b(messageDigest);
        this.f37978c.b(messageDigest);
        messageDigest.update(bArr);
        x7.l lVar = this.f37983i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f37982h.b(messageDigest);
        r9 r9Var = j;
        Class cls = this.g;
        byte[] bytes = (byte[]) r9Var.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(x7.e.f36998a);
            r9Var.f(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f37977b.i(bArr);
    }

    @Override // x7.e
    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f37981f == a0Var.f37981f && this.f37980e == a0Var.f37980e && t8.m.b(this.f37983i, a0Var.f37983i) && this.g.equals(a0Var.g) && this.f37978c.equals(a0Var.f37978c) && this.f37979d.equals(a0Var.f37979d) && this.f37982h.equals(a0Var.f37982h)) {
                return true;
            }
        }
        return false;
    }

    @Override // x7.e
    public final int hashCode() {
        int iHashCode = ((((this.f37979d.hashCode() + (this.f37978c.hashCode() * 31)) * 31) + this.f37980e) * 31) + this.f37981f;
        x7.l lVar = this.f37983i;
        if (lVar != null) {
            iHashCode = (iHashCode * 31) + lVar.hashCode();
        }
        return this.f37982h.f37004b.hashCode() + ((this.g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f37978c + ", signature=" + this.f37979d + ", width=" + this.f37980e + ", height=" + this.f37981f + ", decodedResourceClass=" + this.g + ", transformation='" + this.f37983i + "', options=" + this.f37982h + '}';
    }
}
