package com.applovin.impl;

import com.applovin.impl.i4;
import com.applovin.impl.q3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.common.internal.ImagesContract;
import com.singular.sdk.internal.Constants;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2132m0 {

    /* renamed from: e, reason: collision with root package name */
    private static final List f20123e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20124a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f20125b;

    /* renamed from: c, reason: collision with root package name */
    private final q3 f20126c;

    /* renamed from: d, reason: collision with root package name */
    private d f20127d;

    /* renamed from: com.applovin.impl.m0$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f20128a;

        /* renamed from: b, reason: collision with root package name */
        private long f20129b;

        public long a() {
            return this.f20128a;
        }

        public long b() {
            return this.f20129b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j4) {
            this.f20128a = j4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j4) {
            this.f20129b = j4;
        }
    }

    /* renamed from: com.applovin.impl.m0$c */
    public class c implements K0.b {

        /* renamed from: a, reason: collision with root package name */
        private final String f20130a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f20131b;

        /* renamed from: c, reason: collision with root package name */
        private final String f20132c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f20133d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f20134e;

        /* renamed from: f, reason: collision with root package name */
        private final b f20135f;

        /* renamed from: g, reason: collision with root package name */
        private final e f20136g;

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x004f: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:80), block:B:29:0x004e */
        @Override // K0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(q3.d dVar) {
            MalformedURLException malformedURLException;
            int iC;
            int i;
            long jE = dVar.e();
            Object objA = null;
            try {
                try {
                    iC = dVar.c();
                    try {
                        if (iC > 0) {
                            try {
                                if (iC < 200 || iC >= 400) {
                                    this.f20136g.a(this.f20130a, iC, null, null);
                                    return;
                                }
                                try {
                                    b bVar = this.f20135f;
                                    if (bVar != null) {
                                        bVar.a(jE);
                                    }
                                    C2132m0.this.a(this.f20132c, this.f20130a, iC, jE);
                                    byte[] bArrD = dVar.d();
                                    if (a7.f(com.applovin.impl.sdk.k.o()) && (!this.f20134e || i4.b(bArrD) != i4.a.V2)) {
                                        C2132m0.this.f20124a.u().a(bArrD != null ? new String(dVar.d(), Charset.forName(Constants.ENCODING)) : "", this.f20130a, this.f20131b.b() != null ? this.f20131b.b().toString() : "");
                                    }
                                    if (bArrD == null) {
                                        this.f20136g.a(this.f20130a, this.f20133d, iC);
                                        return;
                                    }
                                    String str = new String(dVar.d(), Charset.forName(Constants.ENCODING));
                                    b bVar2 = this.f20135f;
                                    if (bVar2 != null) {
                                        bVar2.b(bArrD.length);
                                        if (this.f20131b.r()) {
                                            C2132m0.this.f20127d = new d(this.f20131b.f(), bArrD.length, jE);
                                        }
                                    }
                                    if (this.f20134e) {
                                        String strB = i4.b(bArrD, C2132m0.this.f20124a.i0(), C2132m0.this.f20124a);
                                        if (strB == null) {
                                            HashMap map = new HashMap(2);
                                            map.put(com.vungle.ads.internal.ui.a.REQUEST_KEY_EXTRA, StringUtils.getHostAndPath(this.f20130a));
                                            map.put("response", str);
                                            C2132m0.this.f20124a.G().trackEvent("rdf", map);
                                        }
                                        str = strB;
                                    }
                                    try {
                                        this.f20136g.a(this.f20130a, C2132m0.this.a(str, this.f20133d), iC);
                                        return;
                                    } catch (Throwable th) {
                                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f20130a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                                        com.applovin.impl.sdk.o unused = C2132m0.this.f20125b;
                                        if (com.applovin.impl.sdk.o.a()) {
                                            C2132m0.this.f20125b.a("ConnectionManager", str2, th);
                                        }
                                        C2132m0.this.f20124a.E().a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap(ImagesContract.URL, StringUtils.getHostAndPath(this.f20130a)));
                                        this.f20136g.a(this.f20130a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                        return;
                                    }
                                } catch (MalformedURLException e4) {
                                    e = e4;
                                }
                            } catch (MalformedURLException e10) {
                                malformedURLException = e10;
                                iC = i;
                            }
                        } else {
                            try {
                                C2132m0.this.a(this.f20132c, this.f20130a, iC, jE, (Throwable) null);
                                this.f20136g.a(this.f20130a, iC, null, null);
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
                } catch (Throwable th2) {
                    int iB = dVar.b();
                    try {
                        byte[] bArrF = dVar.f();
                        String str3 = new String(bArrF);
                        if (bArrF != null) {
                            if (this.f20134e) {
                                str3 = i4.b(bArrF, C2132m0.this.f20124a.i0(), C2132m0.this.f20124a);
                            }
                            objA = C2132m0.this.a(str3, this.f20133d);
                        }
                    } catch (Throwable unused2) {
                    }
                    C2132m0.this.a(this.f20132c, this.f20130a, iB, jE, th2);
                    this.f20136g.a(this.f20130a, iB, th2.getMessage(), objA);
                    return;
                }
            } catch (MalformedURLException e13) {
                malformedURLException = e13;
                iC = 0;
            }
            MalformedURLException malformedURLException2 = malformedURLException;
            if (this.f20133d != null) {
                C2132m0.this.a(this.f20132c, this.f20130a, iC, jE, malformedURLException2);
                this.f20136g.a(this.f20130a, -901, malformedURLException2.getMessage(), null);
            } else {
                C2132m0.this.a(this.f20132c, this.f20130a, iC, jE);
                this.f20136g.a(this.f20130a, this.f20133d, -901);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z10, b bVar, e eVar) {
            this.f20130a = str;
            this.f20131b = aVar;
            this.f20132c = str2;
            this.f20133d = obj;
            this.f20134e = z10;
            this.f20135f = bVar;
            this.f20136g = eVar;
        }
    }

    /* renamed from: com.applovin.impl.m0$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f20138a = System.currentTimeMillis();

        /* renamed from: b, reason: collision with root package name */
        private final String f20139b;

        /* renamed from: c, reason: collision with root package name */
        private final long f20140c;

        /* renamed from: d, reason: collision with root package name */
        private final long f20141d;

        public d(String str, long j4, long j10) {
            this.f20139b = str;
            this.f20140c = j4;
            this.f20141d = j10;
        }

        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f20140c;
        }

        public long c() {
            return this.f20138a;
        }

        public String d() {
            return this.f20139b;
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
            int i = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            return (((i * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (strD == null ? 43 : strD.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.f20141d;
        }
    }

    /* renamed from: com.applovin.impl.m0$e */
    public interface e {
        void a(String str, int i, String str2, Object obj);

        void a(String str, Object obj, int i);
    }

    public C2132m0(com.applovin.impl.sdk.k kVar) {
        this.f20124a = kVar;
        this.f20125b = kVar.O();
        q3 q3Var = new q3(kVar);
        this.f20126c = q3Var;
        q3Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020c A[Catch: all -> 0x013c, TRY_LEAVE, TryCatch #3 {all -> 0x013c, blocks: (B:39:0x0105, B:43:0x012c, B:42:0x0128, B:50:0x0166, B:52:0x017e, B:58:0x01a0, B:73:0x01f2, B:76:0x0201, B:78:0x020c, B:60:0x01a4, B:63:0x01ac, B:68:0x01c3, B:70:0x01c9, B:71:0x01de, B:54:0x018d, B:81:0x0215, B:65:0x01bd), top: B:111:0x0105, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.sdk.network.a r20, com.applovin.impl.C2132m0.b r21, com.applovin.impl.C2132m0.e r22) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C2132m0.a(com.applovin.impl.sdk.network.a, com.applovin.impl.m0$b, com.applovin.impl.m0$e):void");
    }

    public d a() {
        return this.f20127d;
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
            if (obj instanceof c8) {
                return d8.a(str, this.f20124a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f20125b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, long j4) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20125b.d("ConnectionManager", "Successful " + str + " returned " + i + " in " + (j4 / 1000.0f) + " s over " + AbstractC2135n0.g(this.f20124a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, long j4, Throwable th) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20125b.a("ConnectionManager", "Failed " + str + " returned " + i + " in " + (j4 / 1000.0f) + " s over " + AbstractC2135n0.g(this.f20124a) + " to " + a(str2), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
