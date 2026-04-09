package bc;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4084c {

    /* renamed from: f, reason: collision with root package name */
    public static final a f33108f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f33109a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f33110b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f33111c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f33112d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f33113e;

    /* renamed from: bc.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4084c(int i10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f33109a = i10;
        this.f33110b = bool;
        this.f33111c = bool2;
        this.f33112d = bool3;
        this.f33113e = bool4;
    }

    public final Boolean a() {
        return this.f33112d;
    }

    public final int b() {
        return this.f33109a;
    }

    public final Boolean c() {
        return this.f33110b;
    }

    public final Boolean d() {
        return this.f33113e;
    }

    public final Boolean e() {
        return this.f33111c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4084c)) {
            return false;
        }
        C4084c c4084c = (C4084c) obj;
        return this.f33109a == c4084c.f33109a && AbstractC6492s.d(this.f33110b, c4084c.f33110b) && AbstractC6492s.d(this.f33111c, c4084c.f33111c) && AbstractC6492s.d(this.f33112d, c4084c.f33112d) && AbstractC6492s.d(this.f33113e, c4084c.f33113e);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f33109a) * 31;
        Boolean bool = this.f33110b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f33111c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f33112d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f33113e;
        return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        return "RoomAppWizardConfig(id=" + this.f33109a + ", locationHandled=" + this.f33110b + ", speedtestLocalHandled=" + this.f33111c + ", bluetoothScanHandled=" + this.f33112d + ", notificationPermissionHandled=" + this.f33113e + ")";
    }

    public /* synthetic */ C4084c(int i10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, bool, bool2, bool3, bool4);
    }
}
