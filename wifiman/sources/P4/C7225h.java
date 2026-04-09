package p4;

import A4.C2405i;
import A4.C2406j;
import A4.C2407k;
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

/* renamed from: p4.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7225h extends v4.d {

    /* renamed from: p4.h$a */
    class a extends v4.m {
        a(Class cls) {
            super(cls);
        }

        @Override // v4.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC7066a a(C2405i c2405i) {
            return new B4.b(c2405i.X().N0(), c2405i.Y().W());
        }
    }

    /* renamed from: p4.h$b */
    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // v4.d.a
        public Map c() {
            HashMap map = new HashMap();
            l.b bVar = l.b.TINK;
            map.put("AES128_EAX", C7225h.l(16, 16, bVar));
            l.b bVar2 = l.b.RAW;
            map.put("AES128_EAX_RAW", C7225h.l(16, 16, bVar2));
            map.put("AES256_EAX", C7225h.l(32, 16, bVar));
            map.put("AES256_EAX_RAW", C7225h.l(32, 16, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // v4.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2405i a(C2406j c2406j) {
            return (C2405i) C2405i.a0().t(AbstractC5081h.s(B4.p.c(c2406j.W()))).u(c2406j.X()).w(C7225h.this.m()).i();
        }

        @Override // v4.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C2406j d(AbstractC5081h abstractC5081h) {
            return C2406j.Z(abstractC5081h, C5088o.b());
        }

        @Override // v4.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C2406j c2406j) throws GeneralSecurityException {
            B4.r.a(c2406j.W());
            if (c2406j.X().W() != 12 && c2406j.X().W() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    C7225h() {
        super(C2405i.class, new a(InterfaceC7066a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C2247a l(int i10, int i11, l.b bVar) {
        return new d.a.C2247a((C2406j) C2406j.Y().t(i10).u((C2407k) C2407k.X().t(i11).i()).i(), bVar);
    }

    public static void o(boolean z10) {
        o4.x.l(new C7225h(), z10);
        n.c();
    }

    @Override // v4.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // v4.d
    public d.a f() {
        return new b(C2406j.class);
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
    public C2405i h(AbstractC5081h abstractC5081h) {
        return C2405i.b0(abstractC5081h, C5088o.b());
    }

    @Override // v4.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C2405i c2405i) throws GeneralSecurityException {
        B4.r.c(c2405i.Z(), m());
        B4.r.a(c2405i.X().size());
        if (c2405i.Y().W() != 12 && c2405i.Y().W() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
