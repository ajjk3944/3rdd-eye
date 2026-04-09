package com.bytedance.adsdk.ugeno.msw;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class emc implements Parcelable {
    private final Parcelable ypw;
    public static final emc emc = new emc() { // from class: com.bytedance.adsdk.ugeno.msw.emc.1
    };
    public static final Parcelable.Creator<emc> CREATOR = new Parcelable.ClassLoaderCreator<emc>() { // from class: com.bytedance.adsdk.ugeno.msw.emc.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public emc createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public emc createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return emc.emc;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public emc[] newArray(int i) {
            return new emc[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable emc() {
        return this.ypw;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ypw, i);
    }

    private emc() {
        this.ypw = null;
    }

    public emc(Parcelable parcelable) {
        if (parcelable != null) {
            this.ypw = parcelable == emc ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public emc(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.ypw = parcelable == null ? emc : parcelable;
    }
}
