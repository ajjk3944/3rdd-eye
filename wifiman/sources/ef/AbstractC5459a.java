package ef;

import af.C3806O;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ef.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5459a {

    /* renamed from: ef.a$a, reason: collision with other inner class name */
    public static final class C1744a extends AbstractC5459a {

        /* renamed from: a, reason: collision with root package name */
        private final String f46381a;

        /* renamed from: b, reason: collision with root package name */
        private final C3806O.b.a f46382b;

        /* renamed from: c, reason: collision with root package name */
        private final W7.e f46383c;

        /* renamed from: d, reason: collision with root package name */
        private final s9.d f46384d;

        /* renamed from: e, reason: collision with root package name */
        private final s9.d f46385e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1744a(String id2, C3806O.b.a type, W7.e rating, s9.d value, s9.d message) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(type, "type");
            AbstractC6492s.i(rating, "rating");
            AbstractC6492s.i(value, "value");
            AbstractC6492s.i(message, "message");
            this.f46381a = id2;
            this.f46382b = type;
            this.f46383c = rating;
            this.f46384d = value;
            this.f46385e = message;
        }

        public String a() {
            return this.f46381a;
        }

        public s9.d b() {
            return this.f46385e;
        }

        public final W7.e c() {
            return this.f46383c;
        }

        public final C3806O.b.a d() {
            return this.f46382b;
        }

        public final s9.d e() {
            return this.f46384d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1744a)) {
                return false;
            }
            C1744a c1744a = (C1744a) obj;
            return AbstractC6492s.d(this.f46381a, c1744a.f46381a) && this.f46382b == c1744a.f46382b && this.f46383c == c1744a.f46383c && AbstractC6492s.d(this.f46384d, c1744a.f46384d) && AbstractC6492s.d(this.f46385e, c1744a.f46385e);
        }

        public int hashCode() {
            return (((((((this.f46381a.hashCode() * 31) + this.f46382b.hashCode()) * 31) + this.f46383c.hashCode()) * 31) + this.f46384d.hashCode()) * 31) + this.f46385e.hashCode();
        }

        public String toString() {
            return "KeyValue(id=" + this.f46381a + ", type=" + this.f46382b + ", rating=" + this.f46383c + ", value=" + this.f46384d + ", message=" + this.f46385e + ")";
        }
    }

    /* renamed from: ef.a$b */
    public static final class b extends AbstractC5459a {

        /* renamed from: a, reason: collision with root package name */
        private final String f46386a;

        /* renamed from: b, reason: collision with root package name */
        private final s9.d f46387b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String id2, s9.d message) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(message, "message");
            this.f46386a = id2;
            this.f46387b = message;
        }

        public String a() {
            return this.f46386a;
        }

        public s9.d b() {
            return this.f46387b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f46386a, bVar.f46386a) && AbstractC6492s.d(this.f46387b, bVar.f46387b);
        }

        public int hashCode() {
            return (this.f46386a.hashCode() * 31) + this.f46387b.hashCode();
        }

        public String toString() {
            return "Textual(id=" + this.f46386a + ", message=" + this.f46387b + ")";
        }
    }

    public /* synthetic */ AbstractC5459a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5459a() {
    }
}
