package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f6745a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static ReentrantLock f6746b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    private String f6747c;

    /* renamed from: d, reason: collision with root package name */
    private FileLock f6748d;

    private b(String str, FileLock fileLock) {
        this.f6747c = str;
        this.f6748d = fileLock;
    }

    public static b a(String str) throws Exception {
        f6746b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f6745a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e2) {
            f6746b.unlock();
            throw e2;
        }
    }

    public final void a() {
        try {
            this.f6748d.a();
            this.f6748d.b();
            Lock lock = f6745a.get(this.f6747c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f6746b.unlock();
        }
    }
}
