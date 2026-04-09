package M2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends N2.a {
    public static final Parcelable.Creator<m> CREATOR = new A3.q(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f2793a;

    /* renamed from: b, reason: collision with root package name */
    public List f2794b;

    public m(int i, List list) {
        this.f2793a = i;
        this.f2794b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f2793a);
        AbstractC0241a.y(parcel, 2, this.f2794b);
        AbstractC0241a.H(parcel, iE);
    }
}
