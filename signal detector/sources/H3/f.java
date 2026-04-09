package H3;

import A3.w;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class f extends W.b {
    public static final Parcelable.Creator<f> CREATOR = new w(3);

    /* renamed from: c, reason: collision with root package name */
    public final int f1795c;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1795c = parcel.readInt();
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1795c);
    }

    public f(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f1795c = sideSheetBehavior.f18435h;
    }
}
