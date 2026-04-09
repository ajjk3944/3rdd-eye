package o8;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import t8.k;
import z7.i;
import z7.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final w f30425c = new w(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new l8.d(0), null)), null);

    /* renamed from: a, reason: collision with root package name */
    public final x.e f30426a = new x.e(0);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f30427b = new AtomicReference();

    public final void a(Class cls, Class cls2, Class cls3, w wVar) {
        synchronized (this.f30426a) {
            x.e eVar = this.f30426a;
            k kVar = new k(cls, cls2, cls3);
            if (wVar == null) {
                wVar = f30425c;
            }
            eVar.put(kVar, wVar);
        }
    }
}
