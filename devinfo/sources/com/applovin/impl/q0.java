package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.sdk.AppLovinErrorCodes;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: e, reason: collision with root package name */
    private static final List f5133e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5134a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f5135b;

    /* renamed from: c, reason: collision with root package name */
    private final b4 f5136c;

    /* renamed from: d, reason: collision with root package name */
    private d f5137d;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f5138a;

        /* renamed from: b, reason: collision with root package name */
        private long f5139b;

        public long a() {
            return this.f5138a;
        }

        public long b() {
            return this.f5139b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            this.f5138a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j) {
            this.f5139b = j;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c implements d4.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5140a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f5141b;

        /* renamed from: c, reason: collision with root package name */
        private final String f5142c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f5143d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f5144e;

        /* renamed from: f, reason: collision with root package name */
        private final b f5145f;
        private final e g;

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x004f: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:80), block:B:29:0x004e */
        @Override // d4.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(b4.d dVar) {
            MalformedURLException malformedURLException;
            int iC;
            int i4;
            long jE = dVar.e();
            Object objA = null;
            try {
                try {
                    iC = dVar.c();
                    try {
                        if (iC > 0) {
                            try {
                                if (iC < 200 || iC >= 400) {
                                    this.g.a(this.f5140a, iC, null, null);
                                    return;
                                }
                                try {
                                    b bVar = this.f5145f;
                                    if (bVar != null) {
                                        bVar.a(jE);
                                    }
                                    q0.this.a(this.f5142c, this.f5140a, iC, jE);
                                    byte[] bArrD = dVar.d();
                                    if (n7.h(com.applovin.impl.sdk.k.o()) && (!this.f5144e || u4.b(bArrD) != u4.a.V2)) {
                                        q0.this.f5134a.t().a(bArrD != null ? new String(dVar.d(), Charset.forName("UTF-8")) : "", this.f5140a, this.f5141b.b() != null ? this.f5141b.b().toString() : "");
                                    }
                                    if (bArrD == null) {
                                        this.g.a(this.f5140a, this.f5143d, iC);
                                        return;
                                    }
                                    String str = new String(dVar.d(), Charset.forName("UTF-8"));
                                    b bVar2 = this.f5145f;
                                    if (bVar2 != null) {
                                        bVar2.b(bArrD.length);
                                        if (this.f5141b.r()) {
                                            q0.this.f5137d = new d(this.f5141b.f(), bArrD.length, jE);
                                        }
                                    }
                                    if (this.f5144e) {
                                        String strB = u4.b(bArrD, q0.this.f5134a.i0(), q0.this.f5134a);
                                        if (strB == null) {
                                            HashMap map = new HashMap(2);
                                            map.put("request", StringUtils.getHostAndPath(this.f5140a));
                                            map.put("response", str);
                                            q0.this.f5134a.F().trackEvent("rdf", map);
                                        }
                                        str = strB;
                                    }
                                    try {
                                        this.g.a(this.f5140a, q0.this.a(str, this.f5143d), iC);
                                        return;
                                    } catch (Throwable th2) {
                                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f5140a) + " because of " + th2.getClass().getName() + " : " + th2.getMessage();
                                        com.applovin.impl.sdk.o unused = q0.this.f5135b;
                                        if (com.applovin.impl.sdk.o.a()) {
                                            q0.this.f5135b.a("ConnectionManager", str2, th2);
                                        }
                                        q0.this.f5134a.D().a("ConnectionManager", "failedToParseResponse", th2, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f5140a)));
                                        this.g.a(this.f5140a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                        return;
                                    }
                                } catch (MalformedURLException e2) {
                                    e = e2;
                                }
                            } catch (MalformedURLException e10) {
                                malformedURLException = e10;
                                iC = i4;
                            }
                        } else {
                            try {
                                q0.this.a(this.f5142c, this.f5140a, iC, jE, (Throwable) null);
                                this.g.a(this.f5140a, iC, null, null);
                                return;
                            } catch (MalformedURLException e11) {
                                e = e11;
                                iC = iC;
                            }
                        }
                    } catch (MalformedURLException e12) {
                        e = e12;
                    }
                    malformedURLException = e;
                } catch (Throwable th3) {
                    int iB = dVar.b();
                    try {
                        byte[] bArrF = dVar.f();
                        String str3 = new String(bArrF);
                        if (bArrF != null) {
                            if (this.f5144e) {
                                str3 = u4.b(bArrF, q0.this.f5134a.i0(), q0.this.f5134a);
                            }
                            objA = q0.this.a(str3, this.f5143d);
                        }
                    } catch (Throwable unused2) {
                    }
                    q0.this.a(this.f5142c, this.f5140a, iB, jE, th3);
                    this.g.a(this.f5140a, iB, th3.getMessage(), objA);
                    return;
                }
            } catch (MalformedURLException e13) {
                malformedURLException = e13;
                iC = 0;
            }
            MalformedURLException malformedURLException2 = malformedURLException;
            if (this.f5143d != null) {
                q0.this.a(this.f5142c, this.f5140a, iC, jE, malformedURLException2);
                this.g.a(this.f5140a, -901, malformedURLException2.getMessage(), null);
            } else {
                q0.this.a(this.f5142c, this.f5140a, iC, jE);
                this.g.a(this.f5140a, this.f5143d, -901);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z3, b bVar, e eVar) {
            this.f5140a = str;
            this.f5141b = aVar;
            this.f5142c = str2;
            this.f5143d = obj;
            this.f5144e = z3;
            this.f5145f = bVar;
            this.g = eVar;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f5147a = System.currentTimeMillis();

        /* renamed from: b, reason: collision with root package name */
        private final String f5148b;

        /* renamed from: c, reason: collision with root package name */
        private final long f5149c;

        /* renamed from: d, reason: collision with root package name */
        private final long f5150d;

        public d(String str, long j, long j8) {
            this.f5148b = str;
            this.f5149c = j;
            this.f5150d = j8;
        }

        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f5149c;
        }

        public long c() {
            return this.f5147a;
        }

        public String d() {
            return this.f5148b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String strD = d();
            String strD2 = dVar.d();
            return strD != null ? strD.equals(strD2) : strD2 == null;
        }

        public int hashCode() {
            long jC = c();
            long jB = b();
            int i4 = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            return (((i4 * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (strD == null ? 43 : strD.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.f5150d;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface e {
        void a(String str, int i4, String str2, Object obj);

        void a(String str, Object obj, int i4);
    }

    public q0(com.applovin.impl.sdk.k kVar) {
        this.f5134a = kVar;
        this.f5135b = kVar.O();
        b4 b4Var = new b4(kVar);
        this.f5136c = b4Var;
        b4Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020c A[Catch: all -> 0x013c, TRY_LEAVE, TryCatch #3 {all -> 0x013c, blocks: (B:39:0x0105, B:43:0x012c, B:42:0x0128, B:50:0x0166, B:52:0x017e, B:58:0x01a0, B:73:0x01f2, B:76:0x0201, B:78:0x020c, B:60:0x01a4, B:63:0x01ac, B:68:0x01c3, B:70:0x01c9, B:71:0x01de, B:54:0x018d, B:81:0x0215, B:65:0x01bd), top: B:111:0x0105, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.sdk.network.a r20, com.applovin.impl.q0.b r21, com.applovin.impl.q0.e r22) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q0.a(com.applovin.impl.sdk.network.a, com.applovin.impl.q0$b, com.applovin.impl.q0$e):void");
    }

    public d a() {
        return this.f5137d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof p8) {
                return q8.a(str, this.f5134a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f5135b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i4, long j) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5135b.d("ConnectionManager", "Successful " + str + " returned " + i4 + " in " + (j / 1000.0f) + " s over " + r0.g(this.f5134a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i4, long j, Throwable th2) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5135b.a("ConnectionManager", "Failed " + str + " returned " + i4 + " in " + (j / 1000.0f) + " s over " + r0.g(this.f5134a) + " to " + a(str2), th2);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
