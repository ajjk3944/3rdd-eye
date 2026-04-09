package P2;

import h3.i;
import h3.l;
import i3.C4455a;
import i3.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final i<L2.f, String> f10582a = new i<>(1000);

    /* renamed from: b, reason: collision with root package name */
    public final C4455a.c f10583b = C4455a.a(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    public class a implements C4455a.b<b> {
        @Override // i3.C4455a.b
        public final b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    public static final class b implements C4455a.d {

        /* renamed from: b, reason: collision with root package name */
        public final MessageDigest f10584b;

        /* renamed from: c, reason: collision with root package name */
        public final d.a f10585c = new d.a();

        public b(MessageDigest messageDigest) {
            this.f10584b = messageDigest;
        }

        @Override // i3.C4455a.d
        public final d.a b() {
            return this.f10585c;
        }
    }

    public final String a(L2.f fVar) {
        String str;
        b bVar = (b) this.f10583b.a();
        try {
            fVar.b(bVar.f10584b);
            byte[] bArrDigest = bVar.f10584b.digest();
            char[] cArr = l.f38218b;
            synchronized (cArr) {
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b10 = bArrDigest[i];
                    int i10 = i * 2;
                    char[] cArr2 = l.f38217a;
                    cArr[i10] = cArr2[(b10 & 255) >>> 4];
                    cArr[i10 + 1] = cArr2[b10 & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            this.f10583b.b(bVar);
        }
    }

    public final String b(L2.f fVar) {
        String strA;
        synchronized (this.f10582a) {
            strA = this.f10582a.a(fVar);
        }
        if (strA == null) {
            strA = a(fVar);
        }
        synchronized (this.f10582a) {
            this.f10582a.d(fVar, strA);
        }
        return strA;
    }
}
