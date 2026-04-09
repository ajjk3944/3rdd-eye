package A3;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.Z;
import k0.C2616u;
import l3.C2643b;
import o.S0;
import o.g1;
import x3.C2996a;

/* loaded from: classes.dex */
public final class w implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f502a;

    public /* synthetic */ w(int i) {
        this.f502a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f502a) {
            case 0:
                return new x(parcel, classLoader);
            case 1:
                return new E(parcel, classLoader);
            case 2:
                return new E.g(parcel, classLoader);
            case 3:
                return new H3.f(parcel, classLoader);
            case 4:
                return new K3.a(parcel, classLoader);
            case 5:
                return new M3.D(parcel, classLoader);
            case 6:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new S0.m(parcel, classLoader);
                }
                S0.m mVar = new S0.m(parcel);
                mVar.f3471a = parcel.readInt();
                mVar.f3472b = parcel.readInt();
                mVar.f3473c = parcel.readParcelable(null);
                return mVar;
            case 7:
                if (parcel.readParcelable(classLoader) == null) {
                    return W.b.f3953b;
                }
                throw new IllegalStateException("superState must be null");
            case 8:
                return new Z(parcel, classLoader);
            case 9:
                return new d0.d(parcel, classLoader);
            case 10:
                return new C2616u(parcel, classLoader);
            case 11:
                return new k3.b(parcel, classLoader);
            case 12:
                return new C2643b(parcel, classLoader);
            case 13:
                return new S0(parcel, classLoader);
            case 14:
                return new g1(parcel, classLoader);
            case 15:
                return new C2996a(parcel, classLoader);
            default:
                return new x3.s(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f502a) {
            case 0:
                return new x[i];
            case 1:
                return new E[i];
            case 2:
                return new E.g[i];
            case 3:
                return new H3.f[i];
            case 4:
                return new K3.a[i];
            case 5:
                return new M3.D[i];
            case 6:
                return new S0.m[i];
            case 7:
                return new W.b[i];
            case 8:
                return new Z[i];
            case 9:
                return new d0.d[i];
            case 10:
                return new C2616u[i];
            case 11:
                return new k3.b[i];
            case 12:
                return new C2643b[i];
            case 13:
                return new S0[i];
            case 14:
                return new g1[i];
            case 15:
                return new C2996a[i];
            default:
                return new x3.s[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f502a) {
            case 0:
                return new x(parcel, null);
            case 1:
                return new E(parcel, null);
            case 2:
                return new E.g(parcel, null);
            case 3:
                return new H3.f(parcel, null);
            case 4:
                return new K3.a(parcel, null);
            case 5:
                return new M3.D(parcel, null);
            case 6:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new S0.m(parcel, null);
                }
                S0.m mVar = new S0.m(parcel);
                mVar.f3471a = parcel.readInt();
                mVar.f3472b = parcel.readInt();
                mVar.f3473c = parcel.readParcelable(null);
                return mVar;
            case 7:
                if (parcel.readParcelable(null) == null) {
                    return W.b.f3953b;
                }
                throw new IllegalStateException("superState must be null");
            case 8:
                return new Z(parcel, null);
            case 9:
                return new d0.d(parcel, null);
            case 10:
                return new C2616u(parcel, null);
            case 11:
                return new k3.b(parcel, null);
            case 12:
                return new C2643b(parcel, null);
            case 13:
                return new S0(parcel, null);
            case 14:
                return new g1(parcel, null);
            case 15:
                return new C2996a(parcel, null);
            default:
                return new x3.s(parcel, null);
        }
    }
}
