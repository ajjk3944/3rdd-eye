package Wb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f23830c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f23831a;

    /* renamed from: b, reason: collision with root package name */
    private final long f23832b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(String name, long j10) {
        AbstractC6492s.i(name, "name");
        this.f23831a = name;
        this.f23832b = j10;
    }

    public final long a() {
        return this.f23832b;
    }

    public final String b() {
        return this.f23831a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return AbstractC6492s.d(this.f23831a, gVar.f23831a) && this.f23832b == gVar.f23832b;
    }

    public int hashCode() {
        return (this.f23831a.hashCode() * 31) + Long.hashCode(this.f23832b);
    }

    public String toString() {
        return "RoomSignalMapperPlaceName(name=" + this.f23831a + ", created=" + this.f23832b + ")";
    }
}
