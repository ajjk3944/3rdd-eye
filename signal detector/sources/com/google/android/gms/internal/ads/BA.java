package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* loaded from: classes.dex */
public final class BA {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f7312a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7313b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7314c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7315d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7316e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7317f;

    public BA(IBinder iBinder, String str, int i, float f2, int i3, String str2) {
        this.f7312a = iBinder;
        this.f7313b = str;
        this.f7314c = i;
        this.f7315d = f2;
        this.f7316e = i3;
        this.f7317f = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof BA) {
            BA ba = (BA) obj;
            IBinder iBinder = ba.f7312a;
            String str3 = ba.f7317f;
            String str4 = ba.f7313b;
            if (this.f7312a.equals(iBinder) && ((str = this.f7313b) != null ? str.equals(str4) : str4 == null) && this.f7314c == ba.f7314c && Float.floatToIntBits(this.f7315d) == Float.floatToIntBits(ba.f7315d) && this.f7316e == ba.f7316e && ((str2 = this.f7317f) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f7312a.hashCode() ^ 1000003;
        String str = this.f7313b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f7314c) * 1000003) ^ Float.floatToIntBits(this.f7315d);
        String str2 = this.f7317f;
        return ((((iHashCode2 * 1525764945) ^ this.f7316e) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.f7312a.toString();
        int length = string.length();
        String str = this.f7313b;
        int length2 = String.valueOf(str).length();
        int i = this.f7314c;
        int length3 = String.valueOf(i).length();
        float f2 = this.f7315d;
        int length4 = String.valueOf(f2).length();
        int i3 = this.f7316e;
        int length5 = String.valueOf(i3).length();
        String str2 = this.f7317f;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        A.f.w(sb, "OverlayDisplayShowRequest{windowToken=", string, ", appId=", str);
        sb.append(", layoutGravity=");
        sb.append(i);
        sb.append(", layoutVerticalMargin=");
        sb.append(f2);
        sb.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb.append(i3);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        sb.append(str2);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }
}
