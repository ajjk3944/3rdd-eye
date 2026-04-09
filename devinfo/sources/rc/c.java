package rc;

import ad.g;
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
import androidx.appcompat.widget.AppCompatCheckBox;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import je.u;
import k6.e;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends AppCompatCheckBox {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f32906e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f32907f;
    public ColorStateList g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32908h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f32909i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f32910k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f32911l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f32912m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32913n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f32914o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f32915p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f32916q;

    /* renamed from: r, reason: collision with root package name */
    public int f32917r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f32918s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f32919t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f32920u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f32921v;

    /* renamed from: w, reason: collision with root package name */
    public final e f32922w;

    /* renamed from: x, reason: collision with root package name */
    public final a f32923x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f32904y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f32905z = {R.attr.state_error};
    public static final int[][] A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i4 = this.f32917r;
        return i4 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i4 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.g == null) {
            int i4 = i0.i(R.attr.colorControlActivated, this);
            int i10 = i0.i(R.attr.colorError, this);
            int i11 = i0.i(R.attr.colorSurface, this);
            int i12 = i0.i(R.attr.colorOnSurface, this);
            this.g = new ColorStateList(A, new int[]{i0.o(1.0f, i11, i10), i0.o(1.0f, i11, i4), i0.o(0.54f, i11, i12), i0.o(0.38f, i11, i12), i0.o(0.38f, i11, i12)});
        }
        return this.g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f32914o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        g gVar;
        Drawable drawableMutate = this.f32911l;
        ColorStateList colorStateList3 = this.f32914o;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f32911l = drawableMutate;
        Drawable drawableMutate2 = this.f32912m;
        ColorStateList colorStateList4 = this.f32915p;
        PorterDuff.Mode mode = this.f32916q;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f32912m = drawableMutate2;
        if (this.f32913n) {
            e eVar = this.f32922w;
            if (eVar != null) {
                k6.c cVar = eVar.f27976b;
                Drawable drawable = eVar.f27984a;
                a aVar = this.f32923x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f32901a == null) {
                        aVar.f32901a = new k6.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f32901a);
                }
                ArrayList arrayList = eVar.f27979e;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (eVar.f27979e.size() == 0 && (gVar = eVar.f27978d) != null) {
                        cVar.f27971b.removeListener(gVar);
                        eVar.f27978d = null;
                    }
                }
                Drawable drawable2 = eVar.f27984a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f32901a == null) {
                        aVar.f32901a = new k6.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f32901a);
                } else if (aVar != null) {
                    if (eVar.f27979e == null) {
                        eVar.f27979e = new ArrayList();
                    }
                    if (!eVar.f27979e.contains(aVar)) {
                        eVar.f27979e.add(aVar);
                        if (eVar.f27978d == null) {
                            eVar.f27978d = new g(5, eVar);
                        }
                        cVar.f27971b.addListener(eVar.f27978d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f32911l;
                if ((drawable3 instanceof AnimatedStateListDrawable) && eVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, eVar, false);
                    ((AnimatedStateListDrawable) this.f32911l).addTransition(R.id.indeterminate, R.id.unchecked, eVar, false);
                }
            }
        }
        Drawable drawable4 = this.f32911l;
        if (drawable4 != null && (colorStateList2 = this.f32914o) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f32912m;
        if (drawable5 != null && (colorStateList = this.f32915p) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f32911l;
        Drawable drawable7 = this.f32912m;
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
        return this.f32911l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f32912m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f32915p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f32916q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f32914o;
    }

    public int getCheckedState() {
        return this.f32917r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f32910k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f32917r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32908h && this.f32914o == null && this.f32915p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f32904y);
        }
        if (this.j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f32905z);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i11 = iArrOnCreateDrawableState[i10];
            if (i11 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i11 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i10] = 16842912;
                break;
            }
            i10++;
        }
        this.f32918s = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f32909i || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
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
        if (accessibilityNodeInfo != null && this.j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f32910k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f32903a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f32903a = getCheckedState();
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(jm.a.l(i4, getContext()));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f32912m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i4) {
        setButtonIconDrawable(jm.a.l(i4, getContext()));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f32915p == colorStateList) {
            return;
        }
        this.f32915p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f32916q == mode) {
            return;
        }
        this.f32916q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f32914o == colorStateList) {
            return;
        }
        this.f32914o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z3) {
        this.f32909i = z3;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        setCheckedState(z3 ? 1 : 0);
    }

    public void setCheckedState(int i4) {
        AutofillManager autofillManagerF;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f32917r != i4) {
            this.f32917r = i4;
            super.setChecked(i4 == 1);
            refreshDrawableState();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && this.f32920u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f32919t) {
                return;
            }
            this.f32919t = true;
            LinkedHashSet linkedHashSet = this.f32907f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw u.o(it);
                }
            }
            if (this.f32917r != 2 && (onCheckedChangeListener = this.f32921v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i10 >= 26 && (autofillManagerF = f4.b.f(getContext().getSystemService(f4.b.i()))) != null) {
                autofillManagerF.notifyValueChanged(this);
            }
            this.f32919t = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f32910k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i4) {
        setErrorAccessibilityLabel(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setErrorShown(boolean z3) {
        if (this.j == z3) {
            return;
        }
        this.j = z3;
        refreshDrawableState();
        Iterator it = this.f32906e.iterator();
        if (it.hasNext()) {
            throw u.o(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f32921v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f32920u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f32908h = z3;
        if (z3) {
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
        this.f32911l = drawable;
        this.f32913n = false;
        a();
    }
}
