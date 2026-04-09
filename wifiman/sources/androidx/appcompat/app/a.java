package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import h.AbstractC5936j;

/* loaded from: classes.dex */
public abstract class a {
    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z10);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public abstract void m(Configuration configuration);

    void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z10);

    public abstract void s(boolean z10);

    public abstract void t(boolean z10);

    public abstract void u(Drawable drawable);

    public abstract void v(boolean z10);

    public abstract void w(CharSequence charSequence);

    public abstract void x(CharSequence charSequence);

    public abstract androidx.appcompat.view.b y(b.a aVar);

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C1019a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f26484a;

        public C1019a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f26484a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5936j.f48277t);
            this.f26484a = typedArrayObtainStyledAttributes.getInt(AbstractC5936j.f48281u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C1019a(int i10, int i11) {
            super(i10, i11);
            this.f26484a = 8388627;
        }

        public C1019a(C1019a c1019a) {
            super((ViewGroup.MarginLayoutParams) c1019a);
            this.f26484a = 0;
            this.f26484a = c1019a.f26484a;
        }

        public C1019a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f26484a = 0;
        }
    }
}
