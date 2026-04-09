package g3;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import i2.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f24517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk.c f24518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0.o f24519c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.g f24520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f24522f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, mk.c cVar, u0.o oVar, f1.g gVar, int i4, View view) {
        super(0);
        this.f24517a = context;
        this.f24518b = cVar;
        this.f24519c = oVar;
        this.f24520d = gVar;
        this.f24521e = i4;
        this.f24522f = view;
    }

    @Override // mk.a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f24522f;
        nk.k.c(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new x(this.f24517a, this.f24518b, this.f24519c, this.f24520d, this.f24521e, (m1) callback).getLayoutNode();
    }
}
