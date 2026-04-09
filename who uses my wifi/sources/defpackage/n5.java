package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n5 {
    public Object a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final View f;

    public n5(Activity activity, og2 og2Var, og2 og2Var2) {
        this.a = activity;
        this.f = og2Var;
        this.b = og2Var2;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable drawableA = hh.a(compoundButton);
        if (drawableA != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.c) {
                    sp.h(drawableMutate, (ColorStateList) this.a);
                }
                if (this.d) {
                    sp.i(drawableMutate, (PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        m5 m5Var = (m5) this.f;
        Drawable checkMarkDrawable = m5Var.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.c) {
                    sp.h(drawableMutate, (ColorStateList) this.a);
                }
                if (this.d) {
                    sp.i(drawableMutate, (PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(m5Var.getDrawableState());
                }
                m5Var.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = hn0.m;
        xb4 xb4VarR = xb4.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) xb4VarR.h;
        e61.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) xb4VarR.h, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(ob1.h(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(ob1.h(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                gh.c(compoundButton, xb4VarR.k(2));
            }
            if (typedArray.hasValue(3)) {
                gh.d(compoundButton, yp.c(typedArray.getInt(3, -1), null));
            }
            xb4VarR.z();
        } catch (Throwable th) {
            xb4VarR.z();
            throw th;
        }
    }

    public void d() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        og2 og2Var = (og2) this.b;
        if (this.c) {
            return;
        }
        Activity activity = (Activity) this.a;
        ViewTreeObserver viewTreeObserver2 = null;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(og2Var);
            }
        }
        og2 og2Var2 = (og2) this.f;
        qd2 qd2Var = hg4.C.B;
        ud2 ud2Var = new ud2(og2Var2, og2Var);
        View view = (View) ((WeakReference) ud2Var.g).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            ud2Var.U1(viewTreeObserver2);
        }
        this.c = true;
    }

    public /* synthetic */ n5(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }
}
