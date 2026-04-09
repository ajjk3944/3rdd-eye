package de;

import fc.EnumC5806c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC5806c f46052a;

    public s(EnumC5806c tab) {
        AbstractC6492s.i(tab, "tab");
        this.f46052a = tab;
    }

    public final s a(EnumC5806c tab) {
        AbstractC6492s.i(tab, "tab");
        return new s(tab);
    }

    public final EnumC5806c b() {
        return this.f46052a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f46052a == ((s) obj).f46052a;
    }

    public int hashCode() {
        return this.f46052a.hashCode();
    }

    public String toString() {
        return "DiscoveryHomeConfig(tab=" + this.f46052a + ")";
    }

    public /* synthetic */ s(EnumC5806c enumC5806c, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC5806c.LAN : enumC5806c);
    }
}
