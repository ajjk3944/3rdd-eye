package T3;

import A9.I;
import B4.f;
import D0.a;
import L1.d;
import L1.e;
import android.annotation.SuppressLint;
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
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.github.appintro.AppIntroBaseFragmentKt;
import d4.n;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: MaterialCheckBox.java */
/* loaded from: classes2.dex */
public final class a extends AppCompatCheckBox {

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet<c> f12252f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet<b> f12253g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f12254h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12255j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12256k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f12257l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f12258m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f12259n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12260o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f12261p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f12262q;

    /* renamed from: r, reason: collision with root package name */
    public PorterDuff.Mode f12263r;

    /* renamed from: s, reason: collision with root package name */
    public int f12264s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f12265t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12266u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f12267v;

    /* renamed from: w, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f12268w;

    /* renamed from: x, reason: collision with root package name */
    public final L1.d f12269x;

    /* renamed from: y, reason: collision with root package name */
    public final C0171a f12270y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f12251z = {R.attr.state_indeterminate};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f12248A = {R.attr.state_error};

    /* renamed from: B, reason: collision with root package name */
    public static final int[][] f12249B = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: C, reason: collision with root package name */
    @SuppressLint({"DiscouragedApi"})
    public static final int f12250C = Resources.getSystem().getIdentifier("btn_check_material_anim", AppIntroBaseFragmentKt.ARG_DRAWABLE, ConstantDeviceInfo.APP_PLATFORM);

    /* compiled from: MaterialCheckBox.java */
    /* renamed from: T3.a$a, reason: collision with other inner class name */
    public class C0171a extends L1.c {
        public C0171a() {
        }

        @Override // L1.c
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = a.this.f12261p;
            if (colorStateList != null) {
                a.C0009a.h(drawable, colorStateList);
            }
        }

        @Override // L1.c
        public final void b(Drawable drawable) {
            a aVar = a.this;
            ColorStateList colorStateList = aVar.f12261p;
            if (colorStateList != null) {
                a.C0009a.g(drawable, colorStateList.getColorForState(aVar.f12265t, colorStateList.getDefaultColor()));
            }
        }
    }

    /* compiled from: MaterialCheckBox.java */
    public interface b {
        void a();
    }

    /* compiled from: MaterialCheckBox.java */
    public interface c {
        void a();
    }

    /* compiled from: MaterialCheckBox.java */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new C0172a();

        /* renamed from: b, reason: collision with root package name */
        public int f12272b;

        /* compiled from: MaterialCheckBox.java */
        /* renamed from: T3.a$d$a, reason: collision with other inner class name */
        public class C0172a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d(parcel);
                dVar.f12272b = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.f12272b;
            return f.c(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f12272b));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r12, android.util.AttributeSet r13) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.a.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i = this.f12264s;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12254h == null) {
            int iM = B7.d.m(R.attr.colorControlActivated, this);
            int iM2 = B7.d.m(R.attr.colorError, this);
            int iM3 = B7.d.m(R.attr.colorSurface, this);
            int iM4 = B7.d.m(R.attr.colorOnSurface, this);
            this.f12254h = new ColorStateList(f12249B, new int[]{B7.d.s(1.0f, iM3, iM2), B7.d.s(1.0f, iM3, iM), B7.d.s(0.54f, iM3, iM4), B7.d.s(0.38f, iM3, iM4), B7.d.s(0.38f, iM3, iM4)});
        }
        return this.f12254h;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f12261p;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e eVar;
        Drawable drawableMutate = this.f12258m;
        ColorStateList colorStateList3 = this.f12261p;
        PorterDuff.Mode modeB = R0.b.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                a.C0009a.i(drawableMutate, modeB);
            }
        }
        this.f12258m = drawableMutate;
        Drawable drawableMutate2 = this.f12259n;
        ColorStateList colorStateList4 = this.f12262q;
        PorterDuff.Mode mode = this.f12263r;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                a.C0009a.i(drawableMutate2, mode);
            }
        }
        this.f12259n = drawableMutate2;
        if (this.f12260o) {
            L1.d dVar = this.f12269x;
            if (dVar != null) {
                Drawable drawable = dVar.f3968b;
                C0171a c0171a = this.f12270y;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c0171a.f3951a == null) {
                        c0171a.f3951a = new L1.b(c0171a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0171a.f3951a);
                }
                ArrayList<L1.c> arrayList = dVar.f3956f;
                d.b bVar = dVar.f3953c;
                if (arrayList != null && c0171a != null) {
                    arrayList.remove(c0171a);
                    if (dVar.f3956f.size() == 0 && (eVar = dVar.f3955e) != null) {
                        bVar.f3960b.removeListener(eVar);
                        dVar.f3955e = null;
                    }
                }
                Drawable drawable2 = dVar.f3968b;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c0171a.f3951a == null) {
                        c0171a.f3951a = new L1.b(c0171a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0171a.f3951a);
                } else if (c0171a != null) {
                    if (dVar.f3956f == null) {
                        dVar.f3956f = new ArrayList<>();
                    }
                    if (!dVar.f3956f.contains(c0171a)) {
                        dVar.f3956f.add(c0171a);
                        if (dVar.f3955e == null) {
                            dVar.f3955e = new e(dVar, 0);
                        }
                        bVar.f3960b.addListener(dVar.f3955e);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f12258m;
                if ((drawable3 instanceof AnimatedStateListDrawable) && dVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, dVar, false);
                    ((AnimatedStateListDrawable) this.f12258m).addTransition(R.id.indeterminate, R.id.unchecked, dVar, false);
                }
            }
        }
        Drawable drawable4 = this.f12258m;
        if (drawable4 != null && (colorStateList2 = this.f12261p) != null) {
            a.C0009a.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f12259n;
        if (drawable5 != null && (colorStateList = this.f12262q) != null) {
            a.C0009a.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f12258m;
        Drawable drawable7 = this.f12259n;
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
        return this.f12258m;
    }

    public Drawable getButtonIconDrawable() {
        return this.f12259n;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f12262q;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f12263r;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f12261p;
    }

    public int getCheckedState() {
        return this.f12264s;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f12257l;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f12264s == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i && this.f12261p == null && this.f12262q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12251z);
        }
        if (this.f12256k) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12248A);
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
        this.f12265t = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f12255j || !TextUtils.isEmpty(getText()) || (drawableA = R0.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (n.a(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            a.C0009a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f12256k) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f12257l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f12272b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f12272b = getCheckedState();
        return dVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(I.w(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f12259n = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(I.w(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f12262q == colorStateList) {
            return;
        }
        this.f12262q = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f12263r == mode) {
            return;
        }
        this.f12263r = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f12261p == colorStateList) {
            return;
        }
        this.f12261p = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f12255j = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f12264s != i) {
            this.f12264s = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f12267v == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f12266u) {
                return;
            }
            this.f12266u = true;
            LinkedHashSet<b> linkedHashSet = this.f12253g;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.f12264s != 2 && (onCheckedChangeListener = this.f12268w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f12266u = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f12257l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f12256k == z10) {
            return;
        }
        this.f12256k = z10;
        refreshDrawableState();
        Iterator<c> it = this.f12252f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f12268w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f12267v = charSequence;
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
        this.i = z10;
        if (z10) {
            R0.b.c(this, getMaterialThemeColorsTintList());
        } else {
            R0.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f12258m = drawable;
        this.f12260o = false;
        b();
    }
}
