package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t92 extends hv1 {
    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        hg4.C.h.d("FlagsAccessedBeforeInitialized", new e62("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
