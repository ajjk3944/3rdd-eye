package p;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class c0 implements g0, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public i.g f20030a;

    /* renamed from: d, reason: collision with root package name */
    public d0 f20031d;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f20032g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.c f20033r;

    public c0(androidx.appcompat.widget.c cVar) {
        this.f20033r = cVar;
    }

    @Override // p.g0
    public final boolean a() {
        i.g gVar = this.f20030a;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    @Override // p.g0
    public final int b() {
        return 0;
    }

    @Override // p.g0
    public final void d(int i10) {
        io.sentry.android.core.e0.d("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p.g0
    public final void dismiss() {
        i.g gVar = this.f20030a;
        if (gVar != null) {
            gVar.dismiss();
            this.f20030a = null;
        }
    }

    @Override // p.g0
    public final CharSequence e() {
        return this.f20032g;
    }

    @Override // p.g0
    public final Drawable f() {
        return null;
    }

    @Override // p.g0
    public final void h(CharSequence charSequence) {
        this.f20032g = charSequence;
    }

    @Override // p.g0
    public final void k(Drawable drawable) {
        io.sentry.android.core.e0.d("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p.g0
    public final void l(int i10) {
        io.sentry.android.core.e0.d("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p.g0
    public final void m(int i10) {
        io.sentry.android.core.e0.d("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p.g0
    public final void n(int i10, int i11) {
        if (this.f20031d == null) {
            return;
        }
        androidx.appcompat.widget.c cVar = this.f20033r;
        i.f fVar = new i.f(cVar.getPopupContext());
        CharSequence charSequence = this.f20032g;
        if (charSequence != null) {
            fVar.setTitle(charSequence);
        }
        d0 d0Var = this.f20031d;
        int selectedItemPosition = cVar.getSelectedItemPosition();
        i.b bVar = fVar.f11045a;
        bVar.f11000m = d0Var;
        bVar.f11001n = this;
        bVar.f11005r = selectedItemPosition;
        bVar.f11004q = true;
        i.g gVarCreate = fVar.create();
        this.f20030a = gVarCreate;
        AlertController$RecycleListView alertController$RecycleListView = gVarCreate.f11050y.f11026f;
        alertController$RecycleListView.setTextDirection(i10);
        alertController$RecycleListView.setTextAlignment(i11);
        this.f20030a.show();
    }

    @Override // p.g0
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        androidx.appcompat.widget.c cVar = this.f20033r;
        cVar.setSelection(i10);
        if (cVar.getOnItemClickListener() != null) {
            cVar.performItemClick(null, i10, this.f20031d.getItemId(i10));
        }
        dismiss();
    }

    @Override // p.g0
    public final void p(ListAdapter listAdapter) {
        this.f20031d = (d0) listAdapter;
    }
}
