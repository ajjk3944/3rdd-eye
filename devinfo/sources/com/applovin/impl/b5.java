package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b5 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f3763a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f3764b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f3765c = new Object();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3766a;

        static {
            int[] iArr = new int[b.values().length];
            f3766a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3766a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3766a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final c5 f3771a;

        /* renamed from: b, reason: collision with root package name */
        private final long f3772b;

        /* renamed from: c, reason: collision with root package name */
        private final long f3773c;

        public /* synthetic */ c(c5 c5Var, long j, a aVar) {
            this(c5Var, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.f3773c > this.f3772b;
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public c5 c() {
            return this.f3771a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            c5 c5VarC = c();
            c5 c5VarC2 = cVar.c();
            return c5VarC != null ? c5VarC.equals(c5VarC2) : c5VarC2 == null;
        }

        public int hashCode() {
            long jB = b();
            long jA = a();
            c5 c5VarC = c();
            return ((((((int) (jB ^ (jB >>> 32))) + 59) * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (c5VarC == null ? 43 : c5VarC.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SignalCacheManager.SignalWrapper(signal=");
            sb2.append(c());
            sb2.append(", expirationTimeMillis=");
            sb2.append(b());
            sb2.append(", cacheTimestampMillis=");
            return je.u.s(a(), ")", sb2);
        }

        private c(c5 c5Var, long j) {
            this.f3771a = c5Var;
            this.f3772b = j;
            this.f3773c = SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.f3772b;
        }

        public long a() {
            return this.f3773c;
        }
    }

    public b5(com.applovin.impl.sdk.k kVar) {
        this.f3763a = kVar;
    }

    public void a(c5 c5Var, d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        if (c5Var == null) {
            return;
        }
        long jV = d5Var.v();
        if (jV <= 0) {
            return;
        }
        this.f3763a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f3763a.O().a("SignalCacheManager", "Caching signal for: " + d5Var);
        }
        String strA = a(d5Var, str, maxAdFormat);
        c cVar = new c(c5Var, jV, null);
        synchronized (this.f3765c) {
            this.f3764b.put(strA, cVar);
        }
    }

    public c5 b(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        String strA = a(d5Var, str, maxAdFormat);
        synchronized (this.f3765c) {
            try {
                c cVar = (c) this.f3764b.get(strA);
                if (cVar == null) {
                    return null;
                }
                if (cVar.d()) {
                    this.f3764b.remove(strA);
                    return null;
                }
                this.f3763a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f3763a.O().a("SignalCacheManager", "Returning cached signal for: " + d5Var);
                }
                return cVar.f3771a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private String a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        String strC = d5Var.c();
        int i4 = a.f3766a[d5Var.t().ordinal()];
        if (i4 != 1) {
            return i4 != 2 ? strC : d.h.E(strC, "_", str);
        }
        StringBuilder sbB = i3.e.b(strC, "_");
        sbB.append(maxAdFormat.getLabel());
        return sbB.toString();
    }
}
