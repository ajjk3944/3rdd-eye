package k6;

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
import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends h implements Animatable {
    public static final /* synthetic */ int g = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Context f27977c;

    /* renamed from: d, reason: collision with root package name */
    public ad.g f27978d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f27979e = null;

    /* renamed from: f, reason: collision with root package name */
    public final k.f f27980f = new k.f(this);

    /* renamed from: b, reason: collision with root package name */
    public final c f27976b = new c();

    public e(Context context, int i4) {
        this.f27977c = context;
    }

    @Override // k6.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f27976b;
        cVar.f27970a.draw(canvas);
        if (cVar.f27971b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.getAlpha() : this.f27976b.f27970a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f27976b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.getColorFilter() : this.f27976b.f27970a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f27984a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(0, this.f27984a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f27976b.f27970a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f27976b.f27970a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.getOpacity() : this.f27976b.f27970a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0182, code lost:
    
        if (r8.f27971b != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0184, code lost:
    
        r8.f27971b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018b, code lost:
    
        r8.f27971b.playTogether(r8.f27972c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0192, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.e.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.isAutoMirrored() : this.f27976b.f27970a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f27984a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f27976b.f27971b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.isStateful() : this.f27976b.f27970a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f27976b.f27970a.setBounds(rect);
        }
    }

    @Override // k6.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.setLevel(i4) : this.f27976b.f27970a.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f27984a;
        return drawable != null ? drawable.setState(iArr) : this.f27976b.f27970a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else {
            this.f27976b.f27970a.setAlpha(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f27976b.f27970a.setAutoMirrored(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f27976b.f27970a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            z3.u(drawable, i4);
        } else {
            this.f27976b.f27970a.setTint(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f27976b.f27970a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f27976b.f27970a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z10) {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            return drawable.setVisible(z3, z10);
        }
        this.f27976b.f27970a.setVisible(z3, z10);
        return super.setVisible(z3, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f27976b;
        if (cVar.f27971b.isStarted()) {
            return;
        }
        cVar.f27971b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f27984a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f27976b.f27971b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
