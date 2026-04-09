package de;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: de.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5357a {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f46037a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f46038b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f46039c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f46040d;

    public C5357a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f46037a = bool;
        this.f46038b = bool2;
        this.f46039c = bool3;
        this.f46040d = bool4;
    }

    public static /* synthetic */ C5357a b(C5357a c5357a, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = c5357a.f46037a;
        }
        if ((i10 & 2) != 0) {
            bool2 = c5357a.f46038b;
        }
        if ((i10 & 4) != 0) {
            bool3 = c5357a.f46039c;
        }
        if ((i10 & 8) != 0) {
            bool4 = c5357a.f46040d;
        }
        return c5357a.a(bool, bool2, bool3, bool4);
    }

    public final C5357a a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new C5357a(bool, bool2, bool3, bool4);
    }

    public final Boolean c() {
        return this.f46039c;
    }

    public final Boolean d() {
        return this.f46037a;
    }

    public final Boolean e() {
        return this.f46040d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5357a)) {
            return false;
        }
        C5357a c5357a = (C5357a) obj;
        return AbstractC6492s.d(this.f46037a, c5357a.f46037a) && AbstractC6492s.d(this.f46038b, c5357a.f46038b) && AbstractC6492s.d(this.f46039c, c5357a.f46039c) && AbstractC6492s.d(this.f46040d, c5357a.f46040d);
    }

    public final Boolean f() {
        return this.f46038b;
    }

    public int hashCode() {
        Boolean bool = this.f46037a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f46038b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f46039c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f46040d;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        return "AppWizardConfig(locationHandled=" + this.f46037a + ", speedtestLocalHandled=" + this.f46038b + ", bluetoothScanHandled=" + this.f46039c + ", notificationHandled=" + this.f46040d + ")";
    }
}
