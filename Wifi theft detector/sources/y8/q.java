package y8;

/* loaded from: classes4.dex */
public final class q implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25194b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final short f25195a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ q(short s10) {
        this.f25195a = s10;
    }

    public static final /* synthetic */ q a(short s10) {
        return new q(s10);
    }

    public static boolean c(short s10, Object obj) {
        return (obj instanceof q) && s10 == ((q) obj).g();
    }

    public static String f(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.p.f(g() & 65535, ((q) obj).g() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f25195a, obj);
    }

    public final /* synthetic */ short g() {
        return this.f25195a;
    }

    public int hashCode() {
        return d(this.f25195a);
    }

    public String toString() {
        return f(this.f25195a);
    }

    public static short b(short s10) {
        return s10;
    }

    public static int d(short s10) {
        return s10;
    }
}
