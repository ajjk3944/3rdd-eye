package com.applovin.impl.sdk;

import com.applovin.impl.y2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final o f8063a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8064b = new HashMap(5);

    /* renamed from: c, reason: collision with root package name */
    private final Object f8065c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f8066d = Collections.synchronizedMap(new HashMap(5));

    /* renamed from: e, reason: collision with root package name */
    private final Map f8067e = Collections.synchronizedMap(new HashMap(5));

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f8068a;

        /* renamed from: b, reason: collision with root package name */
        private final String f8069b;

        /* renamed from: c, reason: collision with root package name */
        private final String f8070c;

        public a(String str, String str2, String str3) {
            this.f8068a = str;
            this.f8069b = str2;
            this.f8070c = str3;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public String b() {
            return this.f8068a;
        }

        public String c() {
            return this.f8070c;
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
            return this.f8069b;
        }
    }

    public p(k kVar) {
        this.f8063a = kVar.O();
    }

    public String a(String str) {
        return (String) this.f8067e.get(str);
    }

    public void b(y2 y2Var) {
        this.f8066d.put(y2Var.getAdUnitId(), y2Var.Q());
    }

    public void c(y2 y2Var) {
        synchronized (this.f8065c) {
            try {
                if (o.a()) {
                    this.f8063a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + y2Var);
                }
                this.f8064b.put(y2Var.getAdUnitId(), new a(y2Var.B(), y2Var.c(), y2Var.getNetworkName()));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8067e.put(y2Var.getAdUnitId(), y2Var.Q());
    }

    public void a(y2 y2Var) {
        synchronized (this.f8065c) {
            try {
                String adUnitId = y2Var.getAdUnitId();
                a aVar = (a) this.f8064b.get(adUnitId);
                if (aVar == null) {
                    if (o.a()) {
                        this.f8063a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                    }
                    return;
                }
                if (y2Var.B().equals(aVar.b())) {
                    if (o.a()) {
                        this.f8063a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                    }
                    this.f8064b.remove(adUnitId);
                } else if (o.a()) {
                    this.f8063a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + y2Var + " , since it could have already been updated with a new ad: " + aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String b(String str) {
        return (String) this.f8066d.get(str);
    }

    public a c(String str) {
        a aVar;
        synchronized (this.f8065c) {
            aVar = (a) this.f8064b.get(str);
        }
        return aVar;
    }
}
