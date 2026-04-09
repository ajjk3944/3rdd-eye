package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o3 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView f;
    public final /* synthetic */ s3 g;
    public final /* synthetic */ p3 h;

    public o3(p3 p3Var, AlertController$RecycleListView alertController$RecycleListView, s3 s3Var) {
        this.h = p3Var;
        this.f = alertController$RecycleListView;
        this.g = s3Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        p3 p3Var = this.h;
        boolean[] zArr = p3Var.p;
        AlertController$RecycleListView alertController$RecycleListView = this.f;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        p3Var.t.onClick(this.g.b, i, alertController$RecycleListView.isItemChecked(i));
    }
}
