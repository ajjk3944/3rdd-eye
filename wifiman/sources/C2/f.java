package C2;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    private static final b f2193e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Object f2194a;

    /* renamed from: b, reason: collision with root package name */
    private final b f2195b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2196c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f2197d;

    class a implements b {
        a() {
        }

        @Override // C2.f.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private f(String str, Object obj, b bVar) {
        this.f2196c = W2.k.b(str);
        this.f2194a = obj;
        this.f2195b = (b) W2.k.d(bVar);
    }

    public static f a(String str, Object obj, b bVar) {
        return new f(str, obj, bVar);
    }

    private static b b() {
        return f2193e;
    }

    private byte[] d() {
        if (this.f2197d == null) {
            this.f2197d = this.f2196c.getBytes(e.f2192a);
        }
        return this.f2197d;
    }

    public static f e(String str) {
        return new f(str, null, b());
    }

    public static f f(String str, Object obj) {
        return new f(str, obj, b());
    }

    public Object c() {
        return this.f2194a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f2196c.equals(((f) obj).f2196c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f2195b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f2196c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f2196c + "'}";
    }
}
