package com.staircase3.opensignal.goldstar.speedtest.result;

import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import cc.a0;
import com.staircase3.opensignal.models.PlaceType;
import com.staircase3.opensignal.utils.l;
import h0.b;
import kotlin.Metadata;
import w.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/staircase3/opensignal/goldstar/speedtest/result/SpeedTestResult;", "Landroid/os/Parcelable;", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SpeedTestResult implements Parcelable {
    public static final Parcelable.Creator<SpeedTestResult> CREATOR = new a0(23);
    public int B;
    public final String D;
    public String E;
    public double F;
    public double G;
    public final PlaceType H;
    public final boolean I;
    public String J;
    public l K;
    public boolean L;
    public boolean M;
    public boolean N;
    public long O;
    public long P;

    /* renamed from: a, reason: collision with root package name */
    public final int f6095a;

    /* renamed from: d, reason: collision with root package name */
    public long f6096d;

    /* renamed from: g, reason: collision with root package name */
    public long f6097g;

    /* renamed from: r, reason: collision with root package name */
    public long f6098r;

    /* renamed from: x, reason: collision with root package name */
    public long f6099x;

    /* renamed from: y, reason: collision with root package name */
    public final String f6100y;

    public SpeedTestResult(int i10, long j, long j7, long j10, long j11, String str, int i11, String str2, String str3, double d6, double d10, PlaceType placeType, boolean z10, String str4, l lVar) {
        br.l.e(placeType, "placeType");
        br.l.e(str4, "networkProvider");
        br.l.e(lVar, "networkGeneration");
        this.f6095a = i10;
        this.f6096d = j;
        this.f6097g = j7;
        this.f6098r = j10;
        this.f6099x = j11;
        this.f6100y = str;
        this.B = i11;
        this.D = str2;
        this.E = str3;
        this.F = d6;
        this.G = d10;
        this.H = placeType;
        this.I = z10;
        this.J = str4;
        this.K = lVar;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = -1L;
        this.P = -1L;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SpeedTestResult.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        br.l.c(obj, "null cannot be cast to non-null type com.staircase3.opensignal.goldstar.speedtest.result.SpeedTestResult");
        SpeedTestResult speedTestResult = (SpeedTestResult) obj;
        return this.f6096d == speedTestResult.f6096d && this.f6097g == speedTestResult.f6097g && this.f6098r == speedTestResult.f6098r && this.f6099x == speedTestResult.f6099x && br.l.a(this.f6100y, speedTestResult.f6100y) && this.B == speedTestResult.B && br.l.a(this.D, speedTestResult.D) && br.l.a(this.E, speedTestResult.E) && this.F == speedTestResult.F && this.G == speedTestResult.G && this.H == speedTestResult.H && this.I == speedTestResult.I && this.L == speedTestResult.L && this.M == speedTestResult.M && this.N == speedTestResult.N && br.l.a(this.J, speedTestResult.J) && this.K == speedTestResult.K;
    }

    public final int hashCode() {
        int iB = b.b(b.b(b.b(Long.hashCode(this.f6096d) * 31, 31, this.f6097g), 31, this.f6098r), 31, this.f6099x);
        String str = this.f6100y;
        int iHashCode = (((iB + (str != null ? str.hashCode() : 0)) * 31) + this.B) * 31;
        String str2 = this.D;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.E;
        return this.K.hashCode() + a.g(this.J, g.b(g.b(g.b(g.b((this.H.hashCode() + b.a(this.G, b.a(this.F, (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31)) * 31, this.I, 31), this.L, 31), this.M, 31), this.N, 31), 31);
    }

    public final String toString() {
        return "SpeedTestResult(id=" + this.f6095a + ", time=" + this.f6096d + ", downloadSpeed=" + this.f6097g + ", uploadSpeed=" + this.f6098r + ", latency=" + this.f6099x + ", networkType=" + this.f6100y + ", connectionType=" + this.B + ", networkName=" + this.D + ", ssid=" + this.E + ", latitude=" + this.F + ", longitude=" + this.G + ", placeType=" + this.H + ", isSeen=" + this.I + ", networkProvider=" + this.J + ", networkGeneration=" + this.K + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        br.l.e(parcel, "dest");
        parcel.writeInt(this.f6095a);
        parcel.writeLong(this.f6096d);
        parcel.writeLong(this.f6097g);
        parcel.writeLong(this.f6098r);
        parcel.writeLong(this.f6099x);
        parcel.writeString(this.f6100y);
        parcel.writeInt(this.B);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeDouble(this.F);
        parcel.writeDouble(this.G);
        this.H.writeToParcel(parcel, i10);
        parcel.writeInt(this.I ? 1 : 0);
        parcel.writeString(this.J);
        parcel.writeString(this.K.name());
    }

    public /* synthetic */ SpeedTestResult() {
        this(0, 0L, 0L, 0L, 0L, "", -1, "", "", 0.0d, 0.0d, PlaceType.UNKNOWN, false, "", l.UNKNOWN);
    }
}
