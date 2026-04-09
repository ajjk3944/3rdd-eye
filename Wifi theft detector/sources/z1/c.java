package z1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
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
import android.util.Log;
import android.util.Xml;
import i0.i;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c extends g implements Animatable {

    /* renamed from: b, reason: collision with root package name */
    public C0508c f25230b;

    /* renamed from: c, reason: collision with root package name */
    public Context f25231c;

    /* renamed from: d, reason: collision with root package name */
    public ArgbEvaluator f25232d;

    /* renamed from: e, reason: collision with root package name */
    public d f25233e;

    /* renamed from: f, reason: collision with root package name */
    public Animator.AnimatorListener f25234f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f25235g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable.Callback f25236h;

    public class a implements Drawable.Callback {
        public a() {
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

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f25235g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((z1.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f25235g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((z1.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* renamed from: z1.c$c, reason: collision with other inner class name */
    public static class C0508c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f25239a;

        /* renamed from: b, reason: collision with root package name */
        public h f25240b;

        /* renamed from: c, reason: collision with root package name */
        public AnimatorSet f25241c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f25242d;

        /* renamed from: e, reason: collision with root package name */
        public r.a f25243e;

        public C0508c(Context context, C0508c c0508c, Drawable.Callback callback, Resources resources) {
            if (c0508c != null) {
                this.f25239a = c0508c.f25239a;
                h hVar = c0508c.f25240b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f25240b = (h) constantState.newDrawable(resources);
                    } else {
                        this.f25240b = (h) constantState.newDrawable();
                    }
                    h hVar2 = (h) this.f25240b.mutate();
                    this.f25240b = hVar2;
                    hVar2.setCallback(callback);
                    this.f25240b.setBounds(c0508c.f25240b.getBounds());
                    this.f25240b.h(false);
                }
                ArrayList arrayList = c0508c.f25242d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f25242d = new ArrayList(size);
                    this.f25243e = new r.a(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = (Animator) c0508c.f25242d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = (String) c0508c.f25243e.get(animator);
                        animatorClone.setTarget(this.f25240b.d(str));
                        this.f25242d.add(animatorClone);
                        this.f25243e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f25241c == null) {
                this.f25241c = new AnimatorSet();
            }
            this.f25241c.playTogether(this.f25242d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f25239a;
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

    public c() {
        this(null, null, null);
    }

    public static c a(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            c cVar = new c(context);
            Drawable drawableE = androidx.core.content.res.a.e(context.getResources(), i10, context.getTheme());
            cVar.f25247a = drawableE;
            drawableE.setCallback(cVar.f25236h);
            cVar.f25233e = new d(cVar.f25247a.getConstantState());
            return cVar;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i10);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return b(context, context.getResources(), xml, attributeSetAsAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e("AnimatedVDCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("AnimatedVDCompat", "parser error", e11);
            return null;
        }
    }

    public static c b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public static void d(AnimatedVectorDrawable animatedVectorDrawable, z1.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    public static boolean h(AnimatedVectorDrawable animatedVectorDrawable, z1.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            k0.a.a(drawable, theme);
        }
    }

    public void c(z1.b bVar) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            d((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f25235g == null) {
            this.f25235g = new ArrayList();
        }
        if (this.f25235g.contains(bVar)) {
            return;
        }
        this.f25235g.add(bVar);
        if (this.f25234f == null) {
            this.f25234f = new b();
        }
        this.f25230b.f25241c.addListener(this.f25234f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            return k0.a.b(drawable);
        }
        return false;
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f25230b.f25240b.draw(canvas);
        if (this.f25230b.f25241c.isStarted()) {
            invalidateSelf();
        }
    }

    public final void e() {
        Animator.AnimatorListener animatorListener = this.f25234f;
        if (animatorListener != null) {
            this.f25230b.f25241c.removeListener(animatorListener);
            this.f25234f = null;
        }
    }

    public final void f(String str, Animator animator) {
        animator.setTarget(this.f25230b.f25240b.d(str));
        C0508c c0508c = this.f25230b;
        if (c0508c.f25242d == null) {
            c0508c.f25242d = new ArrayList();
            this.f25230b.f25243e = new r.a();
        }
        this.f25230b.f25242d.add(animator);
        this.f25230b.f25243e.put(animator, str);
    }

    public boolean g(z1.b bVar) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            h((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f25235g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f25235g.size() == 0) {
            e();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f25247a;
        return drawable != null ? k0.a.d(drawable) : this.f25230b.f25240b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f25247a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f25230b.f25239a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f25247a;
        return drawable != null ? k0.a.e(drawable) : this.f25230b.f25240b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f25247a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f25247a.getConstantState());
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f25247a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f25230b.f25240b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f25247a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f25230b.f25240b.getIntrinsicWidth();
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f25247a;
        return drawable != null ? drawable.getOpacity() : this.f25230b.f25240b.getOpacity();
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            k0.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayK = i.k(resources, theme, attributeSet, z1.a.f25220e);
                    int resourceId = typedArrayK.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h hVarB = h.b(resources, resourceId, theme);
                        hVarB.h(false);
                        hVarB.setCallback(this.f25236h);
                        h hVar = this.f25230b.f25240b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f25230b.f25240b = hVarB;
                    }
                    typedArrayK.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, z1.a.f25221f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f25231c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        f(string, e.i(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f25230b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f25247a;
        return drawable != null ? k0.a.h(drawable) : this.f25230b.f25240b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f25247a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f25230b.f25241c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f25247a;
        return drawable != null ? drawable.isStateful() : this.f25230b.f25240b.isStateful();
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f25230b.f25240b.setBounds(rect);
        }
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f25247a;
        return drawable != null ? drawable.setLevel(i10) : this.f25230b.f25240b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f25247a;
        return drawable != null ? drawable.setState(iArr) : this.f25230b.f25240b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f25230b.f25240b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            k0.a.j(drawable, z10);
        } else {
            this.f25230b.f25240b.setAutoMirrored(z10);
        }
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // z1.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            k0.a.n(drawable, i10);
        } else {
            this.f25230b.f25240b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            k0.a.o(drawable, colorStateList);
        } else {
            this.f25230b.f25240b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            k0.a.p(drawable, mode);
        } else {
            this.f25230b.f25240b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f25230b.f25240b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f25230b.f25241c.isStarted()) {
                return;
            }
            this.f25230b.f25241c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f25230b.f25241c.end();
        }
    }

    public c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f25247a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f25230b.f25240b.setColorFilter(colorFilter);
        }
    }

    public static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f25244a;

        public d(Drawable.ConstantState constantState) {
            this.f25244a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f25244a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f25244a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f25244a.newDrawable();
            cVar.f25247a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f25236h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f25244a.newDrawable(resources);
            cVar.f25247a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f25236h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f25244a.newDrawable(resources, theme);
            cVar.f25247a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f25236h);
            return cVar;
        }
    }

    public c(Context context, C0508c c0508c, Resources resources) {
        this.f25232d = null;
        this.f25234f = null;
        this.f25235g = null;
        a aVar = new a();
        this.f25236h = aVar;
        this.f25231c = context;
        if (c0508c != null) {
            this.f25230b = c0508c;
        } else {
            this.f25230b = new C0508c(context, c0508c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
