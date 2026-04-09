package defpackage;

import android.os.IBinder;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nk3 {
    public final IBinder a;
    public final String b;
    public final int c;
    public final float d;
    public final int e;
    public final String f;

    public nk3(IBinder iBinder, String str, int i, float f, int i2, String str2) {
        this.a = iBinder;
        this.b = str;
        this.c = i;
        this.d = f;
        this.e = i2;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof nk3) {
            nk3 nk3Var = (nk3) obj;
            String str3 = nk3Var.f;
            String str4 = nk3Var.b;
            if (this.a.equals(nk3Var.a) && ((str = this.b) != null ? str.equals(str4) : str4 == null) && this.c == nk3Var.c && Float.floatToIntBits(this.d) == Float.floatToIntBits(nk3Var.d) && this.e == nk3Var.e && ((str2 = this.f) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d);
        String str2 = this.f;
        return ((((iHashCode2 * 1525764945) ^ this.e) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        int i = this.c;
        int length3 = String.valueOf(i).length();
        float f = this.d;
        int length4 = String.valueOf(f).length();
        int i2 = this.e;
        int length5 = String.valueOf(i2).length();
        String str2 = this.f;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        ex0.q(sb, "OverlayDisplayShowRequest{windowToken=", string, ", appId=", str);
        sb.append(", layoutGravity=");
        sb.append(i);
        sb.append(", layoutVerticalMargin=");
        sb.append(f);
        sb.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb.append(i2);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        sb.append(str2);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }
}
