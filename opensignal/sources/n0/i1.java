package n0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17183a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17184b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17185c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17186d;

    /* renamed from: e, reason: collision with root package name */
    public Object f17187e;

    /* renamed from: f, reason: collision with root package name */
    public Object f17188f;

    public /* synthetic */ i1(TextView textView) {
        this.f17187e = null;
        this.f17188f = null;
        this.f17183a = false;
        this.f17184b = false;
        this.f17186d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f17186d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f17183a || this.f17184b) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f17183a) {
                    drawableMutate.setTintList((ColorStateList) this.f17187e);
                }
                if (this.f17184b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f17188f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        p.o oVar = (p.o) this.f17186d;
        Drawable checkMarkDrawable = oVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f17183a || this.f17184b) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f17183a) {
                    drawableMutate.setTintList((ColorStateList) this.f17187e);
                }
                if (this.f17184b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f17188f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(oVar.getDrawableState());
                }
                oVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Object c() {
        if (this.f17183a) {
            return null;
        }
        Object obj = this.f17188f;
        if (obj != null) {
            return obj;
        }
        q.d("Unexpected form of a provided value");
        throw new bf.n();
    }

    public void d(AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f17186d;
        io.sentry.k kVarH0 = io.sentry.k.h0(compoundButton.getContext(), attributeSet, h.j.CompoundButton, i10);
        TypedArray typedArray = (TypedArray) kVarH0.f12398g;
        u3.i0.m(compoundButton, compoundButton.getContext(), h.j.CompoundButton, attributeSet, (TypedArray) kVarH0.f12398g, i10, 0);
        try {
            if (typedArray.hasValue(h.j.CompoundButton_buttonCompat) && (resourceId2 = typedArray.getResourceId(h.j.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(ic.a.r(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(h.j.CompoundButton_android_button) && (resourceId = typedArray.getResourceId(h.j.CompoundButton_android_button, 0)) != 0) {
                compoundButton.setButtonDrawable(ic.a.r(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(h.j.CompoundButton_buttonTint)) {
                compoundButton.setButtonTintList(kVarH0.T(h.j.CompoundButton_buttonTint));
            }
            if (typedArray.hasValue(h.j.CompoundButton_buttonTintMode)) {
                compoundButton.setButtonTintMode(p.c1.c(typedArray.getInt(h.j.CompoundButton_buttonTintMode, -1), null));
            }
            kVarH0.l0();
        } catch (Throwable th2) {
            kVarH0.l0();
            throw th2;
        }
    }

    public i1(androidx.compose.runtime.d dVar, Object obj, boolean z10, c2 c2Var, boolean z11) {
        this.f17186d = dVar;
        this.f17183a = z10;
        this.f17187e = c2Var;
        this.f17184b = z11;
        this.f17188f = obj;
        this.f17185c = true;
    }
}
