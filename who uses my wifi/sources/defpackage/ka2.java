package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ka2 extends hv1 {
    public final String f;
    public final int g;

    public ka2(String str, int i) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f = str;
        this.g = i;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.g);
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ka2)) {
            return false;
        }
        ka2 ka2Var = (ka2) obj;
        if (a30.c(this.f, ka2Var.f)) {
            if (a30.c(Integer.valueOf(this.g), Integer.valueOf(ka2Var.g))) {
                return true;
            }
        }
        return false;
    }
}
