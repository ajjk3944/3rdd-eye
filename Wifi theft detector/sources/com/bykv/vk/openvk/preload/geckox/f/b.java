package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f9139a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static ReentrantLock f9140b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    private String f9141c;

    /* renamed from: d, reason: collision with root package name */
    private FileLock f9142d;

    private b(String str, FileLock fileLock) {
        this.f9141c = str;
        this.f9142d = fileLock;
    }

    public static b a(String str) throws Exception {
        f9140b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f9139a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e10) {
            f9140b.unlock();
            throw e10;
        }
    }

    public final void a() {
        try {
            this.f9142d.a();
            this.f9142d.b();
            Lock lock = f9139a.get(this.f9141c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f9140b.unlock();
        }
    }
}
