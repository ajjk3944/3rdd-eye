package com.google.android.material.button;

import F1.W;
import O3.i;
import O3.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C3881f;
import androidx.core.widget.h;
import c4.c;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import f.AbstractC5487d;
import f4.AbstractC5528h;
import f4.C5531k;
import f4.InterfaceC5534n;
import i.AbstractC6050a;
import i4.AbstractC6074a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x1.AbstractC8416a;

/* loaded from: classes3.dex */
public class MaterialButton extends C3881f implements Checkable, InterfaceC5534n {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f37118r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f37119s = {R.attr.state_checked};

    /* renamed from: t, reason: collision with root package name */
    private static final int f37120t = i.f17146h;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.button.a f37121d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f37122e;

    /* renamed from: f, reason: collision with root package name */
    private a f37123f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f37124g;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f37125h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f37126i;

    /* renamed from: j, reason: collision with root package name */
    private String f37127j;

    /* renamed from: k, reason: collision with root package name */
    private int f37128k;

    /* renamed from: l, reason: collision with root package name */
    private int f37129l;

    /* renamed from: m, reason: collision with root package name */
    private int f37130m;

    /* renamed from: n, reason: collision with root package name */
    private int f37131n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f37132o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f37133p;

    /* renamed from: q, reason: collision with root package name */
    private int f37134q;

    interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    static class b extends L1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f37135c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f37135c = parcel.readInt() == 1;
        }

        @Override // L1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f37135c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, O3.a.f16979r);
    }

    private boolean b() {
        int i10 = this.f37134q;
        return i10 == 3 || i10 == 4;
    }

    private boolean c() {
        int i10 = this.f37134q;
        return i10 == 1 || i10 == 2;
    }

    private boolean d() {
        int i10 = this.f37134q;
        return i10 == 16 || i10 == 32;
    }

    private boolean e() {
        return W.z(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f37121d;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void g() {
        if (c()) {
            h.i(this, this.f37126i, null, null, null);
        } else if (b()) {
            h.i(this, null, null, this.f37126i, null);
        } else if (d()) {
            h.i(this, null, this.f37126i, null, null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private void h(boolean z10) {
        Drawable drawable = this.f37126i;
        if (drawable != null) {
            Drawable drawableMutate = AbstractC8416a.r(drawable).mutate();
            this.f37126i = drawableMutate;
            AbstractC8416a.o(drawableMutate, this.f37125h);
            PorterDuff.Mode mode = this.f37124g;
            if (mode != null) {
                AbstractC8416a.p(this.f37126i, mode);
            }
            int intrinsicWidth = this.f37128k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f37126i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f37128k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f37126i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f37126i;
            int i10 = this.f37129l;
            int i11 = this.f37130m;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f37126i.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] drawableArrA = h.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.f37126i) && ((!b() || drawable5 == this.f37126i) && (!d() || drawable4 == this.f37126i))) {
            return;
        }
        g();
    }

    private void i(int i10, int i11) {
        if (this.f37126i == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f37129l = 0;
                if (this.f37134q == 16) {
                    this.f37130m = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f37128k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f37126i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f37131n) - getPaddingBottom()) / 2);
                if (this.f37130m != iMax) {
                    this.f37130m = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f37130m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f37134q;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f37129l = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f37128k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f37126i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - W.D(this)) - intrinsicWidth) - this.f37131n) - W.E(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f37134q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f37129l != textLayoutWidth) {
            this.f37129l = textLayoutWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f37121d;
        return aVar != null && aVar.p();
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f37127j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f37127j;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f37121d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f37126i;
    }

    public int getIconGravity() {
        return this.f37134q;
    }

    public int getIconPadding() {
        return this.f37131n;
    }

    public int getIconSize() {
        return this.f37128k;
    }

    public ColorStateList getIconTint() {
        return this.f37125h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f37124g;
    }

    public int getInsetBottom() {
        return this.f37121d.c();
    }

    public int getInsetTop() {
        return this.f37121d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f37121d.h();
        }
        return null;
    }

    public C5531k getShapeAppearanceModel() {
        if (f()) {
            return this.f37121d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f37121d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f37121d.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C3881f
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f37121d.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C3881f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f37121d.m() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f37132o;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            AbstractC5528h.f(this, this.f37121d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f37118r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f37119s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C3881f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C3881f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C3881f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f37135c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f37135c = this.f37132o;
        return bVar;
    }

    @Override // androidx.appcompat.widget.C3881f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f37121d.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f37126i != null) {
            if (this.f37126i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    void setA11yClassName(String str) {
        this.f37127j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f37121d.s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.C3881f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f37121d.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C3881f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? AbstractC6050a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f37121d.u(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f37132o != z10) {
            this.f37132o = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f37132o);
            }
            if (this.f37133p) {
                return;
            }
            this.f37133p = true;
            Iterator it = this.f37122e.iterator();
            if (it.hasNext()) {
                AbstractC5487d.a(it.next());
                throw null;
            }
            this.f37133p = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f37121d.v(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f37121d.f().S(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f37126i != drawable) {
            this.f37126i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f37134q != i10) {
            this.f37134q = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f37131n != i10) {
            this.f37131n = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? AbstractC6050a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f37128k != i10) {
            this.f37128k = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f37125h != colorStateList) {
            this.f37125h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f37124g != mode) {
            this.f37124g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(AbstractC6050a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f37121d.w(i10);
    }

    public void setInsetTop(int i10) {
        this.f37121d.x(i10);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(a aVar) {
        this.f37123f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        a aVar = this.f37123f;
        if (aVar != null) {
            aVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f37121d.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(AbstractC6050a.a(getContext(), i10));
        }
    }

    @Override // f4.InterfaceC5534n
    public void setShapeAppearanceModel(C5531k c5531k) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f37121d.z(c5531k);
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f37121d.A(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f37121d.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(AbstractC6050a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f37121d.C(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.C3881f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f37121d.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C3881f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f37121d.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f37121d.F(z10);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f37132o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f37120t;
        super(AbstractC6074a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f37122e = new LinkedHashSet();
        this.f37132o = false;
        this.f37133p = false;
        Context context2 = getContext();
        TypedArray typedArrayI = k.i(context2, attributeSet, j.f17359a2, i10, i11, new int[0]);
        this.f37131n = typedArrayI.getDimensionPixelSize(j.f17463n2, 0);
        this.f37124g = n.i(typedArrayI.getInt(j.f17487q2, -1), PorterDuff.Mode.SRC_IN);
        this.f37125h = c.a(getContext(), typedArrayI, j.f17479p2);
        this.f37126i = c.d(getContext(), typedArrayI, j.f17447l2);
        this.f37134q = typedArrayI.getInteger(j.f17455m2, 1);
        this.f37128k = typedArrayI.getDimensionPixelSize(j.f17471o2, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, C5531k.e(context2, attributeSet, i10, i11).m());
        this.f37121d = aVar;
        aVar.r(typedArrayI);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f37131n);
        h(this.f37126i != null);
    }
}
