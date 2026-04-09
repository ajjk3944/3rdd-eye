package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class j6 extends eh implements l5 {
    public h6 i;
    public final i6 j;

    /* JADX WARN: Type inference failed for: r2v2, types: [i6] */
    public j6(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.j = new s40() { // from class: i6
            @Override // defpackage.s40
            public final boolean b(KeyEvent keyEvent) {
                return this.f.f(keyEvent);
            }
        };
        u5 u5VarD = d();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((h6) u5VarD).Y = i;
        u5VarD.c();
    }

    @Override // defpackage.eh, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        c();
        h6 h6Var = (h6) d();
        h6Var.w();
        ((ViewGroup) h6Var.F.findViewById(android.R.id.content)).addView(view, layoutParams);
        h6Var.r.a(h6Var.q.getCallback());
    }

    public final u5 d() {
        if (this.i == null) {
            s5 s5Var = u5.f;
            this.i = new h6(getContext(), getWindow(), this, this);
        }
        return this.i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return um.h(this.j, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h6 h6Var = (h6) d();
        h6Var.w();
        return h6Var.q.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().a();
    }

    @Override // defpackage.eh, android.app.Dialog
    public void onCreate(Bundle bundle) {
        h6 h6Var = (h6) d();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(h6Var.p);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(h6Var);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        d().c();
    }

    @Override // defpackage.eh, android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        h6 h6Var = (h6) d();
        h6Var.A();
        m54 m54Var = h6Var.t;
        if (m54Var != null) {
            m54Var.z(false);
        }
    }

    @Override // defpackage.eh, android.app.Dialog
    public void setContentView(int i) {
        c();
        d().h(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().l(charSequence);
    }

    @Override // defpackage.eh, android.app.Dialog
    public void setContentView(View view) {
        c();
        d().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().l(getContext().getString(i));
    }

    @Override // defpackage.eh, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().j(view, layoutParams);
    }
}
