package com.wireguard.android.backend;

import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f45600a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private long f45601b = SystemClock.elapsedRealtime();

    b() {
    }

    void a(com.wireguard.crypto.b bVar, long j10, long j11) {
        this.f45600a.put(bVar, Pair.create(Long.valueOf(j10), Long.valueOf(j11)));
        this.f45601b = SystemClock.elapsedRealtime();
    }

    public long b() {
        Iterator it = this.f45600a.values().iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Long) ((Pair) it.next()).first).longValue();
        }
        return jLongValue;
    }

    public long c() {
        Iterator it = this.f45600a.values().iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Long) ((Pair) it.next()).second).longValue();
        }
        return jLongValue;
    }
}
