package com.google.android.material.checkbox;

import android.R;
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
import ed.e;
import ed.j;
import ed.k;
import ed.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import u7.f;
import w.g;
import xu.d;

/* loaded from: classes.dex */
public final class b extends AppCompatCheckBox {
    public static final int U = k.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] V = {ed.b.state_indeterminate};
    public static final int[] W;

    /* renamed from: a0, reason: collision with root package name */
    public static final int[][] f5566a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f5567b0;
    public ColorStateList B;
    public boolean D;
    public boolean E;
    public boolean F;
    public CharSequence G;
    public Drawable H;
    public Drawable I;
    public boolean J;
    public ColorStateList K;
    public ColorStateList L;
    public PorterDuff.Mode M;
    public int N;
    public int[] O;
    public boolean P;
    public CharSequence Q;
    public CompoundButton.OnCheckedChangeListener R;
    public final f S;
    public final pd.a T;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f5568x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f5569y;

    static {
        int i10 = ed.b.state_error;
        W = new int[]{i10};
        f5566a0 = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f5567b0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i10 = h.a.checkboxStyle;
        int i11 = U;
        super(le.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        this.f5568x = new LinkedHashSet();
        this.f5569y = new LinkedHashSet();
        Context context2 = getContext();
        int i12 = e.mtrl_checkbox_button_checked_unchecked;
        f fVar = new f(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = j3.k.f13193a;
        Drawable drawable = resources.getDrawable(i12, theme);
        fVar.f23391a = drawable;
        drawable.setCallback(fVar.f23390y);
        new u7.e(fVar.f23391a.getConstantState());
        this.S = fVar;
        this.T = new pd.a(this);
        Context context3 = getContext();
        this.H = getButtonDrawable();
        this.K = getSuperButtonTintList();
        setSupportButtonTintList(null);
        io.sentry.k kVarE = xd.k.e(context3, attributeSet, l.MaterialCheckBox, i10, i11, new int[0]);
        TypedArray typedArray = (TypedArray) kVarE.f12398g;
        this.I = kVarE.U(l.MaterialCheckBox_buttonIcon);
        if (this.H != null && d.d0(context3, ed.b.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(l.MaterialCheckBox_android_button, 0);
            int resourceId2 = typedArray.getResourceId(l.MaterialCheckBox_buttonCompat, 0);
            if (resourceId == f5567b0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.H = ic.a.r(context3, e.mtrl_checkbox_button);
                this.J = true;
                if (this.I == null) {
                    this.I = ic.a.r(context3, e.mtrl_checkbox_button_icon);
                }
            }
        }
        this.L = xu.l.r(context3, kVarE, l.MaterialCheckBox_buttonIconTint);
        this.M = xd.l.d(typedArray.getInt(l.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.D = typedArray.getBoolean(l.MaterialCheckBox_useMaterialThemeColors, false);
        this.E = typedArray.getBoolean(l.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.F = typedArray.getBoolean(l.MaterialCheckBox_errorShown, false);
        this.G = typedArray.getText(l.MaterialCheckBox_errorAccessibilityLabel);
        if (typedArray.hasValue(l.MaterialCheckBox_checkedState)) {
            setCheckedState(typedArray.getInt(l.MaterialCheckBox_checkedState, 0));
        }
        kVarE.l0();
        a();
    }

    private String getButtonStateDescription() {
        int i10 = this.N;
        return i10 == 1 ? getResources().getString(j.mtrl_checkbox_state_description_checked) : i10 == 0 ? getResources().getString(j.mtrl_checkbox_state_description_unchecked) : getResources().getString(j.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.B == null) {
            int iV = io.sentry.config.a.V(this, h.a.colorControlActivated);
            int iV2 = io.sentry.config.a.V(this, h.a.colorError);
            int iV3 = io.sentry.config.a.V(this, ed.b.colorSurface);
            int iV4 = io.sentry.config.a.V(this, ed.b.colorOnSurface);
            this.B = new ColorStateList(f5566a0, new int[]{io.sentry.config.a.b0(iV3, 1.0f, iV2), io.sentry.config.a.b0(iV3, 1.0f, iV), io.sentry.config.a.b0(iV3, 0.54f, iV4), io.sentry.config.a.b0(iV3, 0.38f, iV4), io.sentry.config.a.b0(iV3, 0.38f, iV4)});
        }
        return this.B;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.K;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        id.b bVar;
        Drawable drawableMutate = this.H;
        ColorStateList colorStateList3 = this.K;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.H = drawableMutate;
        Drawable drawableMutate2 = this.I;
        ColorStateList colorStateList4 = this.L;
        PorterDuff.Mode mode = this.M;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.I = drawableMutate2;
        if (this.J) {
            f fVar = this.S;
            if (fVar != null) {
                u7.d dVar = fVar.f23386d;
                Drawable drawable = fVar.f23391a;
                pd.a aVar = this.T;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f20461a == null) {
                        aVar.f20461a = new u7.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f20461a);
                }
                ArrayList arrayList = fVar.f23389x;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.f23389x.size() == 0 && (bVar = fVar.f23388r) != null) {
                        dVar.f23381b.removeListener(bVar);
                        fVar.f23388r = null;
                    }
                }
                Drawable drawable2 = fVar.f23391a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f20461a == null) {
                        aVar.f20461a = new u7.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f20461a);
                } else if (aVar != null) {
                    if (fVar.f23389x == null) {
                        fVar.f23389x = new ArrayList();
                    }
                    if (!fVar.f23389x.contains(aVar)) {
                        fVar.f23389x.add(aVar);
                        if (fVar.f23388r == null) {
                            fVar.f23388r = new id.b(6, fVar);
                        }
                        dVar.f23381b.addListener(fVar.f23388r);
                    }
                }
            }
            Drawable drawable3 = this.H;
            if ((drawable3 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(ed.f.checked, ed.f.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.H).addTransition(ed.f.indeterminate, ed.f.unchecked, fVar, false);
            }
        }
        Drawable drawable4 = this.H;
        if (drawable4 != null && (colorStateList2 = this.K) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.I;
        if (drawable5 != null && (colorStateList = this.L) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.H;
        Drawable drawable7 = this.I;
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
                float f10 = intrinsicWidth / intrinsicHeight;
                if (f10 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f10);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f10 * intrinsicHeight);
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
        return this.H;
    }

    public Drawable getButtonIconDrawable() {
        return this.I;
    }

    public ColorStateList getButtonIconTintList() {
        return this.L;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.M;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.K;
    }

    public int getCheckedState() {
        return this.N;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.G;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.N == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D && this.K == null && this.L == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V);
        }
        if (this.F) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, W);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i12 = iArrOnCreateDrawableState[i11];
            if (i12 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i12 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i11] = 16842912;
                break;
            }
            i11++;
        }
        this.O = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.E || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.F) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.G));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MaterialCheckBox$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MaterialCheckBox$SavedState materialCheckBox$SavedState = (MaterialCheckBox$SavedState) parcelable;
        super.onRestoreInstanceState(materialCheckBox$SavedState.getSuperState());
        setCheckedState(materialCheckBox$SavedState.f5565a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(super.onSaveInstanceState());
        materialCheckBox$SavedState.f5565a = getCheckedState();
        return materialCheckBox$SavedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(ic.a.r(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.I = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(ic.a.r(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.L == colorStateList) {
            return;
        }
        this.L = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.M == mode) {
            return;
        }
        this.M = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.K == colorStateList) {
            return;
        }
        this.K = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.E = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.N != i10) {
            this.N = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && this.Q == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.P) {
                return;
            }
            this.P = true;
            LinkedHashSet linkedHashSet = this.f5569y;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw g.d(it);
                }
            }
            if (this.N != 2 && (onCheckedChangeListener = this.R) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i11 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.P = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.G = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.F == z10) {
            return;
        }
        this.F = z10;
        refreshDrawableState();
        Iterator it = this.f5568x.iterator();
        if (it.hasNext()) {
            throw g.d(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.R = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.Q = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.D = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.H = drawable;
        this.J = false;
        a();
    }
}
