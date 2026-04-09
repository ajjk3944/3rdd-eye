package com.bytedance.sdk.component.adexpress.ycc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class sup extends View {
    private int bw;
    private final List<emc> cf;
    private int dg;
    Rect emc;
    private Paint gbl;
    private int msw;
    private LinearGradient qh;
    private Bitmap ru;
    private Xfermode sup;
    private PorterDuff.Mode sz;
    private int uym;
    private int xq;
    private int ycc;
    Rect ypw;
    private int[] zz;

    public static class emc {
        private final int emc;
        private int ypw = 0;

        public emc(int i10) {
            this.emc = i10;
        }

        public void emc() {
            this.ypw += this.emc;
        }
    }

    public sup(Context context) {
        super(context);
        this.sz = PorterDuff.Mode.DST_IN;
        this.cf = new ArrayList();
        emc();
    }

    private void emc() {
        this.xq = com.bytedance.sdk.component.utils.rie.dg(getContext(), "tt_splash_unlock_image_arrow");
        this.dg = Color.parseColor("#00ffffff");
        this.bw = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.ycc = color;
        this.uym = 10;
        this.msw = 40;
        this.zz = new int[]{this.dg, this.bw, color};
        setLayerType(1, null);
        this.gbl = new Paint(1);
        this.ru = BitmapFactory.decodeResource(getResources(), this.xq);
        this.sup = new PorterDuffXfermode(this.sz);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.ru, this.emc, this.ypw, this.gbl);
        canvas.save();
        Iterator<emc> it = this.cf.iterator();
        while (it.hasNext()) {
            emc next = it.next();
            this.qh = new LinearGradient(next.ypw, 0.0f, next.ypw + this.msw, this.uym, this.zz, (float[]) null, Shader.TileMode.CLAMP);
            this.gbl.setColor(-1);
            this.gbl.setShader(this.qh);
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.gbl);
            this.gbl.setShader(null);
            next.emc();
            if (next.ypw > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.gbl.setXfermode(this.sup);
        canvas3.drawBitmap(this.ru, this.emc, this.ypw, this.gbl);
        this.gbl.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.ru == null) {
            return;
        }
        this.emc = new Rect(0, 0, this.ru.getWidth(), this.ru.getHeight());
        this.ypw = new Rect(0, 0, getWidth(), getHeight());
    }

    public void emc(int i10) {
        this.cf.add(new emc(i10));
        postInvalidate();
    }
}
