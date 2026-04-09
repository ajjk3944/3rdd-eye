package ou;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {
    public static final String k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f19892l;

    /* renamed from: a, reason: collision with root package name */
    public final t f19893a;

    /* renamed from: b, reason: collision with root package name */
    public final s f19894b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19895c;

    /* renamed from: d, reason: collision with root package name */
    public final z f19896d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19897e;

    /* renamed from: f, reason: collision with root package name */
    public final String f19898f;

    /* renamed from: g, reason: collision with root package name */
    public final s f19899g;

    /* renamed from: h, reason: collision with root package name */
    public final r f19900h;

    /* renamed from: i, reason: collision with root package name */
    public final long f19901i;
    public final long j;

    static {
        xu.n nVar = xu.n.f25563a;
        xu.n.f25563a.getClass();
        k = "OkHttp-Sent-Millis";
        xu.n.f25563a.getClass();
        f19892l = "OkHttp-Received-Millis";
    }

    public e(cv.f0 f0Var) throws IOException {
        t tVarB;
        h0 h0VarA;
        br.l.e(f0Var, "rawSource");
        try {
            cv.z zVarE = a.a.e(f0Var);
            String strZ = zVarE.z(Long.MAX_VALUE);
            try {
                ee.x xVar = new ee.x(1);
                xVar.f(null, strZ);
                tVarB = xVar.b();
            } catch (IllegalArgumentException unused) {
                tVarB = null;
            }
            if (tVarB == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strZ));
                xu.n nVar = xu.n.f25563a;
                xu.n.f25563a.getClass();
                xu.n.i("cache corruption", 5, iOException);
                throw iOException;
            }
            this.f19893a = tVarB;
            this.f19895c = zVarE.z(Long.MAX_VALUE);
            fh.f fVar = new fh.f(2);
            int iJ = d.j(zVarE);
            for (int i10 = 0; i10 < iJ; i10++) {
                fVar.b(zVarE.z(Long.MAX_VALUE));
            }
            this.f19894b = fVar.f();
            bc.f0 f0VarD = ic.a.D(zVarE.z(Long.MAX_VALUE));
            this.f19896d = (z) f0VarD.f2603g;
            this.f19897e = f0VarD.f2602d;
            this.f19898f = (String) f0VarD.f2604r;
            fh.f fVar2 = new fh.f(2);
            int iJ2 = d.j(zVarE);
            for (int i11 = 0; i11 < iJ2; i11++) {
                fVar2.b(zVarE.z(Long.MAX_VALUE));
            }
            String str = k;
            String strG = fVar2.g(str);
            String str2 = f19892l;
            String strG2 = fVar2.g(str2);
            fVar2.j(str);
            fVar2.j(str2);
            this.f19901i = strG != null ? Long.parseLong(strG) : 0L;
            this.j = strG2 != null ? Long.parseLong(strG2) : 0L;
            this.f19899g = fVar2.f();
            if (br.l.a(this.f19893a.f19967a, "https")) {
                String strZ2 = zVarE.z(Long.MAX_VALUE);
                if (strZ2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strZ2 + '\"');
                }
                l lVarC = l.f19924b.c(zVarE.z(Long.MAX_VALUE));
                List listA = a(zVarE);
                List listA2 = a(zVarE);
                if (zVarE.b()) {
                    h0VarA = h0.SSL_3_0;
                } else {
                    g0 g0Var = h0.Companion;
                    String strZ3 = zVarE.z(Long.MAX_VALUE);
                    g0Var.getClass();
                    h0VarA = g0.a(strZ3);
                }
                br.l.e(h0VarA, "tlsVersion");
                this.f19900h = new r(h0VarA, lVarC, pu.b.w(listA2), new q(0, pu.b.w(listA)));
            } else {
                this.f19900h = null;
            }
            f0Var.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ic.a.g(f0Var, th2);
                throw th3;
            }
        }
    }

    public static List a(cv.z zVar) throws IOException, CertificateException {
        int iJ = d.j(zVar);
        if (iJ == -1) {
            return mq.w.f16945a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iJ);
            for (int i10 = 0; i10 < iJ; i10++) {
                String strZ = zVar.z(Long.MAX_VALUE);
                cv.g gVar = new cv.g();
                cv.j jVar = cv.j.f6715r;
                cv.j jVarK = sm.m.k(strZ);
                if (jVarK == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                gVar.n0(jVarK);
                arrayList.add(certificateFactory.generateCertificate(new cv.f(gVar, 0)));
            }
            return arrayList;
        } catch (CertificateException e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public static void b(cv.y yVar, List list) throws IOException, CertificateEncodingException {
        try {
            yVar.h0(list.size());
            yVar.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                cv.j jVar = cv.j.f6715r;
                br.l.d(encoded, "bytes");
                yVar.H(sm.m.u(encoded).a());
                yVar.writeByte(10);
            }
        } catch (CertificateEncodingException e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public final void c(d8.a aVar) {
        t tVar = this.f19893a;
        r rVar = this.f19900h;
        s sVar = this.f19899g;
        s sVar2 = this.f19894b;
        cv.y yVarD = a.a.d(aVar.l(0));
        try {
            yVarD.H(tVar.f19974h);
            yVarD.writeByte(10);
            yVarD.H(this.f19895c);
            yVarD.writeByte(10);
            yVarD.h0(sVar2.size());
            yVarD.writeByte(10);
            int size = sVar2.size();
            for (int i10 = 0; i10 < size; i10++) {
                yVarD.H(sVar2.b(i10));
                yVarD.H(": ");
                yVarD.H(sVar2.d(i10));
                yVarD.writeByte(10);
            }
            z zVar = this.f19896d;
            int i11 = this.f19897e;
            String str = this.f19898f;
            br.l.e(zVar, "protocol");
            br.l.e(str, "message");
            StringBuilder sb2 = new StringBuilder();
            if (zVar == z.HTTP_1_0) {
                sb2.append("HTTP/1.0");
            } else {
                sb2.append("HTTP/1.1");
            }
            sb2.append(' ');
            sb2.append(i11);
            sb2.append(' ');
            sb2.append(str);
            String string = sb2.toString();
            br.l.d(string, "StringBuilder().apply(builderAction).toString()");
            yVarD.H(string);
            yVarD.writeByte(10);
            yVarD.h0(sVar.size() + 2);
            yVarD.writeByte(10);
            int size2 = sVar.size();
            for (int i12 = 0; i12 < size2; i12++) {
                yVarD.H(sVar.b(i12));
                yVarD.H(": ");
                yVarD.H(sVar.d(i12));
                yVarD.writeByte(10);
            }
            yVarD.H(k);
            yVarD.H(": ");
            yVarD.h0(this.f19901i);
            yVarD.writeByte(10);
            yVarD.H(f19892l);
            yVarD.H(": ");
            yVarD.h0(this.j);
            yVarD.writeByte(10);
            if (br.l.a(tVar.f19967a, "https")) {
                yVarD.writeByte(10);
                br.l.b(rVar);
                yVarD.H(rVar.f19963b.f19941a);
                yVarD.writeByte(10);
                b(yVarD, rVar.a());
                b(yVarD, rVar.f19964c);
                yVarD.H(rVar.f19962a.javaName());
                yVarD.writeByte(10);
            }
            yVarD.close();
        } finally {
        }
    }

    public e(c0 c0Var) {
        s sVar;
        a0 a0Var = c0Var.f19884a;
        this.f19893a = a0Var.f19860a;
        c0 c0Var2 = c0Var.D;
        br.l.b(c0Var2);
        s sVar2 = c0Var2.f19884a.f19862c;
        s sVar3 = c0Var.f19889y;
        Set setK = d.k(sVar3);
        if (setK.isEmpty()) {
            sVar = pu.b.f20646b;
        } else {
            ArrayList arrayList = new ArrayList(20);
            int size = sVar2.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strB = sVar2.b(i10);
                if (setK.contains(strB)) {
                    String strD = sVar2.d(i10);
                    br.l.e(strB, "name");
                    br.l.e(strD, "value");
                    d.a(strB);
                    d.b(strD, strB);
                    arrayList.add(strB);
                    arrayList.add(tt.l.a1(strD).toString());
                }
            }
            sVar = new s((String[]) arrayList.toArray(new String[0]));
        }
        this.f19894b = sVar;
        this.f19895c = a0Var.f19861b;
        this.f19896d = c0Var.f19885d;
        this.f19897e = c0Var.f19887r;
        this.f19898f = c0Var.f19886g;
        this.f19899g = sVar3;
        this.f19900h = c0Var.f19888x;
        this.f19901i = c0Var.G;
        this.j = c0Var.H;
    }
}
