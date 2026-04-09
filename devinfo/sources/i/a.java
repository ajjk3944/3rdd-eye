package i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f25221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f25222b;

    public a(b bVar, d dVar) {
        this.f25222b = bVar;
        this.f25221a = dVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
        b bVar = this.f25222b;
        DialogInterface.OnClickListener onClickListener = bVar.f25246s;
        d dVar = this.f25221a;
        onClickListener.onClick(dVar.f25253b, i4);
        if (bVar.f25249v) {
            return;
        }
        dVar.f25253b.dismiss();
    }
}
