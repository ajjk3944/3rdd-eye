package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.gms.internal.ads.be1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends CheckedTextView implements j4.l {

    /* renamed from: a, reason: collision with root package name */
    public final r f30820a;

    /* renamed from: b, reason: collision with root package name */
    public final be1 f30821b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f30822c;

    /* renamed from: d, reason: collision with root package name */
    public u f30823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        e3.a(context);
        d3.a(getContext(), this);
        t0 t0Var = new t0(this);
        this.f30822c = t0Var;
        t0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        t0Var.b();
        be1 be1Var = new be1(this);
        this.f30821b = be1Var;
        be1Var.x(attributeSet, R.attr.checkedTextViewStyle);
        this.f30820a = new r(this);
        Context context2 = getContext();
        int[] iArr = h.a.f24785l;
        i0.f fVarJ = i0.f.J(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) fVarJ.f25417c;
        e4.v0.n(this, getContext(), iArr, attributeSet, (TypedArray) fVarJ.f25417c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(jm.a.l(resourceId2, getContext()));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(jm.a.l(resourceId, getContext()));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(fVarJ.y(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(i1.c(typedArray.getInt(3, -1), null));
            }
            fVarJ.M();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th2) {
            fVarJ.M();
            throw th2;
        }
    }

    private u getEmojiTextViewHelper() {
        if (this.f30823d == null) {
            this.f30823d = new u(this);
        }
        return this.f30823d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t0 t0Var = this.f30822c;
        if (t0Var != null) {
            t0Var.b();
        }
        be1 be1Var = this.f30821b;
        if (be1Var != null) {
            be1Var.a();
        }
        r rVar = this.f30820a;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return pk.a.w(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        be1 be1Var = this.f30821b;
        if (be1Var != null) {
            return be1Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        be1 be1Var = this.f30821b;
        if (be1Var != null) {
            return be1Var.v();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        r rVar = this.f30820a;
        if (rVar != null) {
            return (ColorStateList) rVar.f30835a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        r rVar = this.f30820a;
        if (rVar != null) {
            return (PorterDuff.Mode) rVar.f30836b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f30822c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f30822c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        nh.a.n(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        be1 be1Var = this.f30821b;
        if (be1Var != null) {
            be1Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        be1 be1Var = this.f30821b;
        if (be1Var != null) {
            be1Var.A(i4);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        r rVar = this.f30820a;
        if (rVar != null) {
            if (rVar.f30839e) {
                rVar.f30839e = false;
            } else {
                rVar.f30839e = true;
                rVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f30822c;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f30822c;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(pk.a.z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().d(z3);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        be1 be1Var = this.f30821b;
        if (be1Var != null) {
            be1Var.F(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        be1 be1Var = this.f30821b;
        if (be1Var != null) {
            be1Var.G(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        r rVar = this.f30820a;
        if (rVar != null) {
            rVar.f30835a = colorStateList;
            rVar.f30837c = true;
            rVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        r rVar = this.f30820a;
        if (rVar != null) {
            rVar.f30836b = mode;
            rVar.f30838d = true;
            rVar.b();
        }
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        t0 t0Var = this.f30822c;
        t0Var.k(colorStateList);
        t0Var.b();
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        t0 t0Var = this.f30822c;
        t0Var.l(mode);
        t0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) throws Resources.NotFoundException {
        super.setTextAppearance(context, i4);
        t0 t0Var = this.f30822c;
        if (t0Var != null) {
            t0Var.g(i4, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i4) {
        setCheckMarkDrawable(jm.a.l(i4, getContext()));
    }
}
