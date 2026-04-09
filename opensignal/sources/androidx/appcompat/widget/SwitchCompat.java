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
import com.google.android.gms.internal.measurement.y3;
import h.j;
import io.sentry.k;
import j4.h;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import p.c1;
import p.f2;
import p.g2;
import p.h2;
import p.m0;
import p.s;
import p.z2;
import u3.i0;
import u3.v;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: q0, reason: collision with root package name */
    public static final f2 f987q0 = new f2(Float.class, "thumbPos", 0);

    /* renamed from: r0, reason: collision with root package name */
    public static final int[] f988r0 = {R.attr.state_checked};
    public ColorStateList B;
    public PorterDuff.Mode D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public CharSequence K;
    public CharSequence L;
    public CharSequence M;
    public CharSequence N;
    public boolean O;
    public int P;
    public final int Q;
    public float R;
    public float S;
    public final VelocityTracker T;
    public final int U;
    public float V;
    public int W;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f989a;

    /* renamed from: a0, reason: collision with root package name */
    public int f990a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f991b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f992c0;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f993d;

    /* renamed from: d0, reason: collision with root package name */
    public int f994d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f995e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f996f0;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f997g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f998g0;

    /* renamed from: h0, reason: collision with root package name */
    public final TextPaint f999h0;

    /* renamed from: i0, reason: collision with root package name */
    public final ColorStateList f1000i0;

    /* renamed from: j0, reason: collision with root package name */
    public StaticLayout f1001j0;

    /* renamed from: k0, reason: collision with root package name */
    public StaticLayout f1002k0;

    /* renamed from: l0, reason: collision with root package name */
    public final m.a f1003l0;

    /* renamed from: m0, reason: collision with root package name */
    public ObjectAnimator f1004m0;

    /* renamed from: n0, reason: collision with root package name */
    public s f1005n0;

    /* renamed from: o0, reason: collision with root package name */
    public g2 f1006o0;

    /* renamed from: p0, reason: collision with root package name */
    public final Rect f1007p0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1008r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1009x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f1010y;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchCompat(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        int i10 = h.a.switchStyle;
        super(context, attributeSet, i10);
        this.f993d = null;
        this.f997g = null;
        this.f1008r = false;
        this.f1009x = false;
        this.B = null;
        this.D = null;
        this.E = false;
        this.F = false;
        this.T = VelocityTracker.obtain();
        this.f998g0 = true;
        this.f1007p0 = new Rect();
        h2.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.f999h0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        k kVarH0 = k.h0(context, attributeSet, j.SwitchCompat, i10);
        TypedArray typedArray = (TypedArray) kVarH0.f12398g;
        i0.m(this, context, j.SwitchCompat, attributeSet, typedArray, i10, 0);
        Drawable drawableU = kVarH0.U(j.SwitchCompat_android_thumb);
        this.f989a = drawableU;
        if (drawableU != null) {
            drawableU.setCallback(this);
        }
        Drawable drawableU2 = kVarH0.U(j.SwitchCompat_track);
        this.f1010y = drawableU2;
        if (drawableU2 != null) {
            drawableU2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(j.SwitchCompat_android_textOn));
        setTextOffInternal(typedArray.getText(j.SwitchCompat_android_textOff));
        this.O = typedArray.getBoolean(j.SwitchCompat_showText, true);
        this.G = typedArray.getDimensionPixelSize(j.SwitchCompat_thumbTextPadding, 0);
        this.H = typedArray.getDimensionPixelSize(j.SwitchCompat_switchMinWidth, 0);
        this.I = typedArray.getDimensionPixelSize(j.SwitchCompat_switchPadding, 0);
        this.J = typedArray.getBoolean(j.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListT = kVarH0.T(j.SwitchCompat_thumbTint);
        if (colorStateListT != null) {
            this.f993d = colorStateListT;
            this.f1008r = true;
        }
        PorterDuff.Mode modeC = c1.c(typedArray.getInt(j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f997g != modeC) {
            this.f997g = modeC;
            this.f1009x = true;
        }
        if (this.f1008r || this.f1009x) {
            a();
        }
        ColorStateList colorStateListT2 = kVarH0.T(j.SwitchCompat_trackTint);
        if (colorStateListT2 != null) {
            this.B = colorStateListT2;
            this.E = true;
        }
        PorterDuff.Mode modeC2 = c1.c(typedArray.getInt(j.SwitchCompat_trackTintMode, -1), null);
        if (this.D != modeC2) {
            this.D = modeC2;
            this.F = true;
        }
        if (this.E || this.F) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(j.SwitchCompat_switchTextAppearance, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, j.TextAppearance);
            int i11 = j.TextAppearance_android_textColor;
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(i11) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i11, 0)) == 0 || (colorStateList = h3.c.c(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(i11) : colorStateList;
            if (colorStateList != null) {
                this.f1000i0 = colorStateList;
            } else {
                this.f1000i0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i12 = typedArrayObtainStyledAttributes.getInt(j.TextAppearance_android_typeface, -1);
            int i13 = typedArrayObtainStyledAttributes.getInt(j.TextAppearance_android_textStyle, -1);
            Typeface typeface = i12 != 1 ? i12 != 2 ? i12 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i13 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i13) : Typeface.create(typeface, i13);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i14 = i13 & (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0));
                textPaint.setFakeBoldText((i14 & 1) != 0);
                textPaint.setTextSkewX((i14 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(j.TextAppearance_textAllCaps, false)) {
                Context context2 = getContext();
                m.a aVar = new m.a();
                aVar.f15968a = context2.getResources().getConfiguration().locale;
                this.f1003l0 = aVar;
            } else {
                this.f1003l0 = null;
            }
            setTextOnInternal(this.K);
            setTextOffInternal(this.M);
            typedArrayObtainStyledAttributes.recycle();
        }
        new m0(this).f(attributeSet, i10);
        kVarH0.l0();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.Q = viewConfiguration.getScaledTouchSlop();
        this.U = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private s getEmojiTextViewHelper() {
        if (this.f1005n0 == null) {
            this.f1005n0 = new s(this);
        }
        return this.f1005n0;
    }

    private boolean getTargetCheckedState() {
        return this.V > 0.5f;
    }

    private int getThumbOffset() {
        boolean z10 = z2.f20220a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.V : this.V) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1010y;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1007p0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f989a;
        Rect rectB = drawable2 != null ? c1.b(drawable2) : c1.f20036c;
        return ((((this.W - this.f991b0) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.M = charSequence;
        TransformationMethod transformationMethodR = ((y3) getEmojiTextViewHelper().f20166b.f11051a).R(this.f1003l0);
        if (transformationMethodR != null) {
            charSequence = transformationMethodR.getTransformation(charSequence, this);
        }
        this.N = charSequence;
        this.f1002k0 = null;
        if (this.O) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.K = charSequence;
        TransformationMethod transformationMethodR = ((y3) getEmojiTextViewHelper().f20166b.f11051a).R(this.f1003l0);
        if (transformationMethodR != null) {
            charSequence = transformationMethodR.getTransformation(charSequence, this);
        }
        this.L = charSequence;
        this.f1001j0 = null;
        if (this.O) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f989a;
        if (drawable != null) {
            if (this.f1008r || this.f1009x) {
                Drawable drawableMutate = drawable.mutate();
                this.f989a = drawableMutate;
                if (this.f1008r) {
                    drawableMutate.setTintList(this.f993d);
                }
                if (this.f1009x) {
                    this.f989a.setTintMode(this.f997g);
                }
                if (this.f989a.isStateful()) {
                    this.f989a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1010y;
        if (drawable != null) {
            if (this.E || this.F) {
                Drawable drawableMutate = drawable.mutate();
                this.f1010y = drawableMutate;
                if (this.E) {
                    drawableMutate.setTintList(this.B);
                }
                if (this.F) {
                    this.f1010y.setTintMode(this.D);
                }
                if (this.f1010y.isStateful()) {
                    this.f1010y.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.K);
        setTextOffInternal(this.M);
        requestLayout();
    }

    public final void d() {
        if (this.f1006o0 == null && ((y3) this.f1005n0.f20166b.f11051a).B() && h.c()) {
            h hVarA = h.a();
            int iB = hVarA.b();
            if (iB == 3 || iB == 0) {
                g2 g2Var = new g2(this);
                this.f1006o0 = g2Var;
                hVarA.g(g2Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12 = this.f992c0;
        int i13 = this.f994d0;
        int i14 = this.f995e0;
        int i15 = this.f996f0;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f989a;
        Rect rectB = drawable != null ? c1.b(drawable) : c1.f20036c;
        Drawable drawable2 = this.f1010y;
        Rect rect = this.f1007p0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectB != null) {
                int i17 = rectB.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectB.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectB.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectB.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f1010y.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1010y.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f989a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f991b0 + rect.right;
            this.f989a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f989a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
        Drawable drawable2 = this.f1010y;
        if (drawable2 != null) {
            drawable2.setHotspot(f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f989a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1010y;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z10 = z2.f20220a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.W;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.I : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z10 = z2.f20220a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.W;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.I : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ic.a.Q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.O;
    }

    public boolean getSplitTrack() {
        return this.J;
    }

    public int getSwitchMinWidth() {
        return this.H;
    }

    public int getSwitchPadding() {
        return this.I;
    }

    public CharSequence getTextOff() {
        return this.M;
    }

    public CharSequence getTextOn() {
        return this.K;
    }

    public Drawable getThumbDrawable() {
        return this.f989a;
    }

    public final float getThumbPosition() {
        return this.V;
    }

    public int getThumbTextPadding() {
        return this.G;
    }

    public ColorStateList getThumbTintList() {
        return this.f993d;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f997g;
    }

    public Drawable getTrackDrawable() {
        return this.f1010y;
    }

    public ColorStateList getTrackTintList() {
        return this.B;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.D;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f989a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1010y;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1004m0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1004m0.end();
        this.f1004m0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f988r0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1010y;
        Rect rect = this.f1007p0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f994d0;
        int i11 = this.f996f0;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f989a;
        if (drawable != null) {
            if (!this.J || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = c1.b(drawable2);
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1001j0 : this.f1002k0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f999h0;
            ColorStateList colorStateList = this.f1000i0;
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
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
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
            CharSequence charSequence = isChecked() ? this.K : this.M;
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f989a != null) {
            Drawable drawable = this.f1010y;
            Rect rect = this.f1007p0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = c1.b(this.f989a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z11 = z2.f20220a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.W + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.W) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i14 = this.f990a0;
            int i15 = height2 - (i14 / 2);
            height = i14 + i15;
            paddingTop = i15;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f990a0 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f990a0;
        }
        this.f992c0 = paddingLeft;
        this.f994d0 = paddingTop;
        this.f996f0 = height;
        this.f995e0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.O) {
            StaticLayout staticLayout = this.f1001j0;
            TextPaint textPaint = this.f999h0;
            if (staticLayout == null) {
                CharSequence charSequence = this.L;
                this.f1001j0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f1002k0 == null) {
                CharSequence charSequence2 = this.N;
                this.f1002k0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f989a;
        Rect rect = this.f1007p0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f989a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f989a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f991b0 = Math.max(this.O ? (this.G * 2) + Math.max(this.f1001j0.getWidth(), this.f1002k0.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f1010y;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1010y.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f989a;
        if (drawable3 != null) {
            Rect rectB = c1.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.f998g0 ? Math.max(this.H, (this.f991b0 * 2) + iMax + iMax2) : this.H;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.W = iMax3;
        this.f990a0 = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.K : this.M;
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
                Object string = this.K;
                if (string == null) {
                    string = getResources().getString(h.h.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = i0.f23177a;
                new v(f3.c.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.M;
            if (string2 == null) {
                string2 = getResources().getString(h.h.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = i0.f23177a;
            new v(f3.c.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f1004m0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f987q0, zIsChecked ? 1.0f : 0.0f);
        this.f1004m0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f1004m0.setAutoCancel(true);
        this.f1004m0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ic.a.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.K);
        setTextOffInternal(this.M);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.f998g0 = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            requestLayout();
            if (z10) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.H = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.I = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f999h0;
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
        Object string = this.M;
        if (string == null) {
            string = getResources().getString(h.h.abc_capital_off);
        }
        WeakHashMap weakHashMap = i0.f23177a;
        new v(f3.c.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.K;
        if (string == null) {
            string = getResources().getString(h.h.abc_capital_on);
        }
        WeakHashMap weakHashMap = i0.f23177a;
        new v(f3.c.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f989a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f989a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.V = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(ic.a.r(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.G = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f993d = colorStateList;
        this.f1008r = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f997g = mode;
        this.f1009x = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1010y;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1010y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(ic.a.r(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.E = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.D = mode;
        this.F = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f989a || drawable == this.f1010y;
    }
}
