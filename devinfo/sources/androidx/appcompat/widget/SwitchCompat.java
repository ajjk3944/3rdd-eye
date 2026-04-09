package androidx.appcompat.widget;

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
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import e4.i0;
import e4.v0;
import i0.f;
import j6.b;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import m.a;
import me.t1;
import p.c3;
import p.d3;
import p.i1;
import p.t0;
import p.u;
import p.v3;
import w4.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final b R = new b(7, Float.class, "thumbPos");
    public static final int[] S = {R.attr.state_checked};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public final ColorStateList J;
    public StaticLayout K;
    public StaticLayout L;
    public final a M;
    public ObjectAnimator N;
    public u O;
    public c3 P;
    public final Rect Q;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f794a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f795b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f796c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f797d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f798e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f799f;
    public ColorStateList g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f800h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f801i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f802k;

    /* renamed from: l, reason: collision with root package name */
    public int f803l;

    /* renamed from: m, reason: collision with root package name */
    public int f804m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f805n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f806o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f807p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f808q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f809r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f810s;

    /* renamed from: t, reason: collision with root package name */
    public int f811t;

    /* renamed from: u, reason: collision with root package name */
    public final int f812u;

    /* renamed from: v, reason: collision with root package name */
    public float f813v;

    /* renamed from: w, reason: collision with root package name */
    public float f814w;

    /* renamed from: x, reason: collision with root package name */
    public final VelocityTracker f815x;

    /* renamed from: y, reason: collision with root package name */
    public final int f816y;

    /* renamed from: z, reason: collision with root package name */
    public float f817z;

    public SwitchCompat(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        super(context, attributeSet, com.liuzh.deviceinfo.R.attr.switchStyle);
        this.f795b = null;
        this.f796c = null;
        this.f797d = false;
        this.f798e = false;
        this.g = null;
        this.f800h = null;
        this.f801i = false;
        this.j = false;
        this.f815x = VelocityTracker.obtain();
        this.H = true;
        this.Q = new Rect();
        d3.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = h.a.f24796w;
        f fVarJ = f.J(context, attributeSet, iArr, com.liuzh.deviceinfo.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) fVarJ.f25417c;
        v0.n(this, context, iArr, attributeSet, typedArray, com.liuzh.deviceinfo.R.attr.switchStyle);
        Drawable drawableA = fVarJ.A(2);
        this.f794a = drawableA;
        if (drawableA != null) {
            drawableA.setCallback(this);
        }
        Drawable drawableA2 = fVarJ.A(11);
        this.f799f = drawableA2;
        if (drawableA2 != null) {
            drawableA2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f810s = typedArray.getBoolean(3, true);
        this.f802k = typedArray.getDimensionPixelSize(8, 0);
        this.f803l = typedArray.getDimensionPixelSize(5, 0);
        this.f804m = typedArray.getDimensionPixelSize(6, 0);
        this.f805n = typedArray.getBoolean(4, false);
        ColorStateList colorStateListY = fVarJ.y(9);
        if (colorStateListY != null) {
            this.f795b = colorStateListY;
            this.f797d = true;
        }
        PorterDuff.Mode modeC = i1.c(typedArray.getInt(10, -1), null);
        if (this.f796c != modeC) {
            this.f796c = modeC;
            this.f798e = true;
        }
        if (this.f797d || this.f798e) {
            a();
        }
        ColorStateList colorStateListY2 = fVarJ.y(12);
        if (colorStateListY2 != null) {
            this.g = colorStateListY2;
            this.f801i = true;
        }
        PorterDuff.Mode modeC2 = i1.c(typedArray.getInt(13, -1), null);
        if (this.f800h != modeC2) {
            this.f800h = modeC2;
            this.j = true;
        }
        if (this.f801i || this.j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, h.a.f24797x);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = wd.b.r(resourceId, context)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.J = colorStateList;
            } else {
                this.J = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i4 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i10 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i4 != 1 ? i4 != 2 ? i4 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
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
                a aVar = new a();
                aVar.f28848a = context2.getResources().getConfiguration().locale;
                this.M = aVar;
            } else {
                this.M = null;
            }
            setTextOnInternal(this.f806o);
            setTextOffInternal(this.f808q);
            typedArrayObtainStyledAttributes.recycle();
        }
        new t0(this).f(attributeSet, com.liuzh.deviceinfo.R.attr.switchStyle);
        fVarJ.M();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f812u = viewConfiguration.getScaledTouchSlop();
        this.f816y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.liuzh.deviceinfo.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private u getEmojiTextViewHelper() {
        if (this.O == null) {
            this.O = new u(this);
        }
        return this.O;
    }

    private boolean getTargetCheckedState() {
        return this.f817z > 0.5f;
    }

    private int getThumbOffset() {
        boolean z3 = v3.f30896a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f817z : this.f817z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f799f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f794a;
        Rect rectB = drawable2 != null ? i1.b(drawable2) : i1.f30715c;
        return ((((this.A - this.C) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f808q = charSequence;
        TransformationMethod transformationMethodH = ((t1) getEmojiTextViewHelper().f30876b.f30011b).H(this.M);
        if (transformationMethodH != null) {
            charSequence = transformationMethodH.getTransformation(charSequence, this);
        }
        this.f809r = charSequence;
        this.L = null;
        if (this.f810s) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f806o = charSequence;
        TransformationMethod transformationMethodH = ((t1) getEmojiTextViewHelper().f30876b.f30011b).H(this.M);
        if (transformationMethodH != null) {
            charSequence = transformationMethodH.getTransformation(charSequence, this);
        }
        this.f807p = charSequence;
        this.K = null;
        if (this.f810s) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f794a;
        if (drawable != null) {
            if (this.f797d || this.f798e) {
                Drawable drawableMutate = drawable.mutate();
                this.f794a = drawableMutate;
                if (this.f797d) {
                    drawableMutate.setTintList(this.f795b);
                }
                if (this.f798e) {
                    this.f794a.setTintMode(this.f796c);
                }
                if (this.f794a.isStateful()) {
                    this.f794a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f799f;
        if (drawable != null) {
            if (this.f801i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f799f = drawableMutate;
                if (this.f801i) {
                    drawableMutate.setTintList(this.g);
                }
                if (this.j) {
                    this.f799f.setTintMode(this.f800h);
                }
                if (this.f799f.isStateful()) {
                    this.f799f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f806o);
        setTextOffInternal(this.f808q);
        requestLayout();
    }

    public final void d() {
        if (this.P == null && ((t1) this.O.f30876b.f30011b).t() && i.c()) {
            i iVarA = i.a();
            int iB = iVarA.b();
            if (iB == 3 || iB == 0) {
                c3 c3Var = new c3(this);
                this.P = c3Var;
                iVarA.g(c3Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        int i10;
        int i11 = this.D;
        int i12 = this.E;
        int i13 = this.F;
        int i14 = this.G;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.f794a;
        Rect rectB = drawable != null ? i1.b(drawable) : i1.f30715c;
        Drawable drawable2 = this.f799f;
        Rect rect = this.Q;
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
                i4 = i17 > i18 ? (i17 - i18) + i12 : i12;
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
                this.f799f.setBounds(i11, i4, i13, i10);
            } else {
                i4 = i12;
            }
            i10 = i14;
            this.f799f.setBounds(i11, i4, i13, i10);
        }
        Drawable drawable3 = this.f794a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i23 = thumbOffset - rect.left;
            int i24 = thumbOffset + this.C + rect.right;
            this.f794a.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f794a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
        Drawable drawable2 = this.f799f;
        if (drawable2 != null) {
            drawable2.setHotspot(f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f794a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f799f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z3 = v3.f30896a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f804m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z3 = v3.f30896a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f804m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return pk.a.w(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f810s;
    }

    public boolean getSplitTrack() {
        return this.f805n;
    }

    public int getSwitchMinWidth() {
        return this.f803l;
    }

    public int getSwitchPadding() {
        return this.f804m;
    }

    public CharSequence getTextOff() {
        return this.f808q;
    }

    public CharSequence getTextOn() {
        return this.f806o;
    }

    public Drawable getThumbDrawable() {
        return this.f794a;
    }

    public final float getThumbPosition() {
        return this.f817z;
    }

    public int getThumbTextPadding() {
        return this.f802k;
    }

    public ColorStateList getThumbTintList() {
        return this.f795b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f796c;
    }

    public Drawable getTrackDrawable() {
        return this.f799f;
    }

    public ColorStateList getTrackTintList() {
        return this.g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f800h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f794a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f799f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.N.end();
        this.N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, S);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f799f;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i4 = this.E;
        int i10 = this.G;
        int i11 = i4 + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.f794a;
        if (drawable != null) {
            if (!this.f805n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = i1.b(drawable2);
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.K : this.L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.I;
            ColorStateList colorStateList = this.J;
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
            CharSequence charSequence = isChecked() ? this.f806o : this.f808q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z3, i4, i10, i11, i12);
        int iMax2 = 0;
        if (this.f794a != null) {
            Drawable drawable = this.f799f;
            Rect rect = this.Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = i1.b(this.f794a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z10 = v3.f30896a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.A) + iMax + iMax2;
        }
        int gravity = getGravity() & AppLovinMediationAdapter.ERROR_CHILD_USER;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i13 = this.B;
            int i14 = height2 - (i13 / 2);
            height = i13 + i14;
            paddingTop = i14;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.B + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.B;
        }
        this.D = paddingLeft;
        this.E = paddingTop;
        this.G = height;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f810s) {
            StaticLayout staticLayout = this.K;
            TextPaint textPaint = this.I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f807p;
                this.K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.L == null) {
                CharSequence charSequence2 = this.f809r;
                this.L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f794a;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f794a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f794a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.C = Math.max(this.f810s ? (this.f802k * 2) + Math.max(this.K.getWidth(), this.L.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f799f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f799f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f794a;
        if (drawable3 != null) {
            Rect rectB = i1.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.H ? Math.max(this.f803l, (this.C * 2) + iMax + iMax2) : this.f803l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.A = iMax3;
        this.B = iMax4;
        super.onMeasure(i4, i10);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f806o : this.f808q;
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
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) throws Resources.NotFoundException {
        super.setChecked(z3);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f806o;
                if (string == null) {
                    string = getResources().getString(com.liuzh.deviceinfo.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = v0.f22405a;
                new i0(com.liuzh.deviceinfo.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f808q;
            if (string2 == null) {
                string2 = getResources().getString(com.liuzh.deviceinfo.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = v0.f22405a;
            new i0(com.liuzh.deviceinfo.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, R, zIsChecked ? 1.0f : 0.0f);
        this.N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.N.setAutoCancel(true);
        this.N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(pk.a.z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().d(z3);
        setTextOnInternal(this.f806o);
        setTextOffInternal(this.f808q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z3) {
        this.H = z3;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z3) {
        if (this.f810s != z3) {
            this.f810s = z3;
            requestLayout();
            if (z3) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z3) {
        this.f805n = z3;
        invalidate();
    }

    public void setSwitchMinWidth(int i4) {
        this.f803l = i4;
        requestLayout();
    }

    public void setSwitchPadding(int i4) {
        this.f804m = i4;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.I;
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
        Object string = this.f808q;
        if (string == null) {
            string = getResources().getString(com.liuzh.deviceinfo.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = v0.f22405a;
        new i0(com.liuzh.deviceinfo.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f806o;
        if (string == null) {
            string = getResources().getString(com.liuzh.deviceinfo.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = v0.f22405a;
        new i0(com.liuzh.deviceinfo.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f794a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f794a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f817z = f10;
        invalidate();
    }

    public void setThumbResource(int i4) {
        setThumbDrawable(jm.a.l(i4, getContext()));
    }

    public void setThumbTextPadding(int i4) {
        this.f802k = i4;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f795b = colorStateList;
        this.f797d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f796c = mode;
        this.f798e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f799f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f799f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i4) {
        setTrackDrawable(jm.a.l(i4, getContext()));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.f801i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f800h = mode;
        this.j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f794a || drawable == this.f799f;
    }
}
