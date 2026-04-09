package y8;

/* loaded from: classes4.dex */
public final class l implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25183b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f25184a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ l(int i10) {
        this.f25184a = i10;
    }

    public static final /* synthetic */ l a(int i10) {
        return new l(i10);
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof l) && i10 == ((l) obj).g();
    }

    public static String f(int i10) {
        return String.valueOf(i10 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return t.a(g(), ((l) obj).g());
    }

    public boolean equals(Object obj) {
        return c(this.f25184a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f25184a;
    }

    public int hashCode() {
        return d(this.f25184a);
    }

    public String toString() {
        return f(this.f25184a);
    }

    public static int b(int i10) {
        return i10;
    }

    public static int d(int i10) {
        return i10;
    }
}
