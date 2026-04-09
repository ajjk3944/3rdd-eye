package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import cc.h0;
import cc.i0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import io.sentry.android.core.e0;
import jc.b;
import jc.d;
import wc.h;
import zb.l;
import zb.m;

/* loaded from: classes.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new h(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f4879a;

    /* renamed from: d, reason: collision with root package name */
    public final m f4880d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4881g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4882r;

    public zzt(String str, m mVar, boolean z10, boolean z11) {
        this.f4879a = str;
        this.f4880d = mVar;
        this.f4881g = z10;
        this.f4882r = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.P(parcel, 1, this.f4879a);
        m mVar = this.f4880d;
        if (mVar == null) {
            e0.p("GoogleCertificatesQuery", "certificate binder is null");
            mVar = null;
        }
        i4.N(parcel, 2, mVar);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f4881g ? 1 : 0);
        i4.S(parcel, 4, 4);
        parcel.writeInt(this.f4882r ? 1 : 0);
        i4.W(parcel, iU);
    }

    public zzt(String str, IBinder iBinder, boolean z10, boolean z11) {
        i0 h0Var;
        this.f4879a = str;
        m mVar = null;
        if (iBinder != null) {
            try {
                int i10 = l.f26832f;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (iInterfaceQueryLocalInterface instanceof i0) {
                    h0Var = (i0) iInterfaceQueryLocalInterface;
                } else {
                    h0Var = new h0(iBinder, "com.google.android.gms.common.internal.ICertData", 2);
                }
                b bVarC = h0Var.c();
                byte[] bArr = bVarC == null ? null : (byte[]) d.V(bVarC);
                if (bArr != null) {
                    mVar = new m(bArr);
                } else {
                    e0.d("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e4) {
                e0.c("GoogleCertificatesQuery", "Could not unwrap certificate", e4);
            }
        }
        this.f4880d = mVar;
        this.f4881g = z10;
        this.f4882r = z11;
    }
}
