package b3;

import A3.q;
import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334d extends N2.a {
    public static final Parcelable.Creator<C0334d> CREATOR = new q(23);

    /* renamed from: a, reason: collision with root package name */
    public final List f5726a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5727b;

    public C0334d(ArrayList arrayList, String str) {
        this.f5726a = arrayList;
        this.f5727b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.w(parcel, 1, this.f5726a);
        AbstractC0241a.u(parcel, 2, this.f5727b);
        AbstractC0241a.H(parcel, iE);
    }
}
