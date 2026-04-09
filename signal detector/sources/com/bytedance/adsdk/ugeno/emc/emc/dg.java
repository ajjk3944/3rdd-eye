package com.bytedance.adsdk.ugeno.emc.emc;

import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.uym.emc;
import com.bytedance.adsdk.ugeno.uym.msw;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg extends emc {
    private static final float aa;
    private static final float cf;
    private static final float qh;
    private static final float vk;
    private Path bw;
    private Paint dg;
    private int gbl;
    private int msw;
    private int ru;
    private float sba;
    private boolean sup;
    private Path sz;
    private int uym;
    private int xq;
    private emc.C0012emc ycc;
    private float zz;

    static {
        float radians = (float) Math.toRadians(30.0d);
        qh = radians;
        cf = (float) Math.tan(radians);
        vk = (float) Math.cos(radians);
        aa = (float) Math.sin(radians);
    }

    public dg(com.bytedance.adsdk.ugeno.ypw.xq xqVar, JSONObject jSONObject) {
        super(xqVar, jSONObject);
        this.sup = true;
        Paint paint = new Paint();
        this.dg = paint;
        paint.setAntiAlias(true);
        this.bw = new Path();
        this.zz = this.ypw.rie();
        this.sz = new Path();
    }

    private void xq(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.ypw.pxa() > 0.0f) {
                int i = this.ru;
                float f2 = cf;
                float fPxa = ((i * f2) + i) * this.ypw.pxa();
                this.sz.reset();
                this.sz.moveTo(fPxa, 0.0f);
                int i3 = this.gbl;
                float f5 = fPxa - (i3 * f2);
                this.sz.lineTo(f5, i3);
                this.sz.lineTo(f5 + this.xq, this.gbl);
                this.sz.lineTo(this.xq + fPxa, 0.0f);
                this.sz.close();
                float f6 = this.sba;
                float f7 = vk * f6;
                float f8 = f6 * aa;
                if (!this.sup || this.ycc == null) {
                    int i6 = this.msw;
                    linearGradient = new LinearGradient(fPxa, 0.0f, fPxa + f7, f8, new int[]{i6, this.uym, i6}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fPxa, 0.0f, fPxa + f7, f8, this.ycc.ypw, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.dg.setShader(linearGradient);
                Path path = this.bw;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.sz, this.dg);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    @SuppressLint({"DrawAllocation"})
    public void emc(Canvas canvas) {
        xq(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void ypw() {
        this.xq = (int) msw.emc(this.ypw.gbl().getContext(), this.emc.optInt("shineWidth", 30));
        String strOptString = this.emc.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.ycc = com.bytedance.adsdk.ugeno.uym.emc.ypw(str);
        } else {
            int iEmc = com.bytedance.adsdk.ugeno.uym.emc.emc(str);
            this.uym = iEmc;
            this.msw = com.bytedance.adsdk.ugeno.uym.emc.emc(iEmc, 32);
            this.sup = false;
        }
        this.sba = vk * this.xq;
    }

    @Override // com.bytedance.adsdk.ugeno.emc.emc.emc
    public void emc(int i, int i3) {
        this.ru = i;
        this.gbl = i3;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i, i3);
            Path path = this.bw;
            float f2 = this.zz;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        } catch (Throwable unused) {
        }
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
