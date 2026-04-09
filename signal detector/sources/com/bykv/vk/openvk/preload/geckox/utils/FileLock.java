package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FileLock {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f6815a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f6816b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6817c;

    static {
        System.loadLibrary("file_lock_pgl");
    }

    private FileLock(String str, int i) {
        this.f6817c = str;
        this.f6816b = i;
    }

    public static FileLock a(String str) {
        try {
            int iD = d(str);
            nLockFile(iD);
            return new FileLock(str, iD);
        } catch (Exception e6) {
            StringBuilder sbQ = AbstractC1135f5.q("lock failed, file:", str, ", pid:");
            sbQ.append(Process.myPid());
            sbQ.append(" caused by:");
            sbQ.append(e6.getMessage());
            throw new RuntimeException(sbQ.toString());
        }
    }

    public static FileLock b(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            return null;
        } catch (Exception e6) {
            StringBuilder sbQ = AbstractC1135f5.q("try lock failed, file:", str, " caused by:");
            sbQ.append(e6.getMessage());
            throw new RuntimeException(sbQ.toString());
        }
    }

    public static FileLock c(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            new FileLock(str, iD).b();
            return null;
        } catch (Exception e6) {
            StringBuilder sbQ = AbstractC1135f5.q("try lock failed, file:", str, " caused by:");
            sbQ.append(e6.getMessage());
            throw new RuntimeException(sbQ.toString());
        }
    }

    private static int d(String str) {
        Integer numValueOf;
        Map<String, Integer> map = f6815a;
        synchronized (map) {
            try {
                numValueOf = map.get(str);
                if (numValueOf == null) {
                    new File(str).getParentFile().mkdirs();
                    numValueOf = Integer.valueOf(nGetFD(str));
                    map.put(str, numValueOf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return numValueOf.intValue();
    }

    private static native int nGetFD(String str);

    private static native void nLockFile(int i);

    private static native void nLockFileSegment(int i, int i3);

    private static native void nRelease(int i);

    private static native boolean nTryLock(int i);

    private static native void nUnlockFile(int i);

    public static FileLock a(String str, int i) {
        try {
            int iD = d(str);
            nLockFileSegment(iD, i);
            return new FileLock(str, iD);
        } catch (Exception e6) {
            StringBuilder sbQ = AbstractC1135f5.q("lock segment failed, file:", str, " caused by:");
            sbQ.append(e6.getMessage());
            throw new RuntimeException(sbQ.toString());
        }
    }

    public final void b() {
        Integer numRemove;
        Map<String, Integer> map = f6815a;
        synchronized (map) {
            numRemove = map.remove(this.f6817c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e6) {
            throw new RuntimeException("release lock failed, file:" + this.f6817c + " caused by:" + e6.getMessage());
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.f6816b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f6817c);
        }
    }
}
