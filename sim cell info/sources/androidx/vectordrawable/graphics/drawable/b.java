package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class b extends g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    private C0020b f2247c;

    /* renamed from: d, reason: collision with root package name */
    private Context f2248d;

    /* renamed from: e, reason: collision with root package name */
    private ArgbEvaluator f2249e;

    /* renamed from: f, reason: collision with root package name */
    private Animator.AnimatorListener f2250f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<Object> f2251g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable.Callback f2252h;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            b.this.scheduleSelf(runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$b, reason: collision with other inner class name */
    private static class C0020b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f2254a;

        /* renamed from: b, reason: collision with root package name */
        h f2255b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f2256c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f2257d;

        /* renamed from: e, reason: collision with root package name */
        k.a<Animator, String> f2258e;

        public C0020b(Context context, C0020b c0020b, Drawable.Callback callback, Resources resources) {
            if (c0020b != null) {
                this.f2254a = c0020b.f2254a;
                h hVar = c0020b.f2255b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    this.f2255b = (h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    h hVar2 = (h) this.f2255b.mutate();
                    this.f2255b = hVar2;
                    hVar2.setCallback(callback);
                    this.f2255b.setBounds(c0020b.f2255b.getBounds());
                    this.f2255b.h(false);
                }
                ArrayList<Animator> arrayList = c0020b.f2257d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f2257d = new ArrayList<>(size);
                    this.f2258e = new k.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = c0020b.f2257d.get(i2);
                        Animator animatorClone = animator.clone();
                        String str = c0020b.f2258e.get(animator);
                        animatorClone.setTarget(this.f2255b.d(str));
                        this.f2257d.add(animatorClone);
                        this.f2258e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f2256c == null) {
                this.f2256c = new AnimatorSet();
            }
            this.f2256c.playTogether(this.f2257d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2254a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f2259a;

        public c(Drawable.ConstantState constantState) {
            this.f2259a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2259a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2259a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f2259a.newDrawable();
            bVar.f2264b = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f2252h);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f2259a.newDrawable(resources);
            bVar.f2264b = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f2252h);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f2259a.newDrawable(resources, theme);
            bVar.f2264b = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f2252h);
            return bVar;
        }
    }

    b() {
        this(null, null, null);
    }

    private b(Context context) {
        this(context, null, null);
    }

    private b(Context context, C0020b c0020b, Resources resources) {
        this.f2249e = null;
        this.f2250f = null;
        this.f2251g = null;
        a aVar = new a();
        this.f2252h = aVar;
        this.f2248d = context;
        if (c0020b != null) {
            this.f2247c = c0020b;
        } else {
            this.f2247c = new C0020b(context, c0020b, aVar, resources);
        }
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f2247c.f2255b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        C0020b c0020b = this.f2247c;
        if (c0020b.f2257d == null) {
            c0020b.f2257d = new ArrayList<>();
            this.f2247c.f2258e = new k.a<>();
        }
        this.f2247c.f2257d.add(animator);
        this.f2247c.f2258e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                c(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f2249e == null) {
                    this.f2249e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f2249e);
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            u.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            return u.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f2247c.f2255b.draw(canvas);
        if (this.f2247c.f2256c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2264b;
        return drawable != null ? u.a.c(drawable) : this.f2247c.f2255b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2264b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2247c.f2254a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2264b;
        return drawable != null ? u.a.d(drawable) : this.f2247c.f2255b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2264b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f2264b.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2264b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2247c.f2255b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2264b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2247c.f2255b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2264b;
        return drawable != null ? drawable.getOpacity() : this.f2247c.f2255b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainAttributes;
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            u.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    typedArrayObtainAttributes = s.g.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2239e);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h hVarB = h.b(resources, resourceId, theme);
                        hVarB.h(false);
                        hVarB.setCallback(this.f2252h);
                        h hVar = this.f2247c.f2255b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f2247c.f2255b = hVarB;
                    }
                } else if ("target".equals(name)) {
                    typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f2240f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2248d;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, d.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                typedArrayObtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f2247c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2264b;
        return drawable != null ? u.a.g(drawable) : this.f2247c.f2255b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f2264b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2247c.f2256c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f2264b;
        return drawable != null ? drawable.isStateful() : this.f2247c.f2255b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2247c.f2255b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f2264b;
        return drawable != null ? drawable.setLevel(i2) : this.f2247c.f2255b.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2264b;
        return drawable != null ? drawable.setState(iArr) : this.f2247c.f2255b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f2247c.f2255b.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            u.a.i(drawable, z2);
        } else {
            this.f2247c.f2255b.setAutoMirrored(z2);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2247c.f2255b.setColorFilter(colorFilter);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z2) {
        super.setFilterBitmap(z2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, u.b
    public void setTint(int i2) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            u.a.m(drawable, i2);
        } else {
            this.f2247c.f2255b.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable, u.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            u.a.n(drawable, colorStateList);
        } else {
            this.f2247c.f2255b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, u.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            u.a.o(drawable, mode);
        } else {
            this.f2247c.f2255b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f2247c.f2255b.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f2247c.f2256c.isStarted()) {
                return;
            }
            this.f2247c.f2256c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2247c.f2256c.end();
        }
    }
}
