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
import androidx.recyclerview.widget.C0305b;
import com.apm.insight.R;
import g.AbstractC2327a;

/* renamed from: o.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2733q extends CheckedTextView implements U.k {

    /* renamed from: a, reason: collision with root package name */
    public final F0.f f22614a;

    /* renamed from: b, reason: collision with root package name */
    public final C0305b f22615b;

    /* renamed from: c, reason: collision with root package name */
    public final U f22616c;

    /* renamed from: d, reason: collision with root package name */
    public C2740u f22617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2733q(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        X0.a(context);
        W0.a(getContext(), this);
        U u6 = new U(this);
        this.f22616c = u6;
        u6.f(attributeSet, R.attr.checkedTextViewStyle);
        u6.b();
        C0305b c0305b = new C0305b(this);
        this.f22615b = c0305b;
        c0305b.k(attributeSet, R.attr.checkedTextViewStyle);
        this.f22614a = new F0.f(this);
        Context context2 = getContext();
        int[] iArr = AbstractC2327a.f20124l;
        a1 a1VarI = a1.i(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) a1VarI.f22480c;
        R.O.l(this, getContext(), iArr, attributeSet, (TypedArray) a1VarI.f22480c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(a4.t.i(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(a4.t.i(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(a1VarI.c(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC2720j0.c(typedArray.getInt(3, -1), null));
            }
            a1VarI.j();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            a1VarI.j();
            throw th;
        }
    }

    private C2740u getEmojiTextViewHelper() {
        if (this.f22617d == null) {
            this.f22617d = new C2740u(this);
        }
        return this.f22617d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        U u6 = this.f22616c;
        if (u6 != null) {
            u6.b();
        }
        C0305b c0305b = this.f22615b;
        if (c0305b != null) {
            c0305b.a();
        }
        F0.f fVar = this.f22614a;
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a4.t.u(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0305b c0305b = this.f22615b;
        if (c0305b != null) {
            return c0305b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0305b c0305b = this.f22615b;
        if (c0305b != null) {
            return c0305b.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        F0.f fVar = this.f22614a;
        if (fVar != null) {
            return (ColorStateList) fVar.f1439e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        F0.f fVar = this.f22614a;
        if (fVar != null) {
            return (PorterDuff.Mode) fVar.f1440f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f22616c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f22616c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a4.t.n(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0305b c0305b = this.f22615b;
        if (c0305b != null) {
            c0305b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0305b c0305b = this.f22615b;
        if (c0305b != null) {
            c0305b.n(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        F0.f fVar = this.f22614a;
        if (fVar != null) {
            if (fVar.f1437c) {
                fVar.f1437c = false;
            } else {
                fVar.f1437c = true;
                fVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f22616c;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f22616c;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a4.t.v(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().d(z6);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0305b c0305b = this.f22615b;
        if (c0305b != null) {
            c0305b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0305b c0305b = this.f22615b;
        if (c0305b != null) {
            c0305b.t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        F0.f fVar = this.f22614a;
        if (fVar != null) {
            fVar.f1439e = colorStateList;
            fVar.f1435a = true;
            fVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        F0.f fVar = this.f22614a;
        if (fVar != null) {
            fVar.f1440f = mode;
            fVar.f1436b = true;
            fVar.b();
        }
    }

    @Override // U.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        U u6 = this.f22616c;
        u6.l(colorStateList);
        u6.b();
    }

    @Override // U.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        U u6 = this.f22616c;
        u6.m(mode);
        u6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        U u6 = this.f22616c;
        if (u6 != null) {
            u6.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(a4.t.i(getContext(), i));
    }
}
