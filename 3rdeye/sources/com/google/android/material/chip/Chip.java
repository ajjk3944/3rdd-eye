package com.google.android.material.chip;

import B2.o;
import D0.a;
import D0.c;
import E.u;
import J0.i;
import L0.I;
import L0.S;
import M0.g;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.a;
import d4.e;
import d4.h;
import d4.j;
import h4.C4415c;
import h4.C4416d;
import i4.C4456a;
import io.appmetrica.analytics.impl.L2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import l4.C5290i;
import l4.m;
import r4.C5522a;
import z0.C5848a;

/* loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0341a, m, Checkable {

    /* renamed from: x, reason: collision with root package name */
    public static final Rect f22686x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f22687y = {R.attr.state_selected};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f22688z = {R.attr.state_checkable};

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.material.chip.a f22689f;

    /* renamed from: g, reason: collision with root package name */
    public InsetDrawable f22690g;

    /* renamed from: h, reason: collision with root package name */
    public RippleDrawable f22691h;
    public View.OnClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f22692j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22693k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22694l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22695m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22696n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22697o;

    /* renamed from: p, reason: collision with root package name */
    public int f22698p;

    /* renamed from: q, reason: collision with root package name */
    public int f22699q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f22700r;

    /* renamed from: s, reason: collision with root package name */
    public final b f22701s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f22702t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f22703u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f22704v;

    /* renamed from: w, reason: collision with root package name */
    public final a f22705w;

    public class b extends V0.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // V0.a
        public final int o(float f10, float f11) {
            Rect rect = Chip.f22686x;
            Chip chip = Chip.this;
            return (chip.e() && chip.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // V0.a
        public final void p(ArrayList arrayList) {
            com.google.android.material.chip.a aVar;
            arrayList.add(0);
            Rect rect = Chip.f22686x;
            Chip chip = Chip.this;
            if (!chip.e() || (aVar = chip.f22689f) == null || !aVar.f22728M || chip.i == null) {
                return;
            }
            arrayList.add(1);
        }

        @Override // V0.a
        public final boolean u(int i, int i10, Bundle bundle) {
            boolean z10 = false;
            if (i10 == 16) {
                Chip chip = Chip.this;
                if (i == 0) {
                    return chip.performClick();
                }
                if (i == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.i;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z10 = true;
                    }
                    if (chip.f22702t) {
                        chip.f22701s.z(1, 1);
                    }
                }
            }
            return z10;
        }

        @Override // V0.a
        public final void v(g gVar) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f22689f;
            boolean z10 = aVar != null && aVar.f22734S;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4122a;
            accessibilityNodeInfo.setCheckable(z10);
            accessibilityNodeInfo.setClickable(chip.isClickable());
            gVar.j(chip.getAccessibilityClassName());
            gVar.n(chip.getText());
        }

        @Override // V0.a
        public final void w(int i, g gVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4122a;
            if (i != 1) {
                accessibilityNodeInfo.setContentDescription("");
                gVar.i(Chip.f22686x);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                accessibilityNodeInfo.setContentDescription(chip.getContext().getString(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            gVar.i(chip.getCloseIconTouchBoundsInt());
            gVar.b(g.a.f4124e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
        }

        @Override // V0.a
        public final void x(int i, boolean z10) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.f22696n = z10;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(C5522a.a(context, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.chipStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.chipStyle);
        this.f22703u = new Rect();
        this.f22704v = new RectF();
        this.f22705w = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", L2.f39740g) != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet);
        int[] iArr = K3.a.f3117d;
        TypedArray typedArrayD = j.d(aVar.f22748g0, attributeSet, iArr, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.chipStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        aVar.f22722G0 = typedArrayD.hasValue(37);
        Context context3 = aVar.f22748g0;
        ColorStateList colorStateListA = C4415c.a(context3, typedArrayD, 24);
        if (aVar.f22767z != colorStateListA) {
            aVar.f22767z = colorStateListA;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList colorStateListA2 = C4415c.a(context3, typedArrayD, 11);
        if (aVar.f22710A != colorStateListA2) {
            aVar.f22710A = colorStateListA2;
            aVar.onStateChange(aVar.getState());
        }
        float dimension = typedArrayD.getDimension(19, 0.0f);
        if (aVar.f22712B != dimension) {
            aVar.f22712B = dimension;
            aVar.invalidateSelf();
            aVar.v();
        }
        if (typedArrayD.hasValue(12)) {
            aVar.B(typedArrayD.getDimension(12, 0.0f));
        }
        aVar.G(C4415c.a(context3, typedArrayD, 22));
        aVar.H(typedArrayD.getDimension(23, 0.0f));
        aVar.Q(C4415c.a(context3, typedArrayD, 36));
        String text = typedArrayD.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(aVar.f22721G, text)) {
            aVar.f22721G = text;
            aVar.f22754m0.f37513d = true;
            aVar.invalidateSelf();
            aVar.v();
        }
        C4416d c4416d = (!typedArrayD.hasValue(0) || (resourceId = typedArrayD.getResourceId(0, 0)) == 0) ? null : new C4416d(context3, resourceId);
        c4416d.f38233k = typedArrayD.getDimension(1, c4416d.f38233k);
        aVar.R(c4416d);
        int i = typedArrayD.getInt(3, 0);
        if (i == 1) {
            aVar.f22717D0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            aVar.f22717D0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            aVar.f22717D0 = TextUtils.TruncateAt.END;
        }
        aVar.F(typedArrayD.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            aVar.F(typedArrayD.getBoolean(15, false));
        }
        aVar.C(C4415c.c(context3, typedArrayD, 14));
        if (typedArrayD.hasValue(17)) {
            aVar.E(C4415c.a(context3, typedArrayD, 17));
        }
        aVar.D(typedArrayD.getDimension(16, -1.0f));
        aVar.N(typedArrayD.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            aVar.N(typedArrayD.getBoolean(26, false));
        }
        aVar.I(C4415c.c(context3, typedArrayD, 25));
        aVar.M(C4415c.a(context3, typedArrayD, 30));
        aVar.K(typedArrayD.getDimension(28, 0.0f));
        aVar.x(typedArrayD.getBoolean(6, false));
        aVar.A(typedArrayD.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            aVar.A(typedArrayD.getBoolean(8, false));
        }
        aVar.y(C4415c.c(context3, typedArrayD, 7));
        if (typedArrayD.hasValue(9)) {
            aVar.z(C4415c.a(context3, typedArrayD, 9));
        }
        aVar.f22738W = L3.g.a(context3, typedArrayD, 39);
        aVar.f22739X = L3.g.a(context3, typedArrayD, 33);
        float dimension2 = typedArrayD.getDimension(21, 0.0f);
        if (aVar.f22740Y != dimension2) {
            aVar.f22740Y = dimension2;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.P(typedArrayD.getDimension(35, 0.0f));
        aVar.O(typedArrayD.getDimension(34, 0.0f));
        float dimension3 = typedArrayD.getDimension(41, 0.0f);
        if (aVar.f22743b0 != dimension3) {
            aVar.f22743b0 = dimension3;
            aVar.invalidateSelf();
            aVar.v();
        }
        float dimension4 = typedArrayD.getDimension(40, 0.0f);
        if (aVar.f22744c0 != dimension4) {
            aVar.f22744c0 = dimension4;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.L(typedArrayD.getDimension(29, 0.0f));
        aVar.J(typedArrayD.getDimension(27, 0.0f));
        float dimension5 = typedArrayD.getDimension(13, 0.0f);
        if (aVar.f22747f0 != dimension5) {
            aVar.f22747f0 = dimension5;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.F0 = typedArrayD.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayD.recycle();
        j.a(context2, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.chipStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_MaterialComponents_Chip_Action);
        j.b(context2, attributeSet, iArr, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.chipStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.chipStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_MaterialComponents_Chip_Action);
        this.f22697o = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f22699q = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(aVar);
        aVar.j(I.d.i(this));
        j.a(context2, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.chipStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_MaterialComponents_Chip_Action);
        j.b(context2, attributeSet, iArr, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.chipStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.chipStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f22701s = new b(this);
        f();
        if (!zHasValue) {
            setOutlineProvider(new U3.a(this));
        }
        setChecked(this.f22693k);
        setText(aVar.f22721G);
        setEllipsize(aVar.f22717D0);
        i();
        if (!this.f22689f.f22719E0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.f22697o) {
            setMinHeight(this.f22699q);
        }
        this.f22698p = getLayoutDirection();
        super.setOnCheckedChangeListener(new o(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f22704v;
        rectF.setEmpty();
        if (e() && this.i != null) {
            com.google.android.material.chip.a aVar = this.f22689f;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.U()) {
                float f10 = aVar.f22747f0 + aVar.f22746e0 + aVar.f22732Q + aVar.f22745d0 + aVar.f22744c0;
                if (a.b.a(aVar) == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i10 = (int) closeIconTouchBounds.top;
        int i11 = (int) closeIconTouchBounds.right;
        int i12 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f22703u;
        rect.set(i, i10, i11, i12);
        return rect;
    }

    private C4416d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22754m0.f37515f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f22695m != z10) {
            this.f22695m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f22694l != z10) {
            this.f22694l = z10;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0341a
    public final void a() {
        d(this.f22699q);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i) {
        this.f22699q = i;
        if (!this.f22697o) {
            InsetDrawable insetDrawable = this.f22690g;
            if (insetDrawable == null) {
                int[] iArr = C4456a.f38452a;
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f22690g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = C4456a.f38452a;
                    g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f22689f.f22712B));
        int iMax2 = Math.max(0, i - this.f22689f.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f22690g;
            if (insetDrawable2 == null) {
                int[] iArr3 = C4456a.f38452a;
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f22690g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = C4456a.f38452a;
                    g();
                    return;
                }
                return;
            }
        }
        int i10 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i11 = iMax > 0 ? iMax / 2 : 0;
        if (this.f22690g != null) {
            Rect rect = new Rect();
            this.f22690g.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                int[] iArr5 = C4456a.f38452a;
                g();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f22690g = new InsetDrawable((Drawable) this.f22689f, i10, i11, i10, i11);
        int[] iArr6 = C4456a.f38452a;
        g();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f22702t ? super.dispatchHoverEvent(motionEvent) : this.f22701s.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f22702t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.f22701s;
        if (!bVar.n(keyEvent) || bVar.f12840l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f22689f;
        boolean zW = false;
        if (aVar != null && com.google.android.material.chip.a.u(aVar.f22729N)) {
            com.google.android.material.chip.a aVar2 = this.f22689f;
            ?? IsEnabled = isEnabled();
            int i10 = IsEnabled;
            if (this.f22696n) {
                i10 = IsEnabled + 1;
            }
            int i11 = i10;
            if (this.f22695m) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.f22694l) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f22696n) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f22695m) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f22694l) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(aVar2.f22711A0, iArr)) {
                aVar2.f22711A0 = iArr;
                if (aVar2.U()) {
                    zW = aVar2.w(aVar2.getState(), iArr);
                }
            }
        }
        if (zW) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null) {
            return false;
        }
        Object objB = aVar.f22729N;
        if (objB == null) {
            objB = null;
        } else if (objB instanceof c) {
            objB = ((c) objB).b();
        }
        return objB != null;
    }

    public final void f() {
        com.google.android.material.chip.a aVar;
        if (!e() || (aVar = this.f22689f) == null || !aVar.f22728M || this.i == null) {
            I.o(this, null);
            this.f22702t = false;
        } else {
            I.o(this, this.f22701s);
            this.f22702t = true;
        }
    }

    public final void g() {
        this.f22691h = new RippleDrawable(C4456a.a(this.f22689f.f22720F), getBackgroundDrawable(), null);
        this.f22689f.getClass();
        RippleDrawable rippleDrawable = this.f22691h;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        setBackground(rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f22700r)) {
            return this.f22700r;
        }
        com.google.android.material.chip.a aVar = this.f22689f;
        if (!(aVar != null && aVar.f22734S)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        if (!(parent instanceof U3.b)) {
            return "android.widget.Button";
        }
        ((U3.b) parent).getClass();
        throw null;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f22690g;
        return insetDrawable == null ? this.f22689f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22736U;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22737V;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22710A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return Math.max(0.0f, aVar.s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f22689f;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22747f0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null || (drawable = aVar.f22724I) == 0) {
            return null;
        }
        return drawable instanceof c ? ((c) drawable).b() : drawable;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22726K;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22725J;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22712B;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22740Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22716D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22718E;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null || (drawable = aVar.f22729N) == 0) {
            return null;
        }
        return drawable instanceof c ? ((c) drawable).b() : drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22733R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22746e0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22732Q;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22745d0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22731P;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22717D0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f22702t) {
            b bVar = this.f22701s;
            if (bVar.f12840l == 1 || bVar.f12839k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public L3.g getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22739X;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22742a0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22741Z;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22720F;
        }
        return null;
    }

    public C5290i getShapeAppearanceModel() {
        return this.f22689f.f43759b.f43782a;
    }

    public L3.g getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22738W;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22744c0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            return aVar.f22743b0;
        }
        return 0.0f;
    }

    public final void h() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f22689f) == null) {
            return;
        }
        int iR = (int) (aVar.r() + aVar.f22747f0 + aVar.f22744c0);
        com.google.android.material.chip.a aVar2 = this.f22689f;
        int iQ = (int) (aVar2.q() + aVar2.f22740Y + aVar2.f22743b0);
        if (this.f22690g != null) {
            Rect rect = new Rect();
            this.f22690g.getPadding(rect);
            iQ += rect.left;
            iR += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        setPaddingRelative(iQ, paddingTop, iR, paddingBottom);
    }

    public final void i() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C4416d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f22705w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.N(this, this.f22689f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22687y);
        }
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null && aVar.f22734S) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22688z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i, Rect rect) {
        super.onFocusChanged(z10, i, rect);
        if (this.f22702t) {
            this.f22701s.t(z10, i, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.a aVar = this.f22689f;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.f22734S);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof U3.b) {
            U3.b bVar = (U3.b) getParent();
            if (bVar.f37488d) {
                i = 0;
                for (int i10 = 0; i10 < bVar.getChildCount(); i10++) {
                    View childAt = bVar.getChildAt(i10);
                    if ((childAt instanceof Chip) && bVar.getChildAt(i10).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            Object tag = getTag(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo(g.e.a(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).f4136a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f22698p != i) {
            this.f22698p = i;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f22694l
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.f22694l
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.i
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f22702t
            if (r0 == 0) goto L43
            com.google.android.material.chip.Chip$b r0 = r5.f22701s
            r0.z(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r2
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f22700r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f22691h) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f22691h) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.x(z10);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.x(aVar.f22748g0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null) {
            this.f22693k = z10;
        } else if (aVar.f22734S) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.y(A9.I.w(aVar.f22748g0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.z(C5848a.getColorStateList(aVar.f22748g0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.A(aVar.f22748g0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null || aVar.f22710A == colorStateList) {
            return;
        }
        aVar.f22710A = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateList;
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null || aVar.f22710A == (colorStateList = C5848a.getColorStateList(aVar.f22748g0, i))) {
            return;
        }
        aVar.f22710A = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.B(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.B(aVar.f22748g0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f22689f;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.f22715C0 = new WeakReference<>(null);
            }
            this.f22689f = aVar;
            aVar.f22719E0 = false;
            aVar.f22715C0 = new WeakReference<>(this);
            d(this.f22699q);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null || aVar.f22747f0 == f10) {
            return;
        }
        aVar.f22747f0 = f10;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setChipEndPaddingResource(int i) throws Resources.NotFoundException {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            float dimension = aVar.f22748g0.getResources().getDimension(i);
            if (aVar.f22747f0 != dimension) {
                aVar.f22747f0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.C(A9.I.w(aVar.f22748g0, i));
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.D(f10);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.D(aVar.f22748g0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.E(C5848a.getColorStateList(aVar.f22748g0, i));
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.F(aVar.f22748g0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null || aVar.f22712B == f10) {
            return;
        }
        aVar.f22712B = f10;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setChipMinHeightResource(int i) throws Resources.NotFoundException {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            float dimension = aVar.f22748g0.getResources().getDimension(i);
            if (aVar.f22712B != dimension) {
                aVar.f22712B = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null || aVar.f22740Y == f10) {
            return;
        }
        aVar.f22740Y = f10;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setChipStartPaddingResource(int i) throws Resources.NotFoundException {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            float dimension = aVar.f22748g0.getResources().getDimension(i);
            if (aVar.f22740Y != dimension) {
                aVar.f22740Y = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.G(C5848a.getColorStateList(aVar.f22748g0, i));
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.H(f10);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.H(aVar.f22748g0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.I(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null || aVar.f22733R == charSequence) {
            return;
        }
        String str = J0.a.f2693b;
        J0.a aVar2 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? J0.a.f2696e : J0.a.f2695d;
        aVar2.getClass();
        i.c cVar = i.f2708a;
        aVar.f22733R = aVar2.c(charSequence);
        aVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.J(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.J(aVar.f22748g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.I(A9.I.w(aVar.f22748g0, i));
        }
        f();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.K(f10);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.K(aVar.f22748g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.L(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.L(aVar.f22748g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.M(C5848a.getColorStateList(aVar.f22748g0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i10, i11, i12);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.j(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f22689f == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.f22717D0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f22697o = z10;
        d(this.f22699q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(L3.g gVar) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.f22739X = gVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.f22739X = L3.g.b(aVar.f22748g0, i);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.O(f10);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.O(aVar.f22748g0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.P(f10);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.P(aVar.f22748g0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f22689f == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.F0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f22692j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.Q(colorStateList);
        }
        this.f22689f.getClass();
        g();
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.Q(C5848a.getColorStateList(aVar.f22748g0, i));
            this.f22689f.getClass();
            g();
        }
    }

    @Override // l4.m
    public void setShapeAppearanceModel(C5290i c5290i) {
        this.f22689f.setShapeAppearanceModel(c5290i);
    }

    public void setShowMotionSpec(L3.g gVar) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.f22738W = gVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.f22738W = L3.g.b(aVar.f22748g0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.f22719E0 ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f22689f;
        if (aVar2 == null || TextUtils.equals(aVar2.f22721G, charSequence)) {
            return;
        }
        aVar2.f22721G = charSequence;
        aVar2.f22754m0.f37513d = true;
        aVar2.invalidateSelf();
        aVar2.v();
    }

    public void setTextAppearance(C4416d c4416d) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.R(c4416d);
        }
        i();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null || aVar.f22744c0 == f10) {
            return;
        }
        aVar.f22744c0 = f10;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setTextEndPaddingResource(int i) throws Resources.NotFoundException {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            float dimension = aVar.f22748g0.getResources().getDimension(i);
            if (aVar.f22744c0 != dimension) {
                aVar.f22744c0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f10) {
        super.setTextSize(i, f10);
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f10, getResources().getDisplayMetrics());
            h hVar = aVar.f22754m0;
            C4416d c4416d = hVar.f37515f;
            if (c4416d != null) {
                c4416d.f38233k = fApplyDimension;
                hVar.f37510a.setTextSize(fApplyDimension);
                aVar.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar == null || aVar.f22743b0 == f10) {
            return;
        }
        aVar.f22743b0 = f10;
        aVar.invalidateSelf();
        aVar.v();
    }

    public void setTextStartPaddingResource(int i) throws Resources.NotFoundException {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            float dimension = aVar.f22748g0.getResources().getDimension(i);
            if (aVar.f22743b0 != dimension) {
                aVar.f22743b0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.N(z10);
        }
        f();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.A(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.F(z10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.R(new C4416d(aVar.f22748g0, i));
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.a aVar = this.f22689f;
        if (aVar != null) {
            aVar.R(new C4416d(aVar.f22748g0, i));
        }
        i();
    }

    public class a extends I9.g {
        public a() {
        }

        @Override // I9.g
        public final void Z(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f22689f;
            chip.setText(aVar.f22719E0 ? aVar.f22721G : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }

        @Override // I9.g
        public final void Y(int i) {
        }
    }

    public void setInternalOnCheckedChangeListener(e<Chip> eVar) {
    }
}
