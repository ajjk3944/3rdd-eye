package ke;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;

/* renamed from: ke.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6458c implements Comparable {

    /* renamed from: ke.c$a */
    public static final class a extends AbstractC6458c {

        /* renamed from: a, reason: collision with root package name */
        private final String f51420a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String value) {
            super(null);
            AbstractC6492s.i(value, "value");
            this.f51420a = value;
        }

        @Override // ke.AbstractC6458c
        public String b() {
            return this.f51420a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f51420a, ((a) obj).f51420a);
        }

        public int hashCode() {
            return this.f51420a.hashCode();
        }

        public String toString() {
            return "Available(value=" + this.f51420a + ")";
        }
    }

    /* renamed from: ke.c$b */
    public static final class b extends AbstractC6458c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f51421a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final String f51422b = null;

        private b() {
            super(null);
        }

        @Override // ke.AbstractC6458c
        public String b() {
            return f51422b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -800290628;
        }

        public String toString() {
            return "Hidden";
        }
    }

    public /* synthetic */ AbstractC6458c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC6458c other) {
        AbstractC6492s.i(other, "other");
        if (this instanceof a) {
            if (other instanceof a) {
                return t.u(((a) this).b(), ((a) other).b(), true);
            }
            if (other instanceof b) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (other instanceof a) {
            return -1;
        }
        if (other instanceof b) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract String b();

    private AbstractC6458c() {
    }
}
