package p;

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
import com.google.android.gms.internal.ads.be1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class v extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final be1 f30890a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.a0 f30891b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30892c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        e3.a(context);
        this.f30892c = false;
        d3.a(getContext(), this);
        be1 be1Var = new be1(this);
        this.f30890a = be1Var;
        be1Var.x(attributeSet, i4);
        com.google.android.gms.common.api.internal.a0 a0Var = new com.google.android.gms.common.api.internal.a0(this);
        this.f30891b = a0Var;
        a0Var.j(attributeSet, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        be1 be1Var = this.f30890a;
        if (be1Var != null) {
            be1Var.a();
        }
        com.google.android.gms.common.api.internal.a0 a0Var = this.f30891b;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        be1 be1Var = this.f30890a;
        if (be1Var != null) {
            return be1Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        be1 be1Var = this.f30890a;
        if (be1Var != null) {
            return be1Var.v();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        ah.f fVar;
        com.google.android.gms.common.api.internal.a0 a0Var = this.f30891b;
        if (a0Var == null || (fVar = (ah.f) a0Var.f9071d) == null) {
            return null;
        }
        return (ColorStateList) fVar.f382c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        ah.f fVar;
        com.google.android.gms.common.api.internal.a0 a0Var = this.f30891b;
        if (a0Var == null || (fVar = (ah.f) a0Var.f9071d) == null) {
            return null;
        }
        return (PorterDuff.Mode) fVar.f383d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f30891b.f9070c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        be1 be1Var = this.f30890a;
        if (be1Var != null) {
            be1Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        be1 be1Var = this.f30890a;
        if (be1Var != null) {
            be1Var.A(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        com.google.android.gms.common.api.internal.a0 a0Var = this.f30891b;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        com.google.android.gms.common.api.internal.a0 a0Var = this.f30891b;
        if (a0Var != null && drawable != null && !this.f30892c) {
            a0Var.f9069b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (a0Var != null) {
            a0Var.a();
            if (this.f30892c) {
                return;
            }
            ImageView imageView = (ImageView) a0Var.f9070c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(a0Var.f9069b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i4) {
        super.setImageLevel(i4);
        this.f30892c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        this.f30891b.m(i4);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        com.google.android.gms.common.api.internal.a0 a0Var = this.f30891b;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        be1 be1Var = this.f30890a;
        if (be1Var != null) {
            be1Var.F(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        be1 be1Var = this.f30890a;
        if (be1Var != null) {
            be1Var.G(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        com.google.android.gms.common.api.internal.a0 a0Var = this.f30891b;
        if (a0Var != null) {
            if (((ah.f) a0Var.f9071d) == null) {
                a0Var.f9071d = new ah.f();
            }
            ah.f fVar = (ah.f) a0Var.f9071d;
            fVar.f382c = colorStateList;
            fVar.f381b = true;
            a0Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        com.google.android.gms.common.api.internal.a0 a0Var = this.f30891b;
        if (a0Var != null) {
            if (((ah.f) a0Var.f9071d) == null) {
                a0Var.f9071d = new ah.f();
            }
            ah.f fVar = (ah.f) a0Var.f9071d;
            fVar.f383d = mode;
            fVar.f380a = true;
            a0Var.a();
        }
    }
}
