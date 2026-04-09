package androidx.appcompat.widget;

import D0.a;
import L0.G;
import L0.I;
import R0.h;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.c;
import g.C4353a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import l.C5262a;
import o.C5375C;
import o.C5392j;
import o.C5404w;
import o.S;
import o.X;
import o.f0;
import z0.C5848a;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: S, reason: collision with root package name */
    public static final a f14656S = new a(Float.class, "thumbPos");

    /* renamed from: T, reason: collision with root package name */
    public static final int[] f14657T = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public float f14658A;

    /* renamed from: B, reason: collision with root package name */
    public int f14659B;

    /* renamed from: C, reason: collision with root package name */
    public int f14660C;

    /* renamed from: D, reason: collision with root package name */
    public int f14661D;

    /* renamed from: E, reason: collision with root package name */
    public int f14662E;

    /* renamed from: F, reason: collision with root package name */
    public int f14663F;

    /* renamed from: G, reason: collision with root package name */
    public int f14664G;

    /* renamed from: H, reason: collision with root package name */
    public int f14665H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f14666I;

    /* renamed from: J, reason: collision with root package name */
    public final TextPaint f14667J;

    /* renamed from: K, reason: collision with root package name */
    public final ColorStateList f14668K;

    /* renamed from: L, reason: collision with root package name */
    public StaticLayout f14669L;

    /* renamed from: M, reason: collision with root package name */
    public StaticLayout f14670M;

    /* renamed from: N, reason: collision with root package name */
    public final C5262a f14671N;

    /* renamed from: O, reason: collision with root package name */
    public ObjectAnimator f14672O;

    /* renamed from: P, reason: collision with root package name */
    public C5392j f14673P;

    /* renamed from: Q, reason: collision with root package name */
    public b f14674Q;

    /* renamed from: R, reason: collision with root package name */
    public final Rect f14675R;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f14676b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f14677c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f14678d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14679e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14680f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f14681g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f14682h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14683j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14684k;

    /* renamed from: l, reason: collision with root package name */
    public int f14685l;

    /* renamed from: m, reason: collision with root package name */
    public int f14686m;

    /* renamed from: n, reason: collision with root package name */
    public int f14687n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14688o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f14689p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f14690q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f14691r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f14692s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14693t;

    /* renamed from: u, reason: collision with root package name */
    public int f14694u;

    /* renamed from: v, reason: collision with root package name */
    public final int f14695v;

    /* renamed from: w, reason: collision with root package name */
    public float f14696w;

    /* renamed from: x, reason: collision with root package name */
    public float f14697x;

    /* renamed from: y, reason: collision with root package name */
    public final VelocityTracker f14698y;

    /* renamed from: z, reason: collision with root package name */
    public final int f14699z;

    public class a extends Property<SwitchCompat, Float> {
        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f14658A);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    public static class b extends c.e {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f14700a;

        public b(SwitchCompat switchCompat) {
            this.f14700a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.c.e
        public final void a() {
            SwitchCompat switchCompat = (SwitchCompat) this.f14700a.get();
            if (switchCompat != null) {
                switchCompat.c();
            }
        }

        @Override // androidx.emoji2.text.c.e
        public final void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f14700a.get();
            if (switchCompat != null) {
                switchCompat.c();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        super(context, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.switchStyle);
        this.f14677c = null;
        this.f14678d = null;
        this.f14679e = false;
        this.f14680f = false;
        this.f14682h = null;
        this.i = null;
        this.f14683j = false;
        this.f14684k = false;
        this.f14698y = VelocityTracker.obtain();
        this.f14666I = true;
        this.f14675R = new Rect();
        S.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f14667J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C4353a.f37896v;
        X xE = X.e(context, attributeSet, iArr, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.switchStyle);
        I.n(this, context, iArr, attributeSet, xE.f44608b, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.switchStyle);
        Drawable drawableB = xE.b(2);
        this.f14676b = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(this);
        }
        Drawable drawableB2 = xE.b(11);
        this.f14681g = drawableB2;
        if (drawableB2 != null) {
            drawableB2.setCallback(this);
        }
        TypedArray typedArray = xE.f44608b;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f14693t = typedArray.getBoolean(3, true);
        this.f14685l = typedArray.getDimensionPixelSize(8, 0);
        this.f14686m = typedArray.getDimensionPixelSize(5, 0);
        this.f14687n = typedArray.getDimensionPixelSize(6, 0);
        this.f14688o = typedArray.getBoolean(4, false);
        ColorStateList colorStateListA = xE.a(9);
        if (colorStateListA != null) {
            this.f14677c = colorStateListA;
            this.f14679e = true;
        }
        PorterDuff.Mode modeC = C5375C.c(typedArray.getInt(10, -1), null);
        if (this.f14678d != modeC) {
            this.f14678d = modeC;
            this.f14680f = true;
        }
        if (this.f14679e || this.f14680f) {
            a();
        }
        ColorStateList colorStateListA2 = xE.a(12);
        if (colorStateListA2 != null) {
            this.f14682h = colorStateListA2;
            this.f14683j = true;
        }
        PorterDuff.Mode modeC2 = C5375C.c(typedArray.getInt(13, -1), null);
        if (this.i != modeC2) {
            this.i = modeC2;
            this.f14684k = true;
        }
        if (this.f14683j || this.f14684k) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, C4353a.f37897w);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = C5848a.getColorStateList(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f14668K = colorStateList;
            } else {
                this.f14668K = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i10 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i10 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
                textPaint.setFakeBoldText((i11 & 1) != 0);
                textPaint.setTextSkewX((2 & i11) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C5262a c5262a = new C5262a();
                c5262a.f43663a = context2.getResources().getConfiguration().locale;
                this.f14671N = c5262a;
            } else {
                this.f14671N = null;
            }
            setTextOnInternal(this.f14689p);
            setTextOffInternal(this.f14691r);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C5404w(this).f(attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.switchStyle);
        xE.f();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f14695v = viewConfiguration.getScaledTouchSlop();
        this.f14699z = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C5392j getEmojiTextViewHelper() {
        if (this.f14673P == null) {
            this.f14673P = new C5392j(this);
        }
        return this.f14673P;
    }

    private boolean getTargetCheckedState() {
        return this.f14658A > 0.5f;
    }

    private int getThumbOffset() {
        boolean z10 = f0.f44665a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f14658A : this.f14658A) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f14681g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f14675R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f14676b;
        Rect rectB = drawable2 != null ? C5375C.b(drawable2) : C5375C.f44492c;
        return ((((this.f14659B - this.f14661D) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f14691r = charSequence;
        C5392j emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE = emojiTextViewHelper.f44691b.f37335a.e(this.f14671N);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.f14692s = charSequence;
        this.f14670M = null;
        if (this.f14693t) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f14689p = charSequence;
        C5392j emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE = emojiTextViewHelper.f44691b.f37335a.e(this.f14671N);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.f14690q = charSequence;
        this.f14669L = null;
        if (this.f14693t) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f14676b;
        if (drawable != null) {
            if (this.f14679e || this.f14680f) {
                Drawable drawableMutate = drawable.mutate();
                this.f14676b = drawableMutate;
                if (this.f14679e) {
                    a.C0009a.h(drawableMutate, this.f14677c);
                }
                if (this.f14680f) {
                    a.C0009a.i(this.f14676b, this.f14678d);
                }
                if (this.f14676b.isStateful()) {
                    this.f14676b.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f14681g;
        if (drawable != null) {
            if (this.f14683j || this.f14684k) {
                Drawable drawableMutate = drawable.mutate();
                this.f14681g = drawableMutate;
                if (this.f14683j) {
                    a.C0009a.h(drawableMutate, this.f14682h);
                }
                if (this.f14684k) {
                    a.C0009a.i(this.f14681g, this.i);
                }
                if (this.f14681g.isStateful()) {
                    this.f14681g.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f14689p);
        setTextOffInternal(this.f14691r);
        requestLayout();
    }

    public final void d() {
        if (this.f14674Q == null && this.f14673P.f44691b.f37335a.b() && androidx.emoji2.text.c.f15714k != null) {
            androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
            int iB = cVarA.b();
            if (iB == 3 || iB == 0) {
                b bVar = new b(this);
                this.f14674Q = bVar;
                cVarA.f(bVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i10;
        int i11 = this.f14662E;
        int i12 = this.f14663F;
        int i13 = this.f14664G;
        int i14 = this.f14665H;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.f14676b;
        Rect rectB = drawable != null ? C5375C.b(drawable) : C5375C.f44492c;
        Drawable drawable2 = this.f14681g;
        Rect rect = this.f14675R;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i15 = rect.left;
            thumbOffset += i15;
            if (rectB != null) {
                int i16 = rectB.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = rectB.top;
                int i18 = rect.top;
                i = i17 > i18 ? (i17 - i18) + i12 : i12;
                int i19 = rectB.right;
                int i20 = rect.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = rectB.bottom;
                int i22 = rect.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                }
                this.f14681g.setBounds(i11, i, i13, i10);
            } else {
                i = i12;
            }
            i10 = i14;
            this.f14681g.setBounds(i11, i, i13, i10);
        }
        Drawable drawable3 = this.f14676b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i23 = thumbOffset - rect.left;
            int i24 = thumbOffset + this.f14661D + rect.right;
            this.f14676b.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                a.C0009a.f(background, i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f14676b;
        if (drawable != null) {
            a.C0009a.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.f14681g;
        if (drawable2 != null) {
            a.C0009a.e(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f14676b;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f14681g;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z10 = f0.f44665a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f14659B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f14687n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z10 = f0.f44665a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f14659B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f14687n : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.f(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f14693t;
    }

    public boolean getSplitTrack() {
        return this.f14688o;
    }

    public int getSwitchMinWidth() {
        return this.f14686m;
    }

    public int getSwitchPadding() {
        return this.f14687n;
    }

    public CharSequence getTextOff() {
        return this.f14691r;
    }

    public CharSequence getTextOn() {
        return this.f14689p;
    }

    public Drawable getThumbDrawable() {
        return this.f14676b;
    }

    public final float getThumbPosition() {
        return this.f14658A;
    }

    public int getThumbTextPadding() {
        return this.f14685l;
    }

    public ColorStateList getThumbTintList() {
        return this.f14677c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f14678d;
    }

    public Drawable getTrackDrawable() {
        return this.f14681g;
    }

    public ColorStateList getTrackTintList() {
        return this.f14682h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14676b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f14681g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f14672O;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f14672O.end();
        this.f14672O = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14657T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f14681g;
        Rect rect = this.f14675R;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f14663F;
        int i10 = this.f14665H;
        int i11 = i + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.f14676b;
        if (drawable != null) {
            if (!this.f14688o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = C5375C.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f14669L : this.f14670M;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f14668K;
            TextPaint textPaint = this.f14667J;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i11 + i12) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f14689p : this.f14691r;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z10, i, i10, i11, i12);
        int iMax2 = 0;
        if (this.f14676b != null) {
            Drawable drawable = this.f14681g;
            Rect rect = this.f14675R;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = C5375C.b(this.f14676b);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z11 = f0.f44665a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f14659B + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f14659B) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i13 = this.f14660C;
            int i14 = height2 - (i13 / 2);
            height = i13 + i14;
            paddingTop = i14;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f14660C + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f14660C;
        }
        this.f14662E = paddingLeft;
        this.f14663F = paddingTop;
        this.f14665H = height;
        this.f14664G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f14693t) {
            StaticLayout staticLayout = this.f14669L;
            TextPaint textPaint = this.f14667J;
            if (staticLayout == null) {
                CharSequence charSequence = this.f14690q;
                this.f14669L = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f14670M == null) {
                CharSequence charSequence2 = this.f14692s;
                this.f14670M = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f14676b;
        Rect rect = this.f14675R;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f14676b.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f14676b.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f14661D = Math.max(this.f14693t ? (this.f14685l * 2) + Math.max(this.f14669L.getWidth(), this.f14670M.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f14681g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f14681g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f14676b;
        if (drawable3 != null) {
            Rect rectB = C5375C.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.f14666I ? Math.max(this.f14686m, (this.f14661D * 2) + iMax + iMax2) : this.f14686m;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f14659B = iMax3;
        this.f14660C = iMax4;
        super.onMeasure(i, i10);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f14689p : this.f14691r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) throws Resources.NotFoundException {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f14689p;
                if (string == null) {
                    string = getResources().getString(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.string.abc_capital_on);
                }
                WeakHashMap<View, L0.S> weakHashMap = I.f3792a;
                new G(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f14691r;
            if (string2 == null) {
                string2 = getResources().getString(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.string.abc_capital_off);
            }
            WeakHashMap<View, L0.S> weakHashMap2 = I.f3792a;
            new G(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f14672O;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f14656S, zIsChecked ? 1.0f : 0.0f);
        this.f14672O = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f14672O.setAutoCancel(true);
        this.f14672O.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.f14689p);
        setTextOffInternal(this.f14691r);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.f14666I = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f14693t != z10) {
            this.f14693t = z10;
            requestLayout();
            if (z10) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f14688o = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f14686m = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f14687n = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f14667J;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f14691r;
        if (string == null) {
            string = getResources().getString(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.string.abc_capital_off);
        }
        WeakHashMap<View, L0.S> weakHashMap = I.f3792a;
        new G(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f14689p;
        if (string == null) {
            string = getResources().getString(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.string.abc_capital_on);
        }
        WeakHashMap<View, L0.S> weakHashMap = I.f3792a;
        new G(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f14676b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14676b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f14658A = f10;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(A9.I.w(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f14685l = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f14677c = colorStateList;
        this.f14679e = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f14678d = mode;
        this.f14680f = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f14681g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14681g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(A9.I.w(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f14682h = colorStateList;
        this.f14683j = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        this.f14684k = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14676b || drawable == this.f14681g;
    }
}
