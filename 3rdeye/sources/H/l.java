package h;

import A9.I;
import L0.C0777h;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c.DialogC2011i;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import h.AbstractC4401e;
import m.AbstractC5304a;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class l extends DialogC2011i implements InterfaceC4400d {

    /* renamed from: e, reason: collision with root package name */
    public LayoutInflaterFactory2C4402f f38073e;

    /* renamed from: f, reason: collision with root package name */
    public final k f38074f;

    /* JADX WARN: Type inference failed for: r2v2, types: [h.k] */
    public l(Context context, int i) {
        int i10;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = i;
        }
        super(context, i10);
        this.f38074f = new C0777h.a() { // from class: h.k
            @Override // L0.C0777h.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f38072b.e(keyEvent);
            }
        };
        AbstractC4401e abstractC4401eC = c();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C4402f) abstractC4401eC).f38003V = i;
        abstractC4401eC.p();
    }

    @Override // c.DialogC2011i, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().c(view, layoutParams);
    }

    public final AbstractC4401e c() {
        if (this.f38073e == null) {
            AbstractC4401e.c cVar = AbstractC4401e.f37967b;
            this.f38073e = new LayoutInflaterFactory2C4402f(getContext(), getWindow(), this, this);
        }
        return this.f38073e;
    }

    public final void d() {
        B7.d.A(getWindow().getDecorView(), this);
        I.A(getWindow().getDecorView(), this);
        A2.l.D(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().q();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0777h.b(this.f38074f, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i) {
        return (T) c().f(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().m();
    }

    @Override // c.DialogC2011i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().l();
        super.onCreate(bundle);
        c().p();
    }

    @Override // c.DialogC2011i, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c().u();
    }

    @Override // h.InterfaceC4400d
    public final AbstractC5304a onWindowStartingSupportActionMode(AbstractC5304a.InterfaceC0495a interfaceC0495a) {
        return null;
    }

    @Override // c.DialogC2011i, android.app.Dialog
    public final void setContentView(int i) {
        d();
        c().x(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().C(charSequence);
    }

    @Override // c.DialogC2011i, android.app.Dialog
    public final void setContentView(View view) {
        d();
        c().y(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().C(getContext().getString(i));
    }

    @Override // c.DialogC2011i, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        c().z(view, layoutParams);
    }

    @Override // h.InterfaceC4400d
    public final void onSupportActionModeFinished(AbstractC5304a abstractC5304a) {
    }

    @Override // h.InterfaceC4400d
    public final void onSupportActionModeStarted(AbstractC5304a abstractC5304a) {
    }
}
