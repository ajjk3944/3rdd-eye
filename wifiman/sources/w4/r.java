package w4;

import A4.I;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import o4.t;
import o4.v;
import o4.w;
import o4.x;
import y4.b;

/* loaded from: classes3.dex */
class r implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f64435a = Logger.getLogger(r.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f64436b = {0};

    /* renamed from: c, reason: collision with root package name */
    private static final r f64437c = new r();

    private static class b implements t {

        /* renamed from: a, reason: collision with root package name */
        private final v f64438a;

        /* renamed from: b, reason: collision with root package name */
        private final b.a f64439b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f64440c;

        @Override // o4.t
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.f64440c.a();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (v.c cVar : this.f64438a.f(bArrCopyOf)) {
                try {
                    ((t) cVar.g()).a(bArrCopyOfRange, cVar.f().equals(I.LEGACY) ? B4.f.a(bArr2, r.f64436b) : bArr2);
                    this.f64440c.b(cVar.d(), r3.length);
                    return;
                } catch (GeneralSecurityException e10) {
                    r.f64435a.info("tag prefix matches a key, but cannot verify: " + e10);
                }
            }
            for (v.c cVar2 : this.f64438a.h()) {
                try {
                    ((t) cVar2.g()).a(bArr, bArr2);
                    this.f64440c.b(cVar2.d(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f64440c.a();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // o4.t
        public byte[] b(byte[] bArr) throws GeneralSecurityException {
            if (this.f64438a.e().f().equals(I.LEGACY)) {
                bArr = B4.f.a(bArr, r.f64436b);
            }
            try {
                byte[] bArrA = B4.f.a(this.f64438a.e().b(), ((t) this.f64438a.e().g()).b(bArr));
                this.f64439b.b(this.f64438a.e().d(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.f64439b.a();
                throw e10;
            }
        }

        private b(v vVar) {
            this.f64438a = vVar;
            if (!vVar.i()) {
                b.a aVar = v4.f.f63434a;
                this.f64439b = aVar;
                this.f64440c = aVar;
            } else {
                y4.b bVarA = v4.g.b().a();
                y4.c cVarA = v4.f.a(vVar);
                this.f64439b = bVarA.a(cVarA, "mac", "compute");
                this.f64440c = bVarA.a(cVarA, "mac", "verify");
            }
        }
    }

    r() {
    }

    public static void f() {
        x.n(f64437c);
    }

    private void g(v vVar) throws GeneralSecurityException {
        Iterator it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c cVar : (List) it.next()) {
                if (cVar.c() instanceof p) {
                    p pVar = (p) cVar.c();
                    C4.a aVarA = C4.a.a(cVar.b());
                    if (!aVarA.equals(pVar.a())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + pVar.b() + " has wrong output prefix (" + pVar.a() + ") instead of (" + aVarA + ")");
                    }
                }
            }
        }
    }

    @Override // o4.w
    public Class a() {
        return t.class;
    }

    @Override // o4.w
    public Class b() {
        return t.class;
    }

    @Override // o4.w
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public t c(v vVar) throws GeneralSecurityException {
        g(vVar);
        return new b(vVar);
    }
}
