package com.bytedance.sdk.component.bw.xq.emc;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class xq<K, V> {
    private int bw;
    private int dg;
    private final LinkedHashMap<K, SoftReference<V>> emc;
    private int msw;
    private int uym;
    private int xq;
    private int ycc;
    private int ypw;

    public xq(int i10) {
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
        V v10;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                SoftReference<V> softReference = this.emc.get(k10);
                if (softReference != null) {
                    v10 = softReference.get();
                    if (v10 != null) {
                        this.uym++;
                        return v10;
                    }
                    this.emc.remove(k10);
                } else {
                    v10 = null;
                }
                this.msw++;
                V vYpw = ypw(k10);
                if (vYpw == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.bw++;
                        SoftReference<V> softReferencePut = this.emc.put(k10, new SoftReference<>(vYpw));
                        if (softReferencePut != null) {
                            v10 = softReferencePut.get();
                        }
                        if (v10 != null) {
                            this.emc.put(k10, softReferencePut);
                        } else {
                            this.ypw += xq(k10, vYpw);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (v10 != null) {
                    return v10;
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
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.xq), Integer.valueOf(this.uym), Integer.valueOf(this.msw), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    public int ypw(K k10, V v10) {
        return 1;
    }

    public V ypw(K k10) {
        return null;
    }

    public final V emc(K k10, V v10) {
        V v11;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.dg++;
                    this.ypw += xq(k10, v10);
                    SoftReference<V> softReferencePut = this.emc.put(k10, new SoftReference<>(v10));
                    if (softReferencePut != null) {
                        v11 = softReferencePut.get();
                        if (v11 != null) {
                            this.ypw -= xq(k10, v11);
                        }
                    } else {
                        v11 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            emc(this.xq);
            return v11;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        android.util.Log.e("LruCache", "oom maybe occured, clear cache. size= " + r3.ypw + ", maxSize: " + r4);
        r3.ypw = 0;
        r3.emc.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        return;
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
            if (r0 < 0) goto L54
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.emc     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.ypw     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            goto L54
        L12:
            r4 = move-exception
            goto L7b
        L14:
            int r0 = r3.ypw     // Catch: java.lang.Throwable -> L12
            if (r0 > r4) goto L1a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L1a:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.emc     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L2e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L2e:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r3.emc     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L12
            int r2 = r3.ypw     // Catch: java.lang.Throwable -> L12
            int r0 = r3.xq(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r0
            r3.ypw = r2     // Catch: java.lang.Throwable -> L12
        L4c:
            int r0 = r3.ycc     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.ycc = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L54:
            java.lang.String r0 = "LruCache"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "oom maybe occured, clear cache. size= "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.ypw     // Catch: java.lang.Throwable -> L12
            r1.append(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = ", maxSize: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L12
            r1.append(r4)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L12
            android.util.Log.e(r0, r4)     // Catch: java.lang.Throwable -> L12
            r4 = 0
            r3.ypw = r4     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r4 = r3.emc     // Catch: java.lang.Throwable -> L12
            r4.clear()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L7b:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.bw.xq.emc.xq.emc(int):void");
    }
}
