package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f6754a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private FileLock f6755b;

    /* renamed from: c, reason: collision with root package name */
    private String f6756c;

    private a(String str, FileLock fileLock) {
        this.f6756c = str;
        this.f6755b = fileLock;
    }

    public static a a(String str) {
        Map<String, Lock> map = f6754a;
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
                } catch (Exception e6) {
                    reentrantLock.lock();
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(e6));
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = f6754a;
        synchronized (map) {
            try {
                try {
                    this.f6755b.a();
                    this.f6755b.b();
                    map.get(this.f6756c).unlock();
                } catch (Throwable th) {
                    f6754a.get(this.f6756c).unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
