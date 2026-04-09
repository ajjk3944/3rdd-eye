package uh;

import java.util.regex.Pattern;
import sm.m;

/* loaded from: classes.dex */
public final class e extends m {

    /* renamed from: r, reason: collision with root package name */
    public final Pattern f23567r;

    public e(String str) {
        this.f23567r = Pattern.compile(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @Override // sm.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap x(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L14
            java.util.regex.Pattern r0 = r2.f23567r
            java.util.regex.Matcher r3 = r0.matcher(r3)
            boolean r0 = r3.find()
            if (r0 == 0) goto L14
            r0 = 1
            java.lang.String r3 = r3.group(r0)
            goto L16
        L14:
            java.lang.String r3 = ""
        L16:
            java.lang.String r0 = "YoutubeHtmlParser"
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            ch.n.b(r0, r1)
            java.util.HashMap r3 = super.x(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.e.x(java.lang.String):java.util.HashMap");
    }
}
