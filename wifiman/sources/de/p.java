package de;

import fc.EnumC5804a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC5804a f46047a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f46048b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f46049c;

    public p(EnumC5804a sortType, boolean z10, boolean z11) {
        AbstractC6492s.i(sortType, "sortType");
        this.f46047a = sortType;
        this.f46048b = z10;
        this.f46049c = z11;
    }

    public static /* synthetic */ p b(p pVar, EnumC5804a enumC5804a, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC5804a = pVar.f46047a;
        }
        if ((i10 & 2) != 0) {
            z10 = pVar.f46048b;
        }
        if ((i10 & 4) != 0) {
            z11 = pVar.f46049c;
        }
        return pVar.a(enumC5804a, z10, z11);
    }

    public final p a(EnumC5804a sortType, boolean z10, boolean z11) {
        AbstractC6492s.i(sortType, "sortType");
        return new p(sortType, z10, z11);
    }

    public final boolean c() {
        return this.f46049c;
    }

    public final EnumC5804a d() {
        return this.f46047a;
    }

    public final boolean e() {
        return this.f46048b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f46047a == pVar.f46047a && this.f46048b == pVar.f46048b && this.f46049c == pVar.f46049c;
    }

    public int hashCode() {
        return (((this.f46047a.hashCode() * 31) + Boolean.hashCode(this.f46048b)) * 31) + Boolean.hashCode(this.f46049c);
    }

    public String toString() {
        return "DiscoveryBluetoothListConfig(sortType=" + this.f46047a + ", ubiquitiGrouped=" + this.f46048b + ", connectedOnTop=" + this.f46049c + ")";
    }

    public /* synthetic */ p(EnumC5804a enumC5804a, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC5804a.NAME : enumC5804a, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? true : z11);
    }
}
