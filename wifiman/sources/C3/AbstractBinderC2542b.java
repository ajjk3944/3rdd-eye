package C3;

import android.os.Parcel;

/* renamed from: C3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2542b extends AbstractBinderC2544d implements InterfaceC2543c {
    public AbstractBinderC2542b() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // C3.AbstractBinderC2544d
    protected final boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        I3.h hVar = (I3.h) AbstractC2550j.a(parcel, I3.h.CREATOR);
        AbstractC2550j.d(parcel);
        Z(hVar);
        return true;
    }
}
