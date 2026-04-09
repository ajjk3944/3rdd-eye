package com.bytedance.adsdk.ugeno.emc.emc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw extends emc {
    private Paint bw;
    private float dg;
    private Path gbl;
    private boolean msw;
    private Path ru;
    private Path sup;
    private PorterDuffXfermode sz;
    private String uym;
    private float xq;
    private float ycc;
    private boolean zz;

    public bw(com.bytedance.adsdk.ugeno.ypw.xq xqVar, JSONObject jSONObject) {
        super(xqVar, jSONObject);
        this.msw = true;
        this.zz = true;
        Paint paint = new Paint();
        this.bw = paint;
        paint.setAntiAlias(true);
        this.ypw.gbl().setLayerType(2, null);
        this.sz = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.ru = new Path();
        this.gbl = new Path();
        this.sup = new Path();
        this.bw.setXfermode(this.sz);
    }

    private void xq(Canvas canvas) {
        int iWa;
        int iWa2;
        if (this.ypw.wa() <= 0.0f) {
            this.bw.setXfermode(this.sz);
            canvas.drawRect(0.0f, 0.0f, this.xq, this.dg, this.bw);
            return;
        }
        iWa = (int) (this.ypw.wa() * this.xq);
        iWa2 = (int) (this.ypw.wa() * this.dg);
        this.bw.setXfermode(this.sz);
        String str = this.uym;
        str.getClass();
        switch (str) {
            case "bottom":
                canvas.drawRect(0.0f, iWa2, this.xq, this.dg, this.bw);
                break;
            case "center":
                this.ru.reset();
                this.gbl.reset();
                this.sup.reset();
                Path.Direction direction = Path.Direction.CW;
                this.ru.addCircle(this.xq / 2.0f, this.dg / 2.0f, iWa, direction);
                Path path = this.gbl;
                float f2 = this.xq;
                path.addRect(f2 / 2.0f, 0.0f, f2, this.dg, direction);
                Path path2 = this.gbl;
                Path path3 = this.ru;
                Path.Op op = Path.Op.DIFFERENCE;
                path2.op(path3, op);
                this.sup.addRect(0.0f, 0.0f, this.xq / 2.0f, this.dg, direction);
                this.sup.op(this.ru, op);
                canvas.drawPath(this.gbl, this.bw);
                canvas.drawPath(this.sup, this.bw);
                break;
            case "top":
                canvas.drawRect(0.0f, 0.0f, this.xq, this.dg - iWa2, this.bw);
                break;
            case "left":
                canvas.drawRect(0.0f, 0.0f, this.xq - iWa, this.dg, this.bw);
                break;
            case "right":
                canvas.drawRect(iWa, 0.0f, this.xq, this.dg, this.bw);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void emc(Canvas canvas) {
        xq(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void ypw() {
        this.ycc = (float) this.emc.optDouble("start", 0.0d);
        this.uym = this.emc.optString("direction", "center");
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void emc(int i, int i3) {
        if (i > 0 && this.msw) {
            this.xq = i;
            this.msw = false;
        }
        if (i3 <= 0 || !this.zz) {
            return;
        }
        this.dg = i3;
        this.zz = false;
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void ypw(Canvas canvas) {
        xq(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public List<PropertyValuesHolder> xq() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(dg(), this.ycc, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
