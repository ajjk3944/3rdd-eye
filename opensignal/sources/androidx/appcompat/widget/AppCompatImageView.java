package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import bc.f0;
import d5.z0;
import p.h2;
import p.i2;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final h7.b f961a;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f962d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f963g;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h7.b bVar = this.f961a;
        if (bVar != null) {
            bVar.a();
        }
        f0 f0Var = this.f962d;
        if (f0Var != null) {
            f0Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        h7.b bVar = this.f961a;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h7.b bVar = this.f961a;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        z0 z0Var;
        f0 f0Var = this.f962d;
        if (f0Var == null || (z0Var = (z0) f0Var.f2604r) == null) {
            return null;
        }
        return (ColorStateList) z0Var.f7144d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        z0 z0Var;
        f0 f0Var = this.f962d;
        if (f0Var == null || (z0Var = (z0) f0Var.f2604r) == null) {
            return null;
        }
        return (PorterDuff.Mode) z0Var.f7145e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f962d.f2603g).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h7.b bVar = this.f961a;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        h7.b bVar = this.f961a;
        if (bVar != null) {
            bVar.n(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        f0 f0Var = this.f962d;
        if (f0Var != null) {
            f0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        f0 f0Var = this.f962d;
        if (f0Var != null && drawable != null && !this.f963g) {
            f0Var.f2602d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (f0Var != null) {
            f0Var.a();
            if (this.f963g) {
                return;
            }
            ImageView imageView = (ImageView) f0Var.f2603g;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(f0Var.f2602d);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f963g = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        f0 f0Var = this.f962d;
        if (f0Var != null) {
            f0Var.t(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        f0 f0Var = this.f962d;
        if (f0Var != null) {
            f0Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h7.b bVar = this.f961a;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h7.b bVar = this.f961a;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        f0 f0Var = this.f962d;
        if (f0Var != null) {
            if (((z0) f0Var.f2604r) == null) {
                f0Var.f2604r = new z0(3);
            }
            z0 z0Var = (z0) f0Var.f2604r;
            z0Var.f7144d = colorStateList;
            z0Var.f7143c = true;
            f0Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        f0 f0Var = this.f962d;
        if (f0Var != null) {
            if (((z0) f0Var.f2604r) == null) {
                f0Var.f2604r = new z0(3);
            }
            z0 z0Var = (z0) f0Var.f2604r;
            z0Var.f7145e = mode;
            z0Var.f7142b = true;
            f0Var.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i2.a(context);
        this.f963g = false;
        h2.a(getContext(), this);
        h7.b bVar = new h7.b(this);
        this.f961a = bVar;
        bVar.k(attributeSet, i10);
        f0 f0Var = new f0(this);
        this.f962d = f0Var;
        f0Var.j(attributeSet, i10);
    }
}
