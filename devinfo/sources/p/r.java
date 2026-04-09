package p;

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
import com.google.android.gms.internal.ads.e00;
import com.google.android.gms.internal.ads.hl;
import com.google.android.gms.internal.ads.jx;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public Object f30835a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30836b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30837c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30838d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30839e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f30840f;

    public r(Activity activity, e00 e00Var, e00 e00Var2) {
        this.f30835a = activity;
        this.f30840f = e00Var;
        this.f30836b = e00Var2;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f30840f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f30837c || this.f30838d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f30837c) {
                    drawableMutate.setTintList((ColorStateList) this.f30835a);
                }
                if (this.f30838d) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f30836b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        q qVar = (q) this.f30840f;
        Drawable checkMarkDrawable = qVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f30837c || this.f30838d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f30837c) {
                    drawableMutate.setTintList((ColorStateList) this.f30835a);
                }
                if (this.f30838d) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f30836b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(qVar.getDrawableState());
                }
                qVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Object c() {
        if (this.f30837c) {
            return null;
        }
        Object obj = this.f30836b;
        if (obj != null) {
            return obj;
        }
        u0.r.b("Unexpected form of a provided value");
        throw new ac.m();
    }

    public void d(AttributeSet attributeSet, int i4) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f30840f;
        Context context = compoundButton.getContext();
        int[] iArr = h.a.f24786m;
        i0.f fVarJ = i0.f.J(context, attributeSet, iArr, i4);
        TypedArray typedArray = (TypedArray) fVarJ.f25417c;
        e4.v0.n(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) fVarJ.f25417c, i4);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(jm.a.l(resourceId2, compoundButton.getContext()));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(jm.a.l(resourceId, compoundButton.getContext()));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(fVarJ.y(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(i1.c(typedArray.getInt(3, -1), null));
            }
            fVarJ.M();
        } catch (Throwable th2) {
            fVarJ.M();
            throw th2;
        }
    }

    public void e() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        e00 e00Var = (e00) this.f30836b;
        if (this.f30837c) {
            return;
        }
        Activity activity = (Activity) this.f30835a;
        ViewTreeObserver viewTreeObserver2 = null;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(e00Var);
            }
        }
        e00 e00Var2 = (e00) this.f30840f;
        hl hlVar = ua.j.C.B;
        jx jxVar = new jx(e00Var2, e00Var);
        View view = (View) ((WeakReference) jxVar.f11937a).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            jxVar.v1(viewTreeObserver2);
        }
        this.f30837c = true;
    }

    public /* synthetic */ r(TextView textView) {
        this.f30835a = null;
        this.f30836b = null;
        this.f30837c = false;
        this.f30838d = false;
        this.f30840f = textView;
    }

    public r(u0.k1 k1Var, Object obj, boolean z3, u0.j2 j2Var, boolean z10) {
        this.f30840f = k1Var;
        this.f30837c = z3;
        this.f30835a = j2Var;
        this.f30838d = z10;
        this.f30836b = obj;
        this.f30839e = true;
    }
}
