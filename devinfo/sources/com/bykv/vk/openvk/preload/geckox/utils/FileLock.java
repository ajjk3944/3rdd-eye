package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class FileLock {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f6802a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f6803b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6804c;

    static {
        System.loadLibrary("file_lock_pgl");
    }

    private FileLock(String str, int i4) {
        this.f6804c = str;
        this.f6803b = i4;
    }

    public static FileLock a(String str) {
        try {
            int iD = d(str);
            nLockFile(iD);
            return new FileLock(str, iD);
        } catch (Exception e2) {
            StringBuilder sbA = d.h.A("lock failed, file:", str, ", pid:");
            sbA.append(Process.myPid());
            sbA.append(" caused by:");
            sbA.append(e2.getMessage());
            throw new RuntimeException(sbA.toString());
        }
    }

    public static FileLock b(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            return null;
        } catch (Exception e2) {
            StringBuilder sbA = d.h.A("try lock failed, file:", str, " caused by:");
            sbA.append(e2.getMessage());
            throw new RuntimeException(sbA.toString());
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            new FileLock(str, iD).b();
            return null;
        } catch (Exception e2) {
            StringBuilder sbA = d.h.A("try lock failed, file:", str, " caused by:");
            sbA.append(e2.getMessage());
            throw new RuntimeException(sbA.toString());
        }
    }

    private static int d(String str) throws Exception {
        Integer numValueOf;
        Map<String, Integer> map = f6802a;
        synchronized (map) {
            try {
                numValueOf = map.get(str);
                if (numValueOf == null) {
                    new File(str).getParentFile().mkdirs();
                    numValueOf = Integer.valueOf(nGetFD(str));
                    map.put(str, numValueOf);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return numValueOf.intValue();
    }

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i4) throws Exception;

    private static native void nLockFileSegment(int i4, int i10) throws Exception;

    private static native void nRelease(int i4) throws Exception;

    private static native boolean nTryLock(int i4) throws Exception;

    private static native void nUnlockFile(int i4) throws Exception;

    public static FileLock a(String str, int i4) {
        try {
            int iD = d(str);
            nLockFileSegment(iD, i4);
            return new FileLock(str, iD);
        } catch (Exception e2) {
            StringBuilder sbA = d.h.A("lock segment failed, file:", str, " caused by:");
            sbA.append(e2.getMessage());
            throw new RuntimeException(sbA.toString());
        }
    }

    public final void b() {
        Integer numRemove;
        Map<String, Integer> map = f6802a;
        synchronized (map) {
            numRemove = map.remove(this.f6804c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e2) {
            throw new RuntimeException("release lock failed, file:" + this.f6804c + " caused by:" + e2.getMessage());
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.f6803b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f6804c);
        }
    }
}
