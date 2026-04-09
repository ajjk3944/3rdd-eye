package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class g0 extends BitmapDrawable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5897e = 0;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f5898a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5899b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5900c;

    /* renamed from: d, reason: collision with root package name */
    public int f5901d;

    static {
        new Paint();
    }

    public g0(Context context, Bitmap bitmap, Drawable drawable, c0 c0Var) {
        super(context.getResources(), bitmap);
        this.f5901d = 255;
        float f10 = context.getResources().getDisplayMetrics().density;
        if (c0Var != c0.MEMORY) {
            this.f5898a = drawable;
            this.f5900c = true;
            this.f5899b = SystemClock.uptimeMillis();
        }
    }

    public static void a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.f5900c) {
            super.draw(canvas);
            return;
        }
        float fUptimeMillis = (SystemClock.uptimeMillis() - this.f5899b) / 200.0f;
        if (fUptimeMillis >= 1.0f) {
            this.f5900c = false;
            this.f5898a = null;
            super.draw(canvas);
        } else {
            Drawable drawable = this.f5898a;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            super.setAlpha((int) (this.f5901d * fUptimeMillis));
            super.draw(canvas);
            super.setAlpha(this.f5901d);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5898a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f5901d = i10;
        Drawable drawable = this.f5898a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        super.setAlpha(i10);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5898a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
