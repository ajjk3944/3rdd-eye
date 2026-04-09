package com.bytedance.adsdk.ugeno.ouw.ouw;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends ouw {
    private PorterDuffXfermode bly;

    /* renamed from: cf, reason: collision with root package name */
    private Matrix f6919cf;
    private float fkw;

    /* renamed from: le, reason: collision with root package name */
    private View f6920le;

    /* renamed from: lh, reason: collision with root package name */
    private String f6921lh;
    private Paint pno;
    private Paint ra;
    private LinearGradient tlj;
    private float yu;

    public lh(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        super(lhVar, jSONObject);
        this.f6920le = this.vt.fkw;
        Paint paint = new Paint();
        this.ra = paint;
        paint.setAntiAlias(true);
        this.f6920le.setLayerType(2, null);
        this.bly = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.pno = new Paint();
        this.f6919cf = new Matrix();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void lh(Canvas canvas) {
        try {
            if (this.vt.rrs() <= 0.0f) {
                this.ra.setXfermode(this.bly);
                canvas.drawRect(0.0f, 0.0f, this.yu, this.fkw, this.ra);
                return;
            }
            int iRrs = (int) (this.yu * this.vt.rrs());
            int iRrs2 = (int) (this.fkw * this.vt.rrs());
            this.ra.setXfermode(this.bly);
            String str = this.f6921lh;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        float f10 = iRrs2;
                        canvas.drawRect(0.0f, f10, this.yu, this.fkw, this.ra);
                        this.f6919cf.setTranslate(0.0f, f10);
                        this.tlj.setLocalMatrix(this.f6919cf);
                        this.pno.setShader(this.tlj);
                        if (this.vt.rrs() <= 1.0f && this.vt.rrs() > 0.9f) {
                            this.pno.setAlpha((int) (255.0f - (this.vt.rrs() * 255.0f)));
                        }
                        canvas.drawRect(0.0f, 0.0f, this.yu, f10, this.pno);
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        float f11 = iRrs2;
                        canvas.drawRect(0.0f, 0.0f, this.yu, this.fkw - f11, this.ra);
                        this.f6919cf.setTranslate(0.0f, this.fkw - f11);
                        this.tlj.setLocalMatrix(this.f6919cf);
                        this.pno.setShader(this.tlj);
                        if (this.vt.rrs() <= 1.0f && this.vt.rrs() > 0.9f) {
                            this.pno.setAlpha((int) (255.0f - (this.vt.rrs() * 255.0f)));
                        }
                        float f12 = this.yu;
                        float f13 = this.fkw;
                        canvas.drawRect(f12, f13, 0.0f, f13 - f11, this.pno);
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        float f14 = iRrs;
                        canvas.drawRect(0.0f, 0.0f, this.yu - f14, this.fkw, this.ra);
                        this.f6919cf.setTranslate(this.yu - f14, 0.0f);
                        this.tlj.setLocalMatrix(this.f6919cf);
                        this.pno.setShader(this.tlj);
                        if (this.vt.rrs() <= 1.0f && this.vt.rrs() > 0.9f) {
                            this.pno.setAlpha((int) (255.0f - (this.vt.rrs() * 255.0f)));
                        }
                        float f15 = this.yu;
                        canvas.drawRect(f15, this.fkw, f15 - f14, 0.0f, this.pno);
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        float f16 = iRrs;
                        canvas.drawRect(f16, 0.0f, this.yu, this.fkw, this.ra);
                        this.f6919cf.setTranslate(f16, this.fkw);
                        this.tlj.setLocalMatrix(this.f6919cf);
                        this.pno.setShader(this.tlj);
                        if (this.vt.rrs() <= 1.0f && this.vt.rrs() > 0.9f) {
                            this.pno.setAlpha((int) (255.0f - (this.vt.rrs() * 255.0f)));
                        }
                        canvas.drawRect(0.0f, 0.0f, f16, this.fkw, this.pno);
                        break;
                    }
                    break;
            }
        } catch (Throwable th2) {
            Log.e("BaseEffectWrapper", th2.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw() {
        this.f6921lh = this.ouw.optString("direction", "left");
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void vt(Canvas canvas) {
        lh(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(Canvas canvas) {
        lh(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final List<PropertyValuesHolder> vt() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.ouw.fkw.ALPHA.rn, 0.0f, 1.0f));
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(int i4, int i10) {
        this.yu = i4;
        this.fkw = i10;
        String str = this.f6921lh;
        str.getClass();
        switch (str) {
            case "bottom":
                this.tlj = new LinearGradient(0.0f, -this.fkw, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.tlj = new LinearGradient(0.0f, this.fkw, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.tlj = new LinearGradient(this.yu, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.tlj = new LinearGradient(-this.yu, 0.0f, 0.0f, this.fkw, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }
}
