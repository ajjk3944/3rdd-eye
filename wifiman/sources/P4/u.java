package p4;

import A4.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import o4.InterfaceC7066a;
import o4.l;
import r4.C7572a;
import v4.d;

/* loaded from: classes3.dex */
public final class u extends v4.d {

    class a extends v4.m {
        a(Class cls) {
            super(cls);
        }

        @Override // v4.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC7066a a(A4.n nVar) {
            return new C7572a(nVar.W().N0());
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
            map.put("AES128_GCM_SIV", u.m(16, bVar));
            l.b bVar2 = l.b.RAW;
            map.put("AES128_GCM_SIV_RAW", u.m(16, bVar2));
            map.put("AES256_GCM_SIV", u.m(32, bVar));
            map.put("AES256_GCM_SIV_RAW", u.m(32, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // v4.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public A4.n a(A4.o oVar) {
            return (A4.n) A4.n.Y().t(AbstractC5081h.s(B4.p.c(oVar.V()))).u(u.this.n()).i();
        }

        @Override // v4.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public A4.o d(AbstractC5081h abstractC5081h) {
            return A4.o.X(abstractC5081h, C5088o.b());
        }

        @Override // v4.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(A4.o oVar) throws InvalidAlgorithmParameterException {
            B4.r.a(oVar.V());
        }
    }

    u() {
        super(A4.n.class, new a(InterfaceC7066a.class));
    }

    private static boolean l() throws NoSuchPaddingException, NoSuchAlgorithmException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C2247a m(int i10, l.b bVar) {
        return new d.a.C2247a((A4.o) A4.o.W().t(i10).i(), bVar);
    }

    public static void p(boolean z10) {
        if (l()) {
            o4.x.l(new u(), z10);
            x.c();
        }
    }

    @Override // v4.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // v4.d
    public d.a f() {
        return new b(A4.o.class);
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
    public A4.n h(AbstractC5081h abstractC5081h) {
        return A4.n.Z(abstractC5081h, C5088o.b());
    }

    @Override // v4.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(A4.n nVar) throws GeneralSecurityException {
        B4.r.c(nVar.X(), n());
        B4.r.a(nVar.W().size());
    }
}
