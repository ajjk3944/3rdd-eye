package c3;

import N2.k;
import N2.s;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import m0.C5308a;

/* compiled from: LoadPathCache.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final s<?, ?, ?> f18449c = new s<>(Object.class, Object.class, Object.class, Collections.singletonList(new k(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new Z2.d(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    public final C5308a<h3.k, s<?, ?, ?>> f18450a = new C5308a<>();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<h3.k> f18451b = new AtomicReference<>();

    public final void a(Class<?> cls, Class<?> cls2, Class<?> cls3, s<?, ?, ?> sVar) {
        synchronized (this.f18450a) {
            C5308a<h3.k, s<?, ?, ?>> c5308a = this.f18450a;
            h3.k kVar = new h3.k(cls, cls2, cls3);
            if (sVar == null) {
                sVar = f18449c;
            }
            c5308a.put(kVar, sVar);
        }
    }
}
