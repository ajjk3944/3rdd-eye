package com.applovin.shadow.okio;

import java.util.concurrent.locks.ReentrantLock;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class _JvmPlatformKt {
    public static final byte[] asUtf8ToByteArray(String str) {
        k.e(str, "<this>");
        byte[] bytes = str.getBytes(vk.a.f36267a);
        k.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    public static final String toUtf8String(byte[] bArr) {
        k.e(bArr, "<this>");
        return new String(bArr, vk.a.f36267a);
    }

    public static final <T> T withLock(ReentrantLock reentrantLock, mk.a aVar) {
        k.e(reentrantLock, "<this>");
        k.e(aVar, "action");
        reentrantLock.lock();
        try {
            return (T) aVar.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
