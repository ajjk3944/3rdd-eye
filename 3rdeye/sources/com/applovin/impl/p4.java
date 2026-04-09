package com.applovin.impl;

import N7.C1094a9;
import N7.G8;
import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class p4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20663a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f20664b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f20665c = new Object();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20666a;

        static {
            int[] iArr = new int[b.values().length];
            f20666a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20666a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20666a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final q4 f20671a;

        /* renamed from: b, reason: collision with root package name */
        private final long f20672b;

        /* renamed from: c, reason: collision with root package name */
        private final long f20673c;

        public /* synthetic */ c(q4 q4Var, long j4, a aVar) {
            this(q4Var, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.f20673c > this.f20672b;
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public q4 c() {
            return this.f20671a;
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
            q4 q4VarC = c();
            q4 q4VarC2 = cVar.c();
            return q4VarC != null ? q4VarC.equals(q4VarC2) : q4VarC2 == null;
        }

        public int hashCode() {
            long jB = b();
            long jA = a();
            q4 q4VarC = c();
            return ((((((int) (jB ^ (jB >>> 32))) + 59) * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (q4VarC == null ? 43 : q4VarC.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SignalCacheManager.SignalWrapper(signal=");
            sb.append(c());
            sb.append(", expirationTimeMillis=");
            sb.append(b());
            sb.append(", cacheTimestampMillis=");
            return C1094a9.f(sb, a(), ")");
        }

        private c(q4 q4Var, long j4) {
            this.f20671a = q4Var;
            this.f20672b = j4;
            this.f20673c = SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.f20672b;
        }

        public long a() {
            return this.f20673c;
        }
    }

    public p4(com.applovin.impl.sdk.k kVar) {
        this.f20663a = kVar;
    }

    public void a(q4 q4Var, r4 r4Var, String str, MaxAdFormat maxAdFormat) {
        if (q4Var == null) {
            return;
        }
        long jU = r4Var.u();
        if (jU <= 0) {
            return;
        }
        this.f20663a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f20663a.O().a("SignalCacheManager", "Caching signal for: " + r4Var);
        }
        String strA = a(r4Var, str, maxAdFormat);
        c cVar = new c(q4Var, jU, null);
        synchronized (this.f20665c) {
            this.f20664b.put(strA, cVar);
        }
    }

    public q4 b(r4 r4Var, String str, MaxAdFormat maxAdFormat) {
        String strA = a(r4Var, str, maxAdFormat);
        synchronized (this.f20665c) {
            try {
                c cVar = (c) this.f20664b.get(strA);
                if (cVar == null) {
                    return null;
                }
                if (cVar.d()) {
                    this.f20664b.remove(strA);
                    return null;
                }
                this.f20663a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20663a.O().a("SignalCacheManager", "Returning cached signal for: " + r4Var);
                }
                return cVar.f20671a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String a(r4 r4Var, String str, MaxAdFormat maxAdFormat) {
        String strC = r4Var.c();
        int i = a.f20666a[r4Var.t().ordinal()];
        if (i != 1) {
            return i != 2 ? strC : B4.g.o(strC, "_", str);
        }
        StringBuilder sbV = G8.v(strC, "_");
        sbV.append(maxAdFormat.getLabel());
        return sbV.toString();
    }
}
