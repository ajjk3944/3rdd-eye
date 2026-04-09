package gd;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.i0;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = new i0(26);

    /* renamed from: a, reason: collision with root package name */
    public float f24634a;

    /* renamed from: b, reason: collision with root package name */
    public float f24635b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f24636c;

    /* renamed from: d, reason: collision with root package name */
    public float f24637d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24638e;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeFloat(this.f24634a);
        parcel.writeFloat(this.f24635b);
        parcel.writeList(this.f24636c);
        parcel.writeFloat(this.f24637d);
        parcel.writeBooleanArray(new boolean[]{this.f24638e});
    }
}
