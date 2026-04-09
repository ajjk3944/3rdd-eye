package m8;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.t f28961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km.n f28962b;

    public j(km.n nVar, androidx.lifecycle.t tVar) {
        this.f28962b = nVar;
        this.f28961a = tVar;
    }

    @Override // m8.i
    public final void onDestroy() {
        ((HashMap) this.f28962b.f28442b).remove(this.f28961a);
    }

    @Override // m8.i
    public final void onStart() {
    }

    @Override // m8.i
    public final void onStop() {
    }
}
