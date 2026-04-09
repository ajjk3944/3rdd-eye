package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes3.dex */
public class MBridgeImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private Xfermode f14300a;

    /* renamed from: b, reason: collision with root package name */
    private int f14301b;

    /* renamed from: c, reason: collision with root package name */
    private int f14302c;

    /* renamed from: d, reason: collision with root package name */
    private int f14303d;

    /* renamed from: e, reason: collision with root package name */
    private int f14304e;

    /* renamed from: f, reason: collision with root package name */
    private int f14305f;

    /* renamed from: g, reason: collision with root package name */
    private int f14306g;

    /* renamed from: h, reason: collision with root package name */
    private int f14307h;

    /* renamed from: i, reason: collision with root package name */
    private int f14308i;

    /* renamed from: j, reason: collision with root package name */
    private int f14309j;

    /* renamed from: k, reason: collision with root package name */
    private float[] f14310k;

    /* renamed from: l, reason: collision with root package name */
    private float[] f14311l;

    /* renamed from: m, reason: collision with root package name */
    private RectF f14312m;

    /* renamed from: n, reason: collision with root package name */
    private RectF f14313n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f14314o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14315p;

    /* renamed from: q, reason: collision with root package name */
    private Path f14316q;

    /* renamed from: r, reason: collision with root package name */
    private Paint f14317r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f14308i, this.f14309j, this.f14313n, this.f14310k);
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f14310k == null || this.f14311l == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f14310k;
                float f10 = this.f14304e;
                fArr[i13] = f10;
                this.f14311l[i13] = f10 - (this.f14308i / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f14310k;
                float f11 = this.f14305f;
                fArr2[i10] = f11;
                this.f14311l[i10] = f11 - (this.f14308i / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f14310k;
                float f12 = this.f14306g;
                fArr3[i11] = f12;
                this.f14311l[i11] = f12 - (this.f14308i / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f14310k;
                float f13 = this.f14307h;
                fArr4[i12] = f13;
                this.f14311l[i12] = f13 - (this.f14308i / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f14313n;
        if (rectF != null) {
            float f10 = this.f14308i / 2.0f;
            rectF.set(f10, f10, this.f14301b - f10, this.f14302c - f10);
        }
    }

    private void d() {
        RectF rectF = this.f14312m;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f14301b, this.f14302c);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f14312m, null, 31);
            int i10 = this.f14301b;
            int i11 = this.f14308i * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            float f12 = this.f14302c;
            canvas.scale(f10 / f11, ((r5 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f14317r;
            if (paint != null) {
                paint.reset();
                this.f14317r.setAntiAlias(true);
                this.f14317r.setStyle(Paint.Style.FILL);
                this.f14317r.setXfermode(this.f14300a);
            }
            Path path = this.f14316q;
            if (path != null) {
                path.reset();
                this.f14316q.addRoundRect(this.f14312m, this.f14311l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f14316q, this.f14317r);
            Paint paint2 = this.f14317r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f14314o) {
                a(canvas);
            }
        } catch (Exception e10) {
            q0.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f14301b = i10;
        this.f14302c = i11;
        if (this.f14315p) {
            b();
        } else {
            a();
        }
        c();
        d();
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f14314o = true;
        this.f14308i = i11;
        this.f14309j = i12;
        this.f14303d = i10;
    }

    public void setCornerRadius(int i10) {
        this.f14303d = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f14314o = true;
        this.f14315p = true;
        this.f14308i = i14;
        this.f14309j = i15;
        this.f14304e = i10;
        this.f14306g = i12;
        this.f14305f = i11;
        this.f14307h = i13;
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f14316q;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f14316q, this.f14317r);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14316q = new Path();
        this.f14317r = new Paint();
        this.f14310k = new float[8];
        this.f14311l = new float[8];
        this.f14313n = new RectF();
        this.f14312m = new RectF();
        this.f14300a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i10, int i11) {
        Path path = this.f14316q;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f14317r;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f14317r.setColor(i11);
            this.f14317r.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f14310k == null || this.f14311l == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f14310k;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f14303d;
                fArr[i10] = f10;
                this.f14311l[i10] = f10 - (this.f14308i / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}
