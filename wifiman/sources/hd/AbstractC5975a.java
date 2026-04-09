package hd;

import Bc.a;
import gg.AbstractC5912b;
import gg.i;
import je.AbstractC6317r;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5975a {

    /* renamed from: hd.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1797a extends AbstractC5975a {
        public /* synthetic */ AbstractC1797a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: hd.a$a$a, reason: collision with other inner class name */
        public static final class C1798a extends AbstractC1797a {

            /* renamed from: a, reason: collision with root package name */
            private final long f48579a;

            /* renamed from: b, reason: collision with root package name */
            private final d f48580b;

            /* renamed from: c, reason: collision with root package name */
            private final d.AbstractC1799a.C1800a f48581c;

            public /* synthetic */ C1798a(long j10, d dVar, d.AbstractC1799a.C1800a c1800a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? System.currentTimeMillis() : j10, dVar, c1800a);
            }

            @Override // hd.AbstractC5975a
            public d a() {
                return this.f48580b;
            }

            @Override // hd.AbstractC5975a
            public long b() {
                return this.f48579a;
            }

            @Override // hd.AbstractC5975a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public d.AbstractC1799a.C1800a c() {
                return this.f48581c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1798a)) {
                    return false;
                }
                C1798a c1798a = (C1798a) obj;
                return this.f48579a == c1798a.f48579a && AbstractC6492s.d(this.f48580b, c1798a.f48580b) && AbstractC6492s.d(this.f48581c, c1798a.f48581c);
            }

            public int hashCode() {
                return (((Long.hashCode(this.f48579a) * 31) + this.f48580b.hashCode()) * 31) + this.f48581c.hashCode();
            }

            public String toString() {
                return "CellBTSConnected(timestamp=" + this.f48579a + ", from=" + this.f48580b + ", to=" + this.f48581c + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1798a(long j10, d from, d.AbstractC1799a.C1800a to) {
                super(null);
                AbstractC6492s.i(from, "from");
                AbstractC6492s.i(to, "to");
                this.f48579a = j10;
                this.f48580b = from;
                this.f48581c = to;
            }
        }

        /* renamed from: hd.a$a$b */
        public static final class b extends AbstractC1797a {

            /* renamed from: a, reason: collision with root package name */
            private final long f48582a;

            /* renamed from: b, reason: collision with root package name */
            private final d f48583b;

            /* renamed from: c, reason: collision with root package name */
            private final d.AbstractC1799a.b f48584c;

            public /* synthetic */ b(long j10, d dVar, d.AbstractC1799a.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? System.currentTimeMillis() : j10, dVar, bVar);
            }

            @Override // hd.AbstractC5975a
            public d a() {
                return this.f48583b;
            }

            @Override // hd.AbstractC5975a
            public long b() {
                return this.f48582a;
            }

            @Override // hd.AbstractC5975a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public d.AbstractC1799a.b c() {
                return this.f48584c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f48582a == bVar.f48582a && AbstractC6492s.d(this.f48583b, bVar.f48583b) && AbstractC6492s.d(this.f48584c, bVar.f48584c);
            }

            public int hashCode() {
                return (((Long.hashCode(this.f48582a) * 31) + this.f48583b.hashCode()) * 31) + this.f48584c.hashCode();
            }

            public String toString() {
                return "WiFiNetworkConnection(timestamp=" + this.f48582a + ", from=" + this.f48583b + ", to=" + this.f48584c + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j10, d from, d.AbstractC1799a.b to) {
                super(null);
                AbstractC6492s.i(from, "from");
                AbstractC6492s.i(to, "to");
                this.f48582a = j10;
                this.f48583b = from;
                this.f48584c = to;
            }
        }

        /* renamed from: hd.a$a$c */
        public static final class c extends AbstractC1797a {

            /* renamed from: a, reason: collision with root package name */
            private final long f48585a;

            /* renamed from: b, reason: collision with root package name */
            private final d.AbstractC1799a.b f48586b;

            /* renamed from: c, reason: collision with root package name */
            private final d.AbstractC1799a.b f48587c;

            public /* synthetic */ c(long j10, d.AbstractC1799a.b bVar, d.AbstractC1799a.b bVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? System.currentTimeMillis() : j10, bVar, bVar2);
            }

            @Override // hd.AbstractC5975a
            public long b() {
                return this.f48585a;
            }

            @Override // hd.AbstractC5975a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public d.AbstractC1799a.b a() {
                return this.f48586b;
            }

            @Override // hd.AbstractC5975a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public d.AbstractC1799a.b c() {
                return this.f48587c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f48585a == cVar.f48585a && AbstractC6492s.d(this.f48586b, cVar.f48586b) && AbstractC6492s.d(this.f48587c, cVar.f48587c);
            }

            public int hashCode() {
                return (((Long.hashCode(this.f48585a) * 31) + this.f48586b.hashCode()) * 31) + this.f48587c.hashCode();
            }

            public String toString() {
                return "WifiAPRoaming(timestamp=" + this.f48585a + ", from=" + this.f48586b + ", to=" + this.f48587c + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(long j10, d.AbstractC1799a.b from, d.AbstractC1799a.b to) {
                super(null);
                AbstractC6492s.i(from, "from");
                AbstractC6492s.i(to, "to");
                this.f48585a = j10;
                this.f48586b = from;
                this.f48587c = to;
            }
        }

        private AbstractC1797a() {
            super(null);
        }
    }

    /* renamed from: hd.a$c */
    public interface c {
        i a();

        AbstractC5912b b();
    }

    /* renamed from: hd.a$d */
    public static abstract class d {

        /* renamed from: hd.a$d$a, reason: collision with other inner class name */
        public static abstract class AbstractC1799a extends d {

            /* renamed from: hd.a$d$a$a, reason: collision with other inner class name */
            public static final class C1800a extends AbstractC1799a {

                /* renamed from: a, reason: collision with root package name */
                private final a.b.AbstractC0054a.AbstractC0056b f48591a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1800a(a.b.AbstractC0054a.AbstractC0056b state) {
                    super(null);
                    AbstractC6492s.i(state, "state");
                    this.f48591a = state;
                }

                public final a.b.AbstractC0054a.AbstractC0056b a() {
                    return this.f48591a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1800a) && AbstractC6492s.d(this.f48591a, ((C1800a) obj).f48591a);
                }

                public int hashCode() {
                    return this.f48591a.hashCode();
                }

                public String toString() {
                    return "Cellular(state=" + this.f48591a + ")";
                }
            }

            /* renamed from: hd.a$d$a$b */
            public static final class b extends AbstractC1799a {

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC6317r.b.a f48592a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(AbstractC6317r.b.a state) {
                    super(null);
                    AbstractC6492s.i(state, "state");
                    this.f48592a = state;
                }

                public final AbstractC6317r.b.a a() {
                    return this.f48592a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && AbstractC6492s.d(this.f48592a, ((b) obj).f48592a);
                }

                public int hashCode() {
                    return this.f48592a.hashCode();
                }

                public String toString() {
                    return "Wifi(state=" + this.f48592a + ")";
                }
            }

            public /* synthetic */ AbstractC1799a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC1799a() {
                super(null);
            }
        }

        /* renamed from: hd.a$d$b */
        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final b f48593a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 780250057;
            }

            public String toString() {
                return "Disconnected";
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC5975a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract d a();

    public abstract long b();

    public abstract d c();

    /* renamed from: hd.a$b */
    public static final class b extends AbstractC5975a {

        /* renamed from: a, reason: collision with root package name */
        private final long f48588a;

        /* renamed from: b, reason: collision with root package name */
        private final d.AbstractC1799a f48589b;

        /* renamed from: c, reason: collision with root package name */
        private final d f48590c;

        public /* synthetic */ b(long j10, d.AbstractC1799a abstractC1799a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? System.currentTimeMillis() : j10, abstractC1799a);
        }

        @Override // hd.AbstractC5975a
        public long b() {
            return this.f48588a;
        }

        @Override // hd.AbstractC5975a
        public d c() {
            return this.f48590c;
        }

        @Override // hd.AbstractC5975a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d.AbstractC1799a a() {
            return this.f48589b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f48588a == bVar.f48588a && AbstractC6492s.d(this.f48589b, bVar.f48589b);
        }

        public int hashCode() {
            return (Long.hashCode(this.f48588a) * 31) + this.f48589b.hashCode();
        }

        public String toString() {
            return "Disconnection(timestamp=" + this.f48588a + ", from=" + this.f48589b + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, d.AbstractC1799a from) {
            super(null);
            AbstractC6492s.i(from, "from");
            this.f48588a = j10;
            this.f48589b = from;
            this.f48590c = d.b.f48593a;
        }
    }

    private AbstractC5975a() {
    }
}
