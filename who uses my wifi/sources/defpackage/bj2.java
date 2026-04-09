package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bj2 implements si2 {
    public final Context a;
    public final ra4 b = hg4.C.h.g();

    public bj2(Context context) {
        this.a = context;
    }

    @Override // defpackage.si2
    public final void a(HashMap map) throws IOException {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        boolean z = Boolean.parseBoolean(str);
        this.b.r(z);
        if (z) {
            yc0.q(this.a);
        }
    }
}
