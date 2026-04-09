package M2;

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

/* renamed from: M2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167g extends N2.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2763a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2764b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2765c;

    /* renamed from: d, reason: collision with root package name */
    public String f2766d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f2767e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f2768f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f2769g;

    /* renamed from: h, reason: collision with root package name */
    public Account f2770h;
    public J2.d[] i;

    /* renamed from: j, reason: collision with root package name */
    public J2.d[] f2771j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2772k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2773l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2774m;

    /* renamed from: n, reason: collision with root package name */
    public final String f2775n;
    public static final Parcelable.Creator<C0167g> CREATOR = new A3.q(15);

    /* renamed from: C, reason: collision with root package name */
    public static final Scope[] f2761C = new Scope[0];

    /* renamed from: D, reason: collision with root package name */
    public static final J2.d[] f2762D = new J2.d[0];

    public C0167g(int i, int i3, int i6, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, J2.d[] dVarArr, J2.d[] dVarArr2, boolean z6, int i7, boolean z7, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f2761C : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        J2.d[] dVarArr3 = f2762D;
        J2.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f2763a = i;
        this.f2764b = i3;
        this.f2765c = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f2766d = "com.google.android.gms";
        } else {
            this.f2766d = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i8 = AbstractBinderC0161a.f2731b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC0169i h6 = iInterfaceQueryLocalInterface instanceof InterfaceC0169i ? (InterfaceC0169i) iInterfaceQueryLocalInterface : new H(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (h6 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            H h7 = (H) h6;
                            Parcel parcelG0 = h7.g0(h7.h0(), 2);
                            Account account3 = (Account) X2.g.a(parcelG0, Account.CREATOR);
                            parcelG0.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f2770h = account2;
        } else {
            this.f2767e = iBinder;
            this.f2770h = account;
        }
        this.f2768f = scopeArr2;
        this.f2769g = bundle2;
        this.i = dVarArr4;
        this.f2771j = dVarArr3;
        this.f2772k = z6;
        this.f2773l = i7;
        this.f2774m = z7;
        this.f2775n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        A3.q.a(this, parcel, i);
    }
}
