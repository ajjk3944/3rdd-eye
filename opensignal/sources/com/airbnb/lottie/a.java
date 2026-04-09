package com.airbnb.lottie;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LottieAnimationView.SavedState savedState = new LottieAnimationView.SavedState(parcel);
        savedState.f4004a = parcel.readString();
        savedState.f4006g = parcel.readFloat();
        savedState.f4007r = parcel.readInt() == 1;
        savedState.f4008x = parcel.readString();
        savedState.f4009y = parcel.readInt();
        savedState.B = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new LottieAnimationView.SavedState[i10];
    }
}
