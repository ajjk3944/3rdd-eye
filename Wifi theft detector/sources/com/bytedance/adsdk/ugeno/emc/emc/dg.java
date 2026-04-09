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
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg extends emc {

    /* renamed from: aa, reason: collision with root package name */
    private static final float f9211aa;
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
    private emc.C0097emc ycc;
    private float zz;

    static {
        float radians = (float) Math.toRadians(30.0d);
        qh = radians;
        cf = (float) Math.tan(radians);
        vk = (float) Math.cos(radians);
        f9211aa = (float) Math.sin(radians);
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
                int i10 = this.ru;
                float f10 = cf;
                float fPxa = (i10 + (i10 * f10)) * this.ypw.pxa();
                this.sz.reset();
                this.sz.moveTo(fPxa, 0.0f);
                int i11 = this.gbl;
                float f11 = fPxa - (i11 * f10);
                this.sz.lineTo(f11, i11);
                this.sz.lineTo(f11 + this.xq, this.gbl);
                this.sz.lineTo(this.xq + fPxa, 0.0f);
                this.sz.close();
                float f12 = this.sba;
                float f13 = vk * f12;
                float f14 = f12 * f9211aa;
                if (!this.sup || this.ycc == null) {
                    int i12 = this.msw;
                    linearGradient = new LinearGradient(fPxa, 0.0f, fPxa + f13, f14, new int[]{i12, this.uym, i12}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fPxa, 0.0f, fPxa + f13, f14, this.ycc.ypw, (float[]) null, Shader.TileMode.CLAMP);
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
        String strOptString = this.emc.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
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
    public void emc(int i10, int i11) {
        this.ru = i10;
        this.gbl = i11;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
            Path path = this.bw;
            float f10 = this.zz;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
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
