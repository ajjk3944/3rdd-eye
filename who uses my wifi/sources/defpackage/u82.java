package defpackage;

import android.os.Handler;
import android.webkit.WebView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u82 extends WebView {
    public static final /* synthetic */ int i = 0;
    public final Handler f;
    public final gi1 g;
    public boolean h;

    public u82(aa2 aa2Var, Handler handler, gi1 gi1Var) {
        super(aa2Var);
        this.h = false;
        this.f = handler;
        this.g = gi1Var;
    }

    public final void a(String str, String str2) {
        this.f.post(new n62(this, str + "(" + str2 + ");", 0));
    }
}
