package com.google.android.material.checkbox;

import B3.c;
import B3.x;
import M0.b;
import M0.d;
import M0.f;
import a4.t;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.apm.insight.R;
import com.bumptech.glide.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C2731p;
import o3.C2761a;

/* loaded from: classes.dex */
public class MaterialCheckBox extends C2731p {
    public static final int[] M = {R.attr.state_indeterminate};

    /* renamed from: N, reason: collision with root package name */
    public static final int[] f18215N = {R.attr.state_error};

    /* renamed from: O, reason: collision with root package name */
    public static final int[][] f18216O = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: P, reason: collision with root package name */
    public static final int f18217P = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f18218C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f18219D;

    /* renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f18220E;

    /* renamed from: F, reason: collision with root package name */
    public int f18221F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f18222G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f18223H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f18224I;

    /* renamed from: J, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f18225J;

    /* renamed from: K, reason: collision with root package name */
    public final f f18226K;

    /* renamed from: L, reason: collision with root package name */
    public final c f18227L;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f18228e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f18229f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f18230g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18231h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18232j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f18233k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f18234l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f18235m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18236n;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCheckBox(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i = this.f18221F;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f18230g == null) {
            int iM = e.m(R.attr.colorControlActivated, this);
            int iM2 = e.m(R.attr.colorError, this);
            int iM3 = e.m(R.attr.colorSurface, this);
            int iM4 = e.m(R.attr.colorOnSurface, this);
            this.f18230g = new ColorStateList(f18216O, new int[]{e.t(1.0f, iM3, iM2), e.t(1.0f, iM3, iM), e.t(0.54f, iM3, iM4), e.t(0.38f, iM3, iM4), e.t(0.38f, iM3, iM4)});
        }
        return this.f18230g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f18218C;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        x xVar;
        Drawable drawableMutate = this.f18234l;
        ColorStateList colorStateList3 = this.f18218C;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f18234l = drawableMutate;
        Drawable drawableMutate2 = this.f18235m;
        ColorStateList colorStateList4 = this.f18219D;
        PorterDuff.Mode mode = this.f18220E;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f18235m = drawableMutate2;
        if (this.f18236n) {
            f fVar = this.f18226K;
            if (fVar != null) {
                d dVar = fVar.f2636b;
                Drawable drawable = fVar.f2644a;
                c cVar = this.f18227L;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (cVar.f543a == null) {
                        cVar.f543a = new b(cVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(cVar.f543a);
                }
                ArrayList arrayList = fVar.f2639e;
                if (arrayList != null && cVar != null) {
                    arrayList.remove(cVar);
                    if (fVar.f2639e.size() == 0 && (xVar = fVar.f2638d) != null) {
                        dVar.f2630b.removeListener(xVar);
                        fVar.f2638d = null;
                    }
                }
                Drawable drawable2 = fVar.f2644a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (cVar.f543a == null) {
                        cVar.f543a = new b(cVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(cVar.f543a);
                } else if (cVar != null) {
                    if (fVar.f2639e == null) {
                        fVar.f2639e = new ArrayList();
                    }
                    if (!fVar.f2639e.contains(cVar)) {
                        fVar.f2639e.add(cVar);
                        if (fVar.f2638d == null) {
                            fVar.f2638d = new x(4, fVar);
                        }
                        dVar.f2630b.addListener(fVar.f2638d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f18234l;
                if ((drawable3 instanceof AnimatedStateListDrawable) && fVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                    ((AnimatedStateListDrawable) this.f18234l).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
                }
            }
        }
        Drawable drawable4 = this.f18234l;
        if (drawable4 != null && (colorStateList2 = this.f18218C) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f18235m;
        if (drawable5 != null && (colorStateList = this.f18219D) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f18234l;
        Drawable drawable7 = this.f18235m;
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
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
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
        return this.f18234l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f18235m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f18219D;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f18220E;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f18218C;
    }

    public int getCheckedState() {
        return this.f18221F;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f18233k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f18221F == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18231h && this.f18218C == null && this.f18219D == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, M);
        }
        if (this.f18232j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18215N);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i6 = iArrOnCreateDrawableState[i3];
            if (i6 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i6 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i3] = 16842912;
                break;
            }
            i3++;
        }
        this.f18222G = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.i || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
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
        if (accessibilityNodeInfo != null && this.f18232j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f18233k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2761a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2761a c2761a = (C2761a) parcelable;
        super.onRestoreInstanceState(c2761a.getSuperState());
        setCheckedState(c2761a.f22700a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C2761a c2761a = new C2761a(super.onSaveInstanceState());
        c2761a.f22700a = getCheckedState();
        return c2761a;
    }

    @Override // o.C2731p, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(t.i(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f18235m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(t.i(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f18219D == colorStateList) {
            return;
        }
        this.f18219D = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f18220E == mode) {
            return;
        }
        this.f18220E = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f18218C == colorStateList) {
            return;
        }
        this.f18218C = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z6) {
        this.i = z6;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        setCheckedState(z6 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f18221F != i) {
            this.f18221F = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30 && this.f18224I == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f18223H) {
                return;
            }
            this.f18223H = true;
            LinkedHashSet linkedHashSet = this.f18229f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw A.f.f(it);
                }
            }
            if (this.f18221F != 2 && (onCheckedChangeListener = this.f18225J) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i3 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f18223H = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f18233k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z6) {
        if (this.f18232j == z6) {
            return;
        }
        this.f18232j = z6;
        refreshDrawableState();
        Iterator it = this.f18228e.iterator();
        if (it.hasNext()) {
            throw A.f.f(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f18225J = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f18224I = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f18231h = z6;
        if (z6) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // o.C2731p, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f18234l = drawable;
        this.f18236n = false;
        a();
    }
}
