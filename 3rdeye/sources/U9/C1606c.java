package U9;

import U9.I;
import U9.s;
import U9.t;
import U9.v;
import W9.d;
import Z9.i;
import b9.C1992A;
import c9.C2099t;
import c9.C2101v;
import ia.C4468d;
import ia.C4468d.a;
import ia.h;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* compiled from: Cache.kt */
/* renamed from: U9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1606c implements Closeable, Flushable {

    /* renamed from: b, reason: collision with root package name */
    public final W9.d f12607b;

    /* compiled from: Cache.kt */
    /* renamed from: U9.c$a */
    public static final class a extends F {

        /* renamed from: b, reason: collision with root package name */
        public final d.c f12608b;

        /* renamed from: c, reason: collision with root package name */
        public final String f12609c;

        /* renamed from: d, reason: collision with root package name */
        public final String f12610d;

        /* renamed from: e, reason: collision with root package name */
        public final ia.w f12611e;

        /* compiled from: Cache.kt */
        /* renamed from: U9.c$a$a, reason: collision with other inner class name */
        public static final class C0176a extends ia.k {

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ a f12612g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0176a(ia.C c10, a aVar) {
                super(c10);
                this.f12612g = aVar;
            }

            @Override // ia.k, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                this.f12612g.f12608b.close();
                super.close();
            }
        }

        public a(d.c cVar, String str, String str2) {
            this.f12608b = cVar;
            this.f12609c = str;
            this.f12610d = str2;
            this.f12611e = ia.q.c(new C0176a((ia.C) cVar.f13406d.get(1), this));
        }

        @Override // U9.F
        public final long contentLength() {
            String str = this.f12610d;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = V9.b.f13053a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // U9.F
        public final v contentType() {
            String str = this.f12609c;
            if (str == null) {
                return null;
            }
            Pattern pattern = v.f12729d;
            return v.a.b(str);
        }

        @Override // U9.F
        public final ia.g source() {
            return this.f12611e;
        }
    }

    /* compiled from: Cache.kt */
    /* renamed from: U9.c$b */
    public static final class b {
        public static String a(t url) {
            kotlin.jvm.internal.l.f(url, "url");
            ia.h hVar = ia.h.f38646e;
            return h.a.c(url.i).b("MD5").d();
        }

        public static int b(ia.w wVar) throws IOException {
            C4468d c4468d;
            byte bL;
            try {
                wVar.F0(1L);
                long j4 = 0;
                while (true) {
                    long j10 = j4 + 1;
                    boolean zL0 = wVar.l0(j10);
                    c4468d = wVar.f38685c;
                    if (!zL0) {
                        break;
                    }
                    bL = c4468d.l(j4);
                    if ((bL < 48 || bL > 57) && (j4 != 0 || bL != 45)) {
                        break;
                    }
                    j4 = j10;
                }
                if (j4 == 0) {
                    com.google.gson.internal.c.e(16);
                    String string = Integer.toString(bL, 16);
                    kotlin.jvm.internal.l.e(string, "toString(...)");
                    throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
                }
                long jK0 = c4468d.k0();
                String strS = wVar.S(Long.MAX_VALUE);
                if (jK0 >= 0 && jK0 <= 2147483647L && strS.length() <= 0) {
                    return (int) jK0;
                }
                throw new IOException("expected an int but was \"" + jK0 + strS + '\"');
            } catch (NumberFormatException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        public static Set c(s sVar) {
            int size = sVar.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if ("Vary".equalsIgnoreCase(sVar.d(i))) {
                    String strF = sVar.f(i);
                    if (treeSet == null) {
                        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
                        kotlin.jvm.internal.l.e(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = y9.q.q0(strF, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(y9.q.w0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? C2101v.f18583b : treeSet;
        }
    }

    /* compiled from: Cache.kt */
    /* renamed from: U9.c$d */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final d.a f12624a;

        /* renamed from: b, reason: collision with root package name */
        public final ia.A f12625b;

        /* renamed from: c, reason: collision with root package name */
        public final a f12626c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f12627d;

        /* compiled from: Cache.kt */
        /* renamed from: U9.c$d$a */
        public static final class a extends ia.j {

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ C1606c f12629f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ d f12630g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1606c c1606c, d dVar, ia.A a10) {
                super(a10);
                this.f12629f = c1606c;
                this.f12630g = dVar;
            }

            @Override // ia.j, ia.A, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                C1606c c1606c = this.f12629f;
                d dVar = this.f12630g;
                synchronized (c1606c) {
                    if (dVar.f12627d) {
                        return;
                    }
                    dVar.f12627d = true;
                    super.close();
                    this.f12630g.f12624a.b();
                }
            }
        }

        public d(d.a aVar) {
            this.f12624a = aVar;
            ia.A aD = aVar.d(1);
            this.f12625b = aD;
            this.f12626c = new a(C1606c.this, this, aD);
        }

        public final void a() throws IOException {
            synchronized (C1606c.this) {
                if (this.f12627d) {
                    return;
                }
                this.f12627d = true;
                V9.b.c(this.f12625b);
                try {
                    this.f12624a.a();
                } catch (IOException unused) {
                }
            }
        }
    }

    public C1606c(File directory, long j4) {
        kotlin.jvm.internal.l.f(directory, "directory");
        this.f12607b = new W9.d(directory, j4, X9.d.f13679h);
    }

    public final void a(z request) throws IOException {
        kotlin.jvm.internal.l.f(request, "request");
        W9.d dVar = this.f12607b;
        String key = b.a(request.f12795a);
        synchronized (dVar) {
            kotlin.jvm.internal.l.f(key, "key");
            dVar.k();
            dVar.a();
            W9.d.k0(key);
            d.b bVar = dVar.i.get(key);
            if (bVar == null) {
                return;
            }
            dVar.F(bVar);
            if (dVar.f13377g <= dVar.f13373c) {
                dVar.f13384o = false;
            }
        }
    }

    public final synchronized void c() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12607b.close();
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.f12607b.flush();
    }

    /* compiled from: Cache.kt */
    /* renamed from: U9.c$c, reason: collision with other inner class name */
    public static final class C0177c {

        /* renamed from: k, reason: collision with root package name */
        public static final String f12613k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f12614l;

        /* renamed from: a, reason: collision with root package name */
        public final t f12615a;

        /* renamed from: b, reason: collision with root package name */
        public final s f12616b;

        /* renamed from: c, reason: collision with root package name */
        public final String f12617c;

        /* renamed from: d, reason: collision with root package name */
        public final y f12618d;

        /* renamed from: e, reason: collision with root package name */
        public final int f12619e;

        /* renamed from: f, reason: collision with root package name */
        public final String f12620f;

        /* renamed from: g, reason: collision with root package name */
        public final s f12621g;

        /* renamed from: h, reason: collision with root package name */
        public final r f12622h;
        public final long i;

        /* renamed from: j, reason: collision with root package name */
        public final long f12623j;

        static {
            da.h hVar = da.h.f37600a;
            da.h.f37600a.getClass();
            f12613k = "OkHttp-Sent-Millis";
            da.h.f37600a.getClass();
            f12614l = "OkHttp-Received-Millis";
        }

        public C0177c(ia.C rawSource) throws IOException {
            t tVarA;
            I tlsVersion;
            kotlin.jvm.internal.l.f(rawSource, "rawSource");
            try {
                ia.w wVarC = ia.q.c(rawSource);
                String strS = wVarC.S(Long.MAX_VALUE);
                try {
                    t.a aVar = new t.a();
                    aVar.c(null, strS);
                    tVarA = aVar.a();
                } catch (IllegalArgumentException unused) {
                    tVarA = null;
                }
                if (tVarA == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(strS));
                    da.h hVar = da.h.f37600a;
                    da.h.f37600a.getClass();
                    da.h.i(5, "cache corruption", iOException);
                    throw iOException;
                }
                this.f12615a = tVarA;
                this.f12617c = wVarC.S(Long.MAX_VALUE);
                s.a aVar2 = new s.a();
                int iB = b.b(wVarC);
                for (int i = 0; i < iB; i++) {
                    aVar2.b(wVarC.S(Long.MAX_VALUE));
                }
                this.f12616b = aVar2.d();
                Z9.i iVarA = i.a.a(wVarC.S(Long.MAX_VALUE));
                this.f12618d = iVarA.f14080a;
                this.f12619e = iVarA.f14081b;
                this.f12620f = iVarA.f14082c;
                s.a aVar3 = new s.a();
                int iB2 = b.b(wVarC);
                for (int i10 = 0; i10 < iB2; i10++) {
                    aVar3.b(wVarC.S(Long.MAX_VALUE));
                }
                String str = f12613k;
                String strE = aVar3.e(str);
                String str2 = f12614l;
                String strE2 = aVar3.e(str2);
                aVar3.f(str);
                aVar3.f(str2);
                this.i = strE != null ? Long.parseLong(strE) : 0L;
                this.f12623j = strE2 != null ? Long.parseLong(strE2) : 0L;
                this.f12621g = aVar3.d();
                if (kotlin.jvm.internal.l.b(this.f12615a.f12712a, "https")) {
                    String strS2 = wVarC.S(Long.MAX_VALUE);
                    if (strS2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strS2 + '\"');
                    }
                    C1612i c1612iB = C1612i.f12649b.b(wVarC.S(Long.MAX_VALUE));
                    List listA = a(wVarC);
                    List listA2 = a(wVarC);
                    if (wVarC.K()) {
                        tlsVersion = I.SSL_3_0;
                    } else {
                        I.a aVar4 = I.Companion;
                        String strS3 = wVarC.S(Long.MAX_VALUE);
                        aVar4.getClass();
                        tlsVersion = I.a.a(strS3);
                    }
                    kotlin.jvm.internal.l.f(tlsVersion, "tlsVersion");
                    this.f12622h = new r(tlsVersion, c1612iB, V9.b.w(listA2), new q(V9.b.w(listA)));
                } else {
                    this.f12622h = null;
                }
                C1992A c1992a = C1992A.f18074a;
                rawSource.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    A9.I.o(rawSource, th);
                    throw th2;
                }
            }
        }

        public static List a(ia.w wVar) throws IOException, CertificateException {
            int iB = b.b(wVar);
            if (iB == -1) {
                return C2099t.f18581b;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iB);
                for (int i = 0; i < iB; i++) {
                    String strS = wVar.S(Long.MAX_VALUE);
                    C4468d c4468d = new C4468d();
                    ia.h hVar = ia.h.f38646e;
                    ia.h hVarA = h.a.a(strS);
                    if (hVarA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c4468d.y0(hVarA);
                    arrayList.add(certificateFactory.generateCertificate(c4468d.new a()));
                }
                return arrayList;
            } catch (CertificateException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        public static void b(ia.v vVar, List list) throws IOException, CertificateEncodingException {
            try {
                vVar.H0(list.size());
                vVar.L(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    ia.h hVar = ia.h.f38646e;
                    kotlin.jvm.internal.l.e(bytes, "bytes");
                    vVar.c0(h.a.d(bytes).a());
                    vVar.L(10);
                }
            } catch (CertificateEncodingException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        public final void c(d.a aVar) throws Throwable {
            t tVar = this.f12615a;
            r rVar = this.f12622h;
            s sVar = this.f12621g;
            s sVar2 = this.f12616b;
            ia.v vVarB = ia.q.b(aVar.d(0));
            try {
                vVarB.c0(tVar.i);
                vVarB.L(10);
                vVarB.c0(this.f12617c);
                vVarB.L(10);
                vVarB.H0(sVar2.size());
                vVarB.L(10);
                int size = sVar2.size();
                for (int i = 0; i < size; i++) {
                    vVarB.c0(sVar2.d(i));
                    vVarB.c0(": ");
                    vVarB.c0(sVar2.f(i));
                    vVarB.L(10);
                }
                y protocol = this.f12618d;
                int i10 = this.f12619e;
                String message = this.f12620f;
                kotlin.jvm.internal.l.f(protocol, "protocol");
                kotlin.jvm.internal.l.f(message, "message");
                StringBuilder sb = new StringBuilder();
                if (protocol == y.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(i10);
                sb.append(' ');
                sb.append(message);
                String string = sb.toString();
                kotlin.jvm.internal.l.e(string, "StringBuilder().apply(builderAction).toString()");
                vVarB.c0(string);
                vVarB.L(10);
                vVarB.H0(sVar.size() + 2);
                vVarB.L(10);
                int size2 = sVar.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    vVarB.c0(sVar.d(i11));
                    vVarB.c0(": ");
                    vVarB.c0(sVar.f(i11));
                    vVarB.L(10);
                }
                vVarB.c0(f12613k);
                vVarB.c0(": ");
                vVarB.H0(this.i);
                vVarB.L(10);
                vVarB.c0(f12614l);
                vVarB.c0(": ");
                vVarB.H0(this.f12623j);
                vVarB.L(10);
                if (kotlin.jvm.internal.l.b(tVar.f12712a, "https")) {
                    vVarB.L(10);
                    kotlin.jvm.internal.l.c(rVar);
                    vVarB.c0(rVar.f12704b.f12667a);
                    vVarB.L(10);
                    b(vVarB, rVar.a());
                    b(vVarB, rVar.f12705c);
                    vVarB.c0(rVar.f12703a.javaName());
                    vVarB.L(10);
                }
                C1992A c1992a = C1992A.f18074a;
                vVarB.close();
            } finally {
            }
        }

        public C0177c(E e4) {
            s sVarD;
            z zVar = e4.f12562b;
            this.f12615a = zVar.f12795a;
            E e10 = e4.i;
            kotlin.jvm.internal.l.c(e10);
            s sVar = e10.f12562b.f12797c;
            s sVar2 = e4.f12567g;
            Set setC = b.c(sVar2);
            if (setC.isEmpty()) {
                sVarD = V9.b.f13054b;
            } else {
                s.a aVar = new s.a();
                int size = sVar.size();
                for (int i = 0; i < size; i++) {
                    String strD = sVar.d(i);
                    if (setC.contains(strD)) {
                        aVar.a(strD, sVar.f(i));
                    }
                }
                sVarD = aVar.d();
            }
            this.f12616b = sVarD;
            this.f12617c = zVar.f12796b;
            this.f12618d = e4.f12563c;
            this.f12619e = e4.f12565e;
            this.f12620f = e4.f12564d;
            this.f12621g = sVar2;
            this.f12622h = e4.f12566f;
            this.i = e4.f12571l;
            this.f12623j = e4.f12572m;
        }
    }
}
