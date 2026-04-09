package de;

import ic.EnumC6140a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: de.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5351B {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC6140a f46022a;

    public C5351B(EnumC6140a sortTypeNetworkDetail) {
        AbstractC6492s.i(sortTypeNetworkDetail, "sortTypeNetworkDetail");
        this.f46022a = sortTypeNetworkDetail;
    }

    public final C5351B a(EnumC6140a sortTypeNetworkDetail) {
        AbstractC6492s.i(sortTypeNetworkDetail, "sortTypeNetworkDetail");
        return new C5351B(sortTypeNetworkDetail);
    }

    public final EnumC6140a b() {
        return this.f46022a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5351B) && this.f46022a == ((C5351B) obj).f46022a;
    }

    public int hashCode() {
        return this.f46022a.hashCode();
    }

    public String toString() {
        return "WifiNetworkDetailHomeConfig(sortTypeNetworkDetail=" + this.f46022a + ")";
    }

    public /* synthetic */ C5351B(EnumC6140a enumC6140a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC6140a.NAME : enumC6140a);
    }
}
