package defpackage;

import android.os.Parcel;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uz1 extends hv1 {
    public final ch3 f;
    public final String g;
    public final String h;

    public uz1(ch3 ch3Var, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f = ch3Var;
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.g);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.h);
            return true;
        }
        ch3 ch3Var = this.f;
        if (i == 3) {
            u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
            iv1.f(parcel);
            if (u10VarX0 != null) {
                ch3Var.m((View) oi0.l1(u10VarX0));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            ch3Var.d();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        ch3Var.h();
        parcel2.writeNoException();
        return true;
    }
}
