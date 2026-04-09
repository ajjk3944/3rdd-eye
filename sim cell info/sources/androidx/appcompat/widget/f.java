package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class f extends Button implements a0.r, androidx.core.widget.b {

    /* renamed from: b, reason: collision with root package name */
    private final e f934b;

    /* renamed from: c, reason: collision with root package name */
    private final y f935c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.f16q);
    }

    public f(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        super(t0.b(context), attributeSet, i2);
        e eVar = new e(this);
        this.f934b = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f935c = yVar;
        yVar.m(attributeSet, i2);
        yVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f934b;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f935c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f1516a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f935c;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f1516a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f935c;
        if (yVar != null) {
            return yVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f1516a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f935c;
        if (yVar != null) {
            return yVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f1516a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f935c;
        return yVar != null ? yVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f1516a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f935c;
        if (yVar != null) {
            return yVar.i();
        }
        return 0;
    }

    @Override // a0.r
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f934b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a0.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f934b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
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
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        y yVar = this.f935c;
        if (yVar != null) {
            yVar.n(z2, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        y yVar = this.f935c;
        if (yVar == null || androidx.core.widget.b.f1516a || !yVar.l()) {
            return;
        }
        this.f935c.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.b.f1516a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        y yVar = this.f935c;
        if (yVar != null) {
            yVar.s(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (androidx.core.widget.b.f1516a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        y yVar = this.f935c;
        if (yVar != null) {
            yVar.t(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (androidx.core.widget.b.f1516a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        y yVar = this.f935c;
        if (yVar != null) {
            yVar.u(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f934b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f934b;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.m(this, callback));
    }

    public void setSupportAllCaps(boolean z2) {
        y yVar = this.f935c;
        if (yVar != null) {
            yVar.r(z2);
        }
    }

    @Override // a0.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f934b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a0.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f934b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f935c;
        if (yVar != null) {
            yVar.p(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (androidx.core.widget.b.f1516a) {
            super.setTextSize(i2, f2);
            return;
        }
        y yVar = this.f935c;
        if (yVar != null) {
            yVar.z(i2, f2);
        }
    }
}
