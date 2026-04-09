package com.google.android.gms.internal.ads;

import android.os.Parcel;
import b4.C0355t;

/* renamed from: com.google.android.gms.internal.ads.fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1162fe extends B7 {
    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        p2.j.f22785C.f22795h.f("FlagsAccessedBeforeInitialized", new C0355t("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
