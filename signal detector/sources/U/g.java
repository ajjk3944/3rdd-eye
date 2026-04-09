package U;

import A3.q;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class g extends View.BaseSavedState {
    public static final Parcelable.Creator<g> CREATOR = new q(17);

    /* renamed from: a, reason: collision with root package name */
    public int f3658a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC2763b.d(this.f3658a, "}", sb);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3658a);
    }
}
