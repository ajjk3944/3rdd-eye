package tu;

import bc.f0;
import br.l;
import cv.p;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import mq.o;
import mq.w;
import ou.a0;
import ou.b0;
import ou.c0;
import ou.e0;
import ou.j;
import ou.s;
import ou.t;
import ou.u;
import ou.v;
import ou.x;
import su.i;
import su.m;

/* loaded from: classes.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23009a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23010b;

    public a(ou.b bVar) {
        l.e(bVar, "cookieJar");
        this.f23010b = bVar;
    }

    public static int d(c0 c0Var, int i10) throws NumberFormatException {
        String strF = c0.f("Retry-After", c0Var);
        if (strF == null) {
            return i10;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        l.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strF).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strF);
        l.d(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // ou.u
    public final c0 a(f fVar) {
        e0 e0Var;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        j jVar;
        switch (this.f23009a) {
            case 0:
                ou.b bVar = (ou.b) this.f23010b;
                a0 a0Var = fVar.f23018e;
                cj.a aVarB = a0Var.b();
                s sVar = a0Var.f19862c;
                t tVar = a0Var.f19860a;
                f0 f0Var = a0Var.f19863d;
                if (f0Var != null) {
                    v vVar = (v) f0Var.f2603g;
                    if (vVar != null) {
                        aVarB.y("Content-Type", vVar.f19978a);
                    }
                    long j = f0Var.f2602d;
                    if (j != -1) {
                        aVarB.y("Content-Length", String.valueOf(j));
                        ((fh.f) aVarB.f3976r).j("Transfer-Encoding");
                    } else {
                        aVarB.y("Transfer-Encoding", "chunked");
                        ((fh.f) aVarB.f3976r).j("Content-Length");
                    }
                }
                boolean z10 = false;
                if (sVar.a("Host") == null) {
                    aVarB.y("Host", pu.b.v(tVar, false));
                }
                if (sVar.a("Connection") == null) {
                    aVarB.y("Connection", "Keep-Alive");
                }
                if (sVar.a("Accept-Encoding") == null && sVar.a("Range") == null) {
                    aVarB.y("Accept-Encoding", "gzip");
                    z10 = true;
                }
                bVar.getClass();
                l.e(tVar, "url");
                if (sVar.a("User-Agent") == null) {
                    aVarB.y("User-Agent", "okhttp/4.12.0");
                }
                c0 c0VarB = fVar.b(aVarB.r());
                s sVar2 = c0VarB.f19889y;
                e.b(bVar, tVar, sVar2);
                b0 b0VarH = c0VarB.h();
                b0VarH.f19869a = a0Var;
                if (z10 && "gzip".equalsIgnoreCase(c0.f("Content-Encoding", c0VarB)) && e.a(c0VarB) && (e0Var = c0VarB.B) != null) {
                    p pVar = new p(e0Var.h());
                    fh.f fVarC = sVar2.c();
                    fVarC.j("Content-Encoding");
                    fVarC.j("Content-Length");
                    b0VarH.c(fVarC.f());
                    b0VarH.f19875g = new g(c0.f("Content-Type", c0VarB), -1L, a.a.e(pVar));
                }
                return b0VarH.a();
            default:
                a0 a0Var2 = fVar.f23018e;
                i iVar = fVar.f23014a;
                List listF0 = w.f16945a;
                c0 c0Var = null;
                int i10 = 0;
                a0 a0VarB = a0Var2;
                while (true) {
                    boolean z11 = true;
                    while (true) {
                        l.e(a0VarB, "request");
                        if (iVar.F != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (iVar) {
                            try {
                                if (iVar.H) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (iVar.G) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (z11) {
                            su.l lVar = iVar.f22337g;
                            t tVar2 = a0VarB.f19860a;
                            x xVar = iVar.f22335a;
                            if (tVar2.f19975i) {
                                SSLSocketFactory sSLSocketFactory2 = xVar.L;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                HostnameVerifier hostnameVerifier2 = xVar.P;
                                jVar = xVar.Q;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                jVar = null;
                            }
                            iVar.D = new su.e(lVar, new ou.a(tVar2.f19970d, tVar2.f19971e, xVar.H, xVar.K, sSLSocketFactory, hostnameVerifier, jVar, xVar.J, xVar.O, xVar.N, xVar.I), iVar, iVar.f22338r);
                        }
                        try {
                            if (iVar.J) {
                                throw new IOException("Canceled");
                            }
                            try {
                                c0 c0VarB2 = fVar.b(a0VarB);
                                if (c0Var != null) {
                                    b0 b0VarH2 = c0VarB2.h();
                                    b0 b0VarH3 = c0Var.h();
                                    b0VarH3.f19875g = null;
                                    c0 c0VarA = b0VarH3.a();
                                    if (c0VarA.B != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    b0VarH2.j = c0VarA;
                                    c0VarB2 = b0VarH2.a();
                                }
                                c0Var = c0VarB2;
                                a0VarB = b(c0Var, iVar.F);
                                if (a0VarB == null) {
                                    iVar.f(false);
                                    return c0Var;
                                }
                                e0 e0Var2 = c0Var.B;
                                if (e0Var2 != null) {
                                    pu.b.d(e0Var2);
                                }
                                i10++;
                                if (i10 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i10);
                                }
                                iVar.f(true);
                            } catch (IOException e4) {
                                if (!c(e4, iVar, a0VarB, !(e4 instanceof vu.a))) {
                                    Iterator it = listF0.iterator();
                                    while (it.hasNext()) {
                                        ir.f0.c(e4, (Exception) it.next());
                                    }
                                    throw e4;
                                }
                                listF0 = o.F0(listF0, e4);
                                iVar.f(true);
                                z11 = false;
                            } catch (m e10) {
                                if (!c(e10.f22362d, iVar, a0VarB, false)) {
                                    IOException iOException = e10.f22361a;
                                    l.e(iOException, "<this>");
                                    Iterator it2 = listF0.iterator();
                                    while (it2.hasNext()) {
                                        ir.f0.c(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                listF0 = o.F0(listF0, e10.f22361a);
                                iVar.f(true);
                                z11 = false;
                            }
                        } catch (Throwable th3) {
                            iVar.f(true);
                            throw th3;
                        }
                    }
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ou.a0 b(ou.c0 r13, bc.p r14) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.a.b(ou.c0, bc.p):ou.a0");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(java.io.IOException r4, su.i r5, ou.a0 r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r6 = r3.f23010b
            ou.x r6 = (ou.x) r6
            boolean r6 = r6.f20009y
            r0 = 0
            if (r6 != 0) goto Lb
            goto L9d
        Lb:
            if (r7 == 0) goto L12
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L12
            return r0
        L12:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L17
            return r0
        L17:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L22
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto L9d
            if (r7 != 0) goto L9d
            goto L35
        L22:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L30
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L30
            goto L9d
        L30:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L35
            return r0
        L35:
            su.e r4 = r5.D
            br.l.b(r4)
            int r5 = r4.f22327g
            r6 = 1
            if (r5 != 0) goto L49
            int r7 = r4.f22328h
            if (r7 != 0) goto L49
            int r7 = r4.f22329i
            if (r7 != 0) goto L49
            r4 = r0
            goto L9b
        L49:
            ou.f0 r7 = r4.j
            if (r7 == 0) goto L4e
            goto L96
        L4e:
            r7 = 0
            if (r5 > r6) goto L81
            int r5 = r4.f22328h
            if (r5 > r6) goto L81
            int r5 = r4.f22329i
            if (r5 <= 0) goto L5a
            goto L81
        L5a:
            su.i r5 = r4.f22323c
            su.k r5 = r5.E
            if (r5 != 0) goto L61
            goto L81
        L61:
            monitor-enter(r5)
            int r1 = r5.f22350l     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L68
            monitor-exit(r5)
            goto L81
        L68:
            ou.f0 r1 = r5.f22342b     // Catch: java.lang.Throwable -> L7e
            ou.a r1 = r1.f19904a     // Catch: java.lang.Throwable -> L7e
            ou.t r1 = r1.f19858h     // Catch: java.lang.Throwable -> L7e
            ou.a r2 = r4.f22322b     // Catch: java.lang.Throwable -> L7e
            ou.t r2 = r2.f19858h     // Catch: java.lang.Throwable -> L7e
            boolean r1 = pu.b.a(r1, r2)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L7a
            monitor-exit(r5)
            goto L81
        L7a:
            ou.f0 r7 = r5.f22342b     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r5)
            goto L81
        L7e:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L81:
            if (r7 == 0) goto L87
            r4.j = r7
        L85:
            r4 = r6
            goto L9b
        L87:
            kf.n r5 = r4.f22325e
            if (r5 == 0) goto L92
            boolean r5 = r5.c()
            if (r5 != r6) goto L92
            goto L96
        L92:
            ee.x r4 = r4.f22326f
            if (r4 != 0) goto L97
        L96:
            goto L85
        L97:
            boolean r4 = r4.d()
        L9b:
            if (r4 != 0) goto L9e
        L9d:
            return r0
        L9e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.a.c(java.io.IOException, su.i, ou.a0, boolean):boolean");
    }

    public a(x xVar) {
        this.f23010b = xVar;
    }
}
