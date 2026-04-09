package M0;

import B3.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class f extends i implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2635g = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2637c;

    /* renamed from: d, reason: collision with root package name */
    public x f2638d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f2639e = null;

    /* renamed from: f, reason: collision with root package name */
    public final c f2640f = new c(this);

    /* renamed from: b, reason: collision with root package name */
    public final d f2636b = new d();

    public f(Context context, int i) {
        this.f2637c = context;
    }

    @Override // M0.i, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f2636b;
        dVar.f2629a.draw(canvas);
        if (dVar.f2630b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.getAlpha() : this.f2636b.f2629a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f2636b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.getColorFilter() : this.f2636b.f2629a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2644a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new e(0, this.f2644a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2636b.f2629a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2636b.f2629a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.getOpacity() : this.f2636b.f2629a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
    
        if (r8.f2630b != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0135, code lost:
    
        r8.f2630b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013c, code lost:
    
        r8.f2630b.playTogether(r8.f2631c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0143, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.isAutoMirrored() : this.f2636b.f2629a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f2644a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2636b.f2630b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.isStateful() : this.f2636b.f2629a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2636b.f2629a.setBounds(rect);
        }
    }

    @Override // M0.i, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.setLevel(i) : this.f2636b.f2629a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2644a;
        return drawable != null ? drawable.setState(iArr) : this.f2636b.f2629a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f2636b.f2629a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.setAutoMirrored(z6);
        } else {
            this.f2636b.f2629a.setAutoMirrored(z6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2636b.f2629a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            R2.a.G(drawable, i);
        } else {
            this.f2636b.f2629a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f2636b.f2629a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f2636b.f2629a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            return drawable.setVisible(z6, z7);
        }
        this.f2636b.f2629a.setVisible(z6, z7);
        return super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f2636b;
        if (dVar.f2630b.isStarted()) {
            return;
        }
        dVar.f2630b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f2644a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2636b.f2630b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
