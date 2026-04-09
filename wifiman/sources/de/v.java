package de;

import fc.EnumC5805b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC5805b f46055a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f46056b;

    public v(EnumC5805b sortType, boolean z10) {
        AbstractC6492s.i(sortType, "sortType");
        this.f46055a = sortType;
        this.f46056b = z10;
    }

    public static /* synthetic */ v b(v vVar, EnumC5805b enumC5805b, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC5805b = vVar.f46055a;
        }
        if ((i10 & 2) != 0) {
            z10 = vVar.f46056b;
        }
        return vVar.a(enumC5805b, z10);
    }

    public final v a(EnumC5805b sortType, boolean z10) {
        AbstractC6492s.i(sortType, "sortType");
        return new v(sortType, z10);
    }

    public final EnumC5805b c() {
        return this.f46055a;
    }

    public final boolean d() {
        return this.f46056b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f46055a == vVar.f46055a && this.f46056b == vVar.f46056b;
    }

    public int hashCode() {
        return (this.f46055a.hashCode() * 31) + Boolean.hashCode(this.f46056b);
    }

    public String toString() {
        return "DiscoveryLanListConfig(sortType=" + this.f46055a + ", ubiquitiGrouped=" + this.f46056b + ")";
    }

    public /* synthetic */ v(EnumC5805b enumC5805b, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC5805b.IP : enumC5805b, (i10 & 2) != 0 ? true : z10);
    }
}
