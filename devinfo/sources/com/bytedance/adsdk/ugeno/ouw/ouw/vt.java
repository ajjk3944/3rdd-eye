package com.bytedance.adsdk.ugeno.ouw.ouw;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends ouw {
    private int fkw;

    /* renamed from: le, reason: collision with root package name */
    private Paint f6923le;

    /* renamed from: lh, reason: collision with root package name */
    private int f6924lh;
    private int yu;

    public vt(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        super(lhVar, jSONObject);
        Paint paint = new Paint();
        this.f6923le = paint;
        paint.setAntiAlias(true);
    }

    private void lh(Canvas canvas) {
        try {
            if (this.vt.uoy() > 0.0f) {
                this.f6923le.setColor(this.f6924lh);
                this.f6923le.setAlpha((int) ((1.0f - this.vt.uoy()) * 255.0f));
                ((ViewGroup) this.vt.fkw.getParent()).setClipChildren(true);
                canvas.drawCircle(this.yu, this.fkw, Math.min(r0, r2) * 2 * this.vt.uoy(), this.f6923le);
            }
        } catch (Throwable th2) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th2.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw() {
        this.f6924lh = com.bytedance.adsdk.ugeno.ra.ouw.ouw(this.ouw.optString("backgroundColor"), -1);
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
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(lh(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(int i4, int i10) {
        this.yu = i4 / 2;
        this.fkw = i10 / 2;
    }
}
