package Ka;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f10579a = new h();

    public interface a extends Ka.a {
    }

    private h() {
    }

    public final a a() {
        return new i();
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f10580a;

        /* renamed from: b, reason: collision with root package name */
        private final int f10581b;

        /* renamed from: c, reason: collision with root package name */
        private final long f10582c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f10583d;

        public b(String host, int i10, long j10, boolean z10) {
            AbstractC6492s.i(host, "host");
            this.f10580a = host;
            this.f10581b = i10;
            this.f10582c = j10;
            this.f10583d = z10;
        }

        public final boolean a() {
            return this.f10583d;
        }

        public final String b() {
            return this.f10580a;
        }

        public final long c() {
            return this.f10582c;
        }

        public final int d() {
            return this.f10581b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f10580a, bVar.f10580a) && this.f10581b == bVar.f10581b && this.f10582c == bVar.f10582c && this.f10583d == bVar.f10583d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = ((((this.f10580a.hashCode() * 31) + Integer.hashCode(this.f10581b)) * 31) + Long.hashCode(this.f10582c)) * 31;
            boolean z10 = this.f10583d;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return iHashCode + i10;
        }

        public String toString() {
            return "Params(host=" + this.f10580a + ", port=" + this.f10581b + ", latencyMs=" + this.f10582c + ", durationInfinite=" + this.f10583d + ")";
        }

        public /* synthetic */ b(String str, int i10, long j10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, j10, (i11 & 8) != 0 ? false : z10);
        }
    }
}
