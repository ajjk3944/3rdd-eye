package o3;

import A.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import g3.C2333b;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2761a extends View.BaseSavedState {
    public static final Parcelable.Creator<C2761a> CREATOR = new C2333b(10);

    /* renamed from: a, reason: collision with root package name */
    public int f22700a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f22700a;
        return f.p(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f22700a));
    }
}
