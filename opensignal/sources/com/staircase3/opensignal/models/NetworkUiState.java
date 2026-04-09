package com.staircase3.opensignal.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.staircase3.opensignal.utils.l;
import com.staircase3.opensignal.utils.m;
import i6.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/staircase3/opensignal/models/NetworkUiState;", "Landroid/os/Parcelable;", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkUiState implements Parcelable {
    public static final Parcelable.Creator<NetworkUiState> CREATOR = new a(21);
    public um.a B;
    public l D;
    public String E;
    public String F;
    public int G;
    public int H;
    public int I;

    /* renamed from: a, reason: collision with root package name */
    public m f6127a;

    /* renamed from: d, reason: collision with root package name */
    public int f6128d;

    /* renamed from: g, reason: collision with root package name */
    public int f6129g;

    /* renamed from: r, reason: collision with root package name */
    public String f6130r;

    /* renamed from: x, reason: collision with root package name */
    public final String f6131x;

    /* renamed from: y, reason: collision with root package name */
    public int f6132y;

    public NetworkUiState(m mVar, int i10, int i11, String str, String str2, int i12, um.a aVar, l lVar, String str3, String str4, int i13, int i14, int i15) {
        br.l.e(mVar, "strengthType");
        br.l.e(str, "networkTypeDetailed");
        br.l.e(str2, "networkId");
        br.l.e(aVar, "networkType");
        br.l.e(lVar, "networkGeneration");
        br.l.e(str3, "wifiSsid");
        br.l.e(str4, "networkName");
        this.f6127a = mVar;
        this.f6128d = i10;
        this.f6129g = i11;
        this.f6130r = str;
        this.f6131x = str2;
        this.f6132y = i12;
        this.B = aVar;
        this.D = lVar;
        this.E = str3;
        this.F = str4;
        this.G = i13;
        this.H = i14;
        this.I = i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkUiState)) {
            return false;
        }
        NetworkUiState networkUiState = (NetworkUiState) obj;
        return this.f6127a == networkUiState.f6127a && this.f6128d == networkUiState.f6128d && this.f6129g == networkUiState.f6129g && br.l.a(this.f6130r, networkUiState.f6130r) && br.l.a(this.f6131x, networkUiState.f6131x) && this.f6132y == networkUiState.f6132y && this.B == networkUiState.B && this.D == networkUiState.D && br.l.a(this.E, networkUiState.E) && br.l.a(this.F, networkUiState.F) && this.G == networkUiState.G && this.H == networkUiState.H && this.I == networkUiState.I;
    }

    public final int hashCode() {
        return Integer.hashCode(this.I) + c7.a.C(this.H, c7.a.C(this.G, c7.a.g(this.F, c7.a.g(this.E, (this.D.hashCode() + ((this.B.hashCode() + c7.a.C(this.f6132y, c7.a.g(this.f6131x, c7.a.g(this.f6130r, c7.a.C(this.f6129g, c7.a.C(this.f6128d, this.f6127a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkUiState(strengthType=");
        sb2.append(this.f6127a);
        sb2.append(", signalStrengthDbm=");
        sb2.append(this.f6128d);
        sb2.append(", strengthBars=");
        sb2.append(this.f6129g);
        sb2.append(", networkTypeDetailed=");
        sb2.append(this.f6130r);
        sb2.append(", networkId=");
        sb2.append(this.f6131x);
        sb2.append(", networkConnectionType=");
        sb2.append(this.f6132y);
        sb2.append(", networkType=");
        sb2.append(this.B);
        sb2.append(", networkGeneration=");
        sb2.append(this.D);
        sb2.append(", wifiSsid=");
        sb2.append(this.E);
        sb2.append(", networkName=");
        sb2.append(this.F);
        sb2.append(", oldPsc=");
        sb2.append(this.G);
        sb2.append(", oldLac=");
        sb2.append(this.H);
        sb2.append(", oldCid=");
        return c7.a.q(sb2, this.I, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        br.l.e(parcel, "dest");
        parcel.writeString(this.f6127a.name());
        parcel.writeInt(this.f6128d);
        parcel.writeInt(this.f6129g);
        parcel.writeString(this.f6130r);
        parcel.writeString(this.f6131x);
        parcel.writeInt(this.f6132y);
        parcel.writeString(this.B.name());
        parcel.writeString(this.D.name());
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
    }

    public /* synthetic */ NetworkUiState() {
        this(m.UNKNOWN, 0, 0, "", "", -1, um.a.NONE, l.UNKNOWN, "", "", -1, -1, -1);
    }
}
