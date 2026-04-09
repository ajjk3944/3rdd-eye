package nj;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.x1;
import jj.i;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class d extends e {
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public final i f29952k;

    /* renamed from: l, reason: collision with root package name */
    public final LayoutInflater f29953l;

    public d(Context context, i iVar) {
        k.e(context, "context");
        k.e(iVar, "operator");
        this.j = context;
        this.f29952k = iVar;
        this.f29953l = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.t0
    public final void onBindViewHolder(x1 x1Var, int i4) throws Resources.NotFoundException {
        c cVar = (c) x1Var;
        k.e(cVar, "holder");
        aj.b bVar = (aj.b) this.f29954i.get(i4);
        com.google.android.gms.internal.consent_sdk.d dVar = cVar.f29950c;
        cm.g.u(bVar, (ImageView) dVar.g, (ImageView) dVar.f19297c);
        ((TextView) dVar.f19300f).setText(wi.c.e(bVar.f406a));
        ((TextView) dVar.f19298d).setText(bVar.f410e);
        ((TextView) dVar.f19301h).setText(wi.c.h(bVar.f407b, false, true));
        ((TextView) dVar.f19299e).setText(bVar.g.c());
        ((AppCompatCheckBox) dVar.f19296b).setChecked(this.f29952k.f27713f.contains(bVar));
    }

    @Override // androidx.recyclerview.widget.t0
    public final x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        k.e(viewGroup, "parent");
        return new c(this, com.google.android.gms.internal.consent_sdk.d.c(this.f29953l, viewGroup));
    }
}
