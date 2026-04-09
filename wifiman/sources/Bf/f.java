package Bf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final long f1737a;

    /* renamed from: b, reason: collision with root package name */
    private final long f1738b;

    /* renamed from: c, reason: collision with root package name */
    private final float f1739c;

    public /* synthetic */ f(long j10, long j11, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, f10);
    }

    public final long a() {
        return this.f1737a;
    }

    public final float b() {
        return this.f1739c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C6733v0.m(this.f1737a, fVar.f1737a) && C6733v0.m(this.f1738b, fVar.f1738b) && Float.compare(this.f1739c, fVar.f1739c) == 0;
    }

    public int hashCode() {
        return (((C6733v0.s(this.f1737a) * 31) + C6733v0.s(this.f1738b)) * 31) + Float.hashCode(this.f1739c);
    }

    public String toString() {
        return "WifiSpectrumChartColors(axisLine=" + C6733v0.t(this.f1737a) + ", axisText=" + C6733v0.t(this.f1738b) + ", signalFillAlpha=" + this.f1739c + ")";
    }

    private f(long j10, long j11, float f10) {
        this.f1737a = j10;
        this.f1738b = j11;
        this.f1739c = f10;
    }
}
