package androidx.appcompat.app;

import F1.AbstractC2773t;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.lifecycle.T;
import c.AbstractC4145N;
import c.DialogC4163r;
import h.AbstractC5927a;
import q2.AbstractC7419g;

/* loaded from: classes.dex */
public abstract class p extends DialogC4163r implements d {

    /* renamed from: d, reason: collision with root package name */
    private f f26608d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC2773t.a f26609e;

    public p(Context context, int i10) {
        super(context, i(context, i10));
        this.f26609e = new AbstractC2773t.a() { // from class: androidx.appcompat.app.o
            @Override // F1.AbstractC2773t.a
            public final boolean v(KeyEvent keyEvent) {
                return this.f26607a.k(keyEvent);
            }
        };
        f fVarH = h();
        fVarH.O(i(context, i10));
        fVarH.z(null);
    }

    private static int i(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5927a.f47960w, typedValue, true);
        return typedValue.resourceId;
    }

    private void j() {
        T.b(getWindow().getDecorView(), this);
        AbstractC7419g.b(getWindow().getDecorView(), this);
        AbstractC4145N.b(getWindow().getDecorView(), this);
    }

    @Override // c.DialogC4163r, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        h().A();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC2773t.e(this.f26609e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // androidx.appcompat.app.d
    public void e(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void f(androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return h().l(i10);
    }

    public f h() {
        if (this.f26608d == null) {
            this.f26608d = f.k(this, this);
        }
        return this.f26608d;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        h().v();
    }

    boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean l(int i10) {
        return h().I(i10);
    }

    @Override // c.DialogC4163r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        h().u();
        super.onCreate(bundle);
        h().z(bundle);
    }

    @Override // c.DialogC4163r, android.app.Dialog
    protected void onStop() {
        super.onStop();
        h().F();
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b s(b.a aVar) {
        return null;
    }

    @Override // c.DialogC4163r, android.app.Dialog
    public void setContentView(int i10) {
        j();
        h().J(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        h().P(charSequence);
    }

    @Override // c.DialogC4163r, android.app.Dialog
    public void setContentView(View view) {
        j();
        h().K(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        h().P(getContext().getString(i10));
    }

    @Override // c.DialogC4163r, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        h().L(view, layoutParams);
    }
}
