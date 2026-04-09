package zc;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class m3 extends j3 {
    public static final boolean v1(String str) {
        String str2 = (String) u.f27208t.a(null);
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (java.lang.Math.abs(r6.hashCode() % 100) < r8.E().p()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zc.l3 t1(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.m3.t1(java.lang.String):zc.l3");
    }

    public final String u1(String str) {
        w0 w0Var = this.f26981g.f27091a;
        p3.Q(w0Var);
        String strF1 = w0Var.F1(str);
        if (TextUtils.isEmpty(strF1)) {
            return (String) u.f27204r.a(null);
        }
        Uri uri = Uri.parse((String) u.f27204r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strF1).length() + 1 + String.valueOf(authority).length());
        sb2.append(strF1);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }
}
