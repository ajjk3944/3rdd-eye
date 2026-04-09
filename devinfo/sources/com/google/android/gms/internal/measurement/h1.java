package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h1 extends x implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final be.b f19764a;

    public h1(be.b bVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f19764a = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final void N0(long j, Bundle bundle, String str, String str2) {
        this.f19764a.a(j, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final boolean O(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            if (i4 != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f19764a);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) y.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        y.d(parcel);
        N0(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final int d() {
        return System.identityHashCode(this.f19764a);
    }
}
