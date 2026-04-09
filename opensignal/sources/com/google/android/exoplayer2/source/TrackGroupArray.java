package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import wc.h;

/* loaded from: classes.dex */
public final class TrackGroupArray implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4457a;

    /* renamed from: d, reason: collision with root package name */
    public final TrackGroup[] f4458d;

    /* renamed from: g, reason: collision with root package name */
    public int f4459g;

    /* renamed from: r, reason: collision with root package name */
    public static final TrackGroupArray f4456r = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new h(12);

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f4458d = trackGroupArr;
        this.f4457a = trackGroupArr.length;
    }

    public final int d(TrackGroup trackGroup) {
        for (int i10 = 0; i10 < this.f4457a; i10++) {
            if (this.f4458d[i10] == trackGroup) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroupArray.class == obj.getClass()) {
            TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
            if (this.f4457a == trackGroupArray.f4457a && Arrays.equals(this.f4458d, trackGroupArray.f4458d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4459g == 0) {
            this.f4459g = Arrays.hashCode(this.f4458d);
        }
        return this.f4459g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f4457a;
        parcel.writeInt(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            parcel.writeParcelable(this.f4458d[i12], 0);
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int i10 = parcel.readInt();
        this.f4457a = i10;
        this.f4458d = new TrackGroup[i10];
        for (int i11 = 0; i11 < this.f4457a; i11++) {
            this.f4458d[i11] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
