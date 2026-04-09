package d4;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import f4.C5527g;
import f4.C5531k;
import f4.InterfaceC5534n;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5300a extends Drawable implements InterfaceC5534n {

    /* renamed from: a, reason: collision with root package name */
    private b f45752a;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5300a mutate() {
        this.f45752a = new b(this.f45752a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f45752a;
        if (bVar.f45754b) {
            bVar.f45753a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f45752a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f45752a.f45753a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f45752a.f45753a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f45752a.f45753a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zB = AbstractC5301b.b(iArr);
        b bVar = this.f45752a;
        if (bVar.f45754b == zB) {
            return zOnStateChange;
        }
        bVar.f45754b = zB;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f45752a.f45753a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f45752a.f45753a.setColorFilter(colorFilter);
    }

    @Override // f4.InterfaceC5534n
    public void setShapeAppearanceModel(C5531k c5531k) {
        this.f45752a.f45753a.setShapeAppearanceModel(c5531k);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f45752a.f45753a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f45752a.f45753a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f45752a.f45753a.setTintMode(mode);
    }

    public C5300a(C5531k c5531k) {
        this(new b(new C5527g(c5531k)));
    }

    /* renamed from: d4.a$b */
    static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        C5527g f45753a;

        /* renamed from: b, reason: collision with root package name */
        boolean f45754b;

        public b(C5527g c5527g) {
            this.f45753a = c5527g;
            this.f45754b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5300a newDrawable() {
            return new C5300a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f45753a = (C5527g) bVar.f45753a.getConstantState().newDrawable();
            this.f45754b = bVar.f45754b;
        }
    }

    private C5300a(b bVar) {
        this.f45752a = bVar;
    }
}
