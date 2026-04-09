package c2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements PointerInputEventHandler, nk.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk.e f2611a;

    public f0(mk.e eVar) {
        this.f2611a = eVar;
    }

    @Override // nk.g
    public final yj.c a() {
        return this.f2611a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof nk.g)) {
            return false;
        }
        return nk.k.a(this.f2611a, ((nk.g) obj).a());
    }

    public final int hashCode() {
        return this.f2611a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(u uVar, ck.c cVar) {
        return this.f2611a.invoke(uVar, cVar);
    }
}
