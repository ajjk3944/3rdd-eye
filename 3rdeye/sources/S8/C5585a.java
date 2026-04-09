package s8;

import android.annotation.SuppressLint;
import android.content.Context;
import c9.C2092m;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: NetworkStateMonitor.kt */
/* renamed from: s8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5585a {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static C5585a f46168d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f46171a;

    /* renamed from: b, reason: collision with root package name */
    public b f46172b = new b(0, new HashMap(), false, "");

    /* renamed from: c, reason: collision with root package name */
    public static final C0528a f46167c = new C0528a();

    /* renamed from: e, reason: collision with root package name */
    public static final List<String> f46169e = C2092m.W("adsense.google.com", "adservice.google.ca", "adservice.google.co.in", "adservice.google.co.kr", "adservice.google.co.uk", "adservice.google.co.za", "adservice.google.com", "adservice.google.com.ar", "adservice.google.com.au", "adservice.google.com.br", "adservice.google.com.co", "adservice.google.com.gt", "adservice.google.com.mx", "adservice.google.com.pe", "adservice.google.com.ph", "adservice.google.com.pk", "adservice.google.com.tr", "adservice.google.com.tw", "adservice.google.com.vn", "adservice.google.de", "adservice.google.dk", "adservice.google.es", "adservice.google.fr", "adservice.google.nl", "adservice.google.no", "adservice.google.pl", "adservice.google.ru", "adservice.google.vg", "app-measurement.com", "doubleclick.com", "doubleclick.net", "doubleclickbygoogle.com", "googleadservices.com");

    /* renamed from: f, reason: collision with root package name */
    public static final List<String> f46170f = C2092m.W("ms.applvn.com", "applovin.com");

    /* compiled from: NetworkStateMonitor.kt */
    /* renamed from: s8.a$a, reason: collision with other inner class name */
    public static final class C0528a {
        public final synchronized C5585a a(Context context) {
            C5585a c5585a;
            c5585a = C5585a.f46168d;
            if (c5585a == null) {
                c5585a = new C5585a(context);
                C5585a.f46168d = c5585a;
            }
            return c5585a;
        }
    }

    /* compiled from: NetworkStateMonitor.kt */
    /* renamed from: s8.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f46173a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap<String, Boolean> f46174b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46175c;

        /* renamed from: d, reason: collision with root package name */
        public final String f46176d;

        public b(long j4, HashMap<String, Boolean> map, boolean z10, String str) {
            this.f46173a = j4;
            this.f46174b = map;
            this.f46175c = z10;
            this.f46176d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f46173a == bVar.f46173a && l.b(this.f46174b, bVar.f46174b) && this.f46175c == bVar.f46175c && l.b(this.f46176d, bVar.f46176d);
        }

        public final int hashCode() {
            long j4 = this.f46173a;
            return this.f46176d.hashCode() + ((((this.f46174b.hashCode() + (((int) (j4 ^ (j4 >>> 32))) * 31)) * 31) + (this.f46175c ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            return "PhNetworkState(timestamp=" + this.f46173a + ", hostsStatus=" + this.f46174b + ", vpnActive=" + this.f46175c + ", privateDNS=" + this.f46176d + ")";
        }
    }

    public C5585a(Context context) {
        this.f46171a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(h9.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s8.C5586b
            if (r0 == 0) goto L13
            r0 = r6
            s8.b r0 = (s8.C5586b) r0
            int r1 = r0.f46180o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46180o = r1
            goto L18
        L13:
            s8.b r0 = new s8.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f46178m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f46180o
            r3 = 1
            r4 = 100
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            s8.a r0 = r0.f46177l
            b9.n.b(r6)
            goto L52
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            b9.n.b(r6)
            s8.a$b r6 = r5.f46172b
            java.util.HashMap<java.lang.String, java.lang.Boolean> r6 = r6.f46174b
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L46
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            return r6
        L46:
            r0.f46177l = r5
            r0.f46180o = r3
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r5
        L52:
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            float r6 = (float) r6
            s8.a$b r0 = r0.f46172b
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r0.f46174b
            int r0 = r0.size()
            float r0 = (float) r0
            float r6 = r6 / r0
            float r0 = (float) r4
            float r6 = r6 * r0
            int r6 = (int) r6
            int r4 = r4 - r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.C5585a.a(h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(h9.c r6) {
        /*
            r5 = this;
            A9.j r0 = new A9.j
            f9.e r6 = com.google.gson.internal.c.r(r6)
            r1 = 1
            r0.<init>(r1, r6)
            r0.s()
            long r1 = java.lang.System.currentTimeMillis()
            s8.a$b r6 = r5.f46172b
            long r3 = r6.f46173a
            long r1 = r1 - r3
            r3 = 1800000(0x1b7740, double:8.89318E-318)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L9b
            android.content.Context r1 = r5.f46171a
            int r2 = J8.C.f2809a
            boolean r2 = J8.C.c(r1)
            boolean r3 = r6.f46175c
            if (r3 != r2) goto L9b
            java.lang.String r1 = J8.C.a(r1)
            java.lang.String r6 = r6.f46176d
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L9b
            boolean r6 = r0.isActive()
            if (r6 == 0) goto Lab
            s8.a$b r6 = r5.f46172b
            java.util.HashMap<java.lang.String, java.lang.Boolean> r6 = r6.f46174b
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L4c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L4c
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L4c
        L70:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r2 = r1.size()
            r6.<init>(r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L81:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L97
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r6.add(r2)
            goto L81
        L97:
            r0.resumeWith(r6)
            goto Lab
        L9b:
            I9.b r6 = A9.U.f212b
            F9.f r6 = A9.F.a(r6)
            s8.c r1 = new s8.c
            r2 = 0
            r1.<init>(r5, r0, r2)
            r3 = 3
            A9.C0575f.e(r6, r2, r2, r1, r3)
        Lab:
            java.lang.Object r6 = r0.r()
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.C5585a.b(h9.c):java.lang.Object");
    }
}
