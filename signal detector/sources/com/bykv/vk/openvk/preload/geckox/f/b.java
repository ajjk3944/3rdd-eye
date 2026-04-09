package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f6757a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static ReentrantLock f6758b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    private String f6759c;

    /* renamed from: d, reason: collision with root package name */
    private FileLock f6760d;

    private b(String str, FileLock fileLock) {
        this.f6759c = str;
        this.f6760d = fileLock;
    }

    public static b a(String str) throws Exception {
        f6758b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f6757a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e6) {
            f6758b.unlock();
            throw e6;
        }
    }

    public final void a() {
        try {
            this.f6760d.a();
            this.f6760d.b();
            Lock lock = f6757a.get(this.f6759c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f6758b.unlock();
        }
    }
}
