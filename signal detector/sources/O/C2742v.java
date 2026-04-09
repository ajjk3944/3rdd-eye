package o;

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
import androidx.recyclerview.widget.C0305b;

/* renamed from: o.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2742v extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0305b f22645a;

    /* renamed from: b, reason: collision with root package name */
    public final I.d f22646b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2742v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        X0.a(context);
        this.f22647c = false;
        W0.a(getContext(), this);
        C0305b c0305b = new C0305b(this);
        this.f22645a = c0305b;
        c0305b.k(attributeSet, i);
        I.d dVar = new I.d(this);
        this.f22646b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0305b c0305b = this.f22645a;
        if (c0305b != null) {
            c0305b.a();
        }
        I.d dVar = this.f22646b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0305b c0305b = this.f22645a;
        if (c0305b != null) {
            return c0305b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0305b c0305b = this.f22645a;
        if (c0305b != null) {
            return c0305b.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        Y0 y02;
        I.d dVar = this.f22646b;
        if (dVar == null || (y02 = (Y0) dVar.f1852d) == null) {
            return null;
        }
        return y02.f22471a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        Y0 y02;
        I.d dVar = this.f22646b;
        if (dVar == null || (y02 = (Y0) dVar.f1852d) == null) {
            return null;
        }
        return y02.f22472b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f22646b.f1851c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0305b c0305b = this.f22645a;
        if (c0305b != null) {
            c0305b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0305b c0305b = this.f22645a;
        if (c0305b != null) {
            c0305b.n(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        I.d dVar = this.f22646b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        I.d dVar = this.f22646b;
        if (dVar != null && drawable != null && !this.f22647c) {
            dVar.f1850b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f22647c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f1851c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f1850b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f22647c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f22646b.e(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        I.d dVar = this.f22646b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0305b c0305b = this.f22645a;
        if (c0305b != null) {
            c0305b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0305b c0305b = this.f22645a;
        if (c0305b != null) {
            c0305b.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        I.d dVar = this.f22646b;
        if (dVar != null) {
            if (((Y0) dVar.f1852d) == null) {
                dVar.f1852d = new Y0();
            }
            Y0 y02 = (Y0) dVar.f1852d;
            y02.f22471a = colorStateList;
            y02.f22474d = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        I.d dVar = this.f22646b;
        if (dVar != null) {
            if (((Y0) dVar.f1852d) == null) {
                dVar.f1852d = new Y0();
            }
            Y0 y02 = (Y0) dVar.f1852d;
            y02.f22472b = mode;
            y02.f22473c = true;
            dVar.a();
        }
    }
}
