package L1;

import D0.a;
import android.animation.Animator;
import android.animation.AnimatorSet;
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
import java.io.IOException;
import java.util.ArrayList;
import m0.C5308a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class d extends h implements Animatable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f3952h = 0;

    /* renamed from: c, reason: collision with root package name */
    public final b f3953c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f3954d;

    /* renamed from: e, reason: collision with root package name */
    public e f3955e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<L1.c> f3956f;

    /* renamed from: g, reason: collision with root package name */
    public final a f3957g;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            d.this.scheduleSelf(runnable, j4);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            d.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public i f3959a;

        /* renamed from: b, reason: collision with root package name */
        public AnimatorSet f3960b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<Animator> f3961c;

        /* renamed from: d, reason: collision with root package name */
        public C5308a<Animator, String> f3962d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public d(Context context) {
        this.f3955e = null;
        this.f3956f = null;
        this.f3957g = new a();
        this.f3954d = context;
        this.f3953c = new b();
    }

    @Override // L1.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            a.C0009a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            return a.C0009a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f3953c;
        bVar.f3959a.draw(canvas);
        if (bVar.f3960b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.getAlpha() : this.f3953c.f3959a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3953c.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3968b;
        return drawable != null ? a.C0009a.c(drawable) : this.f3953c.f3959a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3968b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f3968b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3953c.f3959a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3953c.f3959a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.getOpacity() : this.f3953c.f3959a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x017f, code lost:
    
        if (r8.f3960b != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0181, code lost:
    
        r8.f3960b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0188, code lost:
    
        r8.f3960b.playTogether(r8.f3961c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.isAutoMirrored() : this.f3953c.f3959a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3968b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3953c.f3960b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.isStateful() : this.f3953c.f3959a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3953c.f3959a.setBounds(rect);
        }
    }

    @Override // L1.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.setLevel(i) : this.f3953c.f3959a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3968b;
        return drawable != null ? drawable.setState(iArr) : this.f3953c.f3959a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3953c.f3959a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f3953c.f3959a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3953c.f3959a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            D0.a.a(drawable, i);
        } else {
            this.f3953c.f3959a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            D0.a.b(drawable, colorStateList);
        } else {
            this.f3953c.f3959a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            D0.a.c(drawable, mode);
        } else {
            this.f3953c.f3959a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f3953c.f3959a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f3953c;
        if (bVar.f3960b.isStarted()) {
            return;
        }
        bVar.f3960b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3968b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3953c.f3960b.end();
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f3963a;

        public c(Drawable.ConstantState constantState) {
            this.f3963a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f3963a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f3963a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            d dVar = new d();
            Drawable drawableNewDrawable = this.f3963a.newDrawable();
            dVar.f3968b = drawableNewDrawable;
            drawableNewDrawable.setCallback(dVar.f3957g);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            d dVar = new d();
            Drawable drawableNewDrawable = this.f3963a.newDrawable(resources);
            dVar.f3968b = drawableNewDrawable;
            drawableNewDrawable.setCallback(dVar.f3957g);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            Drawable drawableNewDrawable = this.f3963a.newDrawable(resources, theme);
            dVar.f3968b = drawableNewDrawable;
            drawableNewDrawable.setCallback(dVar.f3957g);
            return dVar;
        }
    }

    public d() {
        this(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
