package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class d extends AutoCompleteTextView implements a0.r {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f921d = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    private final e f922b;

    /* renamed from: c, reason: collision with root package name */
    private final y f923c;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.f15p);
    }

    public d(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        super(t0.b(context), attributeSet, i2);
        w0 w0VarT = w0.t(getContext(), attributeSet, f921d, i2, 0);
        if (w0VarT.q(0)) {
            setDropDownBackgroundDrawable(w0VarT.f(0));
        }
        w0VarT.u();
        e eVar = new e(this);
        this.f922b = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f923c = yVar;
        yVar.m(attributeSet, i2);
        yVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f922b;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f923c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // a0.r
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f922b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a0.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f922b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f922b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f922b;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.m(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(c.a.d(getContext(), i2));
    }

    @Override // a0.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f922b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a0.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f922b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f923c;
        if (yVar != null) {
            yVar.p(context, i2);
        }
    }
}
