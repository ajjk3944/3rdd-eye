package p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.internal.ads.be1;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class p extends Button implements j4.l {

    /* renamed from: a, reason: collision with root package name */
    public final be1 f30803a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f30804b;

    /* renamed from: c, reason: collision with root package name */
    public u f30805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet, int i4) throws Resources.NotFoundException {
        super(context, attributeSet, i4);
        e3.a(context);
        d3.a(getContext(), this);
        be1 be1Var = new be1(this);
        this.f30803a = be1Var;
        be1Var.x(attributeSet, i4);
        t0 t0Var = new t0(this);
        this.f30804b = t0Var;
        t0Var.f(attributeSet, i4);
        t0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i4);
    }

    private u getEmojiTextViewHelper() {
        if (this.f30805c == null) {
            this.f30805c = new u(this);
        }
        return this.f30805c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        be1 be1Var = this.f30803a;
        if (be1Var != null) {
            be1Var.a();
        }
        t0 t0Var = this.f30804b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (v3.f30898c) {
            return super.getAutoSizeMaxTextSize();
        }
        t0 t0Var = this.f30804b;
        if (t0Var != null) {
            return Math.round(((b1) t0Var.f30873l).f30626e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (v3.f30898c) {
            return super.getAutoSizeMinTextSize();
        }
        t0 t0Var = this.f30804b;
        if (t0Var != null) {
            return Math.round(((b1) t0Var.f30873l).f30625d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (v3.f30898c) {
            return super.getAutoSizeStepGranularity();
        }
        t0 t0Var = this.f30804b;
        if (t0Var != null) {
            return Math.round(((b1) t0Var.f30873l).f30624c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (v3.f30898c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        t0 t0Var = this.f30804b;
        return t0Var != null ? ((b1) t0Var.f30873l).f30627f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (v3.f30898c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        t0 t0Var = this.f30804b;
        if (t0Var != null) {
            return ((b1) t0Var.f30873l).f30622a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return pk.a.w(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        be1 be1Var = this.f30803a;
        if (be1Var != null) {
            return be1Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        be1 be1Var = this.f30803a;
        if (be1Var != null) {
            return be1Var.v();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f30804b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f30804b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
        t0 t0Var = this.f30804b;
        if (t0Var == null || v3.f30898c) {
            return;
        }
        ((b1) t0Var.f30873l).a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i10, int i11) {
        super.onTextChanged(charSequence, i4, i10, i11);
        t0 t0Var = this.f30804b;
        if (t0Var != null) {
            b1 b1Var = (b1) t0Var.f30873l;
            if (v3.f30898c || !b1Var.f()) {
                return;
            }
            b1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i10, int i11, int i12) {
        if (v3.f30898c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i10, i11, i12);
            return;
        }
        t0 t0Var = this.f30804b;
        if (t0Var != null) {
            t0Var.h(i4, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (v3.f30898c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        t0 t0Var = this.f30804b;
        if (t0Var != null) {
            t0Var.i(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (v3.f30898c) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        t0 t0Var = this.f30804b;
        if (t0Var != null) {
            t0Var.j(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        be1 be1Var = this.f30803a;
        if (be1Var != null) {
            be1Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        be1 be1Var = this.f30803a;
        if (be1Var != null) {
            be1Var.A(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(pk.a.z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z3) {
        t0 t0Var = this.f30804b;
        if (t0Var != null) {
            ((TextView) t0Var.f30867d).setAllCaps(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        be1 be1Var = this.f30803a;
        if (be1Var != null) {
            be1Var.F(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        be1 be1Var = this.f30803a;
        if (be1Var != null) {
            be1Var.G(mode);
        }
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        t0 t0Var = this.f30804b;
        t0Var.k(colorStateList);
        t0Var.b();
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        t0 t0Var = this.f30804b;
        t0Var.l(mode);
        t0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) throws Resources.NotFoundException {
        super.setTextAppearance(context, i4);
        t0 t0Var = this.f30804b;
        if (t0Var != null) {
            t0Var.g(i4, context);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z3 = v3.f30898c;
        if (z3) {
            super.setTextSize(i4, f10);
            return;
        }
        t0 t0Var = this.f30804b;
        if (t0Var != null) {
            b1 b1Var = (b1) t0Var.f30873l;
            if (z3 || b1Var.f()) {
                return;
            }
            b1Var.g(i4, f10);
        }
    }
}
