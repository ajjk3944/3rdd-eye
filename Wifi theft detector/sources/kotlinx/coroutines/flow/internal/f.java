package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;

/* loaded from: classes4.dex */
public final class f implements kotlin.coroutines.d {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f22475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.d f22476b;

    public f(Throwable th, kotlin.coroutines.d dVar) {
        this.f22475a = th;
        this.f22476b = dVar;
    }

    @Override // kotlin.coroutines.d
    public Object fold(Object obj, l9.p pVar) {
        return this.f22476b.fold(obj, pVar);
    }

    @Override // kotlin.coroutines.d
    public d.b get(d.c cVar) {
        return this.f22476b.get(cVar);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d minusKey(d.c cVar) {
        return this.f22476b.minusKey(cVar);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return this.f22476b.plus(dVar);
    }
}
