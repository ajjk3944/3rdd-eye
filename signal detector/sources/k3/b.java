package k3;

import A3.w;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class b extends W.b {
    public static final Parcelable.Creator<b> CREATOR = new w(11);

    /* renamed from: c, reason: collision with root package name */
    public final int f21780c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21781d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21782e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21783f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21784g;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f21780c = parcel.readInt();
        this.f21781d = parcel.readInt();
        this.f21782e = parcel.readInt() == 1;
        this.f21783f = parcel.readInt() == 1;
        this.f21784g = parcel.readInt() == 1;
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f21780c);
        parcel.writeInt(this.f21781d);
        parcel.writeInt(this.f21782e ? 1 : 0);
        parcel.writeInt(this.f21783f ? 1 : 0);
        parcel.writeInt(this.f21784g ? 1 : 0);
    }

    public b(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f21780c = bottomSheetBehavior.b0;
        this.f21781d = bottomSheetBehavior.f18144e;
        this.f21782e = bottomSheetBehavior.f18139b;
        this.f21783f = bottomSheetBehavior.f18133W;
        this.f21784g = bottomSheetBehavior.f18134X;
    }
}
