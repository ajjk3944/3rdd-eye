package androidx.appcompat.app;

import a.j;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import f.b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0002a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f365a;

        public C0002a(int i2, int i3) {
            super(i2, i3);
            this.f365a = 0;
            this.f365a = 8388627;
        }

        public C0002a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f365a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f169t);
            this.f365a = typedArrayObtainStyledAttributes.getInt(j.f170u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0002a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f365a = 0;
        }

        public C0002a(C0002a c0002a) {
            super((ViewGroup.MarginLayoutParams) c0002a);
            this.f365a = 0;
            this.f365a = c0002a.f365a;
        }
    }

    public interface b {
        void a(boolean z2);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z2);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public abstract void m(Configuration configuration);

    void n() {
    }

    public abstract boolean o(int i2, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z2);

    public abstract void s(boolean z2);

    public abstract void t(boolean z2);

    public abstract void u(CharSequence charSequence);

    public abstract f.b v(b.a aVar);
}
