package dj;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22273a;

    public a(int i4) {
        this.f22273a = i4;
    }

    @Override // androidx.recyclerview.widget.y0
    public final EdgeEffect a(RecyclerView recyclerView) {
        EdgeEffect edgeEffect = new EdgeEffect(recyclerView.getContext());
        edgeEffect.setColor(this.f22273a);
        return edgeEffect;
    }
}
