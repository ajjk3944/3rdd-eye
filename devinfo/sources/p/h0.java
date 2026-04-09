package p;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 implements m0, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public i.e f30705a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f30706b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f30707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f30708d;

    public h0(AppCompatSpinner appCompatSpinner) {
        this.f30708d = appCompatSpinner;
    }

    @Override // p.m0
    public final boolean a() {
        i.e eVar = this.f30705a;
        if (eVar != null) {
            return eVar.isShowing();
        }
        return false;
    }

    @Override // p.m0
    public final int b() {
        return 0;
    }

    @Override // p.m0
    public final void c(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p.m0
    public final CharSequence d() {
        return this.f30707c;
    }

    @Override // p.m0
    public final void dismiss() {
        i.e eVar = this.f30705a;
        if (eVar != null) {
            eVar.dismiss();
            this.f30705a = null;
        }
    }

    @Override // p.m0
    public final Drawable f() {
        return null;
    }

    @Override // p.m0
    public final void i(CharSequence charSequence) {
        this.f30707c = charSequence;
    }

    @Override // p.m0
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p.m0
    public final void k(int i4) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p.m0
    public final void l(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p.m0
    public final void m(int i4, int i10) {
        if (this.f30706b == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.f30708d;
        t7.m mVar = new t7.m(appCompatSpinner.getPopupContext());
        i.b bVar = (i.b) mVar.f34474c;
        CharSequence charSequence = this.f30707c;
        if (charSequence != null) {
            bVar.f25233d = charSequence;
        }
        i0 i0Var = this.f30706b;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        bVar.f25245r = i0Var;
        bVar.f25246s = this;
        bVar.f25250w = selectedItemPosition;
        bVar.f25249v = true;
        i.e eVarF = mVar.f();
        this.f30705a = eVarF;
        AlertController$RecycleListView alertController$RecycleListView = eVarF.g.f25257f;
        alertController$RecycleListView.setTextDirection(i4);
        alertController$RecycleListView.setTextAlignment(i10);
        this.f30705a.show();
    }

    @Override // p.m0
    public final int n() {
        return 0;
    }

    @Override // p.m0
    public final void o(ListAdapter listAdapter) {
        this.f30706b = (i0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        AppCompatSpinner appCompatSpinner = this.f30708d;
        appCompatSpinner.setSelection(i4);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i4, this.f30706b.getItemId(i4));
        }
        dismiss();
    }
}
