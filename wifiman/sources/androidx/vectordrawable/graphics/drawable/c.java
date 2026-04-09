package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
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
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import o.C7010a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v1.h;
import v1.k;
import x1.AbstractC8416a;

/* loaded from: classes.dex */
public class c extends e implements Animatable {

    /* renamed from: b, reason: collision with root package name */
    private C1133c f32541b;

    /* renamed from: c, reason: collision with root package name */
    private Context f32542c;

    /* renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f32543d;

    /* renamed from: e, reason: collision with root package name */
    d f32544e;

    /* renamed from: f, reason: collision with root package name */
    private Animator.AnimatorListener f32545f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList f32546g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable.Callback f32547h;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f32546g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f32546g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C1133c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f32550a;

        /* renamed from: b, reason: collision with root package name */
        f f32551b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f32552c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f32553d;

        /* renamed from: e, reason: collision with root package name */
        C7010a f32554e;

        public C1133c(Context context, C1133c c1133c, Drawable.Callback callback, Resources resources) {
            if (c1133c != null) {
                this.f32550a = c1133c.f32550a;
                f fVar = c1133c.f32551b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f32551b = (f) constantState.newDrawable(resources);
                    } else {
                        this.f32551b = (f) constantState.newDrawable();
                    }
                    f fVar2 = (f) this.f32551b.mutate();
                    this.f32551b = fVar2;
                    fVar2.setCallback(callback);
                    this.f32551b.setBounds(c1133c.f32551b.getBounds());
                    this.f32551b.g(false);
                }
                ArrayList arrayList = c1133c.f32553d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f32553d = new ArrayList(size);
                    this.f32554e = new C7010a(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = (Animator) c1133c.f32553d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = (String) c1133c.f32554e.get(animator);
                        animatorClone.setTarget(this.f32551b.c(str));
                        this.f32553d.add(animatorClone);
                        this.f32554e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f32552c == null) {
                this.f32552c = new AnimatorSet();
            }
            this.f32552c.playTogether(this.f32553d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f32550a;
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

    c() {
        this(null, null, null);
    }

    public static c a(Context context, int i10) {
        c cVar = new c(context);
        Drawable drawableE = h.e(context.getResources(), i10, context.getTheme());
        cVar.f32556a = drawableE;
        drawableE.setCallback(cVar.f32547h);
        cVar.f32544e = new d(cVar.f32556a.getConstantState());
        return cVar;
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f32545f;
        if (animatorListener != null) {
            this.f32541b.f32552c.removeListener(animatorListener);
            this.f32545f = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f32541b.f32551b.c(str));
        C1133c c1133c = this.f32541b;
        if (c1133c.f32553d == null) {
            c1133c.f32553d = new ArrayList();
            this.f32541b.f32554e = new C7010a();
        }
        this.f32541b.f32553d.add(animator);
        this.f32541b.f32554e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            AbstractC8416a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f32546g == null) {
            this.f32546g = new ArrayList();
        }
        if (this.f32546g.contains(bVar)) {
            return;
        }
        this.f32546g.add(bVar);
        if (this.f32545f == null) {
            this.f32545f = new b();
        }
        this.f32541b.f32552c.addListener(this.f32545f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            return AbstractC8416a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f32541b.f32551b.draw(canvas);
        if (this.f32541b.f32552c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f32546g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f32546g.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f32556a;
        return drawable != null ? AbstractC8416a.d(drawable) : this.f32541b.f32551b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f32556a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f32541b.f32550a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f32556a;
        return drawable != null ? AbstractC8416a.e(drawable) : this.f32541b.f32551b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f32556a != null) {
            return new d(this.f32556a.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f32556a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f32541b.f32551b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f32556a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f32541b.f32551b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f32556a;
        return drawable != null ? drawable.getOpacity() : this.f32541b.f32551b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            AbstractC8416a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f32531e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarB = f.b(resources, resourceId, theme);
                        fVarB.g(false);
                        fVarB.setCallback(this.f32547h);
                        f fVar = this.f32541b.f32551b;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        this.f32541b.f32551b = fVarB;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f32532f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f32542c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, androidx.vectordrawable.graphics.drawable.d.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f32541b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f32556a;
        return drawable != null ? AbstractC8416a.h(drawable) : this.f32541b.f32551b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f32556a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f32541b.f32552c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f32556a;
        return drawable != null ? drawable.isStateful() : this.f32541b.f32551b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f32541b.f32551b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f32556a;
        return drawable != null ? drawable.setLevel(i10) : this.f32541b.f32551b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f32556a;
        return drawable != null ? drawable.setState(iArr) : this.f32541b.f32551b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f32541b.f32551b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            AbstractC8416a.j(drawable, z10);
        } else {
            this.f32541b.f32551b.setAutoMirrored(z10);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            AbstractC8416a.n(drawable, i10);
        } else {
            this.f32541b.f32551b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            AbstractC8416a.o(drawable, colorStateList);
        } else {
            this.f32541b.f32551b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            AbstractC8416a.p(drawable, mode);
        } else {
            this.f32541b.f32551b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f32541b.f32551b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f32541b.f32552c.isStarted()) {
                return;
            }
            this.f32541b.f32552c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f32541b.f32552c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f32556a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f32541b.f32551b.setColorFilter(colorFilter);
        }
    }

    private static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f32555a;

        public d(Drawable.ConstantState constantState) {
            this.f32555a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f32555a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f32555a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f32555a.newDrawable();
            cVar.f32556a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f32547h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f32555a.newDrawable(resources);
            cVar.f32556a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f32547h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f32555a.newDrawable(resources, theme);
            cVar.f32556a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f32547h);
            return cVar;
        }
    }

    private c(Context context, C1133c c1133c, Resources resources) {
        this.f32543d = null;
        this.f32545f = null;
        this.f32546g = null;
        a aVar = new a();
        this.f32547h = aVar;
        this.f32542c = context;
        if (c1133c != null) {
            this.f32541b = c1133c;
        } else {
            this.f32541b = new C1133c(context, c1133c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
