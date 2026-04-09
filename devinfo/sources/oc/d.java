package oc;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f30501a;

    public d(f fVar) {
        this.f30501a = fVar;
    }

    @Override // oc.b
    public final void c(int i4, View view) {
        if (i4 == 5) {
            this.f30501a.cancel();
        }
    }

    @Override // oc.b
    public final void b(View view) {
    }
}
