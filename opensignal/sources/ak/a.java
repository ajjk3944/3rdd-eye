package ak;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class a implements Serializable {
    public final int B;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public final long J;
    public final long K;
    public final long L;
    public final long M;
    public final long N;
    public final boolean O;
    public final float P;
    public final float Q;

    /* renamed from: a, reason: collision with root package name */
    public final int f407a;

    /* renamed from: d, reason: collision with root package name */
    public final int f408d;

    /* renamed from: g, reason: collision with root package name */
    public final int f409g;

    /* renamed from: r, reason: collision with root package name */
    public final float f410r;

    /* renamed from: x, reason: collision with root package name */
    public final long f411x;

    /* renamed from: y, reason: collision with root package name */
    public final int f412y;

    public a(int i10, int i11, int i12, float f10, long j, int i13, int i14, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, boolean z10, float f11, float f12) {
        this.f407a = i10;
        this.f408d = i11;
        this.f409g = i12;
        this.f410r = f10;
        this.f411x = j;
        this.f412y = i13;
        this.B = i14;
        this.D = j7;
        this.E = j10;
        this.F = j11;
        this.G = j12;
        this.H = j13;
        this.I = j14;
        this.J = j15;
        this.K = j16;
        this.L = j17;
        this.M = j18;
        this.N = j19;
        this.O = z10;
        this.P = f11;
        this.Q = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f407a == aVar.f407a && this.f408d == aVar.f408d && this.f409g == aVar.f409g && Float.compare(this.f410r, aVar.f410r) == 0 && this.f411x == aVar.f411x && this.f412y == aVar.f412y && this.B == aVar.B && this.D == aVar.D && this.E == aVar.E && this.F == aVar.F && this.G == aVar.G && this.H == aVar.H && this.I == aVar.I && this.J == aVar.J && this.K == aVar.K && this.L == aVar.L && this.M == aVar.M && this.N == aVar.N && this.O == aVar.O && Float.compare(this.P, aVar.P) == 0 && Float.compare(this.Q, aVar.Q) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.Q) + w.g.a(w.g.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(c7.a.C(this.B, c7.a.C(this.f412y, h0.b.b(w.g.a(c7.a.C(this.f409g, c7.a.C(this.f408d, Integer.hashCode(this.f407a) * 31, 31), 31), this.f410r, 31), 31, this.f411x), 31), 31), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31, this.I), 31, this.J), 31, this.K), 31, this.L), 31, this.M), 31, this.N), this.O, 31), this.P, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdaptiveConfig(minDurationForQualityIncreaseMs=");
        sb2.append(this.f407a);
        sb2.append(", maxDurationForQualityDecreaseMs=");
        sb2.append(this.f408d);
        sb2.append(", minDurationToRetainAfterDiscardMs=");
        sb2.append(this.f409g);
        sb2.append(", bandwidthFraction=");
        sb2.append(this.f410r);
        sb2.append(", initialBitrateEstimate=");
        sb2.append(this.f411x);
        sb2.append(", slidingWindowMaxWeight=");
        sb2.append(this.f412y);
        sb2.append(", bandwidthOverride=");
        sb2.append(this.B);
        sb2.append(", initialBitrateEstimateWifi=");
        sb2.append(this.D);
        sb2.append(", initialBitrateEstimate2G=");
        sb2.append(this.E);
        sb2.append(", initialBitrateEstimate3G=");
        sb2.append(this.F);
        sb2.append(", initialBitrateEstimateLte=");
        sb2.append(this.G);
        sb2.append(", initialBitrateEstimate5G=");
        sb2.append(this.H);
        sb2.append(", initialBitrateEstimate5GNsa=");
        sb2.append(this.I);
        sb2.append(", initialBitrateEstimate5GSa=");
        sb2.append(this.J);
        sb2.append(", initialBitrateEstimate5GMmWave=");
        sb2.append(this.K);
        sb2.append(", liveTargetOffsetMs=");
        sb2.append(this.L);
        sb2.append(", liveMinOffsetMs=");
        sb2.append(this.M);
        sb2.append(", liveMaxOffsetMs=");
        sb2.append(this.N);
        sb2.append(", ignoreDeviceScreenResolution=");
        sb2.append(this.O);
        sb2.append(", liveMinPlaybackSpeed=");
        sb2.append(this.P);
        sb2.append(", liveMaxPlaybackSpeed=");
        return h0.b.q(sb2, this.Q, ')');
    }
}
