package ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t0;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e<T> extends b5.z {
    public Context Z;

    /* renamed from: a0, reason: collision with root package name */
    public RecyclerView f35358a0;

    /* renamed from: b0, reason: collision with root package name */
    public t0 f35359b0;

    @Override // b5.z
    public final void E(Context context) {
        super.E(context);
        this.Z = context;
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f35358a0 == null) {
            RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(R.layout.appi_appinfo_required_permission, viewGroup, false);
            this.f35358a0 = recyclerView;
            dj.b.l(recyclerView, (z2.k) a.a.f3c.f189b);
            ej.e eVarC0 = c0();
            this.f35359b0 = eVarC0;
            this.f35358a0.setAdapter(eVarC0);
            this.f35358a0.i(new sj.a(this));
        }
        return this.f35358a0;
    }

    public abstract ej.e c0();

    public abstract void d0(f0 f0Var);
}
