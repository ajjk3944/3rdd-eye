package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wt extends mg {
    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        ua.j.C.f35265h.f("FlagsAccessedBeforeInitialized", new lq("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
