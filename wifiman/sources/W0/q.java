package W0;

import Y0.v;
import Y0.w;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final a f23554c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final q f23555d = new q(0, 0, 3, null);

    /* renamed from: a, reason: collision with root package name */
    private final long f23556a;

    /* renamed from: b, reason: collision with root package name */
    private final long f23557b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a() {
            return q.f23555d;
        }

        private a() {
        }
    }

    public /* synthetic */ q(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public final long b() {
        return this.f23556a;
    }

    public final long c() {
        return this.f23557b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return v.e(this.f23556a, qVar.f23556a) && v.e(this.f23557b, qVar.f23557b);
    }

    public int hashCode() {
        return (v.i(this.f23556a) * 31) + v.i(this.f23557b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) v.j(this.f23556a)) + ", restLine=" + ((Object) v.j(this.f23557b)) + ')';
    }

    private q(long j10, long j11) {
        this.f23556a = j10;
        this.f23557b = j11;
    }

    public /* synthetic */ q(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? w.g(0) : j10, (i10 & 2) != 0 ? w.g(0) : j11, null);
    }
}
