package n1;

import com.google.android.gms.internal.ads.C0752Tp;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import l1.InterfaceC2639e;
import o1.C2756d;
import o1.C2757e;
import o1.InterfaceC2759g;

/* loaded from: classes.dex */
public final class B implements InterfaceC2639e {

    /* renamed from: j, reason: collision with root package name */
    public static final H1.l f22155j = new H1.l(0, 50);

    /* renamed from: b, reason: collision with root package name */
    public final C0752Tp f22156b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2639e f22157c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2639e f22158d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22159e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22160f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f22161g;

    /* renamed from: h, reason: collision with root package name */
    public final l1.h f22162h;
    public final l1.l i;

    public B(C0752Tp c0752Tp, InterfaceC2639e interfaceC2639e, InterfaceC2639e interfaceC2639e2, int i, int i3, l1.l lVar, Class cls, l1.h hVar) {
        this.f22156b = c0752Tp;
        this.f22157c = interfaceC2639e;
        this.f22158d = interfaceC2639e2;
        this.f22159e = i;
        this.f22160f = i3;
        this.i = lVar;
        this.f22161g = cls;
        this.f22162h = hVar;
    }

    @Override // l1.InterfaceC2639e
    public final void a(MessageDigest messageDigest) {
        Object objG;
        C0752Tp c0752Tp = this.f22156b;
        synchronized (c0752Tp) {
            C2757e c2757e = (C2757e) c0752Tp.f11472d;
            InterfaceC2759g interfaceC2759gL = (InterfaceC2759g) ((ArrayDeque) c2757e.f1505a).poll();
            if (interfaceC2759gL == null) {
                interfaceC2759gL = c2757e.l();
            }
            C2756d c2756d = (C2756d) interfaceC2759gL;
            c2756d.f22676b = 8;
            c2756d.f22677c = byte[].class;
            objG = c0752Tp.g(c2756d, byte[].class);
        }
        byte[] bArr = (byte[]) objG;
        ByteBuffer.wrap(bArr).putInt(this.f22159e).putInt(this.f22160f).array();
        this.f22158d.a(messageDigest);
        this.f22157c.a(messageDigest);
        messageDigest.update(bArr);
        l1.l lVar = this.i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.f22162h.a(messageDigest);
        H1.l lVar2 = f22155j;
        Class cls = this.f22161g;
        byte[] bytes = (byte[]) lVar2.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC2639e.f21817a);
            lVar2.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f22156b.i(bArr);
    }

    @Override // l1.InterfaceC2639e
    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            B b5 = (B) obj;
            if (this.f22160f == b5.f22160f && this.f22159e == b5.f22159e && H1.p.b(this.i, b5.i) && this.f22161g.equals(b5.f22161g) && this.f22157c.equals(b5.f22157c) && this.f22158d.equals(b5.f22158d) && this.f22162h.equals(b5.f22162h)) {
                return true;
            }
        }
        return false;
    }

    @Override // l1.InterfaceC2639e
    public final int hashCode() {
        int iHashCode = ((((this.f22158d.hashCode() + (this.f22157c.hashCode() * 31)) * 31) + this.f22159e) * 31) + this.f22160f;
        l1.l lVar = this.i;
        if (lVar != null) {
            iHashCode = (iHashCode * 31) + lVar.hashCode();
        }
        return this.f22162h.f21823b.hashCode() + ((this.f22161g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f22157c + ", signature=" + this.f22158d + ", width=" + this.f22159e + ", height=" + this.f22160f + ", decodedResourceClass=" + this.f22161g + ", transformation='" + this.i + "', options=" + this.f22162h + '}';
    }
}
