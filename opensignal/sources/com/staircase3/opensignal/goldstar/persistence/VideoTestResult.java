package com.staircase3.opensignal.goldstar.persistence;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import h0.b;
import kotlin.Metadata;
import um.a;
import w.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/staircase3/opensignal/goldstar/persistence/VideoTestResult;", "Landroid/os/Parcelable;", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class VideoTestResult implements Parcelable {
    public static final Parcelable.Creator<VideoTestResult> CREATOR = new l(16);
    public final long B;
    public final long D;
    public final double E;
    public final double F;
    public final a G;
    public final String H;
    public final String I;
    public final boolean J;
    public com.staircase3.opensignal.utils.l K;

    /* renamed from: a, reason: collision with root package name */
    public final int f6086a;

    /* renamed from: d, reason: collision with root package name */
    public final long f6087d;

    /* renamed from: g, reason: collision with root package name */
    public final long f6088g;

    /* renamed from: r, reason: collision with root package name */
    public final long f6089r;

    /* renamed from: x, reason: collision with root package name */
    public final double f6090x;

    /* renamed from: y, reason: collision with root package name */
    public final String f6091y;

    public VideoTestResult(int i10, long j, long j7, long j10, double d6, String str, long j11, long j12, double d10, double d11, a aVar, String str2, String str3, boolean z10, com.staircase3.opensignal.utils.l lVar) {
        br.l.e(lVar, "networkGeneration");
        this.f6086a = i10;
        this.f6087d = j;
        this.f6088g = j7;
        this.f6089r = j10;
        this.f6090x = d6;
        this.f6091y = str;
        this.B = j11;
        this.D = j12;
        this.E = d10;
        this.F = d11;
        this.G = aVar;
        this.H = str2;
        this.I = str3;
        this.J = z10;
        this.K = lVar;
    }

    public final double d() {
        long j = this.D;
        if (j <= 0 || this.f6089r == 0) {
            return 0.0d;
        }
        return (this.f6090x * 100) / j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTestResult)) {
            return false;
        }
        VideoTestResult videoTestResult = (VideoTestResult) obj;
        return this.f6086a == videoTestResult.f6086a && this.f6087d == videoTestResult.f6087d && this.f6088g == videoTestResult.f6088g && this.f6089r == videoTestResult.f6089r && Double.compare(this.f6090x, videoTestResult.f6090x) == 0 && br.l.a(this.f6091y, videoTestResult.f6091y) && this.B == videoTestResult.B && this.D == videoTestResult.D && Double.compare(this.E, videoTestResult.E) == 0 && Double.compare(this.F, videoTestResult.F) == 0 && this.G == videoTestResult.G && br.l.a(this.H, videoTestResult.H) && br.l.a(this.I, videoTestResult.I) && this.J == videoTestResult.J && this.K == videoTestResult.K;
    }

    public final int hashCode() {
        int iA = b.a(this.f6090x, b.b(b.b(b.b(Integer.hashCode(this.f6086a) * 31, 31, this.f6087d), 31, this.f6088g), 31, this.f6089r), 31);
        String str = this.f6091y;
        int iA2 = b.a(this.F, b.a(this.E, b.b(b.b((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.B), 31, this.D), 31), 31);
        a aVar = this.G;
        int iHashCode = (iA2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.H;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.I;
        return this.K.hashCode() + g.b((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, this.J, 31);
    }

    public final String toString() {
        return "VideoTestResult(id=" + this.f6086a + ", time=" + this.f6087d + ", bufferingTime=" + this.f6088g + ", loadingTime=" + this.f6089r + ", playbackTime=" + this.f6090x + ", videoResolution=" + this.f6091y + ", videoLength=" + this.B + ", testLength=" + this.D + ", latitude=" + this.E + ", longitude=" + this.F + ", networkType=" + this.G + ", networkProvider=" + this.H + ", networkSubtype=" + this.I + ", isSeen=" + this.J + ", networkGeneration=" + this.K + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        br.l.e(parcel, "dest");
        parcel.writeInt(this.f6086a);
        parcel.writeLong(this.f6087d);
        parcel.writeLong(this.f6088g);
        parcel.writeLong(this.f6089r);
        parcel.writeDouble(this.f6090x);
        parcel.writeString(this.f6091y);
        parcel.writeLong(this.B);
        parcel.writeLong(this.D);
        parcel.writeDouble(this.E);
        parcel.writeDouble(this.F);
        a aVar = this.G;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeInt(this.J ? 1 : 0);
        parcel.writeString(this.K.name());
    }
}
