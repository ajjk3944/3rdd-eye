package z7;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final x7.e f37974a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37975b;

    /* renamed from: c, reason: collision with root package name */
    public y f37976c;

    public a(x7.e eVar, s sVar, ReferenceQueue referenceQueue) {
        super(sVar, referenceQueue);
        t8.f.c(eVar, "Argument must not be null");
        this.f37974a = eVar;
        boolean z3 = sVar.f38090a;
        this.f37976c = null;
        this.f37975b = z3;
    }
}
