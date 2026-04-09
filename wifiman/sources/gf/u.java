package Gf;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final float f7432a;

    /* renamed from: b, reason: collision with root package name */
    private final float f7433b;

    public /* synthetic */ u(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    public final float a() {
        return this.f7433b;
    }

    public final float b() {
        return this.f7432a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Y0.h.n(this.f7432a, uVar.f7432a) && Y0.h.n(this.f7433b, uVar.f7433b);
    }

    public int hashCode() {
        return (Y0.h.p(this.f7432a) * 31) + Y0.h.p(this.f7433b);
    }

    public String toString() {
        return "WifiScanNetworkItemMeasurements(rowSignalWidth=" + Y0.h.r(this.f7432a) + ", rowChannelsWidth=" + Y0.h.r(this.f7433b) + ")";
    }

    private u(float f10, float f11) {
        this.f7432a = f10;
        this.f7433b = f11;
    }
}
