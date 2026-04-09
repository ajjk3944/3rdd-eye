package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, d<T>> f13438a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<d<T>>> f13439b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f13440c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final f f13441a = new f();
    }

    public static f a() {
        return b.f13441a;
    }

    private int b() {
        return this.f13440c.incrementAndGet();
    }

    public void c() {
    }

    private f() {
        this.f13438a = new ConcurrentHashMap<>();
        this.f13440c = new AtomicInteger();
        this.f13439b = new ConcurrentHashMap<>();
    }

    public synchronized void a(d<T> dVar) {
        try {
            String strF = dVar.f();
            dVar.a(b());
            if (this.f13438a.containsKey(strF)) {
                com.mbridge.msdk.config.component.load.downloader.e eVarJ = dVar.j();
                com.mbridge.msdk.config.component.load.downloader.e eVar = com.mbridge.msdk.config.component.load.downloader.e.RETRY;
                if (eVarJ != eVar) {
                    eVar = com.mbridge.msdk.config.component.load.downloader.e.DELAY;
                }
                dVar.a(eVar);
                if (this.f13439b.containsKey(strF)) {
                    CopyOnWriteArrayList<d<T>> copyOnWriteArrayList = this.f13439b.get(strF);
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.add(dVar);
                        this.f13439b.remove(strF);
                        this.f13439b.put(strF, copyOnWriteArrayList);
                    }
                } else {
                    CopyOnWriteArrayList<d<T>> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList2.add(dVar);
                    this.f13439b.put(strF, copyOnWriteArrayList2);
                }
            } else {
                com.mbridge.msdk.config.component.load.downloader.e eVarJ2 = dVar.j();
                com.mbridge.msdk.config.component.load.downloader.e eVar2 = com.mbridge.msdk.config.component.load.downloader.e.RETRY;
                if (eVarJ2 != eVar2) {
                    eVar2 = com.mbridge.msdk.config.component.load.downloader.e.QUEUED;
                }
                dVar.a(eVar2);
                this.f13438a.put(strF, dVar);
                dVar.a(i.b().a().getDownloadTasks().submit(new h(dVar)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(d dVar) {
        CopyOnWriteArrayList<d<T>> copyOnWriteArrayListRemove;
        String strF = dVar.f();
        this.f13438a.remove(strF);
        if (this.f13439b.containsKey(strF) && (copyOnWriteArrayListRemove = this.f13439b.remove(strF)) != null && copyOnWriteArrayListRemove.size() > 0) {
            d<T> dVarRemove = copyOnWriteArrayListRemove.remove(0);
            dVarRemove.a(com.mbridge.msdk.config.component.load.downloader.e.QUEUED);
            this.f13438a.put(strF, dVarRemove);
            dVarRemove.a(i.b().a().getDownloadTasks().submit(new h(dVarRemove)));
            if (copyOnWriteArrayListRemove.size() > 0) {
                this.f13439b.put(strF, copyOnWriteArrayListRemove);
            }
        }
    }

    public synchronized void a(String str) {
        CopyOnWriteArrayList<d<T>> copyOnWriteArrayList;
        try {
            if (!TextUtils.isEmpty(str) && this.f13439b.containsKey(str) && (copyOnWriteArrayList = this.f13439b.get(str)) != null && copyOnWriteArrayList.size() > 0) {
                Iterator<d<T>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    d<T> next = it.next();
                    copyOnWriteArrayList.remove(next);
                    next.b(next.d());
                }
                if (copyOnWriteArrayList.size() > 0) {
                    this.f13439b.remove(str);
                    this.f13439b.put(str, copyOnWriteArrayList);
                } else {
                    this.f13439b.remove(str);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                a(this.f13438a.get(str), str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(d dVar, String str) {
        if (dVar != null) {
            dVar.a(dVar.d());
            this.f13438a.remove(str);
        }
    }
}
