package y8;

/* loaded from: classes4.dex */
public final class j implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25178b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final byte f25179a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ j(byte b10) {
        this.f25179a = b10;
    }

    public static final /* synthetic */ j a(byte b10) {
        return new j(b10);
    }

    public static boolean c(byte b10, Object obj) {
        return (obj instanceof j) && b10 == ((j) obj).g();
    }

    public static String f(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.p.f(g() & 255, ((j) obj).g() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f25179a, obj);
    }

    public final /* synthetic */ byte g() {
        return this.f25179a;
    }

    public int hashCode() {
        return d(this.f25179a);
    }

    public String toString() {
        return f(this.f25179a);
    }

    public static byte b(byte b10) {
        return b10;
    }

    public static int d(byte b10) {
        return b10;
    }
}
