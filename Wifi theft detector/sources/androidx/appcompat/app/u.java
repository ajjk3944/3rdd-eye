package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.s;
import h.b;

/* loaded from: classes.dex */
public class u extends androidx.activity.j implements c {

    /* renamed from: d, reason: collision with root package name */
    public AppCompatDelegate f581d;

    /* renamed from: e, reason: collision with root package name */
    public final s.a f582e;

    public u(@NonNull Context context) {
        this(context, 0);
    }

    public static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(c.a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().y();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.s.e(this.f582e, getWindow().getDecorView(), this, keyEvent);
    }

    public AppCompatDelegate e() {
        if (this.f581d == null) {
            this.f581d = AppCompatDelegate.i(this, this);
        }
        return this.f581d;
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return e().j(i10);
    }

    public boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean h(int i10) {
        return e().G(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        e().u();
    }

    @Override // androidx.appcompat.app.c
    public h.b m(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        e().t();
        super.onCreate(bundle);
        e().x(bundle);
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void onStop() {
        super.onStop();
        e().D();
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void setContentView(int i10) {
        c();
        e().H(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().N(charSequence);
    }

    public u(Context context, int i10) {
        super(context, f(context, i10));
        this.f582e = new s.a() { // from class: androidx.appcompat.app.t
            @Override // androidx.core.view.s.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f580a.g(keyEvent);
            }
        };
        AppCompatDelegate appCompatDelegateE = e();
        appCompatDelegateE.M(f(context, i10));
        appCompatDelegateE.x(null);
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void setContentView(View view) {
        c();
        e().I(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        e().N(getContext().getString(i10));
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().J(view, layoutParams);
    }

    @Override // androidx.appcompat.app.c
    public void k(h.b bVar) {
    }

    @Override // androidx.appcompat.app.c
    public void o(h.b bVar) {
    }
}
