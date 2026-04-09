package p4;

import A4.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import java.security.GeneralSecurityException;
import o4.InterfaceC7066a;
import v4.d;

/* loaded from: classes3.dex */
public class D extends v4.d {

    class a extends v4.m {
        a(Class cls) {
            super(cls);
        }

        @Override // v4.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC7066a a(A4.E e10) {
            String strV = e10.W().V();
            return o4.s.a(strV).b(strV);
        }
    }

    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // v4.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public A4.E a(A4.F f10) {
            return (A4.E) A4.E.Y().t(f10).u(D.this.k()).i();
        }

        @Override // v4.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public A4.F d(AbstractC5081h abstractC5081h) {
            return A4.F.W(abstractC5081h, C5088o.b());
        }

        @Override // v4.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(A4.F f10) {
        }
    }

    D() {
        super(A4.E.class, new a(InterfaceC7066a.class));
    }

    public static void m(boolean z10) {
        o4.x.l(new D(), z10);
    }

    @Override // v4.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // v4.d
    public d.a f() {
        return new b(A4.F.class);
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
    public A4.E h(AbstractC5081h abstractC5081h) {
        return A4.E.Z(abstractC5081h, C5088o.b());
    }

    @Override // v4.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(A4.E e10) throws GeneralSecurityException {
        B4.r.c(e10.X(), k());
    }
}
