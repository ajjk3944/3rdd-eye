package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import g3.C2333b;

/* renamed from: o.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2700K extends View.BaseSavedState {
    public static final Parcelable.Creator<C2700K> CREATOR = new C2333b(9);

    /* renamed from: a, reason: collision with root package name */
    public boolean f22398a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f22398a ? (byte) 1 : (byte) 0);
    }
}
