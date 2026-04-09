package com.bytedance.adsdk.ugeno.ouw.ouw;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends ouw {
    private boolean bly;

    /* renamed from: cf, reason: collision with root package name */
    private Path f6916cf;
    private Paint fkw;

    /* renamed from: le, reason: collision with root package name */
    private float f6917le;

    /* renamed from: lh, reason: collision with root package name */
    private float f6918lh;
    private PorterDuffXfermode mwh;
    private boolean pno;
    private String ra;
    private Path ryl;
    private Path tlj;
    private float yu;

    public fkw(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        super(lhVar, jSONObject);
        this.pno = true;
        this.bly = true;
        Paint paint = new Paint();
        this.fkw = paint;
        paint.setAntiAlias(true);
        this.vt.fkw.setLayerType(2, null);
        this.mwh = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.tlj = new Path();
        this.f6916cf = new Path();
        this.ryl = new Path();
        this.fkw.setXfermode(this.mwh);
    }

    private void lh(Canvas canvas) {
        int iEy;
        int iEy2;
        if (this.vt.ey() <= 0.0f) {
            this.fkw.setXfermode(this.mwh);
            canvas.drawRect(0.0f, 0.0f, this.f6918lh, this.yu, this.fkw);
            return;
        }
        iEy = (int) (this.vt.ey() * this.f6918lh);
        iEy2 = (int) (this.vt.ey() * this.yu);
        this.fkw.setXfermode(this.mwh);
        String str = this.ra;
        str.getClass();
        switch (str) {
            case "bottom":
                canvas.drawRect(0.0f, iEy2, this.f6918lh, this.yu, this.fkw);
                break;
            case "center":
                this.tlj.reset();
                this.f6916cf.reset();
                this.ryl.reset();
                Path.Direction direction = Path.Direction.CW;
                this.tlj.addCircle(this.f6918lh / 2.0f, this.yu / 2.0f, iEy, direction);
                Path path = this.f6916cf;
                float f10 = this.f6918lh;
                path.addRect(f10 / 2.0f, 0.0f, f10, this.yu, direction);
                Path path2 = this.f6916cf;
                Path path3 = this.tlj;
                Path.Op op = Path.Op.DIFFERENCE;
                path2.op(path3, op);
                this.ryl.addRect(0.0f, 0.0f, this.f6918lh / 2.0f, this.yu, direction);
                this.ryl.op(this.tlj, op);
                canvas.drawPath(this.f6916cf, this.fkw);
                canvas.drawPath(this.ryl, this.fkw);
                break;
            case "top":
                canvas.drawRect(0.0f, 0.0f, this.f6918lh, this.yu - iEy2, this.fkw);
                break;
            case "left":
                canvas.drawRect(0.0f, 0.0f, this.f6918lh - iEy, this.yu, this.fkw);
                break;
            case "right":
                canvas.drawRect(iEy, 0.0f, this.f6918lh, this.yu, this.fkw);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw() {
        this.f6917le = (float) this.ouw.optDouble("start", 0.0d);
        this.ra = this.ouw.optString("direction", "center");
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void vt(Canvas canvas) {
        lh(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final List<PropertyValuesHolder> vt() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(lh(), this.f6917le, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(Canvas canvas) {
        lh(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(int i4, int i10) {
        if (i4 > 0 && this.pno) {
            this.f6918lh = i4;
            this.pno = false;
        }
        if (i10 <= 0 || !this.bly) {
            return;
        }
        this.yu = i10;
        this.bly = false;
    }
}
