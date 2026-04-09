package i;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class x extends d.l implements h {

    /* renamed from: e, reason: collision with root package name */
    public v f25391e;

    /* renamed from: f, reason: collision with root package name */
    public final w f25392f;

    /* JADX WARN: Type inference failed for: r2v2, types: [i.w] */
    public x(Context context, int i4) {
        int i10;
        if (i4 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = i4;
        }
        super(context, i10);
        this.f25392f = new e4.l() { // from class: i.w
            @Override // e4.l
            public final boolean a(KeyEvent keyEvent) {
                return this.f25390a.e(keyEvent);
            }
        };
        l lVarD = d();
        if (i4 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i4 = typedValue2.resourceId;
        }
        ((v) lVarD).T = i4;
        lVarD.d();
    }

    @Override // d.l, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        v vVar = (v) d();
        vVar.x();
        ((ViewGroup) vVar.A.findViewById(android.R.id.content)).addView(view, layoutParams);
        vVar.f25376m.a(vVar.f25375l.getCallback());
    }

    public final l d() {
        if (this.f25391e == null) {
            c7.l lVar = l.f25328a;
            this.f25391e = new v(getContext(), getWindow(), this, this);
        }
        return this.f25391e;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return cm.g.h(this.f25392f, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i4) {
        v vVar = (v) d();
        vVar.x();
        return vVar.f25375l.findViewById(i4);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().b();
    }

    @Override // d.l, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().d();
    }

    @Override // d.l, android.app.Dialog
    public final void onStop() {
        super.onStop();
        v vVar = (v) d();
        vVar.C();
        wd.b bVar = vVar.f25378o;
        if (bVar != null) {
            bVar.R(false);
        }
    }

    @Override // d.l, android.app.Dialog
    public void setContentView(int i4) {
        c();
        d().i(i4);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().m(charSequence);
    }

    @Override // d.l, android.app.Dialog
    public void setContentView(View view) {
        c();
        d().j(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i4) {
        super.setTitle(i4);
        d().m(getContext().getString(i4));
    }

    @Override // d.l, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().k(view, layoutParams);
    }
}
