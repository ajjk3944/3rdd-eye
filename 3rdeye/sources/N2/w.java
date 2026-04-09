package N2;

import O2.g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* compiled from: ResourceCacheKey.java */
/* loaded from: classes.dex */
public final class w implements L2.f {

    /* renamed from: j, reason: collision with root package name */
    public static final h3.i<Class<?>, byte[]> f4647j = new h3.i<>(50);

    /* renamed from: b, reason: collision with root package name */
    public final O2.g f4648b;

    /* renamed from: c, reason: collision with root package name */
    public final L2.f f4649c;

    /* renamed from: d, reason: collision with root package name */
    public final L2.f f4650d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4651e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4652f;

    /* renamed from: g, reason: collision with root package name */
    public final Class<?> f4653g;

    /* renamed from: h, reason: collision with root package name */
    public final L2.h f4654h;
    public final L2.l<?> i;

    public w(O2.g gVar, L2.f fVar, L2.f fVar2, int i, int i10, L2.l lVar, Class cls, L2.h hVar) {
        this.f4648b = gVar;
        this.f4649c = fVar;
        this.f4650d = fVar2;
        this.f4651e = i;
        this.f4652f = i10;
        this.i = lVar;
        this.f4653g = cls;
        this.f4654h = hVar;
    }

    @Override // L2.f
    public final void b(MessageDigest messageDigest) {
        Object objF;
        O2.g gVar = this.f4648b;
        synchronized (gVar) {
            g.b bVar = gVar.f10181b;
            O2.i iVarM = (O2.i) ((ArrayDeque) bVar.f2034b).poll();
            if (iVarM == null) {
                iVarM = bVar.m();
            }
            g.a aVar = (g.a) iVarM;
            aVar.f10187b = 8;
            aVar.f10188c = byte[].class;
            objF = gVar.f(aVar, byte[].class);
        }
        byte[] bArr = (byte[]) objF;
        ByteBuffer.wrap(bArr).putInt(this.f4651e).putInt(this.f4652f).array();
        this.f4650d.b(messageDigest);
        this.f4649c.b(messageDigest);
        messageDigest.update(bArr);
        L2.l<?> lVar = this.i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f4654h.b(messageDigest);
        h3.i<Class<?>, byte[]> iVar = f4647j;
        Class<?> cls = this.f4653g;
        byte[] bArrA = iVar.a(cls);
        if (bArrA == null) {
            bArrA = cls.getName().getBytes(L2.f.f4027a);
            iVar.d(cls, bArrA);
        }
        messageDigest.update(bArrA);
        gVar.h(bArr);
    }

    @Override // L2.f
    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f4652f == wVar.f4652f && this.f4651e == wVar.f4651e && h3.l.b(this.i, wVar.i) && this.f4653g.equals(wVar.f4653g) && this.f4649c.equals(wVar.f4649c) && this.f4650d.equals(wVar.f4650d) && this.f4654h.equals(wVar.f4654h)) {
                return true;
            }
        }
        return false;
    }

    @Override // L2.f
    public final int hashCode() {
        int iHashCode = ((((this.f4650d.hashCode() + (this.f4649c.hashCode() * 31)) * 31) + this.f4651e) * 31) + this.f4652f;
        L2.l<?> lVar = this.i;
        if (lVar != null) {
            iHashCode = (iHashCode * 31) + lVar.hashCode();
        }
        return this.f4654h.f4033b.hashCode() + ((this.f4653g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f4649c + ", signature=" + this.f4650d + ", width=" + this.f4651e + ", height=" + this.f4652f + ", decodedResourceClass=" + this.f4653g + ", transformation='" + this.i + "', options=" + this.f4654h + '}';
    }
}
