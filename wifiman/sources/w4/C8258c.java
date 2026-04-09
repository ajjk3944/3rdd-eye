package w4;

import A4.C2397a;
import A4.C2398b;
import A4.C2399c;
import A4.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o4.AbstractC7072g;
import o4.l;
import o4.t;
import o4.x;
import v4.d;
import v4.l;

/* renamed from: w4.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8258c extends v4.d {

    /* renamed from: d, reason: collision with root package name */
    private static final v4.l f64374d = v4.l.b(new l.b() { // from class: w4.b
        @Override // v4.l.b
        public final Object a(AbstractC7072g abstractC7072g) {
            return new x4.b((C8256a) abstractC7072g);
        }
    }, C8256a.class, InterfaceC8262g.class);

    /* renamed from: w4.c$a */
    class a extends v4.m {
        a(Class cls) {
            super(cls);
        }

        @Override // v4.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(C2397a c2397a) {
            return new B4.o(new B4.m(c2397a.X().N0()), c2397a.Y().W());
        }
    }

    /* renamed from: w4.c$b */
    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // v4.d.a
        public Map c() {
            HashMap map = new HashMap();
            C2398b c2398b = (C2398b) C2398b.Y().t(32).u((C2399c) C2399c.X().t(16).i()).i();
            l.b bVar = l.b.TINK;
            map.put("AES_CMAC", new d.a.C2247a(c2398b, bVar));
            map.put("AES256_CMAC", new d.a.C2247a((C2398b) C2398b.Y().t(32).u((C2399c) C2399c.X().t(16).i()).i(), bVar));
            map.put("AES256_CMAC_RAW", new d.a.C2247a((C2398b) C2398b.Y().t(32).u((C2399c) C2399c.X().t(16).i()).i(), l.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // v4.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2397a a(C2398b c2398b) {
            return (C2397a) C2397a.a0().w(0).t(AbstractC5081h.s(B4.p.c(c2398b.W()))).u(c2398b.X()).i();
        }

        @Override // v4.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C2398b d(AbstractC5081h abstractC5081h) {
            return C2398b.Z(abstractC5081h, C5088o.b());
        }

        @Override // v4.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C2398b c2398b) throws GeneralSecurityException {
            C8258c.q(c2398b.X());
            C8258c.r(c2398b.W());
        }
    }

    C8258c() {
        super(C2397a.class, new a(t.class));
    }

    public static void o(boolean z10) {
        x.l(new C8258c(), z10);
        AbstractC8261f.c();
        v4.h.c().d(f64374d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(C2399c c2399c) throws GeneralSecurityException {
        if (c2399c.W() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c2399c.W() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(int i10) throws GeneralSecurityException {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // v4.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // v4.d
    public d.a f() {
        return new b(C2398b.class);
    }

    @Override // v4.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // v4.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C2397a h(AbstractC5081h abstractC5081h) {
        return C2397a.b0(abstractC5081h, C5088o.b());
    }

    @Override // v4.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C2397a c2397a) throws GeneralSecurityException {
        B4.r.c(c2397a.Z(), m());
        r(c2397a.X().size());
        q(c2397a.Y());
    }
}
