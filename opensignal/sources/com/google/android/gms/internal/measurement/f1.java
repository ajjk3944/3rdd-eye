package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class f1 extends y implements r0 {

    /* renamed from: d, reason: collision with root package name */
    public final xe.b f4983d;

    public f1(xe.b bVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f4983d = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final int b() {
        return System.identityHashCode(this.f4983d);
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean d(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f4983d);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) z.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        z.d(parcel);
        l(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void l(long j, Bundle bundle, String str, String str2) {
        this.f4983d.a(j, bundle, str, str2);
    }
}
