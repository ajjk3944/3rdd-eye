package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f9136a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private FileLock f9137b;

    /* renamed from: c, reason: collision with root package name */
    private String f9138c;

    private a(String str, FileLock fileLock) {
        this.f9138c = str;
        this.f9137b = fileLock;
    }

    public static a a(String str) throws Exception {
        Map<String, Lock> map = f9136a;
        synchronized (map) {
            try {
                Lock reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                if (!reentrantLock.tryLock()) {
                    return null;
                }
                try {
                    FileLock fileLockC = FileLock.c(str);
                    if (fileLockC == null) {
                        reentrantLock.unlock();
                        return null;
                    }
                    return new a(str, fileLockC);
                } catch (Exception e10) {
                    reentrantLock.lock();
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(e10));
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = f9136a;
        synchronized (map) {
            try {
                try {
                    this.f9137b.a();
                    this.f9137b.b();
                    map.get(this.f9138c).unlock();
                } catch (Throwable th) {
                    f9136a.get(this.f9138c).unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
