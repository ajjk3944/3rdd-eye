package cj;

import androidx.recyclerview.widget.v0;
import jg.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f2888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f2889c;

    public a(b bVar, g gVar) {
        this.f2888b = bVar;
        this.f2889c = gVar;
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onChanged() {
        if (this.f2888b.f2890a != null) {
            this.f2889c.a();
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onItemRangeChanged(int i4, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onItemRangeChanged(int i4, int i10, Object obj) {
        super.onItemRangeChanged(i4, i10, obj);
        onChanged();
    }
}
