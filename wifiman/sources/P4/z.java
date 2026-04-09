package p4;

import A4.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o4.InterfaceC7066a;
import o4.l;
import v4.d;

/* loaded from: classes3.dex */
public class z extends v4.d {

    class a extends v4.m {
        a(Class cls) {
            super(cls);
        }

        @Override // v4.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC7066a a(A4.r rVar) {
            return new B4.g(rVar.W().N0());
        }
    }

    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // v4.d.a
        public Map c() {
            HashMap map = new HashMap();
            map.put("CHACHA20_POLY1305", new d.a.C2247a(A4.s.U(), l.b.TINK));
            map.put("CHACHA20_POLY1305_RAW", new d.a.C2247a(A4.s.U(), l.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // v4.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public A4.r a(A4.s sVar) {
            return (A4.r) A4.r.Y().u(z.this.k()).t(AbstractC5081h.s(B4.p.c(32))).i();
        }

        @Override // v4.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public A4.s d(AbstractC5081h abstractC5081h) {
            return A4.s.V(abstractC5081h, C5088o.b());
        }

        @Override // v4.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(A4.s sVar) {
        }
    }

    z() {
        super(A4.r.class, new a(InterfaceC7066a.class));
    }

    public static void m(boolean z10) {
        o4.x.l(new z(), z10);
        AbstractC7217C.c();
    }

    @Override // v4.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // v4.d
    public d.a f() {
        return new b(A4.s.class);
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
    public A4.r h(AbstractC5081h abstractC5081h) {
        return A4.r.Z(abstractC5081h, C5088o.b());
    }

    @Override // v4.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(A4.r rVar) throws GeneralSecurityException {
        B4.r.c(rVar.X(), k());
        if (rVar.W().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
