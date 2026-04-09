package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* loaded from: classes.dex */
public class s extends RadioButton implements androidx.core.widget.j, a0.r {

    /* renamed from: b, reason: collision with root package name */
    private final i f1123b;

    /* renamed from: c, reason: collision with root package name */
    private final e f1124c;

    /* renamed from: d, reason: collision with root package name */
    private final y f1125d;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.E);
    }

    public s(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        super(t0.b(context), attributeSet, i2);
        i iVar = new i(this);
        this.f1123b = iVar;
        iVar.e(attributeSet, i2);
        e eVar = new e(this);
        this.f1124c = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f1125d = yVar;
        yVar.m(attributeSet, i2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1124c;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f1125d;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f1123b;
        return iVar != null ? iVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // a0.r
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1124c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a0.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1124c;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f1123b;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f1123b;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1124c;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1124c;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) throws NoSuchFieldException {
        setButtonDrawable(c.a.d(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) throws NoSuchFieldException {
        super.setButtonDrawable(drawable);
        i iVar = this.f1123b;
        if (iVar != null) {
            iVar.f();
        }
    }

    @Override // a0.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1124c;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a0.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1124c;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintList(ColorStateList colorStateList) throws NoSuchFieldException {
        i iVar = this.f1123b;
        if (iVar != null) {
            iVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) throws NoSuchFieldException {
        i iVar = this.f1123b;
        if (iVar != null) {
            iVar.h(mode);
        }
    }
}
