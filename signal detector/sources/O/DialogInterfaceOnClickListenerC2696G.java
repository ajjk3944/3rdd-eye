package o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import h.C2344b;
import h.DialogInterfaceC2347e;

/* renamed from: o.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2696G implements L, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC2347e f22375a;

    /* renamed from: b, reason: collision with root package name */
    public C2697H f22376b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f22377c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f22378d;

    public DialogInterfaceOnClickListenerC2696G(M m6) {
        this.f22378d = m6;
    }

    @Override // o.L
    public final boolean a() {
        DialogInterfaceC2347e dialogInterfaceC2347e = this.f22375a;
        if (dialogInterfaceC2347e != null) {
            return dialogInterfaceC2347e.isShowing();
        }
        return false;
    }

    @Override // o.L
    public final int b() {
        return 0;
    }

    @Override // o.L
    public final void d(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // o.L
    public final void dismiss() {
        DialogInterfaceC2347e dialogInterfaceC2347e = this.f22375a;
        if (dialogInterfaceC2347e != null) {
            dialogInterfaceC2347e.dismiss();
            this.f22375a = null;
        }
    }

    @Override // o.L
    public final CharSequence e() {
        return this.f22377c;
    }

    @Override // o.L
    public final Drawable f() {
        return null;
    }

    @Override // o.L
    public final void h(CharSequence charSequence) {
        this.f22377c = charSequence;
    }

    @Override // o.L
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // o.L
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // o.L
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // o.L
    public final void m(int i, int i3) {
        if (this.f22376b == null) {
            return;
        }
        M m6 = this.f22378d;
        L2.w wVar = new L2.w(m6.getPopupContext());
        C2344b c2344b = (C2344b) wVar.f2570c;
        CharSequence charSequence = this.f22377c;
        if (charSequence != null) {
            c2344b.f20311d = charSequence;
        }
        C2697H c2697h = this.f22376b;
        int selectedItemPosition = m6.getSelectedItemPosition();
        c2344b.f20314g = c2697h;
        c2344b.f20315h = this;
        c2344b.f20316j = selectedItemPosition;
        c2344b.i = true;
        DialogInterfaceC2347e dialogInterfaceC2347eI = wVar.i();
        this.f22375a = dialogInterfaceC2347eI;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC2347eI.f20339f.f20321e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i3);
        this.f22375a.show();
    }

    @Override // o.L
    public final int n() {
        return 0;
    }

    @Override // o.L
    public final void o(ListAdapter listAdapter) {
        this.f22376b = (C2697H) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        M m6 = this.f22378d;
        m6.setSelection(i);
        if (m6.getOnItemClickListener() != null) {
            m6.performItemClick(null, i, this.f22376b.getItemId(i));
        }
        dismiss();
    }
}
