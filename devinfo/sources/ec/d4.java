package ec;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d4 extends x3 {
    public static final boolean E(String str) {
        String str2 = (String) d0.f22664t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.E().p()) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ec.c4 C(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.d4.C(java.lang.String):ec.c4");
    }

    public final String D(String str) {
        h1 h1Var = this.f23175c.f22731a;
        g4.U(h1Var);
        String strO = h1Var.O(str);
        if (TextUtils.isEmpty(strO)) {
            return (String) d0.f22660r.a(null);
        }
        Uri uri = Uri.parse((String) d0.f22660r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strO).length() + 1 + String.valueOf(authority).length());
        sb2.append(strO);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }
}
