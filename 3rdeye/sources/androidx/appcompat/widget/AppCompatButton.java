package androidx.appcompat.widget;

import R0.h;
import R0.k;
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
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import o.C5386d;
import o.C5392j;
import o.C5404w;
import o.C5406y;
import o.S;
import o.U;
import o.f0;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements k {

    /* renamed from: b, reason: collision with root package name */
    public final C5386d f14594b;

    /* renamed from: c, reason: collision with root package name */
    public final C5404w f14595c;

    /* renamed from: d, reason: collision with root package name */
    public C5392j f14596d;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private C5392j getEmojiTextViewHelper() {
        if (this.f14596d == null) {
            this.f14596d = new C5392j(this);
        }
        return this.f14596d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5386d c5386d = this.f14594b;
        if (c5386d != null) {
            c5386d.a();
        }
        C5404w c5404w = this.f14595c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f0.f44667c) {
            return super.getAutoSizeMaxTextSize();
        }
        C5404w c5404w = this.f14595c;
        if (c5404w != null) {
            return Math.round(c5404w.i.f44766e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f0.f44667c) {
            return super.getAutoSizeMinTextSize();
        }
        C5404w c5404w = this.f14595c;
        if (c5404w != null) {
            return Math.round(c5404w.i.f44765d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f0.f44667c) {
            return super.getAutoSizeStepGranularity();
        }
        C5404w c5404w = this.f14595c;
        if (c5404w != null) {
            return Math.round(c5404w.i.f44764c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (f0.f44667c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C5404w c5404w = this.f14595c;
        return c5404w != null ? c5404w.i.f44767f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (f0.f44667c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C5404w c5404w = this.f14595c;
        if (c5404w != null) {
            return c5404w.i.f44762a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5386d c5386d = this.f14594b;
        if (c5386d != null) {
            return c5386d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5386d c5386d = this.f14594b;
        if (c5386d != null) {
            return c5386d.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14595c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14595c.e();
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
    public void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        C5404w c5404w = this.f14595c;
        if (c5404w == null || f0.f44667c) {
            return;
        }
        c5404w.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        C5404w c5404w = this.f14595c;
        if (c5404w == null || f0.f44667c) {
            return;
        }
        C5406y c5406y = c5404w.i;
        if (c5406y.f()) {
            c5406y.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i10, int i11, int i12) throws IllegalArgumentException {
        if (f0.f44667c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i10, i11, i12);
            return;
        }
        C5404w c5404w = this.f14595c;
        if (c5404w != null) {
            c5404w.i(i, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (f0.f44667c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C5404w c5404w = this.f14595c;
        if (c5404w != null) {
            c5404w.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f0.f44667c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C5404w c5404w = this.f14595c;
        if (c5404w != null) {
            c5404w.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5386d c5386d = this.f14594b;
        if (c5386d != null) {
            c5386d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C5386d c5386d = this.f14594b;
        if (c5386d != null) {
            c5386d.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        C5404w c5404w = this.f14595c;
        if (c5404w != null) {
            c5404w.f44741a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5386d c5386d = this.f14594b;
        if (c5386d != null) {
            c5386d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5386d c5386d = this.f14594b;
        if (c5386d != null) {
            c5386d.i(mode);
        }
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5404w c5404w = this.f14595c;
        c5404w.l(colorStateList);
        c5404w.b();
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5404w c5404w = this.f14595c;
        c5404w.m(mode);
        c5404w.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5404w c5404w = this.f14595c;
        if (c5404w != null) {
            c5404w.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f10) {
        boolean z10 = f0.f44667c;
        if (z10) {
            super.setTextSize(i, f10);
            return;
        }
        C5404w c5404w = this.f14595c;
        if (c5404w == null || z10) {
            return;
        }
        C5406y c5406y = c5404w.i;
        if (c5406y.f()) {
            return;
        }
        c5406y.g(f10, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        U.a(context);
        S.a(this, getContext());
        C5386d c5386d = new C5386d(this);
        this.f14594b = c5386d;
        c5386d.d(attributeSet, i);
        C5404w c5404w = new C5404w(this);
        this.f14595c = c5404w;
        c5404w.f(attributeSet, i);
        c5404w.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }
}
