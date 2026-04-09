package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.sdk.AppLovinErrorCodes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.ui.AdActivity;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q0 {

    /* renamed from: e, reason: collision with root package name */
    private static final List f7350e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7351a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f7352b;

    /* renamed from: c, reason: collision with root package name */
    private final b4 f7353c;

    /* renamed from: d, reason: collision with root package name */
    private d f7354d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f7355a;

        /* renamed from: b, reason: collision with root package name */
        private long f7356b;

        public long a() {
            return this.f7355a;
        }

        public long b() {
            return this.f7356b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f7355a = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10) {
            this.f7356b = j10;
        }
    }

    public class c implements r0.b {

        /* renamed from: a, reason: collision with root package name */
        private final String f7357a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f7358b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7359c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f7360d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f7361e;

        /* renamed from: f, reason: collision with root package name */
        private final b f7362f;

        /* renamed from: g, reason: collision with root package name */
        private final e f7363g;

        /* JADX WARN: Not initialized variable reg: 6, insn: 0x004d: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:78), block:B:29:0x004c */
        @Override // r0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(b4.d dVar) {
            MalformedURLException malformedURLException;
            int iC;
            int i10;
            long jE = dVar.e();
            Object objA = null;
            try {
                try {
                    iC = dVar.c();
                    try {
                        if (iC > 0) {
                            try {
                                if (iC < 200 || iC >= 400) {
                                    this.f7363g.a(this.f7357a, iC, null, null);
                                    return;
                                }
                                try {
                                    b bVar = this.f7362f;
                                    if (bVar != null) {
                                        bVar.a(jE);
                                    }
                                    q0.this.a(this.f7359c, this.f7357a, iC, jE);
                                    byte[] bArrD = dVar.d();
                                    if (n7.h(com.applovin.impl.sdk.k.o()) && (!this.f7361e || u4.b(bArrD) != u4.a.V2)) {
                                        q0.this.f7351a.t().a(bArrD != null ? new String(dVar.d(), Charset.forName(C.UTF8_NAME)) : "", this.f7357a, this.f7358b.b() != null ? this.f7358b.b().toString() : "");
                                    }
                                    if (bArrD == null) {
                                        this.f7363g.a(this.f7357a, this.f7360d, iC);
                                        return;
                                    }
                                    String str = new String(dVar.d(), Charset.forName(C.UTF8_NAME));
                                    b bVar2 = this.f7362f;
                                    if (bVar2 != null) {
                                        bVar2.b(bArrD.length);
                                        if (this.f7358b.r()) {
                                            q0.this.f7354d = new d(this.f7358b.f(), bArrD.length, jE);
                                        }
                                    }
                                    if (this.f7361e) {
                                        String strB = u4.b(bArrD, q0.this.f7351a.i0(), q0.this.f7351a);
                                        if (strB == null) {
                                            HashMap map = new HashMap(2);
                                            map.put(AdActivity.REQUEST_KEY_EXTRA, StringUtils.getHostAndPath(this.f7357a));
                                            map.put("response", str);
                                            q0.this.f7351a.F().trackEvent("rdf", map);
                                        }
                                        str = strB;
                                    }
                                    try {
                                        this.f7363g.a(this.f7357a, q0.this.a(str, this.f7360d), iC);
                                        return;
                                    } catch (Throwable th) {
                                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f7357a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                                        com.applovin.impl.sdk.o unused = q0.this.f7352b;
                                        if (com.applovin.impl.sdk.o.a()) {
                                            q0.this.f7352b.a("ConnectionManager", str2, th);
                                        }
                                        q0.this.f7351a.D().a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f7357a)));
                                        this.f7363g.a(this.f7357a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                        return;
                                    }
                                } catch (MalformedURLException e10) {
                                    e = e10;
                                }
                            } catch (MalformedURLException e11) {
                                malformedURLException = e11;
                                iC = i10;
                            }
                        } else {
                            try {
                                q0.this.a(this.f7359c, this.f7357a, iC, jE, (Throwable) null);
                                this.f7363g.a(this.f7357a, iC, null, null);
                                return;
                            } catch (MalformedURLException e12) {
                                e = e12;
                                iC = iC;
                            }
                        }
                    } catch (MalformedURLException e13) {
                        e = e13;
                    }
                    malformedURLException = e;
                } catch (Throwable th2) {
                    int iB = dVar.b();
                    try {
                        byte[] bArrF = dVar.f();
                        String str3 = new String(bArrF);
                        if (bArrF != null) {
                            if (this.f7361e) {
                                str3 = u4.b(bArrF, q0.this.f7351a.i0(), q0.this.f7351a);
                            }
                            objA = q0.this.a(str3, this.f7360d);
                        }
                    } catch (Throwable unused2) {
                    }
                    q0.this.a(this.f7359c, this.f7357a, iB, jE, th2);
                    this.f7363g.a(this.f7357a, iB, th2.getMessage(), objA);
                    return;
                }
            } catch (MalformedURLException e14) {
                malformedURLException = e14;
                iC = 0;
            }
            MalformedURLException malformedURLException2 = malformedURLException;
            if (this.f7360d != null) {
                q0.this.a(this.f7359c, this.f7357a, iC, jE, malformedURLException2);
                this.f7363g.a(this.f7357a, -901, malformedURLException2.getMessage(), null);
            } else {
                q0.this.a(this.f7359c, this.f7357a, iC, jE);
                this.f7363g.a(this.f7357a, this.f7360d, -901);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z10, b bVar, e eVar) {
            this.f7357a = str;
            this.f7358b = aVar;
            this.f7359c = str2;
            this.f7360d = obj;
            this.f7361e = z10;
            this.f7362f = bVar;
            this.f7363g = eVar;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f7365a = System.currentTimeMillis();

        /* renamed from: b, reason: collision with root package name */
        private final String f7366b;

        /* renamed from: c, reason: collision with root package name */
        private final long f7367c;

        /* renamed from: d, reason: collision with root package name */
        private final long f7368d;

        public d(String str, long j10, long j11) {
            this.f7366b = str;
            this.f7367c = j10;
            this.f7368d = j11;
        }

        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f7367c;
        }

        public long c() {
            return this.f7365a;
        }

        public String d() {
            return this.f7366b;
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
            int i10 = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            return (((i10 * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (strD == null ? 43 : strD.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.f7368d;
        }
    }

    public interface e {
        void a(String str, int i10, String str2, Object obj);

        void a(String str, Object obj, int i10);
    }

    public q0(com.applovin.impl.sdk.k kVar) {
        this.f7351a = kVar;
        this.f7352b = kVar.O();
        b4 b4Var = new b4(kVar);
        this.f7353c = b4Var;
        b4Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0217 A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #0 {all -> 0x0142, blocks: (B:40:0x0106, B:44:0x0132, B:43:0x012e, B:51:0x016c, B:53:0x0184, B:59:0x01a6, B:74:0x01fd, B:77:0x020c, B:79:0x0217, B:61:0x01aa, B:64:0x01b2, B:69:0x01c9, B:71:0x01cf, B:72:0x01e9, B:55:0x0193, B:82:0x0220, B:66:0x01c3), top: B:107:0x0106, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.sdk.network.a r20, com.applovin.impl.q0.b r21, com.applovin.impl.q0.e r22) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q0.a(com.applovin.impl.sdk.network.a, com.applovin.impl.q0$b, com.applovin.impl.q0$e):void");
    }

    public d a() {
        return this.f7354d;
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
                return q8.a(str, this.f7351a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7352b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7352b.d("ConnectionManager", "Successful " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + r0.g(this.f7351a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10, Throwable th) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7352b.a("ConnectionManager", "Failed " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + r0.g(this.f7351a) + " to " + a(str2), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
