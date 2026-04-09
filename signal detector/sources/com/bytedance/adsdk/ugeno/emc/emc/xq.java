package com.bytedance.adsdk.ugeno.emc.emc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq extends emc {
    private float bw;
    private float dg;
    private Matrix gbl;
    private Paint msw;
    private LinearGradient ru;
    private Paint uym;
    private String xq;
    private View ycc;
    private PorterDuffXfermode zz;

    public xq(com.bytedance.adsdk.ugeno.ypw.xq xqVar, JSONObject jSONObject) {
        super(xqVar, jSONObject);
        this.ycc = this.ypw.gbl();
        Paint paint = new Paint();
        this.uym = paint;
        paint.setAntiAlias(true);
        this.ycc.setLayerType(2, null);
        this.zz = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.msw = new Paint();
        this.gbl = new Matrix();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void xq(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.emc.emc.xq.xq(android.graphics.Canvas):void");
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void emc(Canvas canvas) {
        xq(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void ypw() {
        this.xq = this.emc.optString("direction", "left");
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void emc(int i, int i3) {
        this.dg = i;
        this.bw = i3;
        String str = this.xq;
        str.getClass();
        switch (str) {
            case "bottom":
                this.ru = new LinearGradient(0.0f, -this.bw, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.ru = new LinearGradient(0.0f, this.bw, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.ru = new LinearGradient(this.dg, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.ru = new LinearGradient(-this.dg, 0.0f, 0.0f, this.bw, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void ypw(Canvas canvas) {
        xq(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public List<PropertyValuesHolder> xq() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.emc.bw.ALPHA.ypw(), 0.0f, 1.0f));
        return arrayList;
    }
}
