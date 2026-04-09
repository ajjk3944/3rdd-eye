package t9;

import kotlin.jvm.internal.p;
import t9.a;

/* loaded from: classes4.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final j f24475a = new j();

    @Override // t9.k
    public /* bridge */ /* synthetic */ t9.a a() {
        return a.b(b());
    }

    public long b() {
        return h.f24473a.d();
    }

    public String toString() {
        return h.f24473a.toString();
    }

    public static final class a implements t9.a {

        /* renamed from: a, reason: collision with root package name */
        public final long f24476a;

        public /* synthetic */ a(long j10) {
            this.f24476a = j10;
        }

        public static final /* synthetic */ a b(long j10) {
            return new a(j10);
        }

        public static long f(long j10) {
            return h.f24473a.c(j10);
        }

        public static boolean g(long j10, Object obj) {
            return (obj instanceof a) && j10 == ((a) obj).l();
        }

        public static int h(long j10) {
            return androidx.privacysandbox.ads.adservices.topics.d.a(j10);
        }

        public static final long i(long j10, long j11) {
            return h.f24473a.b(j10, j11);
        }

        public static long j(long j10, t9.a other) {
            p.e(other, "other");
            if (other instanceof a) {
                return i(j10, ((a) other).l());
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) k(j10)) + " and " + other);
        }

        public static String k(long j10) {
            return "ValueTimeMark(reading=" + j10 + ')';
        }

        @Override // t9.i
        public long a() {
            return f(this.f24476a);
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(t9.a aVar) {
            return a.C0487a.a(this, aVar);
        }

        @Override // t9.a
        public long e(t9.a other) {
            p.e(other, "other");
            return j(this.f24476a, other);
        }

        public boolean equals(Object obj) {
            return g(this.f24476a, obj);
        }

        public int hashCode() {
            return h(this.f24476a);
        }

        public final /* synthetic */ long l() {
            return this.f24476a;
        }

        public String toString() {
            return k(this.f24476a);
        }

        public static long d(long j10) {
            return j10;
        }
    }
}
