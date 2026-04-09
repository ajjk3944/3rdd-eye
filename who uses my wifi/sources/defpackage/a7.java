package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a7 implements g7, DialogInterface.OnClickListener {
    public u3 f;
    public b7 g;
    public CharSequence h;
    public final /* synthetic */ h7 i;

    public a7(h7 h7Var) {
        this.i = h7Var;
    }

    @Override // defpackage.g7
    public final boolean a() {
        u3 u3Var = this.f;
        if (u3Var != null) {
            return u3Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.g7
    public final int b() {
        return 0;
    }

    @Override // defpackage.g7
    public final Drawable d() {
        return null;
    }

    @Override // defpackage.g7
    public final void dismiss() {
        u3 u3Var = this.f;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f = null;
        }
    }

    @Override // defpackage.g7
    public final void e(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // defpackage.g7
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.g7
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.g7
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.g7
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.g7
    public final void m(int i, int i2) {
        if (this.g == null) {
            return;
        }
        h7 h7Var = this.i;
        t3 t3Var = new t3(h7Var.getPopupContext());
        p3 p3Var = (p3) t3Var.h;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            p3Var.d = charSequence;
        }
        b7 b7Var = this.g;
        int selectedItemPosition = h7Var.getSelectedItemPosition();
        p3Var.m = b7Var;
        p3Var.n = this;
        p3Var.s = selectedItemPosition;
        p3Var.r = true;
        u3 u3VarB = t3Var.b();
        this.f = u3VarB;
        AlertController$RecycleListView alertController$RecycleListView = u3VarB.k.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f.show();
    }

    @Override // defpackage.g7
    public final int n() {
        return 0;
    }

    @Override // defpackage.g7
    public final CharSequence o() {
        return this.h;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        h7 h7Var = this.i;
        h7Var.setSelection(i);
        if (h7Var.getOnItemClickListener() != null) {
            h7Var.performItemClick(null, i, this.g.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.g7
    public final void p(ListAdapter listAdapter) {
        this.g = (b7) listAdapter;
    }
}
