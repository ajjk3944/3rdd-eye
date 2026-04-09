package com.bytedance.adsdk.ugeno.pno;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw implements Parcelable {
    final Parcelable vt;
    public static final ouw ouw = new ouw() { // from class: com.bytedance.adsdk.ugeno.pno.ouw.1
    };
    public static final Parcelable.Creator<ouw> CREATOR = new Parcelable.ClassLoaderCreator<ouw>() { // from class: com.bytedance.adsdk.ugeno.pno.ouw.2
        private static ouw ouw(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return ouw.ouw;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ ouw createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return ouw(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i4) {
            return new ouw[i4];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return ouw(parcel, null);
        }
    };

    public /* synthetic */ ouw(byte b10) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.vt, i4);
    }

    private ouw() {
        this.vt = null;
    }

    public ouw(Parcelable parcelable) {
        if (parcelable != null) {
            this.vt = parcelable == ouw ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public ouw(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.vt = parcelable == null ? ouw : parcelable;
    }
}
