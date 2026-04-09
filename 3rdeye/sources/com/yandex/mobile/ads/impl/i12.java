package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class i12 extends f12 {
    public static final Parcelable.Creator<i12> CREATOR = new a();

    public class a implements Parcelable.Creator<i12> {
        @Override // android.os.Parcelable.Creator
        public final i12 createFromParcel(Parcel parcel) {
            return new i12();
        }

        @Override // android.os.Parcelable.Creator
        public final i12[] newArray(int i) {
            return new i12[i];
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
