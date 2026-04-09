package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import i6.a;

/* loaded from: classes.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new a(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f4242a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4243d;

    public AppInfoTable(int i10, String str) {
        this.f4242a = i10;
        this.f4243d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.f4243d;
        StringBuilder sb2 = new StringBuilder(c7.a.d(33, str));
        sb2.append("Ait(controlCode=");
        sb2.append(this.f4242a);
        sb2.append(",url=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4243d);
        parcel.writeInt(this.f4242a);
    }
}
