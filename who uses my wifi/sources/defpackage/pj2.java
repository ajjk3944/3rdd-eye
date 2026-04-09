package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pj2 implements y32 {
    public final /* synthetic */ int f;
    public final /* synthetic */ qj2 g;

    public /* synthetic */ pj2(qj2 qj2Var, int i) {
        this.f = i;
        this.g = qj2Var;
    }

    @Override // defpackage.y32
    public final void c(Object obj, Map map) {
        switch (this.f) {
            case 0:
                qj2 qj2Var = this.g;
                qj2Var.getClass();
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(qj2Var.a)) {
                        qj2Var.c.execute(new fu1(21, this));
                        break;
                    }
                }
                break;
            default:
                qj2 qj2Var2 = this.g;
                qj2Var2.getClass();
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(qj2Var2.a)) {
                        qj2Var2.c.execute(new fu1(22, this));
                        break;
                    }
                }
                break;
        }
    }
}
