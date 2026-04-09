package o;

import D0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import g.C4353a;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* renamed from: o.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5389g {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f44668a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f44669b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f44670c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44671d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f44672e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44673f;

    public C5389g(CompoundButton compoundButton) {
        this.f44668a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f44668a;
        Drawable drawableA = R0.c.a(compoundButton);
        if (drawableA != null) {
            if (this.f44671d || this.f44672e) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.f44671d) {
                    a.C0009a.h(drawableMutate, this.f44669b);
                }
                if (this.f44672e) {
                    a.C0009a.i(drawableMutate, this.f44670c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.f44668a;
        Context context = compoundButton.getContext();
        int[] iArr = C4353a.f37887m;
        X xE = X.e(context, attributeSet, iArr, i);
        TypedArray typedArray = xE.f44608b;
        L0.I.n(compoundButton, compoundButton.getContext(), iArr, attributeSet, xE.f44608b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(A9.I.w(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(A9.I.w(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                R0.b.c(compoundButton, xE.a(2));
            }
            if (typedArray.hasValue(3)) {
                R0.b.d(compoundButton, C5375C.c(typedArray.getInt(3, -1), null));
            }
            xE.f();
        } catch (Throwable th) {
            xE.f();
            throw th;
        }
    }
}
