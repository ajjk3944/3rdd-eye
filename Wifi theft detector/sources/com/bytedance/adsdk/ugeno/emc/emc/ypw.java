package com.bytedance.adsdk.ugeno.emc.emc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw extends emc {
    private int bw;
    private int dg;
    private int xq;
    private Paint ycc;

    public ypw(com.bytedance.adsdk.ugeno.ypw.xq xqVar, JSONObject jSONObject) {
        super(xqVar, jSONObject);
        Paint paint = new Paint();
        this.ycc = paint;
        paint.setAntiAlias(true);
    }

    private void xq(Canvas canvas) {
        try {
            if (this.ypw.wpn() > 0.0f) {
                this.ycc.setColor(this.xq);
                this.ycc.setAlpha((int) ((1.0f - this.ypw.wpn()) * 255.0f));
                ((ViewGroup) this.ypw.gbl().getParent()).setClipChildren(true);
                canvas.drawCircle(this.dg, this.bw, Math.min(r0, r2) * 2 * this.ypw.wpn(), this.ycc);
            }
        } catch (Throwable th) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void emc(Canvas canvas) {
        xq(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void ypw() {
        this.xq = com.bytedance.adsdk.ugeno.uym.emc.emc(this.emc.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), -1);
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void emc(int i10, int i11) {
        this.dg = i10 / 2;
        this.bw = i11 / 2;
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void ypw(Canvas canvas) {
        xq(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public List<PropertyValuesHolder> xq() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(dg(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
