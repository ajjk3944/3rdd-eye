package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class p6 extends ImageButton {
    public final fw3 f;
    public final so1 g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        w11.a(context);
        this.h = false;
        n11.a(getContext(), this);
        fw3 fw3Var = new fw3(this);
        this.f = fw3Var;
        fw3Var.k(attributeSet, i);
        so1 so1Var = new so1(this);
        this.g = so1Var;
        so1Var.k(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.a();
        }
        so1 so1Var = this.g;
        if (so1Var != null) {
            so1Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            return fw3Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            return fw3Var.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        gc3 gc3Var;
        so1 so1Var = this.g;
        if (so1Var == null || (gc3Var = (gc3) so1Var.h) == null) {
            return null;
        }
        return (ColorStateList) gc3Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        gc3 gc3Var;
        so1 so1Var = this.g;
        if (so1Var == null || (gc3Var = (gc3) so1Var.h) == null) {
            return null;
        }
        return (PorterDuff.Mode) gc3Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.g.g).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.n(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        so1 so1Var = this.g;
        if (so1Var != null) {
            so1Var.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        so1 so1Var = this.g;
        if (so1Var != null && drawable != null && !this.h) {
            so1Var.f = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (so1Var != null) {
            so1Var.b();
            if (this.h) {
                return;
            }
            ImageView imageView = (ImageView) so1Var.g;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(so1Var.f);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.g.l(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        so1 so1Var = this.g;
        if (so1Var != null) {
            so1Var.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        so1 so1Var = this.g;
        if (so1Var != null) {
            if (((gc3) so1Var.h) == null) {
                so1Var.h = new gc3();
            }
            gc3 gc3Var = (gc3) so1Var.h;
            gc3Var.c = colorStateList;
            gc3Var.b = true;
            so1Var.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        so1 so1Var = this.g;
        if (so1Var != null) {
            if (((gc3) so1Var.h) == null) {
                so1Var.h = new gc3();
            }
            gc3 gc3Var = (gc3) so1Var.h;
            gc3Var.d = mode;
            gc3Var.a = true;
            so1Var.b();
        }
    }
}
