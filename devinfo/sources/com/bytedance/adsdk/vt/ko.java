package com.bytedance.adsdk.vt;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko<K, V> {
    private int fkw;

    /* renamed from: le, reason: collision with root package name */
    private int f7042le;

    /* renamed from: lh, reason: collision with root package name */
    private int f7043lh = 20;
    private final LinkedHashMap<K, V> ouw = new LinkedHashMap<>(0, 0.75f, true);
    private int pno;
    private int ra;
    private int vt;
    private int yu;

    public final V ouw(K k2) {
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v10 = this.ouw.get(k2);
                if (v10 != null) {
                    this.ra++;
                    return v10;
                }
                this.pno++;
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized String toString() {
        int i4;
        try {
            int i10 = this.ra;
            int i11 = this.pno + i10;
            i4 = i11 != 0 ? (i10 * 100) / i11 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th2) {
            throw th2;
        }
        return "LruCache[maxSize=" + this.f7043lh + ",hits=" + this.ra + ",misses=" + this.pno + ",hitRate=" + i4 + "%]";
    }

    public final V ouw(K k2, V v10) {
        V vPut;
        if (k2 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.yu++;
                    this.vt++;
                    vPut = this.ouw.put(k2, v10);
                    if (vPut != null) {
                        this.vt--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ouw(this.f7043lh);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        throw new java.lang.IllegalStateException(com.bytedance.adsdk.vt.ko.class.getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ouw(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.vt     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L4d
            java.util.LinkedHashMap<K, V> r0 = r2.ouw     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r2.vt     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L4d
            goto L14
        L12:
            r3 = move-exception
            goto L6a
        L14:
            int r0 = r2.vt     // Catch: java.lang.Throwable -> L12
            if (r0 <= r3) goto L4b
            java.util.LinkedHashMap<K, V> r0 = r2.ouw     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L4b
        L21:
            java.util.LinkedHashMap<K, V> r0 = r2.ouw     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, V> r0 = r2.ouw     // Catch: java.lang.Throwable -> L12
            r0.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r0 = r2.vt     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + (-1)
            r2.vt = r0     // Catch: java.lang.Throwable -> L12
            int r0 = r2.f7042le     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r2.f7042le = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            goto L0
        L4b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return
        L4d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.bytedance.adsdk.vt.ko> r1 = com.bytedance.adsdk.vt.ko.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        L6a:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.ko.ouw(int):void");
    }
}
