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

/* loaded from: classes.dex */
public final class o extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final n0.i1 f20123a;

    /* renamed from: d, reason: collision with root package name */
    public final h7.b f20124d;

    /* renamed from: g, reason: collision with root package name */
    public final m0 f20125g;

    /* renamed from: r, reason: collision with root package name */
    public s f20126r;

    /* JADX WARN: Illegal instructions before constructor call */
    public o(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int i10 = h.a.checkedTextViewStyle;
        i2.a(context);
        super(context, attributeSet, i10);
        h2.a(getContext(), this);
        m0 m0Var = new m0(this);
        this.f20125g = m0Var;
        m0Var.f(attributeSet, i10);
        m0Var.b();
        h7.b bVar = new h7.b(this);
        this.f20124d = bVar;
        bVar.k(attributeSet, i10);
        this.f20123a = new n0.i1(this);
        io.sentry.k kVarH0 = io.sentry.k.h0(getContext(), attributeSet, h.j.CheckedTextView, i10);
        TypedArray typedArray = (TypedArray) kVarH0.f12398g;
        u3.i0.m(this, getContext(), h.j.CheckedTextView, attributeSet, (TypedArray) kVarH0.f12398g, i10, 0);
        try {
            if (typedArray.hasValue(h.j.CheckedTextView_checkMarkCompat) && (resourceId2 = typedArray.getResourceId(h.j.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    setCheckMarkDrawable(ic.a.r(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(h.j.CheckedTextView_android_checkMark) && (resourceId = typedArray.getResourceId(h.j.CheckedTextView_android_checkMark, 0)) != 0) {
                setCheckMarkDrawable(ic.a.r(getContext(), resourceId));
            }
            if (typedArray.hasValue(h.j.CheckedTextView_checkMarkTint)) {
                setCheckMarkTintList(kVarH0.T(h.j.CheckedTextView_checkMarkTint));
            }
            if (typedArray.hasValue(h.j.CheckedTextView_checkMarkTintMode)) {
                setCheckMarkTintMode(c1.c(typedArray.getInt(h.j.CheckedTextView_checkMarkTintMode, -1), null));
            }
            kVarH0.l0();
            getEmojiTextViewHelper().b(attributeSet, i10);
        } catch (Throwable th2) {
            kVarH0.l0();
            throw th2;
        }
    }

    private s getEmojiTextViewHelper() {
        if (this.f20126r == null) {
            this.f20126r = new s(this);
        }
        return this.f20126r;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m0 m0Var = this.f20125g;
        if (m0Var != null) {
            m0Var.b();
        }
        h7.b bVar = this.f20124d;
        if (bVar != null) {
            bVar.a();
        }
        n0.i1 i1Var = this.f20123a;
        if (i1Var != null) {
            i1Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ic.a.Q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        h7.b bVar = this.f20124d;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h7.b bVar = this.f20124d;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        n0.i1 i1Var = this.f20123a;
        if (i1Var != null) {
            return (ColorStateList) i1Var.f17187e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        n0.i1 i1Var = this.f20123a;
        if (i1Var != null) {
            return (PorterDuff.Mode) i1Var.f17188f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f20125g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f20125g.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ba.m.G(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h7.b bVar = this.f20124d;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        h7.b bVar = this.f20124d;
        if (bVar != null) {
            bVar.n(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        n0.i1 i1Var = this.f20123a;
        if (i1Var != null) {
            if (i1Var.f17185c) {
                i1Var.f17185c = false;
            } else {
                i1Var.f17185c = true;
                i1Var.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f20125g;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f20125g;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ic.a.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h7.b bVar = this.f20124d;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h7.b bVar = this.f20124d;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        n0.i1 i1Var = this.f20123a;
        if (i1Var != null) {
            i1Var.f17187e = colorStateList;
            i1Var.f17183a = true;
            i1Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        n0.i1 i1Var = this.f20123a;
        if (i1Var != null) {
            i1Var.f17188f = mode;
            i1Var.f17184b = true;
            i1Var.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        m0 m0Var = this.f20125g;
        m0Var.k(colorStateList);
        m0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        m0 m0Var = this.f20125g;
        m0Var.l(mode);
        m0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        m0 m0Var = this.f20125g;
        if (m0Var != null) {
            m0Var.g(context, i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(ic.a.r(getContext(), i10));
    }
}
