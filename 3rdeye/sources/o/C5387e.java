package o;

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
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g.C4353a;

/* compiled from: AppCompatCheckedTextView.java */
/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5387e extends CheckedTextView implements R0.k {

    /* renamed from: b, reason: collision with root package name */
    public final C5388f f44654b;

    /* renamed from: c, reason: collision with root package name */
    public final C5386d f44655c;

    /* renamed from: d, reason: collision with root package name */
    public final C5404w f44656d;

    /* renamed from: e, reason: collision with root package name */
    public C5392j f44657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5387e(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        U.a(context);
        S.a(this, getContext());
        C5404w c5404w = new C5404w(this);
        this.f44656d = c5404w;
        c5404w.f(attributeSet, R.attr.checkedTextViewStyle);
        c5404w.b();
        C5386d c5386d = new C5386d(this);
        this.f44655c = c5386d;
        c5386d.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f44654b = new C5388f(this);
        Context context2 = getContext();
        int[] iArr = C4353a.f37886l;
        X xE = X.e(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = xE.f44608b;
        L0.I.n(this, getContext(), iArr, attributeSet, xE.f44608b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(A9.I.w(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(A9.I.w(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(xE.a(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(C5375C.c(typedArray.getInt(3, -1), null));
            }
            xE.f();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            xE.f();
            throw th;
        }
    }

    private C5392j getEmojiTextViewHelper() {
        if (this.f44657e == null) {
            this.f44657e = new C5392j(this);
        }
        return this.f44657e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5404w c5404w = this.f44656d;
        if (c5404w != null) {
            c5404w.b();
        }
        C5386d c5386d = this.f44655c;
        if (c5386d != null) {
            c5386d.a();
        }
        C5388f c5388f = this.f44654b;
        if (c5388f != null) {
            c5388f.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return R0.h.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5386d c5386d = this.f44655c;
        if (c5386d != null) {
            return c5386d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5386d c5386d = this.f44655c;
        if (c5386d != null) {
            return c5386d.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C5388f c5388f = this.f44654b;
        if (c5388f != null) {
            return c5388f.f44660b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C5388f c5388f = this.f44654b;
        if (c5388f != null) {
            return c5388f.f44661c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f44656d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f44656d.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        B7.d.t(editorInfo, inputConnectionOnCreateInputConnection, this);
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
        C5386d c5386d = this.f44655c;
        if (c5386d != null) {
            c5386d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C5386d c5386d = this.f44655c;
        if (c5386d != null) {
            c5386d.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C5388f c5388f = this.f44654b;
        if (c5388f != null) {
            if (c5388f.f44664f) {
                c5388f.f44664f = false;
            } else {
                c5388f.f44664f = true;
                c5388f.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f44656d;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f44656d;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(R0.h.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5386d c5386d = this.f44655c;
        if (c5386d != null) {
            c5386d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5386d c5386d = this.f44655c;
        if (c5386d != null) {
            c5386d.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C5388f c5388f = this.f44654b;
        if (c5388f != null) {
            c5388f.f44660b = colorStateList;
            c5388f.f44662d = true;
            c5388f.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C5388f c5388f = this.f44654b;
        if (c5388f != null) {
            c5388f.f44661c = mode;
            c5388f.f44663e = true;
            c5388f.a();
        }
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5404w c5404w = this.f44656d;
        c5404w.l(colorStateList);
        c5404w.b();
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5404w c5404w = this.f44656d;
        c5404w.m(mode);
        c5404w.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5404w c5404w = this.f44656d;
        if (c5404w != null) {
            c5404w.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(A9.I.w(getContext(), i));
    }
}
