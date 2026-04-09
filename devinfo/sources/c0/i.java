package c0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d0.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f2437a;

    public i(j jVar) {
        this.f2437a = jVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.u uVar, ck.c cVar) {
        Object objF = m1.f(uVar, new h(this.f2437a, null, 0), cVar);
        return objF == dk.a.f22275a ? objF : yj.u.f37649a;
    }
}
