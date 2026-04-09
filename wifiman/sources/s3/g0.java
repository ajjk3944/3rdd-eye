package s3;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import r3.C7566d;

/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator {
    static void a(C7891f c7891f, Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, c7891f.f61270a);
        t3.b.k(parcel, 2, c7891f.f61271b);
        t3.b.k(parcel, 3, c7891f.f61272c);
        t3.b.q(parcel, 4, c7891f.f61273d, false);
        t3.b.j(parcel, 5, c7891f.f61274e, false);
        t3.b.s(parcel, 6, c7891f.f61275f, i10, false);
        t3.b.e(parcel, 7, c7891f.f61276g, false);
        t3.b.p(parcel, 8, c7891f.f61277h, i10, false);
        t3.b.s(parcel, 10, c7891f.f61278i, i10, false);
        t3.b.s(parcel, 11, c7891f.f61279j, i10, false);
        t3.b.c(parcel, 12, c7891f.f61280k);
        t3.b.k(parcel, 13, c7891f.f61281l);
        t3.b.c(parcel, 14, c7891f.f61282m);
        t3.b.q(parcel, 15, c7891f.b(), false);
        t3.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Scope[] scopeArr = C7891f.f61268o;
        Bundle bundle = new Bundle();
        C7566d[] c7566dArr = C7891f.f61269p;
        C7566d[] c7566dArr2 = c7566dArr;
        String strF = null;
        IBinder iBinderR = null;
        Account account = null;
        String strF2 = null;
        int iS = 0;
        int iS2 = 0;
        int iS3 = 0;
        boolean zL = false;
        int iS4 = 0;
        boolean zL2 = false;
        while (parcel.dataPosition() < iX) {
            int iQ = SafeParcelReader.q(parcel);
            switch (SafeParcelReader.k(iQ)) {
                case 1:
                    iS = SafeParcelReader.s(parcel, iQ);
                    break;
                case 2:
                    iS2 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 3:
                    iS3 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, iQ);
                    break;
                case 5:
                    iBinderR = SafeParcelReader.r(parcel, iQ);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.h(parcel, iQ, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, iQ);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.e(parcel, iQ, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.w(parcel, iQ);
                    break;
                case 10:
                    c7566dArr = (C7566d[]) SafeParcelReader.h(parcel, iQ, C7566d.CREATOR);
                    break;
                case 11:
                    c7566dArr2 = (C7566d[]) SafeParcelReader.h(parcel, iQ, C7566d.CREATOR);
                    break;
                case 12:
                    zL = SafeParcelReader.l(parcel, iQ);
                    break;
                case 13:
                    iS4 = SafeParcelReader.s(parcel, iQ);
                    break;
                case 14:
                    zL2 = SafeParcelReader.l(parcel, iQ);
                    break;
                case 15:
                    strF2 = SafeParcelReader.f(parcel, iQ);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iX);
        return new C7891f(iS, iS2, iS3, strF, iBinderR, scopeArr, bundle, account, c7566dArr, c7566dArr2, zL, iS4, zL2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7891f[i10];
    }
}
