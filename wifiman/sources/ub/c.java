package Ub;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f22327c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f22328a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22329b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(int i10, String sessionID) {
        AbstractC6492s.i(sessionID, "sessionID");
        this.f22328a = i10;
        this.f22329b = sessionID;
    }

    public final int a() {
        return this.f22328a;
    }

    public final String b() {
        return this.f22329b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f22328a == cVar.f22328a && AbstractC6492s.d(this.f22329b, cVar.f22329b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f22328a) * 31) + this.f22329b.hashCode();
    }

    public String toString() {
        return "RoomAppSession(id=" + this.f22328a + ", sessionID=" + this.f22329b + ")";
    }

    public /* synthetic */ c(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, str);
    }
}
