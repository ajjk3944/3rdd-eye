package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hc0 extends AppCompatCheckBox {
    public static final int[] D = {R.attr.state_indeterminate};
    public static final int[] E = {R.attr.state_error};
    public static final int[][] F = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public CompoundButton.OnCheckedChangeListener A;
    public final n4 B;
    public final fa C;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public ColorStateList l;
    public boolean m;
    public boolean n;
    public boolean o;
    public CharSequence p;
    public Drawable q;
    public Drawable r;
    public boolean s;
    public ColorStateList t;
    public ColorStateList u;
    public PorterDuff.Mode v;
    public int w;
    public int[] x;
    public boolean y;
    public CharSequence z;

    public hc0(Context context, AttributeSet attributeSet) {
        super(um.z(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        Context context2 = getContext();
        n4 n4Var = new n4(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = fq0.a;
        Drawable drawableA = aq0.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        n4Var.f = drawableA;
        drawableA.setCallback(n4Var.k);
        new m4(n4Var.f.getConstantState());
        this.B = n4Var;
        this.C = new fa(this, 2);
        Context context3 = getContext();
        this.q = hh.a(this);
        this.t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        uk2.h(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = gn0.x;
        uk2.i(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        xb4 xb4Var = new xb4(context3, typedArrayObtainStyledAttributes, 10);
        this.r = xb4Var.m(2);
        if (this.q != null && qb1.o(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == G && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.q = ob1.h(context3, R.drawable.mtrl_checkbox_button);
                this.s = true;
                if (this.r == null) {
                    this.r = ob1.h(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.u = ob1.f(context3, xb4Var, 3);
        this.v = qb1.m(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.m = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.n = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.o = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.p = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        xb4Var.z();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.w;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.l == null) {
            int i = i41.i(this, R.attr.colorControlActivated);
            int i2 = i41.i(this, R.attr.colorError);
            int i3 = i41.i(this, R.attr.colorSurface);
            int i4 = i41.i(this, R.attr.colorOnSurface);
            this.l = new ColorStateList(F, new int[]{i41.n(1.0f, i3, i2), i41.n(1.0f, i3, i), i41.n(0.54f, i3, i4), i41.n(0.38f, i3, i4), i41.n(0.38f, i3, i4)});
        }
        return this.l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.t;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        n1 n1Var;
        Drawable drawableMutate = this.q;
        ColorStateList colorStateList3 = this.t;
        PorterDuff.Mode modeB = gh.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                drawableMutate.setTintMode(modeB);
            }
        }
        this.q = drawableMutate;
        Drawable drawableMutate2 = this.r;
        ColorStateList colorStateList4 = this.u;
        PorterDuff.Mode mode = this.v;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.r = drawableMutate2;
        if (this.s) {
            n4 n4Var = this.B;
            if (n4Var != null) {
                l4 l4Var = n4Var.g;
                Drawable drawable = n4Var.f;
                fa faVar = this.C;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (faVar.a == null) {
                        faVar.a = new a4(faVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(faVar.a);
                }
                ArrayList arrayList = n4Var.j;
                if (arrayList != null && faVar != null) {
                    arrayList.remove(faVar);
                    if (n4Var.j.size() == 0 && (n1Var = n4Var.i) != null) {
                        l4Var.b.removeListener(n1Var);
                        n4Var.i = null;
                    }
                }
                Drawable drawable2 = n4Var.f;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (faVar.a == null) {
                        faVar.a = new a4(faVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(faVar.a);
                } else if (faVar != null) {
                    if (n4Var.j == null) {
                        n4Var.j = new ArrayList();
                    }
                    if (!n4Var.j.contains(faVar)) {
                        n4Var.j.add(faVar);
                        if (n4Var.i == null) {
                            n4Var.i = new n1(1, n4Var);
                        }
                        l4Var.b.addListener(n4Var.i);
                    }
                }
            }
            Drawable drawable3 = this.q;
            if ((drawable3 instanceof AnimatedStateListDrawable) && n4Var != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, n4Var, false);
                ((AnimatedStateListDrawable) this.q).addTransition(R.id.indeterminate, R.id.unchecked, n4Var, false);
            }
        }
        Drawable drawable4 = this.q;
        if (drawable4 != null && (colorStateList2 = this.t) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.r;
        if (drawable5 != null && (colorStateList = this.u) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.q;
        Drawable drawable7 = this.r;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.q;
    }

    public Drawable getButtonIconDrawable() {
        return this.r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.v;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.t;
    }

    public int getCheckedState() {
        return this.w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.p;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.w == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m && this.t == null && this.u == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        if (this.o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.x = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.n || !TextUtils.isEmpty(getText()) || (drawableA = hh.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.o) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.p));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof gc0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        gc0 gc0Var = (gc0) parcelable;
        super.onRestoreInstanceState(gc0Var.getSuperState());
        setCheckedState(gc0Var.f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        gc0 gc0Var = new gc0(super.onSaveInstanceState());
        gc0Var.f = getCheckedState();
        return gc0Var;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ob1.h(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.r = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(ob1.h(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.u == colorStateList) {
            return;
        }
        this.u = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.v == mode) {
            return;
        }
        this.v = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.t == colorStateList) {
            return;
        }
        this.t = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.n = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.w != i) {
            this.w = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.z == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.y) {
                return;
            }
            this.y = true;
            LinkedHashSet linkedHashSet = this.k;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw ex0.e(it);
                }
            }
            if (this.w != 2 && (onCheckedChangeListener = this.A) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.y = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.o == z) {
            return;
        }
        this.o = z;
        refreshDrawableState();
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            throw ex0.e(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.z = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.m = z;
        if (z) {
            gh.c(this, getMaterialThemeColorsTintList());
        } else {
            gh.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.q = drawable;
        this.s = false;
        a();
    }
}
