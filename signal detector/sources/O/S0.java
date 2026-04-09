package o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class S0 extends W.b {
    public static final Parcelable.Creator<S0> CREATOR = new A3.w(13);

    /* renamed from: c, reason: collision with root package name */
    public boolean f22422c;

    public S0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f22422c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f22422c + "}";
    }

    @Override // W.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f22422c));
    }
}
