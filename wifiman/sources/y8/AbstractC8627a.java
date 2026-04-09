package y8;

import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8627a {

    /* renamed from: y8.a$a, reason: collision with other inner class name */
    public static final class C2357a extends AbstractC8627a {

        /* renamed from: a, reason: collision with root package name */
        private final long f66420a;

        /* renamed from: b, reason: collision with root package name */
        private final String f66421b;

        /* renamed from: c, reason: collision with root package name */
        private final C5969a f66422c;

        public C2357a(long j10, String str, C5969a c5969a) {
            super(null);
            this.f66420a = j10;
            this.f66421b = str;
            this.f66422c = c5969a;
        }

        @Override // y8.AbstractC8627a
        public long a() {
            return this.f66420a;
        }

        public final String b() {
            return this.f66421b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2357a)) {
                return false;
            }
            C2357a c2357a = (C2357a) obj;
            return this.f66420a == c2357a.f66420a && AbstractC6492s.d(this.f66421b, c2357a.f66421b) && AbstractC6492s.d(this.f66422c, c2357a.f66422c);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f66420a) * 31;
            String str = this.f66421b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C5969a c5969a = this.f66422c;
            return iHashCode2 + (c5969a != null ? c5969a.hashCode() : 0);
        }

        public String toString() {
            return "ApRoaming(timestamp=" + this.f66420a + ", name=" + this.f66421b + ", bssid=" + this.f66422c + ")";
        }
    }

    /* renamed from: y8.a$b */
    public interface b {
        gg.i a();
    }

    /* renamed from: y8.a$c */
    public static final class c extends AbstractC8627a {

        /* renamed from: a, reason: collision with root package name */
        private final long f66423a;

        /* renamed from: b, reason: collision with root package name */
        private final String f66424b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, String name) {
            super(null);
            AbstractC6492s.i(name, "name");
            this.f66423a = j10;
            this.f66424b = name;
        }

        @Override // y8.AbstractC8627a
        public long a() {
            return this.f66423a;
        }

        public final String b() {
            return this.f66424b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f66423a == cVar.f66423a && AbstractC6492s.d(this.f66424b, cVar.f66424b);
        }

        public int hashCode() {
            return (Long.hashCode(this.f66423a) * 31) + this.f66424b.hashCode();
        }

        public String toString() {
            return "PlaceAdded(timestamp=" + this.f66423a + ", name=" + this.f66424b + ")";
        }
    }

    public /* synthetic */ AbstractC8627a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long a();

    private AbstractC8627a() {
    }
}
