package de;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k implements af.b, af.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f22213a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f22214b;

    public k() {
        ee.l lVar = ee.l.f23430a;
        this.f22213a = new HashMap();
        this.f22214b = new ArrayDeque();
    }

    public final synchronized void a() {
        ae.d dVar = ae.d.f356b;
        ed.f fVar = ed.f.f23280b;
        synchronized (this) {
            try {
                if (!this.f22213a.containsKey(wd.b.class)) {
                    this.f22213a.put(wd.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f22213a.get(wd.b.class)).put(fVar, dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
