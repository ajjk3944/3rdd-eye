package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import g0.C4356c;
import y9.C5819a;

/* renamed from: io.appmetrica.analytics.impl.bg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4512bg {
    public static final String a(C5045w9 c5045w9) {
        String string;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i = c5045w9.f41946c;
        String str = c5045w9.f41947d;
        byte[] bArr = c5045w9.f41948e;
        if (i == 1) {
            string = "Attribution";
        } else if (i == 2) {
            string = "Session start";
        } else if (i == 4) {
            if (str == null) {
                str = "null";
            }
            StringBuilder sb2 = new StringBuilder(str);
            if (bArr != null) {
                String str2 = new String(bArr, C5819a.f48359b);
                if (!TextUtils.isEmpty(str2)) {
                    sb2.append(" with value ");
                    sb2.append(str2);
                }
            }
            string = sb2.toString();
        } else if (i == 5) {
            string = "Referrer";
        } else if (i == 7) {
            string = "Session heartbeat";
        } else if (i == 13) {
            string = "The very first event";
        } else if (i == 35) {
            string = "E-Commerce";
        } else if (i == 40) {
            string = "Ad revenue (ILRD)";
        } else if (i == 42) {
            string = "External attribution";
        } else if (i == 16) {
            string = "Open";
        } else if (i == 17) {
            string = "Update";
        } else if (i == 20) {
            string = "User profile update";
        } else if (i != 21) {
            switch (i) {
                case 25:
                    string = "ANR";
                    break;
                case 26:
                    string = androidx.work.s.d("Crash: ", str);
                    break;
                case 27:
                    string = androidx.work.s.d("Error: ", str);
                    break;
                default:
                    string = C4356c.h(i, "type=");
                    break;
            }
        } else {
            string = "Revenue";
        }
        sb.append(string);
        return sb.toString();
    }

    public static final String a(String str, EnumC4997ub enumC4997ub, String str2, String str3) {
        if (!O9.f39926d.contains(EnumC4997ub.a(enumC4997ub.f41758a))) {
            return null;
        }
        StringBuilder sbV = N7.G8.v(str, ": ");
        sbV.append(enumC4997ub.name());
        if (O9.f39928f.contains(enumC4997ub) && !TextUtils.isEmpty(str2)) {
            sbV.append(" with name ");
            sbV.append(str2);
        }
        if (O9.f39927e.contains(enumC4997ub) && !TextUtils.isEmpty(str3)) {
            sbV.append(" with value ");
            sbV.append(str3);
        }
        return sbV.toString();
    }
}
