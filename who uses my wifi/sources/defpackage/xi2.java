package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xi2 implements si2 {
    public final /* synthetic */ int a;
    public final zw2 b;

    public /* synthetic */ xi2(zw2 zw2Var, int i) {
        this.a = i;
        this.b = zw2Var;
    }

    @Override // defpackage.si2
    public final void a(HashMap map) {
        switch (this.a) {
            case 0:
                String str = (String) map.get("gesture");
                if (!TextUtils.isEmpty(str)) {
                    int iHashCode = str.hashCode();
                    zw2 zw2Var = this.b;
                    if (iHashCode == 97520651) {
                        if (str.equals("flick")) {
                            zw2Var.h(ww2.h, true);
                            break;
                        }
                    } else if (iHashCode == 109399814 && str.equals("shake")) {
                        zw2Var.h(ww2.g, true);
                        break;
                    }
                    zw2Var.h(ww2.f, true);
                    break;
                }
                break;
            default:
                String str2 = (String) map.get("test_mode_enabled");
                if (!TextUtils.isEmpty(str2)) {
                    this.b.b(str2.equals("true"));
                    break;
                }
                break;
        }
    }
}
