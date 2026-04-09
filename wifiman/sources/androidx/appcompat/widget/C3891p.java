package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import h.AbstractC5927a;

/* renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3891p extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    private final C3880e f27440a;

    /* renamed from: b, reason: collision with root package name */
    private final C3892q f27441b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27442c;

    public C3891p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5927a.f47963z);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C3880e c3880e = this.f27440a;
        if (c3880e != null) {
            c3880e.b();
        }
        C3892q c3892q = this.f27441b;
        if (c3892q != null) {
            c3892q.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3880e c3880e = this.f27440a;
        if (c3880e != null) {
            return c3880e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3880e c3880e = this.f27440a;
        if (c3880e != null) {
            return c3880e.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C3892q c3892q = this.f27441b;
        if (c3892q != null) {
            return c3892q.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C3892q c3892q = this.f27441b;
        if (c3892q != null) {
            return c3892q.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f27441b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3880e c3880e = this.f27440a;
        if (c3880e != null) {
            c3880e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3880e c3880e = this.f27440a;
        if (c3880e != null) {
            c3880e.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C3892q c3892q = this.f27441b;
        if (c3892q != null) {
            c3892q.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C3892q c3892q = this.f27441b;
        if (c3892q != null && drawable != null && !this.f27442c) {
            c3892q.h(drawable);
        }
        super.setImageDrawable(drawable);
        C3892q c3892q2 = this.f27441b;
        if (c3892q2 != null) {
            c3892q2.c();
            if (this.f27442c) {
                return;
            }
            this.f27441b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f27442c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f27441b.i(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C3892q c3892q = this.f27441b;
        if (c3892q != null) {
            c3892q.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3880e c3880e = this.f27440a;
        if (c3880e != null) {
            c3880e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3880e c3880e = this.f27440a;
        if (c3880e != null) {
            c3880e.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C3892q c3892q = this.f27441b;
        if (c3892q != null) {
            c3892q.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C3892q c3892q = this.f27441b;
        if (c3892q != null) {
            c3892q.k(mode);
        }
    }

    public C3891p(Context context, AttributeSet attributeSet, int i10) {
        super(Y.b(context), attributeSet, i10);
        this.f27442c = false;
        X.a(this, getContext());
        C3880e c3880e = new C3880e(this);
        this.f27440a = c3880e;
        c3880e.e(attributeSet, i10);
        C3892q c3892q = new C3892q(this);
        this.f27441b = c3892q;
        c3892q.g(attributeSet, i10);
    }
}
