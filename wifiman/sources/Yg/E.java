package Yg;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class E implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24986b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f24987a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ E(long j10) {
        this.f24987a = j10;
    }

    public static final /* synthetic */ E a(long j10) {
        return new E(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof E) && j10 == ((E) obj).j();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return L.d(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return L.b(j(), ((E) obj).j());
    }

    public boolean equals(Object obj) {
        return c(this.f24987a, obj);
    }

    public int hashCode() {
        return g(this.f24987a);
    }

    public final /* synthetic */ long j() {
        return this.f24987a;
    }

    public String toString() {
        return h(this.f24987a);
    }
}
