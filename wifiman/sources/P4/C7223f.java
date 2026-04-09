package p4;

import A4.C2402f;
import A4.C2403g;
import A4.C2404h;
import A4.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import java.security.GeneralSecurityException;
import v4.d;

/* renamed from: p4.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7223f extends v4.d {

    /* renamed from: p4.f$a */
    class a extends v4.m {
        a(Class cls) {
            super(cls);
        }

        @Override // v4.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public B4.l a(C2402f c2402f) {
            return new B4.a(c2402f.Y().N0(), c2402f.Z().W());
        }
    }

    /* renamed from: p4.f$b */
    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // v4.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2402f a(C2403g c2403g) {
            return (C2402f) C2402f.b0().u(c2403g.Y()).t(AbstractC5081h.s(B4.p.c(c2403g.X()))).w(C7223f.this.l()).i();
        }

        @Override // v4.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C2403g d(AbstractC5081h abstractC5081h) {
            return C2403g.a0(abstractC5081h, C5088o.b());
        }

        @Override // v4.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C2403g c2403g) throws GeneralSecurityException {
            B4.r.a(c2403g.X());
            C7223f.this.o(c2403g.Y());
        }
    }

    C7223f() {
        super(C2402f.class, new a(B4.l.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(C2404h c2404h) throws GeneralSecurityException {
        if (c2404h.W() < 12 || c2404h.W() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // v4.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // v4.d
    public d.a f() {
        return new b(C2403g.class);
    }

    @Override // v4.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // v4.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C2402f h(AbstractC5081h abstractC5081h) {
        return C2402f.c0(abstractC5081h, C5088o.b());
    }

    @Override // v4.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(C2402f c2402f) {
        B4.r.c(c2402f.a0(), l());
        B4.r.a(c2402f.Y().size());
        o(c2402f.Z());
    }
}
