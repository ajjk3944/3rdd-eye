package I3;

import A3.q;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = new q(3);

    /* renamed from: a, reason: collision with root package name */
    public float f1898a;

    /* renamed from: b, reason: collision with root package name */
    public float f1899b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1900c;

    /* renamed from: d, reason: collision with root package name */
    public float f1901d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1902e;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f1898a);
        parcel.writeFloat(this.f1899b);
        parcel.writeList(this.f1900c);
        parcel.writeFloat(this.f1901d);
        parcel.writeBooleanArray(new boolean[]{this.f1902e});
    }
}
