package p4;

import A4.C2400d;
import A4.C2401e;
import A4.C2402f;
import A4.C2403g;
import A4.C2404h;
import A4.y;
import com.google.crypto.tink.config.internal.b;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o4.InterfaceC7066a;
import o4.l;
import v4.d;
import w4.C8266k;

/* renamed from: p4.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7222e extends v4.d {

    /* renamed from: p4.e$a */
    class a extends v4.m {
        a(Class cls) {
            super(cls);
        }

        @Override // v4.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC7066a a(C2400d c2400d) {
            return new B4.h((B4.l) new C7223f().e(c2400d.X(), B4.l.class), (o4.t) new C8266k().e(c2400d.Y(), o4.t.class), c2400d.Y().Z().Y());
        }
    }

    /* renamed from: p4.e$b */
    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // v4.d.a
        public Map c() {
            HashMap map = new HashMap();
            A4.u uVar = A4.u.SHA256;
            l.b bVar = l.b.TINK;
            map.put("AES128_CTR_HMAC_SHA256", C7222e.m(16, 16, 32, 16, uVar, bVar));
            l.b bVar2 = l.b.RAW;
            map.put("AES128_CTR_HMAC_SHA256_RAW", C7222e.m(16, 16, 32, 16, uVar, bVar2));
            map.put("AES256_CTR_HMAC_SHA256", C7222e.m(32, 16, 32, 32, uVar, bVar));
            map.put("AES256_CTR_HMAC_SHA256_RAW", C7222e.m(32, 16, 32, 32, uVar, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // v4.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2400d a(C2401e c2401e) {
            C2402f c2402f = (C2402f) new C7223f().f().a(c2401e.W());
            return (C2400d) C2400d.a0().t(c2402f).u((A4.v) new C8266k().f().a(c2401e.X())).w(C7222e.this.n()).i();
        }

        @Override // v4.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C2401e d(AbstractC5081h abstractC5081h) {
            return C2401e.Z(abstractC5081h, C5088o.b());
        }

        @Override // v4.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C2401e c2401e) throws InvalidAlgorithmParameterException {
            new C7223f().f().e(c2401e.W());
            new C8266k().f().e(c2401e.X());
            B4.r.a(c2401e.W().X());
        }
    }

    C7222e() {
        super(C2400d.class, new a(InterfaceC7066a.class));
    }

    private static C2401e l(int i10, int i11, int i12, int i13, A4.u uVar) {
        C2403g c2403g = (C2403g) C2403g.Z().u((C2404h) C2404h.X().t(i11).i()).t(i10).i();
        return (C2401e) C2401e.Y().t(c2403g).u((A4.w) A4.w.Z().u((A4.x) A4.x.Z().t(uVar).u(i13).i()).t(i12).i()).i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C2247a m(int i10, int i11, int i12, int i13, A4.u uVar, l.b bVar) {
        return new d.a.C2247a(l(i10, i11, i12, i13, uVar), bVar);
    }

    public static void p(boolean z10) {
        o4.x.l(new C7222e(), z10);
    }

    @Override // v4.d
    public b.EnumC1214b a() {
        return b.EnumC1214b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // v4.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // v4.d
    public d.a f() {
        return new b(C2401e.class);
    }

    @Override // v4.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // v4.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C2400d h(AbstractC5081h abstractC5081h) {
        return C2400d.b0(abstractC5081h, C5088o.b());
    }

    @Override // v4.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(C2400d c2400d) throws GeneralSecurityException {
        B4.r.c(c2400d.Z(), n());
        new C7223f().j(c2400d.X());
        new C8266k().j(c2400d.Y());
    }
}
