package M2;

import a.AbstractC0241a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r extends N2.a {
    public static final Parcelable.Creator<r> CREATOR = new A3.q(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f2805a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f2806b;

    /* renamed from: c, reason: collision with root package name */
    public final J2.b f2807c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2808d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2809e;

    public r(int i, IBinder iBinder, J2.b bVar, boolean z6, boolean z7) {
        this.f2805a = i;
        this.f2806b = iBinder;
        this.f2807c = bVar;
        this.f2808d = z6;
        this.f2809e = z7;
    }

    public final boolean equals(Object obj) {
        Object h6;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            if (!this.f2807c.equals(rVar.f2807c)) {
                return false;
            }
            Object h7 = null;
            IBinder iBinder = this.f2806b;
            if (iBinder == null) {
                h6 = null;
            } else {
                int i = AbstractBinderC0161a.f2731b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                h6 = iInterfaceQueryLocalInterface instanceof InterfaceC0169i ? (InterfaceC0169i) iInterfaceQueryLocalInterface : new H(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = rVar.f2806b;
            if (iBinder2 != null) {
                int i3 = AbstractBinderC0161a.f2731b;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                h7 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0169i ? (InterfaceC0169i) iInterfaceQueryLocalInterface2 : new H(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!u.g(h6, h7)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f2805a);
        AbstractC0241a.s(parcel, 2, this.f2806b);
        AbstractC0241a.t(parcel, 3, this.f2807c, i);
        AbstractC0241a.B(parcel, 4, 4);
        parcel.writeInt(this.f2808d ? 1 : 0);
        AbstractC0241a.B(parcel, 5, 4);
        parcel.writeInt(this.f2809e ? 1 : 0);
        AbstractC0241a.H(parcel, iE);
    }
}
