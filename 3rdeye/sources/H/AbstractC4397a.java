package h;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import h.LayoutInflaterFactory2C4402f;
import m.AbstractC5304a;

/* compiled from: ActionBar.java */
/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4397a {

    /* compiled from: ActionBar.java */
    /* renamed from: h.a$b */
    public interface b {
        void a();
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* renamed from: h.a$c */
    public static abstract class c {
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z10);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    public abstract boolean i(int i, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(boolean z10);

    public abstract void m(boolean z10);

    public abstract void n(boolean z10);

    public abstract void o(CharSequence charSequence);

    public abstract void p(CharSequence charSequence);

    public AbstractC5304a q(LayoutInflaterFactory2C4402f.d dVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: h.a$a, reason: collision with other inner class name */
    public static class C0461a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f37966a;

        public C0461a(C0461a c0461a) {
            super((ViewGroup.MarginLayoutParams) c0461a);
            this.f37966a = 0;
            this.f37966a = c0461a.f37966a;
        }

        public C0461a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f37966a = 0;
        }
    }

    public void h() {
    }
}
