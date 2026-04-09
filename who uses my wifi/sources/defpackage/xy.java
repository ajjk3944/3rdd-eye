package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xy extends l0 {
    public static final Parcelable.Creator<xy> CREATOR = new ed4(0);
    public static final Scope[] t = new Scope[0];
    public static final ju[] u = new ju[0];
    public final int f;
    public final int g;
    public final int h;
    public String i;
    public IBinder j;
    public Scope[] k;
    public Bundle l;
    public Account m;
    public ju[] n;
    public ju[] o;
    public final boolean p;
    public final int q;
    public boolean r;
    public final String s;

    public xy(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, ju[] juVarArr, ju[] juVarArr2, boolean z, int i4, boolean z2, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? t : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        ju[] juVarArr3 = u;
        ju[] juVarArr4 = juVarArr == null ? juVarArr3 : juVarArr;
        juVarArr3 = juVarArr2 != null ? juVarArr2 : juVarArr3;
        this.f = i;
        this.g = i2;
        this.h = i3;
        if ("com.google.android.gms".equals(str)) {
            this.i = "com.google.android.gms";
        } else {
            this.i = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = k1.g;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface fi4Var = iInterfaceQueryLocalInterface instanceof k10 ? (k10) iInterfaceQueryLocalInterface : new fi4(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    fi4 fi4Var2 = (fi4) fi4Var;
                    Parcel parcelT = fi4Var2.T(fi4Var2.U(), 2);
                    Account account3 = (Account) cc2.a(parcelT, Account.CREATOR);
                    parcelT.recycle();
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    account2 = account3;
                } catch (RemoteException unused) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
            this.m = account2;
        } else {
            this.j = iBinder;
            this.m = account;
        }
        this.k = scopeArr2;
        this.l = bundle2;
        this.n = juVarArr4;
        this.o = juVarArr3;
        this.p = z;
        this.q = i4;
        this.r = z2;
        this.s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ed4.a(this, parcel, i);
    }
}
