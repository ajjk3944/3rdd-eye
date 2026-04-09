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

    public xq(int i) {
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
        V v6;
        if (k6 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                SoftReference<V> softReference = this.emc.get(k6);
                if (softReference != null) {
                    v6 = softReference.get();
                    if (v6 != null) {
                        this.uym++;
                        return v6;
                    }
                    this.emc.remove(k6);
                } else {
                    v6 = null;
                }
                this.msw++;
                V vYpw = ypw(k6);
                if (vYpw == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.bw++;
                        SoftReference<V> softReferencePut = this.emc.put(k6, new SoftReference<>(vYpw));
                        if (softReferencePut != null) {
                            v6 = softReferencePut.get();
                        }
                        if (v6 != null) {
                            this.emc.put(k6, softReferencePut);
                        } else {
                            this.ypw += xq(k6, vYpw);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (v6 != null) {
                    return v6;
                }
                emc(this.xq);
                return vYpw;
            } finally {
            }
        }
    }

    public final synchronized String toString() {
        int i;
        int i3;
        try {
            i = this.uym;
            i3 = this.msw + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.xq), Integer.valueOf(this.uym), Integer.valueOf(this.msw), Integer.valueOf(i3 != 0 ? (i * 100) / i3 : 0));
    }

    public int ypw(K k6, V v6) {
        return 1;
    }

    public V ypw(K k6) {
        return null;
    }

    public final V emc(K k6, V v6) {
        V v7;
        if (k6 != null && v6 != null) {
            synchronized (this) {
                try {
                    this.dg++;
                    this.ypw += xq(k6, v6);
                    SoftReference<V> softReferencePut = this.emc.put(k6, new SoftReference<>(v6));
                    if (softReferencePut != null) {
                        v7 = softReferencePut.get();
                        if (v7 != null) {
                            this.ypw -= xq(k6, v7);
                        }
                    } else {
                        v7 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            emc(this.xq);
            return v7;
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
