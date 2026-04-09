package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class su1 {
    public final Context a;
    public boolean b;
    public final sb2 c;
    public final v92 d = new v92(false, Collections.EMPTY_LIST);

    public su1(Context context, sb2 sb2Var) {
        this.a = context;
        this.c = sb2Var;
    }

    public final boolean a() {
        sb2 sb2Var = this.c;
        return ((sb2Var == null || !((qb2) sb2Var).g.k) && !this.d.f) || this.b;
    }

    public final void b(String str) {
        List<String> list;
        v92 v92Var = this.d;
        sb2 sb2Var = this.c;
        if ((sb2Var == null || !((qb2) sb2Var).g.k) && !v92Var.f) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (sb2Var != null) {
            ((qb2) sb2Var).b(str, null, 3);
            return;
        }
        if (!v92Var.f || (list = v92Var.g) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                lf4 lf4Var = hg4.C.c;
                new w72(this.a, "", strReplace, null).r1();
            }
        }
    }
}
