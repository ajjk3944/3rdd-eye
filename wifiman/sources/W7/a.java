package W7;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oh.AbstractC7137b;
import org.snmp4j.mp.SnmpConstants;

/* loaded from: classes3.dex */
public final class a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0878a f23676b = new C0878a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f23677a;

    /* renamed from: W7.a$a, reason: collision with other inner class name */
    public static final class C0878a {
        public /* synthetic */ C0878a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(int i10) {
            return new a(i10);
        }

        public final a b(long j10) {
            return new a(j10);
        }

        public final a c(float f10) {
            return new a(AbstractC7137b.g(f10 * SnmpConstants.MILLISECOND_TO_NANOSECOND));
        }

        public final a d(int i10) {
            return new a(i10 * 1000000);
        }

        private C0878a() {
        }
    }

    public a(long j10) {
        this.f23677a = j10;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        AbstractC6492s.i(other, "other");
        return AbstractC6492s.l(this.f23677a, other.f23677a);
    }

    public final long b() {
        return this.f23677a;
    }

    public final float c() {
        return this.f23677a / 1000000.0f;
    }

    public final int d() {
        return AbstractC7137b.d(this.f23677a / 1000000.0d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f23677a == ((a) obj).f23677a;
    }

    public int hashCode() {
        return Long.hashCode(this.f23677a);
    }

    public String toString() {
        return "[" + d() + " Mbps]";
    }
}
