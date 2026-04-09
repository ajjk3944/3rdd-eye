package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f6589a;

    public b(a... aVarArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f6589a = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(Arrays.asList(aVarArr));
    }

    public final void a(a aVar) {
        if (aVar == null) {
            return;
        }
        this.f6589a.add(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
        for (a aVar : this.f6589a) {
            if (aVar != null) {
                aVar.b(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
        for (a aVar : this.f6589a) {
            if (aVar != null) {
                aVar.c(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
        for (a aVar : this.f6589a) {
            if (aVar != null) {
                aVar.a(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th2) {
        for (a aVar : this.f6589a) {
            if (aVar != null) {
                aVar.b(bVar, dVar, th2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th2) {
        for (a aVar : this.f6589a) {
            if (aVar != null) {
                aVar.c(bVar, dVar, th2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th2) {
        for (a aVar : this.f6589a) {
            if (aVar != null) {
                aVar.a(bVar, dVar, th2);
            }
        }
    }
}
