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
import o.C5386d;
import o.C5394l;
import o.S;
import o.U;
import o.V;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: b, reason: collision with root package name */
    public final C5386d f14601b;

    /* renamed from: c, reason: collision with root package name */
    public final C5394l f14602c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14603d;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5386d c5386d = this.f14601b;
        if (c5386d != null) {
            c5386d.a();
        }
        C5394l c5394l = this.f14602c;
        if (c5394l != null) {
            c5394l.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5386d c5386d = this.f14601b;
        if (c5386d != null) {
            return c5386d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5386d c5386d = this.f14601b;
        if (c5386d != null) {
            return c5386d.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        V v10;
        C5394l c5394l = this.f14602c;
        if (c5394l == null || (v10 = c5394l.f44696b) == null) {
            return null;
        }
        return v10.f44603a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        V v10;
        C5394l c5394l = this.f14602c;
        if (c5394l == null || (v10 = c5394l.f44696b) == null) {
            return null;
        }
        return v10.f44604b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f14602c.f44695a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5386d c5386d = this.f14601b;
        if (c5386d != null) {
            c5386d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C5386d c5386d = this.f14601b;
        if (c5386d != null) {
            c5386d.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C5394l c5394l = this.f14602c;
        if (c5394l != null) {
            c5394l.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C5394l c5394l = this.f14602c;
        if (c5394l != null && drawable != null && !this.f14603d) {
            c5394l.f44697c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c5394l != null) {
            c5394l.a();
            if (this.f14603d) {
                return;
            }
            ImageView imageView = c5394l.f44695a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c5394l.f44697c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f14603d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C5394l c5394l = this.f14602c;
        if (c5394l != null) {
            c5394l.c(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C5394l c5394l = this.f14602c;
        if (c5394l != null) {
            c5394l.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5386d c5386d = this.f14601b;
        if (c5386d != null) {
            c5386d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5386d c5386d = this.f14601b;
        if (c5386d != null) {
            c5386d.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C5394l c5394l = this.f14602c;
        if (c5394l != null) {
            if (c5394l.f44696b == null) {
                c5394l.f44696b = new V();
            }
            V v10 = c5394l.f44696b;
            v10.f44603a = colorStateList;
            v10.f44606d = true;
            c5394l.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C5394l c5394l = this.f14602c;
        if (c5394l != null) {
            if (c5394l.f44696b == null) {
                c5394l.f44696b = new V();
            }
            V v10 = c5394l.f44696b;
            v10.f44604b = mode;
            v10.f44605c = true;
            c5394l.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        U.a(context);
        this.f14603d = false;
        S.a(this, getContext());
        C5386d c5386d = new C5386d(this);
        this.f14601b = c5386d;
        c5386d.d(attributeSet, i);
        C5394l c5394l = new C5394l(this);
        this.f14602c = c5394l;
        c5394l.b(attributeSet, i);
    }
}
