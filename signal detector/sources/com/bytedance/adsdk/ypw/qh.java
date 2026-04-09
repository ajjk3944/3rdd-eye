package com.bytedance.adsdk.ypw;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class qh<K, V> {
    private int bw;
    private int dg;
    private final LinkedHashMap<K, V> emc;
    private int msw;
    private int uym;
    private int xq;
    private int ycc;
    private int ypw;

    public qh(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.xq = i;
        this.emc = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int xq(K k6, V v6) {
        int iYpw = ypw(k6, v6);
        if (iYpw >= 0) {
            return iYpw;
        }
        throw new IllegalStateException("Negative size: " + k6 + "=" + v6);
    }

    public final V emc(K k6) {
        V vPut;
        if (k6 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v6 = this.emc.get(k6);
                if (v6 != null) {
                    this.uym++;
                    return v6;
                }
                this.msw++;
                V vYpw = ypw(k6);
                if (vYpw == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.bw++;
                        vPut = this.emc.put(k6, vYpw);
                        if (vPut != null) {
                            this.emc.put(k6, vPut);
                        } else {
                            this.ypw += xq(k6, vYpw);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    return vPut;
                }
                emc(this.xq);
                return vYpw;
            } finally {
            }
        }
    }

    public final synchronized String toString() {
        int i;
        try {
            int i3 = this.uym;
            int i6 = this.msw + i3;
            i = i6 != 0 ? (i3 * 100) / i6 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.xq + ",hits=" + this.uym + ",misses=" + this.msw + ",hitRate=" + i + "%]";
    }

    public int ypw(K k6, V v6) {
        return 1;
    }

    public V ypw(K k6) {
        return null;
    }

    public final V emc(K k6, V v6) {
        V vPut;
        if (k6 != null && v6 != null) {
            synchronized (this) {
                try {
                    this.dg++;
                    this.ypw += xq(k6, v6);
                    vPut = this.emc.put(k6, v6);
                    if (vPut != null) {
                        this.ypw -= xq(k6, vPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            emc(this.xq);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.ypw     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L51
            java.util.LinkedHashMap<K, V> r0 = r3.emc     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.ypw     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L51
            goto L14
        L12:
            r4 = move-exception
            goto L70
        L14:
            int r0 = r3.ypw     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L4f
            java.util.LinkedHashMap<K, V> r0 = r3.emc     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L4f
        L21:
            java.util.LinkedHashMap<K, V> r0 = r3.emc     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, V> r2 = r3.emc     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.ypw     // Catch: java.lang.Throwable -> L12
            int r0 = r3.xq(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r0
            r3.ypw = r2     // Catch: java.lang.Throwable -> L12
            int r0 = r3.ycc     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.ycc = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r4     // Catch: java.lang.Throwable -> L12
        L70:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ypw.qh.emc(int):void");
    }
}
