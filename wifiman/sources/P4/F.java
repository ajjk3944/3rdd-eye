package p4;

import A4.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import java.security.GeneralSecurityException;
import o4.InterfaceC7066a;
import v4.d;

/* loaded from: classes3.dex */
public class F extends v4.d {

    class a extends v4.m {
        a(Class cls) {
            super(cls);
        }

        @Override // v4.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC7066a a(A4.G g10) {
            String strW = g10.W().W();
            return new E(g10.W().V(), o4.s.a(strW).b(strW));
        }
    }

    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // v4.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public A4.G a(A4.H h10) {
            return (A4.G) A4.G.Y().t(h10).u(F.this.k()).i();
        }

        @Override // v4.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public A4.H d(AbstractC5081h abstractC5081h) {
            return A4.H.Y(abstractC5081h, C5088o.b());
        }

        @Override // v4.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(A4.H h10) throws GeneralSecurityException {
            if (h10.W().isEmpty() || !h10.X()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    F() {
        super(A4.G.class, new a(InterfaceC7066a.class));
    }

    public static void m(boolean z10) {
        o4.x.l(new F(), z10);
    }

    @Override // v4.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // v4.d
    public d.a f() {
        return new b(A4.H.class);
    }

    @Override // v4.d
    public y.c g() {
        return y.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    @Override // v4.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public A4.G h(AbstractC5081h abstractC5081h) {
        return A4.G.Z(abstractC5081h, C5088o.b());
    }

    @Override // v4.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(A4.G g10) throws GeneralSecurityException {
        B4.r.c(g10.X(), k());
    }
}
