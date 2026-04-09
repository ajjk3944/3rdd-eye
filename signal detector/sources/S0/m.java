package S0;

import A3.w;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class m extends View.BaseSavedState {
    public static final Parcelable.Creator<m> CREATOR = new w(6);

    /* renamed from: a, reason: collision with root package name */
    public int f3471a;

    /* renamed from: b, reason: collision with root package name */
    public int f3472b;

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f3473c;

    public m(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3471a = parcel.readInt();
        this.f3472b = parcel.readInt();
        this.f3473c = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3471a);
        parcel.writeInt(this.f3472b);
        parcel.writeParcelable(this.f3473c, i);
    }
}
