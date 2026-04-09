package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class ri2 extends qi2 {
    public static final Parcelable.Creator<ri2> CREATOR = new a();

    public class a implements Parcelable.Creator<ri2> {
        @Override // android.os.Parcelable.Creator
        public final ri2 createFromParcel(Parcel parcel) {
            return new ri2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ri2[] newArray(int i) {
            return new ri2[i];
        }
    }

    public ri2(Parcel parcel) {
        super(parcel);
    }

    public ri2(String str, String str2) {
        super(str, str2);
    }
}
