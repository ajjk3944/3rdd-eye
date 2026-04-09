package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class r9 implements q9 {

    /* renamed from: a, reason: collision with root package name */
    public long f15576a;

    /* renamed from: b, reason: collision with root package name */
    public long f15577b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15578c;

    public r9() {
        this.f15576a = -9223372036854775807L;
        this.f15577b = -9223372036854775807L;
    }

    public synchronized Object a(Object obj) {
        t8.i iVar;
        iVar = (t8.i) ((LinkedHashMap) this.f15578c).get(obj);
        return iVar != null ? iVar.f34513a : null;
    }

    @Override // com.google.android.gms.internal.ads.q9
    public long b() {
        return this.f15577b;
    }

    public int c(Object obj) {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.q9
    public void e(MessageDigest[] messageDigestArr, long j, int i4) throws IOException {
        MappedByteBuffer map = ((FileChannel) this.f15578c).map(FileChannel.MapMode.READ_ONLY, this.f15576a + j, i4);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public synchronized Object f(Object obj, Object obj2) {
        int iC = c(obj2);
        long j = iC;
        if (j >= this.f15576a) {
            d(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f15577b += j;
        }
        t8.i iVar = (t8.i) ((LinkedHashMap) this.f15578c).put(obj, obj2 == null ? null : new t8.i(iC, obj2));
        if (iVar != null) {
            this.f15577b -= iVar.f34514b;
            if (!iVar.f34513a.equals(obj2)) {
                d(obj, iVar.f34513a);
            }
        }
        g(this.f15576a);
        return iVar != null ? iVar.f34513a : null;
    }

    public synchronized void g(long j) {
        while (this.f15577b > j) {
            Iterator it = ((LinkedHashMap) this.f15578c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            t8.i iVar = (t8.i) entry.getValue();
            this.f15577b -= iVar.f34514b;
            Object key = entry.getKey();
            it.remove();
            d(key, iVar.f34513a);
        }
    }

    public void h(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f15578c) == null) {
            this.f15578c = exc;
        }
        if (this.f15576a == -9223372036854775807L && kw1.X.get() <= 0) {
            this.f15576a = 200 + jElapsedRealtime;
        }
        long j = this.f15576a;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.f15577b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f15578c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f15578c;
        this.f15578c = null;
        this.f15576a = -9223372036854775807L;
        this.f15577b = -9223372036854775807L;
        throw exc3;
    }

    public boolean i() {
        synchronized (this.f15578c) {
            try {
                ua.j.C.f35267k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f15577b + this.f15576a > jElapsedRealtime) {
                    return false;
                }
                this.f15577b = jElapsedRealtime;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(long j) {
        synchronized (this.f15578c) {
            this.f15576a = j;
        }
    }

    public r9(FileChannel fileChannel, long j, long j8) {
        this.f15578c = fileChannel;
        this.f15576a = j;
        this.f15577b = j8;
    }

    public r9(int i4, long j) {
        switch (i4) {
            case 3:
                this.f15577b = Long.MIN_VALUE;
                this.f15578c = new Object();
                this.f15576a = j;
                break;
            default:
                this.f15578c = new LinkedHashMap(100, 0.75f, true);
                this.f15576a = j;
                break;
        }
    }

    public void d(Object obj, Object obj2) {
    }
}
