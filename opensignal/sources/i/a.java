package i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f10962a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f10963d;

    public a(b bVar, e eVar) {
        this.f10963d = bVar;
        this.f10962a = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        b bVar = this.f10963d;
        DialogInterface.OnClickListener onClickListener = bVar.f11001n;
        e eVar = this.f10962a;
        onClickListener.onClick(eVar.f11022b, i10);
        if (bVar.f11004q) {
            return;
        }
        eVar.f11022b.dismiss();
    }
}
