package oc;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g1.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends m4.b {
    public static final Parcelable.Creator<c> CREATOR = new p(8);

    /* renamed from: c, reason: collision with root package name */
    public final int f30497c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30498d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30499e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30500f;
    public final boolean g;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f30497c = parcel.readInt();
        this.f30498d = parcel.readInt();
        this.f30499e = parcel.readInt() == 1;
        this.f30500f = parcel.readInt() == 1;
        this.g = parcel.readInt() == 1;
    }

    @Override // m4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f30497c);
        parcel.writeInt(this.f30498d);
        parcel.writeInt(this.f30499e ? 1 : 0);
        parcel.writeInt(this.f30500f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public c(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f30497c = bottomSheetBehavior.N;
        this.f30498d = bottomSheetBehavior.f20358e;
        this.f30499e = bottomSheetBehavior.f20352b;
        this.f30500f = bottomSheetBehavior.I;
        this.g = bottomSheetBehavior.J;
    }
}
