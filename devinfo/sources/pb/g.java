package pb;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends qb.a {
    public static final Parcelable.Creator<g> CREATOR = new j4.g(20);

    /* renamed from: o, reason: collision with root package name */
    public static final Scope[] f31595o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    public static final nb.d[] f31596p = new nb.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f31597a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31598b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31599c;

    /* renamed from: d, reason: collision with root package name */
    public String f31600d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f31601e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f31602f;
    public Bundle g;

    /* renamed from: h, reason: collision with root package name */
    public Account f31603h;

    /* renamed from: i, reason: collision with root package name */
    public nb.d[] f31604i;
    public nb.d[] j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f31605k;

    /* renamed from: l, reason: collision with root package name */
    public final int f31606l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31607m;

    /* renamed from: n, reason: collision with root package name */
    public final String f31608n;

    public g(int i4, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, nb.d[] dVarArr, nb.d[] dVarArr2, boolean z3, int i12, boolean z10, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f31595o : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        nb.d[] dVarArr3 = f31596p;
        nb.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f31597a = i4;
        this.f31598b = i10;
        this.f31599c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f31600d = "com.google.android.gms";
        } else {
            this.f31600d = str;
        }
        if (i4 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f31559b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface m0Var = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        m0 m0Var2 = (m0) m0Var;
                        Parcel parcelO = m0Var2.O(m0Var2.T(), 2);
                        Account account3 = (Account) ac.j.a(parcelO, Account.CREATOR);
                        parcelO.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th2;
                }
            }
            this.f31603h = account2;
        } else {
            this.f31601e = iBinder;
            this.f31603h = account;
        }
        this.f31602f = scopeArr2;
        this.g = bundle2;
        this.f31604i = dVarArr4;
        this.j = dVarArr3;
        this.f31605k = z3;
        this.f31606l = i12;
        this.f31607m = z10;
        this.f31608n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        j4.g.a(this, parcel, i4);
    }
}
