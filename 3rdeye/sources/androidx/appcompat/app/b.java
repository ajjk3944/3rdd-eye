package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController f14338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f14339c;

    public b(AlertController.b bVar, AlertController alertController) {
        this.f14339c = bVar;
        this.f14338b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j4) {
        AlertController.b bVar = this.f14339c;
        DialogInterface.OnClickListener onClickListener = bVar.f14326n;
        AlertController alertController = this.f14338b;
        onClickListener.onClick(alertController.f14287b, i);
        if (bVar.f14330r) {
            return;
        }
        alertController.f14287b.dismiss();
    }
}
