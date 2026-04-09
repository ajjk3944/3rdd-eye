package kotlinx.coroutines;

import kotlin.coroutines.d;

/* loaded from: classes4.dex */
public final class t2 implements d.b, d.c {

    /* renamed from: a, reason: collision with root package name */
    public static final t2 f22694a = new t2();

    @Override // kotlin.coroutines.d
    public Object fold(Object obj, l9.p pVar) {
        return d.b.a.a(this, obj, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public d.b get(d.c cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public d.c getKey() {
        return this;
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d minusKey(d.c cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.b.a.d(this, dVar);
    }
}
