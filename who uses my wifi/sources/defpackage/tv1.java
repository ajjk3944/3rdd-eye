package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tv1 extends hv1 implements wi2 {
    public static final /* synthetic */ int g = 0;
    public final b8 f;

    public tv1(b8 b8Var) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f = b8Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        iv1.f(parcel);
        n0(string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.wi2
    public final void n0(String str, String str2) {
        this.f.O(str, str2);
    }
}
