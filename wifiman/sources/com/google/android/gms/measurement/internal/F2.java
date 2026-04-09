package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import s3.AbstractC7888c;

/* loaded from: classes.dex */
public final class F2 extends AbstractC7888c {
    public F2(Context context, Looper looper, AbstractC7888c.a aVar, AbstractC7888c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // s3.AbstractC7888c
    protected final String C() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // s3.AbstractC7888c
    protected final String D() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // s3.AbstractC7888c, com.google.android.gms.common.api.a.f
    public final int h() {
        return 12451000;
    }

    @Override // s3.AbstractC7888c
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4951s2 ? (InterfaceC4951s2) iInterfaceQueryLocalInterface : new C4967u2(iBinder);
    }
}
