package h;

import R.InterfaceC0182i;
import a.AbstractC0241a;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Q;
import c.DialogC0390o;
import com.apm.insight.R;

/* loaded from: classes.dex */
public class x extends DialogC0390o implements InterfaceC2350h {

    /* renamed from: d, reason: collision with root package name */
    public v f20434d;

    /* renamed from: e, reason: collision with root package name */
    public final w f20435e;

    /* JADX WARN: Type inference failed for: r2v2, types: [h.w] */
    public x(Context context, int i) {
        int i3;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i3 = typedValue.resourceId;
        } else {
            i3 = i;
        }
        super(context, i3);
        this.f20435e = new InterfaceC0182i() { // from class: h.w
            @Override // R.InterfaceC0182i
            public final boolean g(KeyEvent keyEvent) {
                return this.f20433a.e(keyEvent);
            }
        };
        k kVarC = c();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((v) kVarC).f20414h0 = i;
        kVarC.g();
    }

    @Override // c.DialogC0390o, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v vVar = (v) c();
        vVar.B();
        ((ViewGroup) vVar.f20396O.findViewById(android.R.id.content)).addView(view, layoutParams);
        vVar.f20422m.a(vVar.f20420l.getCallback());
    }

    public final k c() {
        if (this.f20434d == null) {
            C0.B b5 = k.f20346a;
            this.f20434d = new v(getContext(), getWindow(), this, this);
        }
        return this.f20434d;
    }

    public final void d() {
        Q.i(getWindow().getDecorView(), this);
        AbstractC0241a.o(getWindow().getDecorView(), this);
        com.bumptech.glide.c.J(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return com.bumptech.glide.c.l(this.f20435e, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        v vVar = (v) c();
        vVar.B();
        return vVar.f20420l.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().d();
    }

    @Override // c.DialogC0390o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().c();
        super.onCreate(bundle);
        c().g();
    }

    @Override // c.DialogC0390o, android.app.Dialog
    public final void onStop() {
        super.onStop();
        v vVar = (v) c();
        vVar.H();
        com.bumptech.glide.d dVar = vVar.f20385C;
        if (dVar != null) {
            dVar.W(false);
        }
    }

    @Override // c.DialogC0390o, android.app.Dialog
    public void setContentView(int i) {
        d();
        c().l(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().q(charSequence);
    }

    @Override // c.DialogC0390o, android.app.Dialog
    public void setContentView(View view) {
        d();
        c().m(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().q(getContext().getString(i));
    }

    @Override // c.DialogC0390o, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        c().n(view, layoutParams);
    }
}
