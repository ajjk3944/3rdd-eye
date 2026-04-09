package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n3 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ s3 f;
    public final /* synthetic */ p3 g;

    public n3(p3 p3Var, s3 s3Var) {
        this.g = p3Var;
        this.f = s3Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        p3 p3Var = this.g;
        DialogInterface.OnClickListener onClickListener = p3Var.n;
        s3 s3Var = this.f;
        onClickListener.onClick(s3Var.b, i);
        if (p3Var.r) {
            return;
        }
        s3Var.b.dismiss();
    }
}
