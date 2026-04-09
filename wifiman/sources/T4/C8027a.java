package t4;

import A4.p;
import A4.q;
import A4.y;
import B4.r;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o4.InterfaceC7070e;
import o4.l;
import o4.x;
import v4.d;
import v4.m;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8027a extends d {

    /* renamed from: t4.a$a, reason: collision with other inner class name */
    class C2169a extends m {
        C2169a(Class cls) {
            super(cls);
        }

        @Override // v4.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC7070e a(p pVar) {
            return new B4.d(pVar.W().N0());
        }
    }

    /* renamed from: t4.a$b */
    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // v4.d.a
        public Map c() {
            HashMap map = new HashMap();
            map.put("AES256_SIV", new d.a.C2247a((q) q.W().t(64).i(), l.b.TINK));
            map.put("AES256_SIV_RAW", new d.a.C2247a((q) q.W().t(64).i(), l.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // v4.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p a(q qVar) {
            return (p) p.Y().t(AbstractC5081h.s(B4.p.c(qVar.V()))).u(C8027a.this.k()).i();
        }

        @Override // v4.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public q d(AbstractC5081h abstractC5081h) {
            return q.X(abstractC5081h, C5088o.b());
        }

        @Override // v4.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(q qVar) throws InvalidAlgorithmParameterException {
            if (qVar.V() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.V() + ". Valid keys must have 64 bytes.");
        }
    }

    C8027a() {
        super(p.class, new C2169a(InterfaceC7070e.class));
    }

    public static void m(boolean z10) {
        x.l(new C8027a(), z10);
    }

    @Override // v4.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // v4.d
    public d.a f() {
        return new b(q.class);
    }

    @Override // v4.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // v4.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public p h(AbstractC5081h abstractC5081h) {
        return p.Z(abstractC5081h, C5088o.b());
    }

    @Override // v4.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(p pVar) throws GeneralSecurityException {
        r.c(pVar.X(), k());
        if (pVar.W().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + pVar.W().size() + ". Valid keys must have 64 bytes.");
    }
}
