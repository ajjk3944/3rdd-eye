package p4;

import A4.C2408l;
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

/* loaded from: classes3.dex */
public final class p extends v4.d {

    class a extends v4.m {
        a(Class cls) {
            super(cls);
        }

        @Override // v4.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC7066a a(C2408l c2408l) {
            return new B4.c(c2408l.W().N0());
        }
    }

    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // v4.d.a
        public Map c() {
            HashMap map = new HashMap();
            l.b bVar = l.b.TINK;
            map.put("AES128_GCM", p.l(16, bVar));
            l.b bVar2 = l.b.RAW;
            map.put("AES128_GCM_RAW", p.l(16, bVar2));
            map.put("AES256_GCM", p.l(32, bVar));
            map.put("AES256_GCM_RAW", p.l(32, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // v4.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2408l a(A4.m mVar) {
            return (C2408l) C2408l.Y().t(AbstractC5081h.s(B4.p.c(mVar.V()))).u(p.this.m()).i();
        }

        @Override // v4.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public A4.m d(AbstractC5081h abstractC5081h) {
            return A4.m.X(abstractC5081h, C5088o.b());
        }

        @Override // v4.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(A4.m mVar) throws InvalidAlgorithmParameterException {
            B4.r.a(mVar.V());
        }
    }

    p() {
        super(C2408l.class, new a(InterfaceC7066a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C2247a l(int i10, l.b bVar) {
        return new d.a.C2247a((A4.m) A4.m.W().t(i10).i(), bVar);
    }

    public static void o(boolean z10) {
        o4.x.l(new p(), z10);
        s.c();
    }

    @Override // v4.d
    public b.EnumC1214b a() {
        return b.EnumC1214b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // v4.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // v4.d
    public d.a f() {
        return new b(A4.m.class);
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
    public C2408l h(AbstractC5081h abstractC5081h) {
        return C2408l.Z(abstractC5081h, C5088o.b());
    }

    @Override // v4.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C2408l c2408l) throws GeneralSecurityException {
        B4.r.c(c2408l.X(), m());
        B4.r.a(c2408l.W().size());
    }
}
