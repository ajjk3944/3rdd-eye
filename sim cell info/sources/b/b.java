package b;

import a0.e;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.d;
import f.b;

/* loaded from: classes.dex */
public class b extends Dialog implements b.a {

    /* renamed from: b, reason: collision with root package name */
    private d f2404b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a f2405c;

    class a implements e.a {
        a() {
        }

        @Override // a0.e.a
        public boolean i(KeyEvent keyEvent) {
            return b.this.c(keyEvent);
        }
    }

    public b(Context context, int i2) {
        super(context, b(context, i2));
        this.f2405c = new a();
        d dVarA = a();
        dVarA.C(b(context, i2));
        dVarA.q(null);
    }

    private static int b(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.a.f24y, typedValue, true);
        return typedValue.resourceId;
    }

    public d a() {
        if (this.f2404b == null) {
            this.f2404b = d.f(this, this);
        }
        return this.f2404b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i2) {
        return a().y(i2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.e(this.f2405c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // b.a
    public void f(f.b bVar) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) a().g(i2);
    }

    @Override // b.a
    public f.b g(b.a aVar) {
        return null;
    }

    @Override // b.a
    public void h(f.b bVar) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().m();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().l();
        super.onCreate(bundle);
        a().q(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        a().z(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().A(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().B(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        a().D(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().D(charSequence);
    }
}
