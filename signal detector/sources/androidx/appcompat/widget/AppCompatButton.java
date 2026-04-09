package androidx.appcompat.widget;

import U.k;
import a4.t;
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
import androidx.recyclerview.widget.C0305b;
import com.apm.insight.R;
import java.lang.reflect.InvocationTargetException;
import o.C2706c0;
import o.C2740u;
import o.U;
import o.W0;
import o.X0;
import o.q1;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C0305b f4860a;

    /* renamed from: b, reason: collision with root package name */
    public final U f4861b;

    /* renamed from: c, reason: collision with root package name */
    public C2740u f4862c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private C2740u getEmojiTextViewHelper() {
        if (this.f4862c == null) {
            this.f4862c = new C2740u(this);
        }
        return this.f4862c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0305b c0305b = this.f4860a;
        if (c0305b != null) {
            c0305b.a();
        }
        U u6 = this.f4861b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q1.f22620c) {
            return super.getAutoSizeMaxTextSize();
        }
        U u6 = this.f4861b;
        if (u6 != null) {
            return Math.round(((C2706c0) u6.f22439l).f22493e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (q1.f22620c) {
            return super.getAutoSizeMinTextSize();
        }
        U u6 = this.f4861b;
        if (u6 != null) {
            return Math.round(((C2706c0) u6.f22439l).f22492d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (q1.f22620c) {
            return super.getAutoSizeStepGranularity();
        }
        U u6 = this.f4861b;
        if (u6 != null) {
            return Math.round(((C2706c0) u6.f22439l).f22491c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (q1.f22620c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        U u6 = this.f4861b;
        return u6 != null ? ((C2706c0) u6.f22439l).f22494f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (q1.f22620c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        U u6 = this.f4861b;
        if (u6 != null) {
            return ((C2706c0) u6.f22439l).f22489a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return t.u(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0305b c0305b = this.f4860a;
        if (c0305b != null) {
            return c0305b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0305b c0305b = this.f4860a;
        if (c0305b != null) {
            return c0305b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4861b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4861b.e();
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
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        U u6 = this.f4861b;
        if (u6 == null || q1.f22620c) {
            return;
        }
        ((C2706c0) u6.f22439l).a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i3, int i6) {
        super.onTextChanged(charSequence, i, i3, i6);
        U u6 = this.f4861b;
        if (u6 != null) {
            C2706c0 c2706c0 = (C2706c0) u6.f22439l;
            if (q1.f22620c || !c2706c0.f()) {
                return;
            }
            c2706c0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i3, int i6, int i7) {
        if (q1.f22620c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i3, i6, i7);
            return;
        }
        U u6 = this.f4861b;
        if (u6 != null) {
            u6.i(i, i3, i6, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (q1.f22620c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        U u6 = this.f4861b;
        if (u6 != null) {
            u6.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (q1.f22620c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        U u6 = this.f4861b;
        if (u6 != null) {
            u6.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0305b c0305b = this.f4860a;
        if (c0305b != null) {
            c0305b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0305b c0305b = this.f4860a;
        if (c0305b != null) {
            c0305b.n(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(t.v(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z6) {
        U u6 = this.f4861b;
        if (u6 != null) {
            ((TextView) u6.f22432d).setAllCaps(z6);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0305b c0305b = this.f4860a;
        if (c0305b != null) {
            c0305b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0305b c0305b = this.f4860a;
        if (c0305b != null) {
            c0305b.t(mode);
        }
    }

    @Override // U.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        U u6 = this.f4861b;
        u6.l(colorStateList);
        u6.b();
    }

    @Override // U.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        U u6 = this.f4861b;
        u6.m(mode);
        u6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        U u6 = this.f4861b;
        if (u6 != null) {
            u6.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z6 = q1.f22620c;
        if (z6) {
            super.setTextSize(i, f2);
            return;
        }
        U u6 = this.f4861b;
        if (u6 != null) {
            C2706c0 c2706c0 = (C2706c0) u6.f22439l;
            if (z6 || c2706c0.f()) {
                return;
            }
            c2706c0.g(i, f2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        X0.a(context);
        W0.a(getContext(), this);
        C0305b c0305b = new C0305b(this);
        this.f4860a = c0305b;
        c0305b.k(attributeSet, i);
        U u6 = new U(this);
        this.f4861b = u6;
        u6.f(attributeSet, i);
        u6.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }
}
