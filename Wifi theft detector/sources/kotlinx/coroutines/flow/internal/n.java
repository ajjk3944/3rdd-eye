package kotlinx.coroutines.flow.internal;

import y8.s;

/* loaded from: classes4.dex */
public final class n implements kotlinx.coroutines.flow.c {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.channels.o f22483a;

    public n(kotlinx.coroutines.channels.o oVar) {
        this.f22483a = oVar;
    }

    @Override // kotlinx.coroutines.flow.c
    public Object emit(Object obj, c9.c cVar) {
        Object objB = this.f22483a.b(obj, cVar);
        return objB == kotlin.coroutines.intrinsics.a.f() ? objB : s.f25199a;
    }
}
