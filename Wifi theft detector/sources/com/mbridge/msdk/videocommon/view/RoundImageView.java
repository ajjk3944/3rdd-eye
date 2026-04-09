package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.widget.MBImageView;

/* loaded from: classes3.dex */
public class RoundImageView extends MBImageView {

    /* renamed from: c, reason: collision with root package name */
    private int f19743c;

    /* renamed from: d, reason: collision with root package name */
    private int f19744d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f19745e;

    /* renamed from: f, reason: collision with root package name */
    private int f19746f;

    /* renamed from: g, reason: collision with root package name */
    private Matrix f19747g;

    /* renamed from: h, reason: collision with root package name */
    private BitmapShader f19748h;

    /* renamed from: i, reason: collision with root package name */
    private int f19749i;

    /* renamed from: j, reason: collision with root package name */
    private RectF f19750j;

    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19747g = new Matrix();
        Paint paint = new Paint();
        this.f19745e = paint;
        paint.setAntiAlias(true);
        this.f19744d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f19743c = 1;
    }

    private Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            q0.b("View", th.getMessage());
            return null;
        }
    }

    private void b() {
        Bitmap bitmapA;
        try {
            Drawable drawable = getDrawable();
            if (drawable == null || (bitmapA = a(drawable)) == null || bitmapA.isRecycled()) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f19748h = new BitmapShader(bitmapA, tileMode, tileMode);
            int i10 = this.f19743c;
            float fMax = 1.0f;
            if (i10 == 0) {
                fMax = (this.f19749i * 1.0f) / Math.min(bitmapA.getWidth(), bitmapA.getHeight());
            } else if (i10 == 1) {
                fMax = Math.max((getWidth() * 1.0f) / bitmapA.getWidth(), (getHeight() * 1.0f) / bitmapA.getHeight());
            }
            this.f19747g.setScale(fMax, fMax);
            this.f19748h.setLocalMatrix(this.f19747g);
            this.f19745e.setShader(this.f19748h);
        } catch (Throwable th) {
            q0.b("RoundImageView", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            if (getDrawable() == null) {
                return;
            }
            b();
            if (this.f19743c != 1) {
                float f10 = this.f19746f;
                canvas.drawCircle(f10, f10, f10, this.f19745e);
            } else {
                RectF rectF = this.f19750j;
                float f11 = this.f19744d;
                canvas.drawRoundRect(rectF, f11, f11, this.f19745e);
            }
        } catch (Throwable th) {
            q0.b("RoundImageView", th.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f19743c == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f19749i = iMin;
            this.f19746f = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
        this.f19743c = bundle.getInt("state_type");
        this.f19744d = bundle.getInt("state_border_radius");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f19743c);
        bundle.putInt("state_border_radius", this.f19744d);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f19743c == 1) {
            this.f19750j = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i10) {
        int iA = v0.a(getContext(), i10);
        if (this.f19744d != iA) {
            this.f19744d = iA;
            invalidate();
        }
    }

    public void setType(int i10) {
        if (this.f19743c != i10) {
            this.f19743c = i10;
            if (i10 != 1 && i10 != 0) {
                this.f19743c = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19747g = new Matrix();
        Paint paint = new Paint();
        this.f19745e = paint;
        paint.setAntiAlias(true);
        this.f19744d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f19743c = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.f19747g = new Matrix();
        Paint paint = new Paint();
        this.f19745e = paint;
        paint.setAntiAlias(true);
        this.f19744d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f19743c = 1;
    }
}
