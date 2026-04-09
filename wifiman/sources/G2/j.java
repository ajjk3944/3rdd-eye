package G2;

import W2.k;
import W2.l;
import X2.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final W2.h f6852a = new W2.h(1000);

    /* renamed from: b, reason: collision with root package name */
    private final E1.e f6853b = X2.a.d(10, new a());

    class a implements a.d {
        a() {
        }

        @Override // X2.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private static final class b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        final MessageDigest f6855a;

        /* renamed from: b, reason: collision with root package name */
        private final X2.c f6856b = X2.c.a();

        b(MessageDigest messageDigest) {
            this.f6855a = messageDigest;
        }

        @Override // X2.a.f
        public X2.c b() {
            return this.f6856b;
        }
    }

    private String a(C2.e eVar) {
        b bVar = (b) k.d(this.f6853b.b());
        try {
            eVar.a(bVar.f6855a);
            return l.w(bVar.f6855a.digest());
        } finally {
            this.f6853b.a(bVar);
        }
    }

    public String b(C2.e eVar) {
        String strA;
        synchronized (this.f6852a) {
            strA = (String) this.f6852a.g(eVar);
        }
        if (strA == null) {
            strA = a(eVar);
        }
        synchronized (this.f6852a) {
            this.f6852a.k(eVar, strA);
        }
        return strA;
    }
}
