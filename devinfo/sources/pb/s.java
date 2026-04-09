package pb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s extends qb.a {
    public static final Parcelable.Creator<s> CREATOR = new j4.g(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f31663a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f31664b;

    /* renamed from: c, reason: collision with root package name */
    public final nb.b f31665c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31666d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f31667e;

    public s(int i4, IBinder iBinder, nb.b bVar, boolean z3, boolean z10) {
        this.f31663a = i4;
        this.f31664b = iBinder;
        this.f31665c = bVar;
        this.f31666d = z3;
        this.f31667e = z10;
    }

    public final boolean equals(Object obj) {
        Object m0Var;
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (this.f31665c.equals(sVar.f31665c)) {
                    Object m0Var2 = null;
                    IBinder iBinder = this.f31664b;
                    if (iBinder == null) {
                        m0Var = null;
                    } else {
                        int i4 = a.f31559b;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        m0Var = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                    }
                    IBinder iBinder2 = sVar.f31664b;
                    if (iBinder2 != null) {
                        int i10 = a.f31559b;
                        IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        m0Var2 = iInterfaceQueryLocalInterface2 instanceof i ? (i) iInterfaceQueryLocalInterface2 : new m0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                    }
                    if (y.l(m0Var, m0Var2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f31663a);
        com.bumptech.glide.f.F(parcel, 2, this.f31664b);
        com.bumptech.glide.f.H(parcel, 3, this.f31665c, i4);
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(this.f31666d ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 5, 4);
        parcel.writeInt(this.f31667e ? 1 : 0);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
