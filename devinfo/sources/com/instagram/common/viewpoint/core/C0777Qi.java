package com.instagram.common.viewpoint.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;

/* renamed from: com.facebook.ads.redexgen.X.Qi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0777Qi implements Parcelable.Creator<LinearLayoutManager$SavedState> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final LinearLayoutManager$SavedState createFromParcel(Parcel parcel) {
        return new LinearLayoutManager$SavedState(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final LinearLayoutManager$SavedState[] newArray(int i4) {
        return new LinearLayoutManager$SavedState[i4];
    }
}
