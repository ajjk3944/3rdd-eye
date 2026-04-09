package androidx.appcompat.widget;

import B3.h;
import R.A;
import R.O;
import a4.t;
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
import f0.j;
import g.AbstractC2327a;
import h0.C2360j;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import l.C2628a;
import o.AbstractC2720j0;
import o.C2740u;
import o.U;
import o.W0;
import o.a1;
import o.q1;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: i0, reason: collision with root package name */
    public static final h f4943i0 = new h(14, Float.class, "thumbPos");

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f4944j0 = {R.attr.state_checked};

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f4945C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f4946D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f4947E;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f4948F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4949G;

    /* renamed from: H, reason: collision with root package name */
    public int f4950H;

    /* renamed from: I, reason: collision with root package name */
    public final int f4951I;

    /* renamed from: J, reason: collision with root package name */
    public float f4952J;

    /* renamed from: K, reason: collision with root package name */
    public float f4953K;

    /* renamed from: L, reason: collision with root package name */
    public final VelocityTracker f4954L;
    public final int M;

    /* renamed from: N, reason: collision with root package name */
    public float f4955N;

    /* renamed from: O, reason: collision with root package name */
    public int f4956O;

    /* renamed from: P, reason: collision with root package name */
    public int f4957P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4958Q;

    /* renamed from: R, reason: collision with root package name */
    public int f4959R;

    /* renamed from: S, reason: collision with root package name */
    public int f4960S;

    /* renamed from: T, reason: collision with root package name */
    public int f4961T;

    /* renamed from: U, reason: collision with root package name */
    public int f4962U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4963V;

    /* renamed from: W, reason: collision with root package name */
    public final TextPaint f4964W;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f4965a;

    /* renamed from: a0, reason: collision with root package name */
    public final ColorStateList f4966a0;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f4967b;
    public StaticLayout b0;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f4968c;

    /* renamed from: c0, reason: collision with root package name */
    public StaticLayout f4969c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4970d;

    /* renamed from: d0, reason: collision with root package name */
    public final C2628a f4971d0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4972e;

    /* renamed from: e0, reason: collision with root package name */
    public ObjectAnimator f4973e0;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4974f;

    /* renamed from: f0, reason: collision with root package name */
    public C2740u f4975f0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4976g;

    /* renamed from: g0, reason: collision with root package name */
    public C2360j f4977g0;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4978h;

    /* renamed from: h0, reason: collision with root package name */
    public final Rect f4979h0;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4980j;

    /* renamed from: k, reason: collision with root package name */
    public int f4981k;

    /* renamed from: l, reason: collision with root package name */
    public int f4982l;

    /* renamed from: m, reason: collision with root package name */
    public int f4983m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4984n;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private C2740u getEmojiTextViewHelper() {
        if (this.f4975f0 == null) {
            this.f4975f0 = new C2740u(this);
        }
        return this.f4975f0;
    }

    private boolean getTargetCheckedState() {
        return this.f4955N > 0.5f;
    }

    private int getThumbOffset() {
        boolean z6 = q1.f22618a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f4955N : this.f4955N) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f4974f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f4979h0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f4965a;
        Rect rectB = drawable2 != null ? AbstractC2720j0.b(drawable2) : AbstractC2720j0.f22539c;
        return ((((this.f4956O - this.f4958Q) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f4947E = charSequence;
        TransformationMethod transformationMethodI = ((R2.a) getEmojiTextViewHelper().f22642b.f19807b).I(this.f4971d0);
        if (transformationMethodI != null) {
            charSequence = transformationMethodI.getTransformation(charSequence, this);
        }
        this.f4948F = charSequence;
        this.f4969c0 = null;
        if (this.f4949G) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f4945C = charSequence;
        TransformationMethod transformationMethodI = ((R2.a) getEmojiTextViewHelper().f22642b.f19807b).I(this.f4971d0);
        if (transformationMethodI != null) {
            charSequence = transformationMethodI.getTransformation(charSequence, this);
        }
        this.f4946D = charSequence;
        this.b0 = null;
        if (this.f4949G) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f4965a;
        if (drawable != null) {
            if (this.f4970d || this.f4972e) {
                Drawable drawableMutate = drawable.mutate();
                this.f4965a = drawableMutate;
                if (this.f4970d) {
                    drawableMutate.setTintList(this.f4967b);
                }
                if (this.f4972e) {
                    this.f4965a.setTintMode(this.f4968c);
                }
                if (this.f4965a.isStateful()) {
                    this.f4965a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f4974f;
        if (drawable != null) {
            if (this.i || this.f4980j) {
                Drawable drawableMutate = drawable.mutate();
                this.f4974f = drawableMutate;
                if (this.i) {
                    drawableMutate.setTintList(this.f4976g);
                }
                if (this.f4980j) {
                    this.f4974f.setTintMode(this.f4978h);
                }
                if (this.f4974f.isStateful()) {
                    this.f4974f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f4945C);
        setTextOffInternal(this.f4947E);
        requestLayout();
    }

    public final void d() {
        if (this.f4977g0 == null && ((R2.a) this.f4975f0.f22642b.f19807b).u() && j.f19988k != null) {
            j jVarA = j.a();
            int iB = jVarA.b();
            if (iB == 3 || iB == 0) {
                C2360j c2360j = new C2360j(this);
                this.f4977g0 = c2360j;
                jVarA.f(c2360j);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i3;
        int i6 = this.f4959R;
        int i7 = this.f4960S;
        int i8 = this.f4961T;
        int i9 = this.f4962U;
        int thumbOffset = getThumbOffset() + i6;
        Drawable drawable = this.f4965a;
        Rect rectB = drawable != null ? AbstractC2720j0.b(drawable) : AbstractC2720j0.f22539c;
        Drawable drawable2 = this.f4974f;
        Rect rect = this.f4979h0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i10 = rect.left;
            thumbOffset += i10;
            if (rectB != null) {
                int i11 = rectB.left;
                if (i11 > i10) {
                    i6 += i11 - i10;
                }
                int i12 = rectB.top;
                int i13 = rect.top;
                i = i12 > i13 ? (i12 - i13) + i7 : i7;
                int i14 = rectB.right;
                int i15 = rect.right;
                if (i14 > i15) {
                    i8 -= i14 - i15;
                }
                int i16 = rectB.bottom;
                int i17 = rect.bottom;
                if (i16 > i17) {
                    i3 = i9 - (i16 - i17);
                }
                this.f4974f.setBounds(i6, i, i8, i3);
            } else {
                i = i7;
            }
            i3 = i9;
            this.f4974f.setBounds(i6, i, i8, i3);
        }
        Drawable drawable3 = this.f4965a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i18 = thumbOffset - rect.left;
            int i19 = thumbOffset + this.f4958Q + rect.right;
            this.f4965a.setBounds(i18, i7, i19, i9);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i18, i7, i19, i9);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f5) {
        super.drawableHotspotChanged(f2, f5);
        Drawable drawable = this.f4965a;
        if (drawable != null) {
            drawable.setHotspot(f2, f5);
        }
        Drawable drawable2 = this.f4974f;
        if (drawable2 != null) {
            drawable2.setHotspot(f2, f5);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4965a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f4974f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z6 = q1.f22618a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f4956O;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f4983m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z6 = q1.f22618a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f4956O;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f4983m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return t.u(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f4949G;
    }

    public boolean getSplitTrack() {
        return this.f4984n;
    }

    public int getSwitchMinWidth() {
        return this.f4982l;
    }

    public int getSwitchPadding() {
        return this.f4983m;
    }

    public CharSequence getTextOff() {
        return this.f4947E;
    }

    public CharSequence getTextOn() {
        return this.f4945C;
    }

    public Drawable getThumbDrawable() {
        return this.f4965a;
    }

    public final float getThumbPosition() {
        return this.f4955N;
    }

    public int getThumbTextPadding() {
        return this.f4981k;
    }

    public ColorStateList getThumbTintList() {
        return this.f4967b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f4968c;
    }

    public Drawable getTrackDrawable() {
        return this.f4974f;
    }

    public ColorStateList getTrackTintList() {
        return this.f4976g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f4978h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4965a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4974f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f4973e0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f4973e0.end();
        this.f4973e0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4944j0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f4974f;
        Rect rect = this.f4979h0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f4960S;
        int i3 = this.f4962U;
        int i6 = i + rect.top;
        int i7 = i3 - rect.bottom;
        Drawable drawable2 = this.f4965a;
        if (drawable != null) {
            if (!this.f4984n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = AbstractC2720j0.b(drawable2);
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.b0 : this.f4969c0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f4964W;
            ColorStateList colorStateList = this.f4966a0;
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
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i6 + i7) / 2) - (staticLayout.getHeight() / 2));
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
            CharSequence charSequence = isChecked() ? this.f4945C : this.f4947E;
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
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z6, i, i3, i6, i7);
        int iMax2 = 0;
        if (this.f4965a != null) {
            Drawable drawable = this.f4974f;
            Rect rect = this.f4979h0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = AbstractC2720j0.b(this.f4965a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z7 = q1.f22618a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f4956O + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f4956O) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i8 = this.f4957P;
            int i9 = height2 - (i8 / 2);
            height = i8 + i9;
            paddingTop = i9;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f4957P + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f4957P;
        }
        this.f4959R = paddingLeft;
        this.f4960S = paddingTop;
        this.f4962U = height;
        this.f4961T = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f4949G) {
            StaticLayout staticLayout = this.b0;
            TextPaint textPaint = this.f4964W;
            if (staticLayout == null) {
                CharSequence charSequence = this.f4946D;
                this.b0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f4969c0 == null) {
                CharSequence charSequence2 = this.f4948F;
                this.f4969c0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f4965a;
        Rect rect = this.f4979h0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f4965a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f4965a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f4958Q = Math.max(this.f4949G ? (this.f4981k * 2) + Math.max(this.b0.getWidth(), this.f4969c0.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f4974f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f4974f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f4965a;
        if (drawable3 != null) {
            Rect rectB = AbstractC2720j0.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.f4963V ? Math.max(this.f4982l, (this.f4958Q * 2) + iMax + iMax2) : this.f4982l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f4956O = iMax3;
        this.f4957P = iMax4;
        super.onMeasure(i, i3);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f4945C : this.f4947E;
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
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        super.setChecked(z6);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f4945C;
                if (string == null) {
                    string = getResources().getString(com.apm.insight.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = O.f3270a;
                new A(com.apm.insight.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f4947E;
            if (string2 == null) {
                string2 = getResources().getString(com.apm.insight.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = O.f3270a;
            new A(com.apm.insight.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f4973e0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f4943i0, zIsChecked ? 1.0f : 0.0f);
        this.f4973e0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f4973e0.setAutoCancel(true);
        this.f4973e0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(t.v(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().d(z6);
        setTextOnInternal(this.f4945C);
        setTextOffInternal(this.f4947E);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z6) {
        this.f4963V = z6;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z6) {
        if (this.f4949G != z6) {
            this.f4949G = z6;
            requestLayout();
            if (z6) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z6) {
        this.f4984n = z6;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f4982l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f4983m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f4964W;
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
        Object string = this.f4947E;
        if (string == null) {
            string = getResources().getString(com.apm.insight.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = O.f3270a;
        new A(com.apm.insight.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f4945C;
        if (string == null) {
            string = getResources().getString(com.apm.insight.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = O.f3270a;
        new A(com.apm.insight.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4965a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4965a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f4955N = f2;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(t.i(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f4981k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f4967b = colorStateList;
        this.f4970d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f4968c = mode;
        this.f4972e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4974f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4974f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(t.i(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f4976g = colorStateList;
        this.i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f4978h = mode;
        this.f4980j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4965a || drawable == this.f4974f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int resourceId;
        super(context, attributeSet, com.apm.insight.R.attr.switchStyle);
        this.f4967b = null;
        this.f4968c = null;
        this.f4970d = false;
        this.f4972e = false;
        this.f4976g = null;
        this.f4978h = null;
        this.i = false;
        this.f4980j = false;
        this.f4954L = VelocityTracker.obtain();
        this.f4963V = true;
        this.f4979h0 = new Rect();
        W0.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.f4964W = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC2327a.f20136x;
        a1 a1VarI = a1.i(context, attributeSet, iArr, com.apm.insight.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) a1VarI.f22480c;
        O.l(this, context, iArr, attributeSet, typedArray, com.apm.insight.R.attr.switchStyle);
        Drawable drawableD = a1VarI.d(2);
        this.f4965a = drawableD;
        if (drawableD != null) {
            drawableD.setCallback(this);
        }
        Drawable drawableD2 = a1VarI.d(11);
        this.f4974f = drawableD2;
        if (drawableD2 != null) {
            drawableD2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f4949G = typedArray.getBoolean(3, true);
        this.f4981k = typedArray.getDimensionPixelSize(8, 0);
        this.f4982l = typedArray.getDimensionPixelSize(5, 0);
        this.f4983m = typedArray.getDimensionPixelSize(6, 0);
        this.f4984n = typedArray.getBoolean(4, false);
        ColorStateList colorStateListC = a1VarI.c(9);
        if (colorStateListC != null) {
            this.f4967b = colorStateListC;
            this.f4970d = true;
        }
        PorterDuff.Mode modeC = AbstractC2720j0.c(typedArray.getInt(10, -1), null);
        if (this.f4968c != modeC) {
            this.f4968c = modeC;
            this.f4972e = true;
        }
        if (this.f4970d || this.f4972e) {
            a();
        }
        ColorStateList colorStateListC2 = a1VarI.c(12);
        if (colorStateListC2 != null) {
            this.f4976g = colorStateListC2;
            this.i = true;
        }
        PorterDuff.Mode modeC2 = AbstractC2720j0.c(typedArray.getInt(13, -1), null);
        if (this.f4978h != modeC2) {
            this.f4978h = modeC2;
            this.f4980j = true;
        }
        if (this.i || this.f4980j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC2327a.f20137y);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = G.c.b(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f4966a0 = colorStateList;
            } else {
                this.f4966a0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int i3 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i3 != 1 ? i3 != 2 ? i3 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i6 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i6) : Typeface.create(typeface, i6);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i7 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i6;
                textPaint.setFakeBoldText((i7 & 1) != 0);
                textPaint.setTextSkewX((2 & i7) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C2628a c2628a = new C2628a();
                c2628a.f21802a = context2.getResources().getConfiguration().locale;
                this.f4971d0 = c2628a;
            } else {
                this.f4971d0 = null;
            }
            setTextOnInternal(this.f4945C);
            setTextOffInternal(this.f4947E);
            typedArrayObtainStyledAttributes.recycle();
        }
        new U(this).f(attributeSet, com.apm.insight.R.attr.switchStyle);
        a1VarI.j();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4951I = viewConfiguration.getScaledTouchSlop();
        this.M = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.apm.insight.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
