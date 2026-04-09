package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Pe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673Pe extends W2.a {
    public final IBinder n1(S2.b bVar, String str, BinderC0569Jc binderC0569Jc) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, bVar);
        parcelH0.writeString(str);
        C7.e(parcelH0, binderC0569Jc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 1);
        IBinder strongBinder = parcelK0.readStrongBinder();
        parcelK0.recycle();
        return strongBinder;
    }
}
