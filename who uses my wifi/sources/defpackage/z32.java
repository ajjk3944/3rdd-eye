package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z32 implements y32 {
    public final /* synthetic */ int f;
    public final zw2 g;

    public /* synthetic */ z32(zw2 zw2Var, int i) {
        this.f = i;
        this.g = zw2Var;
    }

    @Override // defpackage.y32
    public final void c(Object obj, Map map) throws NumberFormatException {
        switch (this.f) {
            case 0:
                if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
                    return;
                }
                zw2 zw2Var = this.g;
                String str = (String) map.get("persistentData");
                synchronized (zw2Var) {
                    zw2Var.x = str;
                    hg4.C.h.g().g(zw2Var.x);
                }
                return;
            default:
                if (map == null || !map.containsKey("extras")) {
                    return;
                }
                long j = Long.MAX_VALUE;
                if (map.containsKey("expires")) {
                    try {
                        j = Long.parseLong((String) map.get("expires"));
                    } catch (NumberFormatException unused) {
                    }
                }
                zw2 zw2Var2 = this.g;
                String str2 = (String) map.get("extras");
                synchronized (zw2Var2) {
                    zw2Var2.o = str2;
                    zw2Var2.q = j;
                    zw2Var2.m();
                }
                return;
        }
    }
}
