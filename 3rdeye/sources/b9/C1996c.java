package b9;

import S9.J;
import S9.K;
import f9.C4351i;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* compiled from: DeepRecursive.kt */
/* renamed from: b9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1996c<T, R> extends AbstractC1995b<T, R> implements InterfaceC4347e<R> {

    /* renamed from: b, reason: collision with root package name */
    public J f18078b;

    /* renamed from: c, reason: collision with root package name */
    public C1992A f18079c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4347e<Object> f18080d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18081e;

    @Override // b9.AbstractC1995b
    public final g9.a a(C1992A c1992a, K k10) {
        this.f18080d = k10;
        this.f18079c = c1992a;
        return g9.a.COROUTINE_SUSPENDED;
    }

    @Override // f9.InterfaceC4347e
    public final InterfaceC4350h getContext() {
        return C4351i.f37871b;
    }

    @Override // f9.InterfaceC4347e
    public final void resumeWith(Object obj) {
        this.f18080d = null;
        this.f18081e = obj;
    }
}
