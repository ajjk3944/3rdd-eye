package com.applovin.impl.sdk;

import com.applovin.impl.q2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final o f21405a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f21406b = new HashMap(5);

    /* renamed from: c, reason: collision with root package name */
    private final Object f21407c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f21408d = Collections.synchronizedMap(new HashMap(5));

    /* renamed from: e, reason: collision with root package name */
    private final Map f21409e = Collections.synchronizedMap(new HashMap(5));

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f21410a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21411b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21412c;

        public a(String str, String str2, String str3) {
            this.f21410a = str;
            this.f21411b = str2;
            this.f21412c = str3;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public String b() {
            return this.f21410a;
        }

        public String c() {
            return this.f21412c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            String strC = c();
            String strC2 = aVar.c();
            return strC != null ? strC.equals(strC2) : strC2 == null;
        }

        public int hashCode() {
            String strB = b();
            int iHashCode = strB == null ? 43 : strB.hashCode();
            String strA = a();
            int iHashCode2 = ((iHashCode + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            String strC = c();
            return (iHashCode2 * 59) + (strC != null ? strC.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ")";
        }

        public String a() {
            return this.f21411b;
        }
    }

    public p(k kVar) {
        this.f21405a = kVar.O();
    }

    public String a(String str) {
        return (String) this.f21409e.get(str);
    }

    public void b(q2 q2Var) {
        this.f21408d.put(q2Var.getAdUnitId(), q2Var.O());
    }

    public void c(q2 q2Var) {
        synchronized (this.f21407c) {
            try {
                if (o.a()) {
                    this.f21405a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + q2Var);
                }
                this.f21406b.put(q2Var.getAdUnitId(), new a(q2Var.C(), q2Var.c(), q2Var.getNetworkName()));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21409e.put(q2Var.getAdUnitId(), q2Var.O());
    }

    public void a(q2 q2Var) {
        synchronized (this.f21407c) {
            try {
                String adUnitId = q2Var.getAdUnitId();
                a aVar = (a) this.f21406b.get(adUnitId);
                if (aVar == null) {
                    if (o.a()) {
                        this.f21405a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                    }
                    return;
                }
                if (q2Var.C().equals(aVar.b())) {
                    if (o.a()) {
                        this.f21405a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                    }
                    this.f21406b.remove(adUnitId);
                } else if (o.a()) {
                    this.f21405a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + q2Var + " , since it could have already been updated with a new ad: " + aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String b(String str) {
        return (String) this.f21408d.get(str);
    }

    public a c(String str) {
        a aVar;
        synchronized (this.f21407c) {
            aVar = (a) this.f21406b.get(str);
        }
        return aVar;
    }
}
