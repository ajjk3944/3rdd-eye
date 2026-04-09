package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import cc.a;
import cc.a0;
import cc.g;
import cc.g0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.sentry.android.core.e0;
import oc.h;

/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new a0(0);
    public static final Scope[] K = new Scope[0];
    public static final Feature[] L = new Feature[0];
    public Bundle B;
    public Account D;
    public Feature[] E;
    public Feature[] F;
    public final boolean G;
    public final int H;
    public boolean I;
    public final String J;

    /* renamed from: a, reason: collision with root package name */
    public final int f4831a;

    /* renamed from: d, reason: collision with root package name */
    public final int f4832d;

    /* renamed from: g, reason: collision with root package name */
    public final int f4833g;

    /* renamed from: r, reason: collision with root package name */
    public String f4834r;

    /* renamed from: x, reason: collision with root package name */
    public IBinder f4835x;

    /* renamed from: y, reason: collision with root package name */
    public Scope[] f4836y;

    public GetServiceRequest(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z10, int i13, boolean z11, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? K : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = L;
        Feature[] featureArr4 = featureArr == null ? featureArr3 : featureArr;
        featureArr3 = featureArr2 != null ? featureArr2 : featureArr3;
        this.f4831a = i10;
        this.f4832d = i11;
        this.f4833g = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f4834r = "com.google.android.gms";
        } else {
            this.f4834r = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = a.f3601e;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface g0Var = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        g0 g0Var2 = (g0) g0Var;
                        Parcel parcelD = g0Var2.d(g0Var2.R(), 2);
                        Account account3 = (Account) h.a(parcelD, Account.CREATOR);
                        parcelD.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        e0.p("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th2;
                }
            }
            this.D = account2;
        } else {
            this.f4835x = iBinder;
            this.D = account;
        }
        this.f4836y = scopeArr2;
        this.B = bundle2;
        this.E = featureArr4;
        this.F = featureArr3;
        this.G = z10;
        this.H = i13;
        this.I = z11;
        this.J = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        a0.a(this, parcel, i10);
    }
}
