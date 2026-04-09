package de;

import ic.EnumC6141b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: de.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5354E {

    /* renamed from: a, reason: collision with root package name */
    private final ic.e f46025a;

    /* renamed from: b, reason: collision with root package name */
    private final ic.d f46026b;

    /* renamed from: c, reason: collision with root package name */
    private final ic.c f46027c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC6141b f46028d;

    public C5354E(ic.e chartSpectrum, ic.d sortTypeNetworks, ic.c sortTypeChannelHealth, EnumC6141b scanFeature) {
        AbstractC6492s.i(chartSpectrum, "chartSpectrum");
        AbstractC6492s.i(sortTypeNetworks, "sortTypeNetworks");
        AbstractC6492s.i(sortTypeChannelHealth, "sortTypeChannelHealth");
        AbstractC6492s.i(scanFeature, "scanFeature");
        this.f46025a = chartSpectrum;
        this.f46026b = sortTypeNetworks;
        this.f46027c = sortTypeChannelHealth;
        this.f46028d = scanFeature;
    }

    public static /* synthetic */ C5354E b(C5354E c5354e, ic.e eVar, ic.d dVar, ic.c cVar, EnumC6141b enumC6141b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = c5354e.f46025a;
        }
        if ((i10 & 2) != 0) {
            dVar = c5354e.f46026b;
        }
        if ((i10 & 4) != 0) {
            cVar = c5354e.f46027c;
        }
        if ((i10 & 8) != 0) {
            enumC6141b = c5354e.f46028d;
        }
        return c5354e.a(eVar, dVar, cVar, enumC6141b);
    }

    public final C5354E a(ic.e chartSpectrum, ic.d sortTypeNetworks, ic.c sortTypeChannelHealth, EnumC6141b scanFeature) {
        AbstractC6492s.i(chartSpectrum, "chartSpectrum");
        AbstractC6492s.i(sortTypeNetworks, "sortTypeNetworks");
        AbstractC6492s.i(sortTypeChannelHealth, "sortTypeChannelHealth");
        AbstractC6492s.i(scanFeature, "scanFeature");
        return new C5354E(chartSpectrum, sortTypeNetworks, sortTypeChannelHealth, scanFeature);
    }

    public final ic.e c() {
        return this.f46025a;
    }

    public final EnumC6141b d() {
        return this.f46028d;
    }

    public final ic.c e() {
        return this.f46027c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5354E)) {
            return false;
        }
        C5354E c5354e = (C5354E) obj;
        return this.f46025a == c5354e.f46025a && this.f46026b == c5354e.f46026b && this.f46027c == c5354e.f46027c && this.f46028d == c5354e.f46028d;
    }

    public final ic.d f() {
        return this.f46026b;
    }

    public int hashCode() {
        return (((((this.f46025a.hashCode() * 31) + this.f46026b.hashCode()) * 31) + this.f46027c.hashCode()) * 31) + this.f46028d.hashCode();
    }

    public String toString() {
        return "WifiScanHomeConfig(chartSpectrum=" + this.f46025a + ", sortTypeNetworks=" + this.f46026b + ", sortTypeChannelHealth=" + this.f46027c + ", scanFeature=" + this.f46028d + ")";
    }

    public /* synthetic */ C5354E(ic.e eVar, ic.d dVar, ic.c cVar, EnumC6141b enumC6141b, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ic.e.ALL : eVar, (i10 & 2) != 0 ? ic.d.SSID : dVar, (i10 & 4) != 0 ? ic.c.NUMBER : cVar, (i10 & 8) != 0 ? EnumC6141b.NETWORKS : enumC6141b);
    }
}
