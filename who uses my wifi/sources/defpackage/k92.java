package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k92 extends hv1 implements tc2 {
    public final /* synthetic */ wm0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k92(l92 l92Var, wm0 wm0Var) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f = wm0Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            iv1.f(parcel);
        } else if (i == 2) {
            String string = parcel.readString();
            iv1.f(parcel);
            w(string);
        } else {
            if (i != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) iv1.b(parcel, Bundle.CREATOR);
            iv1.f(parcel);
            t3(string2, bundle, string3);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.tc2
    public final void t3(String str, Bundle bundle, String str2) {
        this.f.b(new ug0(7, new ls3(str, 3)));
    }

    @Override // defpackage.tc2
    public final void w(String str) {
        this.f.a(str);
    }
}
