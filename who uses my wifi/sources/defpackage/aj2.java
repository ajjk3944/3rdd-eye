package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class aj2 implements si2 {
    @Override // defpackage.si2
    public final void a(HashMap map) {
        if (!((Boolean) tw1.e.c.a(mz1.ib)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hg4.C.h.g().t(Boolean.parseBoolean(str));
    }
}
