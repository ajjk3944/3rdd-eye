package o;

import L0.I;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import g.C4353a;
import java.util.WeakHashMap;

/* compiled from: AppCompatBackgroundHelper.java */
/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5386d {

    /* renamed from: a, reason: collision with root package name */
    public final View f44641a;

    /* renamed from: d, reason: collision with root package name */
    public V f44644d;

    /* renamed from: e, reason: collision with root package name */
    public V f44645e;

    /* renamed from: f, reason: collision with root package name */
    public V f44646f;

    /* renamed from: c, reason: collision with root package name */
    public int f44643c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C5390h f44642b = C5390h.a();

    public C5386d(View view) {
        this.f44641a = view;
    }

    public final void a() {
        View view = this.f44641a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f44644d != null) {
                if (this.f44646f == null) {
                    this.f44646f = new V();
                }
                V v10 = this.f44646f;
                v10.f44603a = null;
                v10.f44606d = false;
                v10.f44604b = null;
                v10.f44605c = false;
                WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
                ColorStateList colorStateListG = I.d.g(view);
                if (colorStateListG != null) {
                    v10.f44606d = true;
                    v10.f44603a = colorStateListG;
                }
                PorterDuff.Mode modeH = I.d.h(view);
                if (modeH != null) {
                    v10.f44605c = true;
                    v10.f44604b = modeH;
                }
                if (v10.f44606d || v10.f44605c) {
                    C5390h.e(background, v10, view.getDrawableState());
                    return;
                }
            }
            V v11 = this.f44645e;
            if (v11 != null) {
                C5390h.e(background, v11, view.getDrawableState());
                return;
            }
            V v12 = this.f44644d;
            if (v12 != null) {
                C5390h.e(background, v12, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        V v10 = this.f44645e;
        if (v10 != null) {
            return v10.f44603a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        V v10 = this.f44645e;
        if (v10 != null) {
            return v10.f44604b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListI;
        View view = this.f44641a;
        Context context = view.getContext();
        int[] iArr = C4353a.f37900z;
        X xE = X.e(context, attributeSet, iArr, i);
        TypedArray typedArray = xE.f44608b;
        View view2 = this.f44641a;
        L0.I.n(view2, view2.getContext(), iArr, attributeSet, xE.f44608b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f44643c = typedArray.getResourceId(0, -1);
                C5390h c5390h = this.f44642b;
                Context context2 = view.getContext();
                int i10 = this.f44643c;
                synchronized (c5390h) {
                    colorStateListI = c5390h.f44676a.i(context2, i10);
                }
                if (colorStateListI != null) {
                    g(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                I.d.q(view, xE.a(1));
            }
            if (typedArray.hasValue(2)) {
                I.d.r(view, C5375C.c(typedArray.getInt(2, -1), null));
            }
            xE.f();
        } catch (Throwable th) {
            xE.f();
            throw th;
        }
    }

    public final void e() {
        this.f44643c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateListI;
        this.f44643c = i;
        C5390h c5390h = this.f44642b;
        if (c5390h != null) {
            Context context = this.f44641a.getContext();
            synchronized (c5390h) {
                colorStateListI = c5390h.f44676a.i(context, i);
            }
        } else {
            colorStateListI = null;
        }
        g(colorStateListI);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f44644d == null) {
                this.f44644d = new V();
            }
            V v10 = this.f44644d;
            v10.f44603a = colorStateList;
            v10.f44606d = true;
        } else {
            this.f44644d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f44645e == null) {
            this.f44645e = new V();
        }
        V v10 = this.f44645e;
        v10.f44603a = colorStateList;
        v10.f44606d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f44645e == null) {
            this.f44645e = new V();
        }
        V v10 = this.f44645e;
        v10.f44604b = mode;
        v10.f44605c = true;
        a();
    }
}
