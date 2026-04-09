package com.staircase3.opensignal.refactor;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import com.google.android.gms.maps.model.LatLng;
import com.staircase3.opensignal.models.PlaceType;
import h0.b;
import i6.a;
import kotlin.Metadata;
import w.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/staircase3/opensignal/refactor/SpeedTestItem;", "", "Landroid/os/Parcelable;", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SpeedTestItem implements Parcelable {
    public static final Parcelable.Creator<SpeedTestItem> CREATOR = new a(1);
    public final boolean B;
    public final String D;
    public final boolean E;
    public final String F;
    public final PlaceType G;

    /* renamed from: a, reason: collision with root package name */
    public final String f6138a;

    /* renamed from: d, reason: collision with root package name */
    public final String f6139d;

    /* renamed from: g, reason: collision with root package name */
    public final long f6140g;

    /* renamed from: r, reason: collision with root package name */
    public final long f6141r;

    /* renamed from: x, reason: collision with root package name */
    public final LatLng f6142x;

    /* renamed from: y, reason: collision with root package name */
    public final String f6143y;

    public SpeedTestItem(String str, String str2, long j, long j7, LatLng latLng, String str3, boolean z10, String str4, boolean z11, String str5, PlaceType placeType) {
        this.f6138a = str;
        this.f6139d = str2;
        this.f6140g = j;
        this.f6141r = j7;
        this.f6142x = latLng;
        this.f6143y = str3;
        this.B = z10;
        this.D = str4;
        this.E = z11;
        this.F = str5;
        this.G = placeType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeedTestItem)) {
            return false;
        }
        SpeedTestItem speedTestItem = (SpeedTestItem) obj;
        return l.a(this.f6138a, speedTestItem.f6138a) && l.a(this.f6139d, speedTestItem.f6139d) && this.f6140g == speedTestItem.f6140g && this.f6141r == speedTestItem.f6141r && l.a(this.f6142x, speedTestItem.f6142x) && l.a(this.f6143y, speedTestItem.f6143y) && this.B == speedTestItem.B && l.a(this.D, speedTestItem.D) && this.E == speedTestItem.E && l.a(this.F, speedTestItem.F) && this.G == speedTestItem.G;
    }

    public final int hashCode() {
        String str = this.f6138a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6139d;
        int iB = b.b(b.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f6140g), 31, this.f6141r);
        LatLng latLng = this.f6142x;
        int iHashCode2 = (iB + (latLng == null ? 0 : latLng.hashCode())) * 31;
        String str3 = this.f6143y;
        int iB2 = g.b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.B, 31);
        String str4 = this.D;
        int iB3 = g.b((iB2 + (str4 == null ? 0 : str4.hashCode())) * 31, this.E, 31);
        String str5 = this.F;
        int iHashCode3 = (iB3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PlaceType placeType = this.G;
        return iHashCode3 + (placeType != null ? placeType.hashCode() : 0);
    }

    public final String toString() {
        return "SpeedTestItem(dlSpeed=" + this.f6138a + ", ulSpeed=" + this.f6139d + ", pingTime=" + this.f6140g + ", time=" + this.f6141r + ", position=" + this.f6142x + ", networkName=" + this.f6143y + ", isWifi=" + this.B + ", rowId=" + this.D + ", isRecent=" + this.E + ", networkConnectionType=" + this.F + ", placeType=" + this.G + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "dest");
        parcel.writeString(this.f6138a);
        parcel.writeString(this.f6139d);
        parcel.writeLong(this.f6140g);
        parcel.writeLong(this.f6141r);
        parcel.writeParcelable(this.f6142x, i10);
        parcel.writeString(this.f6143y);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeString(this.D);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeString(this.F);
        PlaceType placeType = this.G;
        if (placeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            placeType.writeToParcel(parcel, i10);
        }
    }
}
