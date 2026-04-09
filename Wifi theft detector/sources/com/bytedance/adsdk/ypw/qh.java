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

    public qh(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.xq = i10;
        this.emc = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int xq(K k10, V v10) {
        int iYpw = ypw(k10, v10);
        if (iYpw >= 0) {
            return iYpw;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    public final V emc(K k10) {
        V vPut;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v10 = this.emc.get(k10);
                if (v10 != null) {
                    this.uym++;
                    return v10;
                }
                this.msw++;
                V vYpw = ypw(k10);
                if (vYpw == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.bw++;
                        vPut = this.emc.put(k10, vYpw);
                        if (vPut != null) {
                            this.emc.put(k10, vPut);
                        } else {
                            this.ypw += xq(k10, vYpw);
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
        int i10;
        int i11;
        try {
            i10 = this.uym;
            i11 = this.msw + i10;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.xq), Integer.valueOf(this.uym), Integer.valueOf(this.msw), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    public int ypw(K k10, V v10) {
        return 1;
    }

    public V ypw(K k10) {
        return null;
    }

    public final V emc(K k10, V v10) {
        V vPut;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.dg++;
                    this.ypw += xq(k10, v10);
                    vPut = this.emc.put(k10, v10);
                    if (vPut != null) {
                        this.ypw -= xq(k10, vPut);
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
