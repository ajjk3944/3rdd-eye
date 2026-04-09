package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f14340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController f14341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f14342d;

    public c(AlertController.b bVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f14342d = bVar;
        this.f14340b = recycleListView;
        this.f14341c = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j4) {
        AlertController.b bVar = this.f14342d;
        boolean[] zArr = bVar.f14328p;
        AlertController.RecycleListView recycleListView = this.f14340b;
        if (zArr != null) {
            zArr[i] = recycleListView.isItemChecked(i);
        }
        bVar.f14332t.onClick(this.f14341c.f14287b, i, recycleListView.isItemChecked(i));
    }
}
