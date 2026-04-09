package com.bytedance.sdk.openadsdk.core.gbl.ycc;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.dg.gbl;
import com.bytedance.adsdk.ugeno.dg.sz;

/* loaded from: classes.dex */
public class xq implements sz {
    @Override // com.bytedance.adsdk.ugeno.dg.sz
    public boolean emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, MotionEvent motionEvent, gbl gblVar, com.bytedance.adsdk.ugeno.dg.dg.xq xqVar2) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            if (emc(xqVar.gbl(), motionEvent.getX(), motionEvent.getY()) && gblVar != null) {
                gblVar.emc(xqVar, xqVar2.dg(), xqVar2.ycc().ypw());
            }
        }
        return true;
    }

    private boolean emc(View view, float f10, float f11) {
        return f10 >= 0.0f && f10 < ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }
}
