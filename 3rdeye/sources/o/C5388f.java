package o;

import D0.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: AppCompatCheckedTextViewHelper.java */
/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5388f {

    /* renamed from: a, reason: collision with root package name */
    public final C5387e f44659a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f44660b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f44661c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44662d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f44663e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44664f;

    public C5388f(C5387e c5387e) {
        this.f44659a = c5387e;
    }

    public final void a() {
        C5387e c5387e = this.f44659a;
        Drawable checkMarkDrawable = c5387e.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f44662d || this.f44663e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f44662d) {
                    a.C0009a.h(drawableMutate, this.f44660b);
                }
                if (this.f44663e) {
                    a.C0009a.i(drawableMutate, this.f44661c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c5387e.getDrawableState());
                }
                c5387e.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
