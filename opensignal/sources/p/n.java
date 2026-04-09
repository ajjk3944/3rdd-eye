package p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class n extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final h7.b f20116a;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f20117d;

    /* renamed from: g, reason: collision with root package name */
    public s f20118g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i2.a(context);
        h2.a(getContext(), this);
        h7.b bVar = new h7.b(this);
        this.f20116a = bVar;
        bVar.k(attributeSet, i10);
        m0 m0Var = new m0(this);
        this.f20117d = m0Var;
        m0Var.f(attributeSet, i10);
        m0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private s getEmojiTextViewHelper() {
        if (this.f20118g == null) {
            this.f20118g = new s(this);
        }
        return this.f20118g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h7.b bVar = this.f20116a;
        if (bVar != null) {
            bVar.a();
        }
        m0 m0Var = this.f20117d;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (z2.f20222c) {
            return super.getAutoSizeMaxTextSize();
        }
        m0 m0Var = this.f20117d;
        if (m0Var != null) {
            return Math.round(m0Var.f20113i.f20195e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (z2.f20222c) {
            return super.getAutoSizeMinTextSize();
        }
        m0 m0Var = this.f20117d;
        if (m0Var != null) {
            return Math.round(m0Var.f20113i.f20194d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (z2.f20222c) {
            return super.getAutoSizeStepGranularity();
        }
        m0 m0Var = this.f20117d;
        if (m0Var != null) {
            return Math.round(m0Var.f20113i.f20193c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (z2.f20222c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        m0 m0Var = this.f20117d;
        return m0Var != null ? m0Var.f20113i.f20196f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (z2.f20222c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        m0 m0Var = this.f20117d;
        if (m0Var != null) {
            return m0Var.f20113i.f20191a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ic.a.Q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        h7.b bVar = this.f20116a;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h7.b bVar = this.f20116a;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f20117d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f20117d.e();
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m0 m0Var = this.f20117d;
        if (m0Var == null || z2.f20222c) {
            return;
        }
        m0Var.f20113i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m0 m0Var = this.f20117d;
        if (m0Var != null) {
            v0 v0Var = m0Var.f20113i;
            if (z2.f20222c || !v0Var.f()) {
                return;
            }
            v0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (z2.f20222c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        m0 m0Var = this.f20117d;
        if (m0Var != null) {
            m0Var.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (z2.f20222c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        m0 m0Var = this.f20117d;
        if (m0Var != null) {
            m0Var.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (z2.f20222c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        m0 m0Var = this.f20117d;
        if (m0Var != null) {
            m0Var.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h7.b bVar = this.f20116a;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        h7.b bVar = this.f20116a;
        if (bVar != null) {
            bVar.n(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ic.a.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        m0 m0Var = this.f20117d;
        if (m0Var != null) {
            m0Var.f20105a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h7.b bVar = this.f20116a;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h7.b bVar = this.f20116a;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        m0 m0Var = this.f20117d;
        m0Var.k(colorStateList);
        m0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        m0 m0Var = this.f20117d;
        m0Var.l(mode);
        m0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        m0 m0Var = this.f20117d;
        if (m0Var != null) {
            m0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z10 = z2.f20222c;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        m0 m0Var = this.f20117d;
        if (m0Var != null) {
            v0 v0Var = m0Var.f20113i;
            if (z10 || v0Var.f()) {
                return;
            }
            v0Var.g(i10, f10);
        }
    }
}
