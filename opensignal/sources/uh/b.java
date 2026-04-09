package uh;

import android.net.Uri;
import android.text.TextUtils;
import nh.l;

/* loaded from: classes.dex */
public final class b extends d {
    @Override // uh.d, dt.w
    public final l d(String str) {
        if (TextUtils.isEmpty(str)) {
            return new nh.c();
        }
        return g(Uri.parse("?" + str).getQueryParameter("player_response"));
    }
}
