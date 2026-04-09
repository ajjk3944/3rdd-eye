package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.internal.ThreadContextKt;
import y8.s;

/* loaded from: classes4.dex */
public final class UndispatchedContextCollector implements kotlinx.coroutines.flow.c {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.d f22467a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22468b;

    /* renamed from: c, reason: collision with root package name */
    public final l9.p f22469c;

    public UndispatchedContextCollector(kotlinx.coroutines.flow.c cVar, kotlin.coroutines.d dVar) {
        this.f22467a = dVar;
        this.f22468b = ThreadContextKt.b(dVar);
        this.f22469c = new UndispatchedContextCollector$emitRef$1(cVar, null);
    }

    @Override // kotlinx.coroutines.flow.c
    public Object emit(Object obj, c9.c cVar) {
        Object objB = d.b(this.f22467a, obj, this.f22468b, this.f22469c, cVar);
        return objB == kotlin.coroutines.intrinsics.a.f() ? objB : s.f25199a;
    }
}
