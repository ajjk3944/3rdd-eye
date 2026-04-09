package ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class m0 extends b5.z {
    public n0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f35436a0;

    /* renamed from: b0, reason: collision with root package name */
    public Context f35437b0;

    /* renamed from: c0, reason: collision with root package name */
    public ig.e f35438c0;

    @Override // b5.z
    public final void E(Context context) {
        super.E(context);
        this.f35437b0 = context;
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f35436a0 == null) {
            RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(R.layout.appi_appinfo_services, viewGroup, false);
            this.f35436a0 = recyclerView;
            dj.b.l(recyclerView, (z2.k) a.a.f3c.f189b);
            ig.e eVar = new ig.e(this);
            this.f35438c0 = eVar;
            this.f35436a0.setAdapter(eVar);
            this.f35436a0.i(new sj.a(this));
        }
        return this.f35436a0;
    }
}
