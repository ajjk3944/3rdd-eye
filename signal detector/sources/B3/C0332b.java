package b3;

import A3.q;
import a.AbstractC0241a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332b extends N2.a {
    public static final Parcelable.Creator<C0332b> CREATOR = new q(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f5723a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5724b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f5725c;

    public C0332b(int i, int i3, Intent intent) {
        this.f5723a = i;
        this.f5724b = i3;
        this.f5725c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f5723a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f5724b);
        AbstractC0241a.t(parcel, 3, this.f5725c, i);
        AbstractC0241a.H(parcel, iE);
    }
}
