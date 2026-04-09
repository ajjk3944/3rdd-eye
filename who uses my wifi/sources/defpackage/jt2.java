package defpackage;

import android.graphics.Rect;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class jt2 implements ov1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ag2 g;

    public /* synthetic */ jt2(ag2 ag2Var, int i) {
        this.f = i;
        this.g = ag2Var;
    }

    @Override // defpackage.ov1
    public final /* synthetic */ void S0(nv1 nv1Var) {
        switch (this.f) {
            case 0:
                HashMap map = new HashMap();
                map.put("isVisible", true != nv1Var.j ? "0" : "1");
                this.g.a("onAdVisibilityChanged", map);
                break;
            case 1:
                Rect rect = nv1Var.d;
                this.g.e0().r(rect.left, rect.top);
                break;
            default:
                Rect rect2 = nv1Var.d;
                this.g.e0().r(rect2.left, rect2.top);
                break;
        }
    }
}
