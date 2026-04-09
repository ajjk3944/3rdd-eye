package de;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n implements cf.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f22218a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f22219b;

    public final synchronized void a() {
        try {
            Iterator it = this.f22218a.iterator();
            while (it.hasNext()) {
                this.f22219b.add(((cf.b) it.next()).get());
            }
            this.f22218a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // cf.b
    public final Object get() {
        if (this.f22219b == null) {
            synchronized (this) {
                try {
                    if (this.f22219b == null) {
                        this.f22219b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f22219b);
    }
}
