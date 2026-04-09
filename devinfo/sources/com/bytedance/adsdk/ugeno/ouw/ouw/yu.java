package com.bytedance.adsdk.ugeno.ouw.ouw;

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
import com.bytedance.adsdk.ugeno.ra.ouw;
import com.bytedance.adsdk.ugeno.ra.ra;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends ouw {

    /* renamed from: jg, reason: collision with root package name */
    private static final float f6925jg;
    private static final float ko;
    private static final float rn;
    private static final float zih;
    private float bly;

    /* renamed from: cf, reason: collision with root package name */
    private int f6926cf;
    private Path fkw;

    /* renamed from: le, reason: collision with root package name */
    private ouw.C0035ouw f6927le;

    /* renamed from: lh, reason: collision with root package name */
    private int f6928lh;
    private Path mwh;
    private int pno;
    private int ra;
    private boolean ryl;
    private int tlj;
    private float vm;
    private Paint yu;

    static {
        float radians = (float) Math.toRadians(30.0d);
        f6925jg = radians;
        ko = (float) Math.tan(radians);
        rn = (float) Math.cos(radians);
        zih = (float) Math.sin(radians);
    }

    public yu(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        super(lhVar, jSONObject);
        this.ryl = true;
        Paint paint = new Paint();
        this.yu = paint;
        paint.setAntiAlias(true);
        this.fkw = new Path();
        this.bly = this.vt.ux;
        this.mwh = new Path();
    }

    private void lh(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.vt.osn() > 0.0f) {
                int i4 = this.tlj;
                float f10 = ko;
                float fOsn = ((i4 * f10) + i4) * this.vt.osn();
                this.mwh.reset();
                this.mwh.moveTo(fOsn, 0.0f);
                int i10 = this.f6926cf;
                float f11 = fOsn - (i10 * f10);
                this.mwh.lineTo(f11, i10);
                this.mwh.lineTo(f11 + this.f6928lh, this.f6926cf);
                this.mwh.lineTo(this.f6928lh + fOsn, 0.0f);
                this.mwh.close();
                float f12 = this.vm;
                float f13 = rn * f12;
                float f14 = f12 * zih;
                if (!this.ryl || this.f6927le == null) {
                    int i11 = this.pno;
                    linearGradient = new LinearGradient(fOsn, 0.0f, fOsn + f13, f14, new int[]{i11, this.ra, i11}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fOsn, 0.0f, fOsn + f13, f14, this.f6927le.vt, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.yu.setShader(linearGradient);
                Path path = this.fkw;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.mwh, this.yu);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw() throws NumberFormatException {
        this.f6928lh = (int) ra.ouw(this.vt.fkw.getContext(), this.ouw.optInt("shineWidth", 30));
        String strOptString = this.ouw.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.f6927le = com.bytedance.adsdk.ugeno.ra.ouw.vt(str);
        } else {
            int iOuw = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str, -16777216);
            this.ra = iOuw;
            this.pno = (iOuw & 16777215) | 536870912;
            this.ryl = false;
        }
        this.vm = rn * this.f6928lh;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void vt(Canvas canvas) {
        lh(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final List<PropertyValuesHolder> vt() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(lh(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    @SuppressLint({"DrawAllocation"})
    public final void ouw(Canvas canvas) {
        lh(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(int i4, int i10) {
        this.tlj = i4;
        this.f6926cf = i10;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i4, i10);
            Path path = this.fkw;
            float f10 = this.bly;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }
}
