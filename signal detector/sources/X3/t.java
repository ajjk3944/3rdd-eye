package x3;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public abstract class t extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f24157a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f24158b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f24159c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24160d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24161e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24162f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24163g;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect = this.f24159c;
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f24158b == null || this.f24157a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f24160d) {
            rect.set(0, 0, width, this.f24158b.top);
            this.f24157a.setBounds(rect);
            this.f24157a.draw(canvas);
        }
        if (this.f24161e) {
            rect.set(0, height - this.f24158b.bottom, width, height);
            this.f24157a.setBounds(rect);
            this.f24157a.draw(canvas);
        }
        if (this.f24162f) {
            Rect rect2 = this.f24158b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f24157a.setBounds(rect);
            this.f24157a.draw(canvas);
        }
        if (this.f24163g) {
            Rect rect3 = this.f24158b;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f24157a.setBounds(rect);
            this.f24157a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f24157a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f24157a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z6) {
        this.f24161e = z6;
    }

    public void setDrawLeftInsetForeground(boolean z6) {
        this.f24162f = z6;
    }

    public void setDrawRightInsetForeground(boolean z6) {
        this.f24163g = z6;
    }

    public void setDrawTopInsetForeground(boolean z6) {
        this.f24160d = z6;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f24157a = drawable;
    }
}
