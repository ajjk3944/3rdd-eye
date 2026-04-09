package w4;

import A4.u;
import A4.v;
import A4.w;
import A4.x;
import A4.y;
import com.google.crypto.tink.config.internal.b;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import o4.AbstractC7072g;
import o4.l;
import o4.t;
import v4.d;
import v4.l;

/* renamed from: w4.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8266k extends v4.d {

    /* renamed from: d, reason: collision with root package name */
    private static final v4.l f64402d = v4.l.b(new l.b() { // from class: w4.j
        @Override // v4.l.b
        public final Object a(AbstractC7072g abstractC7072g) {
            return new x4.c((C8264i) abstractC7072g);
        }
    }, C8264i.class, InterfaceC8262g.class);

    /* renamed from: w4.k$a */
    class a extends v4.m {
        a(Class cls) {
            super(cls);
        }

        @Override // v4.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(v vVar) throws GeneralSecurityException {
            u uVarX = vVar.Z().X();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.Y().N0(), "HMAC");
            int iY = vVar.Z().Y();
            int i10 = c.f64404a[uVarX.ordinal()];
            if (i10 == 1) {
                return new B4.o(new B4.n("HMACSHA1", secretKeySpec), iY);
            }
            if (i10 == 2) {
                return new B4.o(new B4.n("HMACSHA224", secretKeySpec), iY);
            }
            if (i10 == 3) {
                return new B4.o(new B4.n("HMACSHA256", secretKeySpec), iY);
            }
            if (i10 == 4) {
                return new B4.o(new B4.n("HMACSHA384", secretKeySpec), iY);
            }
            if (i10 == 5) {
                return new B4.o(new B4.n("HMACSHA512", secretKeySpec), iY);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: w4.k$b */
    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // v4.d.a
        public Map c() {
            HashMap map = new HashMap();
            u uVar = u.SHA256;
            l.b bVar = l.b.TINK;
            map.put("HMAC_SHA256_128BITTAG", C8266k.m(32, 16, uVar, bVar));
            l.b bVar2 = l.b.RAW;
            map.put("HMAC_SHA256_128BITTAG_RAW", C8266k.m(32, 16, uVar, bVar2));
            map.put("HMAC_SHA256_256BITTAG", C8266k.m(32, 32, uVar, bVar));
            map.put("HMAC_SHA256_256BITTAG_RAW", C8266k.m(32, 32, uVar, bVar2));
            u uVar2 = u.SHA512;
            map.put("HMAC_SHA512_128BITTAG", C8266k.m(64, 16, uVar2, bVar));
            map.put("HMAC_SHA512_128BITTAG_RAW", C8266k.m(64, 16, uVar2, bVar2));
            map.put("HMAC_SHA512_256BITTAG", C8266k.m(64, 32, uVar2, bVar));
            map.put("HMAC_SHA512_256BITTAG_RAW", C8266k.m(64, 32, uVar2, bVar2));
            map.put("HMAC_SHA512_512BITTAG", C8266k.m(64, 64, uVar2, bVar));
            map.put("HMAC_SHA512_512BITTAG_RAW", C8266k.m(64, 64, uVar2, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // v4.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public v a(w wVar) {
            return (v) v.b0().w(C8266k.this.n()).u(wVar.Y()).t(AbstractC5081h.s(B4.p.c(wVar.X()))).i();
        }

        @Override // v4.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public w d(AbstractC5081h abstractC5081h) {
            return w.a0(abstractC5081h, C5088o.b());
        }

        @Override // v4.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(w wVar) throws GeneralSecurityException {
            if (wVar.X() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            C8266k.r(wVar.Y());
        }
    }

    /* renamed from: w4.k$c */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64404a;

        static {
            int[] iArr = new int[u.values().length];
            f64404a = iArr;
            try {
                iArr[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64404a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64404a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64404a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64404a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C8266k() {
        super(v.class, new a(t.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C2247a m(int i10, int i11, u uVar, l.b bVar) {
        return new d.a.C2247a((w) w.Z().u((x) x.Z().t(uVar).u(i11).i()).t(i10).i(), bVar);
    }

    public static void p(boolean z10) {
        o4.x.l(new C8266k(), z10);
        n.c();
        v4.h.c().d(f64402d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(x xVar) throws GeneralSecurityException {
        if (xVar.Y() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i10 = c.f64404a[xVar.X().ordinal()];
        if (i10 == 1) {
            if (xVar.Y() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 2) {
            if (xVar.Y() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 3) {
            if (xVar.Y() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 == 4) {
            if (xVar.Y() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i10 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (xVar.Y() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // v4.d
    public b.EnumC1214b a() {
        return b.EnumC1214b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // v4.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // v4.d
    public d.a f() {
        return new b(w.class);
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
    public v h(AbstractC5081h abstractC5081h) {
        return v.c0(abstractC5081h, C5088o.b());
    }

    @Override // v4.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(v vVar) throws GeneralSecurityException {
        B4.r.c(vVar.a0(), n());
        if (vVar.Y().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        r(vVar.Z());
    }
}
