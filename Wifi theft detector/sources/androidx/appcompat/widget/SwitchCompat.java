package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property S = new a(Float.class, "thumbPos");
    public static final int[] T = {R.attr.state_checked};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public ColorStateList J;
    public Layout K;
    public Layout L;
    public TransformationMethod M;
    public ObjectAnimator N;
    public final y O;
    public l P;
    public b Q;
    public final Rect R;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f1018a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1019b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1020c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1021d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1022e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1023f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1024g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1025h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1026i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1027j;

    /* renamed from: k, reason: collision with root package name */
    public int f1028k;

    /* renamed from: l, reason: collision with root package name */
    public int f1029l;

    /* renamed from: m, reason: collision with root package name */
    public int f1030m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1031n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f1032o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1033p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1034q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f1035r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1036s;

    /* renamed from: t, reason: collision with root package name */
    public int f1037t;

    /* renamed from: u, reason: collision with root package name */
    public int f1038u;

    /* renamed from: v, reason: collision with root package name */
    public float f1039v;

    /* renamed from: w, reason: collision with root package name */
    public float f1040w;

    /* renamed from: x, reason: collision with root package name */
    public VelocityTracker f1041x;

    /* renamed from: y, reason: collision with root package name */
    public int f1042y;

    /* renamed from: z, reason: collision with root package name */
    public float f1043z;

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1043z);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    public static class b extends EmojiCompat.f {

        /* renamed from: a, reason: collision with root package name */
        public final Reference f1044a;

        public b(SwitchCompat switchCompat) {
            this.f1044a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.f
        public void a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f1044a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.f
        public void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1044a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(@NonNull Context context) {
        this(context, null);
    }

    public static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    @NonNull
    private l getEmojiTextViewHelper() {
        if (this.P == null) {
            this.P = new l(this);
        }
        return this.P;
    }

    private boolean getTargetCheckedState() {
        return this.f1043z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((k1.b(this) ? 1.0f - this.f1043z : this.f1043z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1023f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1018a;
        Rect rectD = drawable2 != null ? j0.d(drawable2) : j0.f1194c;
        return ((((this.A - this.C) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1034q = charSequence;
        this.f1035r = g(charSequence);
        this.L = null;
        if (this.f1036s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1032o = charSequence;
        this.f1033p = g(charSequence);
        this.K = null;
        if (this.f1036s) {
            p();
        }
    }

    public final void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) S, z10 ? 1.0f : 0.0f);
        this.N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.N.setAutoCancel(true);
        this.N.start();
    }

    public final void b() {
        Drawable drawable = this.f1018a;
        if (drawable != null) {
            if (this.f1021d || this.f1022e) {
                Drawable drawableMutate = k0.a.r(drawable).mutate();
                this.f1018a = drawableMutate;
                if (this.f1021d) {
                    k0.a.o(drawableMutate, this.f1019b);
                }
                if (this.f1022e) {
                    k0.a.p(this.f1018a, this.f1020c);
                }
                if (this.f1018a.isStateful()) {
                    this.f1018a.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f1023f;
        if (drawable != null) {
            if (this.f1026i || this.f1027j) {
                Drawable drawableMutate = k0.a.r(drawable).mutate();
                this.f1023f = drawableMutate;
                if (this.f1026i) {
                    k0.a.o(drawableMutate, this.f1024g);
                }
                if (this.f1027j) {
                    k0.a.p(this.f1023f, this.f1025h);
                }
                if (this.f1023f.isStateful()) {
                    this.f1023f.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.R;
        int i12 = this.D;
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1018a;
        Rect rectD = drawable != null ? j0.d(drawable) : j0.f1194c;
        Drawable drawable2 = this.f1023f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectD != null) {
                int i17 = rectD.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectD.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectD.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectD.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f1023f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1023f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1018a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.C + rect.right;
            this.f1018a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                k0.a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1018a;
        if (drawable != null) {
            k0.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f1023f;
        if (drawable2 != null) {
            k0.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1018a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1023f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.M);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!k1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1030m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (k1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1030m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.o(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1036s;
    }

    public boolean getSplitTrack() {
        return this.f1031n;
    }

    public int getSwitchMinWidth() {
        return this.f1029l;
    }

    public int getSwitchPadding() {
        return this.f1030m;
    }

    public CharSequence getTextOff() {
        return this.f1034q;
    }

    public CharSequence getTextOn() {
        return this.f1032o;
    }

    public Drawable getThumbDrawable() {
        return this.f1018a;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getThumbPosition() {
        return this.f1043z;
    }

    public int getThumbTextPadding() {
        return this.f1028k;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f1019b;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f1020c;
    }

    public Drawable getTrackDrawable() {
        return this.f1023f;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f1024g;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.f1025h;
    }

    public final boolean h(float f10, float f11) {
        if (this.f1018a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1018a.getPadding(this.R);
        int i10 = this.E;
        int i11 = this.f1038u;
        int i12 = i10 - i11;
        int i13 = (this.D + thumbOffset) - i11;
        int i14 = this.C + i13;
        Rect rect = this.R;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.G + i11));
    }

    public final Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.I, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void j() {
        setTextOnInternal(this.f1032o);
        setTextOffInternal(this.f1034q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1018a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1023f;
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

    public final void k() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f1034q;
            if (string == null) {
                string = getResources().getString(c.h.abc_capital_off);
            }
            ViewCompat.x0(this, string);
        }
    }

    public final void l() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f1032o;
            if (string == null) {
                string = getResources().getString(c.h.abc_capital_on);
            }
            ViewCompat.x0(this, string);
        }
    }

    public void m(Context context, int i10) {
        z0 z0VarT = z0.t(context, i10, c.j.TextAppearance);
        ColorStateList colorStateListC = z0VarT.c(c.j.TextAppearance_android_textColor);
        if (colorStateListC != null) {
            this.J = colorStateListC;
        } else {
            this.J = getTextColors();
        }
        int iF = z0VarT.f(c.j.TextAppearance_android_textSize, 0);
        if (iF != 0) {
            float f10 = iF;
            if (f10 != this.I.getTextSize()) {
                this.I.setTextSize(f10);
                requestLayout();
            }
        }
        o(z0VarT.k(c.j.TextAppearance_android_typeface, -1), z0VarT.k(c.j.TextAppearance_android_textStyle, -1));
        if (z0VarT.a(c.j.TextAppearance_textAllCaps, false)) {
            this.M = new g.a(getContext());
        } else {
            this.M = null;
        }
        setTextOnInternal(this.f1032o);
        setTextOffInternal(this.f1034q);
        z0VarT.x();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.I.setFakeBoldText(false);
            this.I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.I.setFakeBoldText((i11 & 1) != 0);
            this.I.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void o(int i10, int i11) {
        n(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.R;
        Drawable drawable = this.f1023f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.E;
        int i11 = this.G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1018a;
        if (drawable != null) {
            if (!this.f1031n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = j0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
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
        Layout layout = getTargetCheckedState() ? this.K : this.L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                this.I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1032o : this.f1034q;
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f1018a != null) {
            Rect rect = this.R;
            Drawable drawable = this.f1023f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = j0.d(this.f1018a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (k1.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i14 = this.B;
            paddingTop = paddingTop2 - (i14 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.B;
                this.D = paddingLeft;
                this.E = paddingTop;
                this.G = height;
                this.F = width;
            }
            paddingTop = getPaddingTop();
            i14 = this.B;
        }
        height = i14 + paddingTop;
        this.D = paddingLeft;
        this.E = paddingTop;
        this.G = height;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f1036s) {
            if (this.K == null) {
                this.K = i(this.f1033p);
            }
            if (this.L == null) {
                this.L = i(this.f1035r);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.f1018a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1018a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1018a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.C = Math.max(this.f1036s ? Math.max(this.K.getWidth(), this.L.getWidth()) + (this.f1028k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f1023f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1023f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f1018a;
        if (drawable3 != null) {
            Rect rectD = j0.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.H ? Math.max(this.f1029l, (this.C * 2) + iMax + iMax2) : this.f1029l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.A = iMax3;
        this.B = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1032o : this.f1034q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1041x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f1037t
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1039v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.k1.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f1043z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f1043z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f1039v = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1039v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1038u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f1040w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1038u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f1037t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1039v = r0
            r6.f1040w = r3
            return r1
        L89:
            int r0 = r6.f1037t
            if (r0 != r2) goto L94
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f1037t = r0
            android.view.VelocityTracker r0 = r6.f1041x
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f1037t = r1
            r6.f1039v = r0
            r6.f1040w = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.Q == null && this.P.b() && EmojiCompat.i()) {
            EmojiCompat emojiCompatC = EmojiCompat.c();
            int iE = emojiCompatC.e();
            if (iE == 3 || iE == 0) {
                b bVar = new b(this);
                this.Q = bVar;
                emojiCompatC.t(bVar);
            }
        }
    }

    public final void q(MotionEvent motionEvent) throws Resources.NotFoundException {
        this.f1037t = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f1041x.computeCurrentVelocity(1000);
            float xVelocity = this.f1041x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f1042y) {
                targetCheckedState = getTargetCheckedState();
            } else if (!k1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) throws Resources.NotFoundException {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f1032o);
        setTextOffInternal(this.f1034q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1036s != z10) {
            this.f1036s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1031n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1029l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1030m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.I.getTypeface() == null || this.I.getTypeface().equals(typeface)) && (this.I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1018a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1018a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f1043z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(d.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1028k = i10;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f1019b = colorStateList;
        this.f1021d = true;
        b();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f1020c = mode;
        this.f1022e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1023f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1023f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(d.a.b(getContext(), i10));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f1024g = colorStateList;
        this.f1026i = true;
        c();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.f1025h = mode;
        this.f1027j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1018a || drawable == this.f1023f;
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, c.a.switchStyle);
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f1019b = null;
        this.f1020c = null;
        this.f1021d = false;
        this.f1022e = false;
        this.f1024g = null;
        this.f1025h = null;
        this.f1026i = false;
        this.f1027j = false;
        this.f1041x = VelocityTracker.obtain();
        this.H = true;
        this.R = new Rect();
        v0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = c.j.SwitchCompat;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        ViewCompat.h0(this, context, iArr, attributeSet, z0VarV.r(), i10, 0);
        Drawable drawableG = z0VarV.g(c.j.SwitchCompat_android_thumb);
        this.f1018a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = z0VarV.g(c.j.SwitchCompat_track);
        this.f1023f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(z0VarV.p(c.j.SwitchCompat_android_textOn));
        setTextOffInternal(z0VarV.p(c.j.SwitchCompat_android_textOff));
        this.f1036s = z0VarV.a(c.j.SwitchCompat_showText, true);
        this.f1028k = z0VarV.f(c.j.SwitchCompat_thumbTextPadding, 0);
        this.f1029l = z0VarV.f(c.j.SwitchCompat_switchMinWidth, 0);
        this.f1030m = z0VarV.f(c.j.SwitchCompat_switchPadding, 0);
        this.f1031n = z0VarV.a(c.j.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListC = z0VarV.c(c.j.SwitchCompat_thumbTint);
        if (colorStateListC != null) {
            this.f1019b = colorStateListC;
            this.f1021d = true;
        }
        PorterDuff.Mode modeE = j0.e(z0VarV.k(c.j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f1020c != modeE) {
            this.f1020c = modeE;
            this.f1022e = true;
        }
        if (this.f1021d || this.f1022e) {
            b();
        }
        ColorStateList colorStateListC2 = z0VarV.c(c.j.SwitchCompat_trackTint);
        if (colorStateListC2 != null) {
            this.f1024g = colorStateListC2;
            this.f1026i = true;
        }
        PorterDuff.Mode modeE2 = j0.e(z0VarV.k(c.j.SwitchCompat_trackTintMode, -1), null);
        if (this.f1025h != modeE2) {
            this.f1025h = modeE2;
            this.f1027j = true;
        }
        if (this.f1026i || this.f1027j) {
            c();
        }
        int iN = z0VarV.n(c.j.SwitchCompat_switchTextAppearance, 0);
        if (iN != 0) {
            m(context, iN);
        }
        y yVar = new y(this);
        this.O = yVar;
        yVar.m(attributeSet, i10);
        z0VarV.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1038u = viewConfiguration.getScaledTouchSlop();
        this.f1042y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
