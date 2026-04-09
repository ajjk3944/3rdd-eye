package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qk3 extends hv1 {
    public final it3 f;
    public final /* synthetic */ rk3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk3(rk3 rk3Var, it3 it3Var) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        this.g = rk3Var;
        this.f = it3Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        x03 x03Var;
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) iv1.b(parcel, Bundle.CREATOR);
        iv1.f(parcel);
        int i2 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i3 = bundle.getInt("uiMode", 0);
        byte b = (byte) (((byte) (0 | 1)) | 1);
        if (string == null) {
            string = null;
        }
        byte b2 = (byte) (b | 2);
        if (b2 != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b2 & 1) == 0) {
                sb.append(" statusCode");
            }
            if ((b2 & 2) == 0) {
                sb.append(" uiMode");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        this.f.b(new ok3(string, i2, i3));
        if (i2 == 8157 && (x03Var = this.g.a) != null) {
            rk3.c.a("unbind LMD display overlay service", new Object[0]);
            x03Var.c(new bh3(5, x03Var));
        }
        return true;
    }
}
