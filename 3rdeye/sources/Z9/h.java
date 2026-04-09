package Z9;

import U9.E;
import U9.u;
import U9.x;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;

/* compiled from: RetryAndFollowUpInterceptor.kt */
/* loaded from: classes3.dex */
public final class h implements u {

    /* renamed from: a, reason: collision with root package name */
    public final x f14079a;

    public h(x client) {
        l.f(client, "client");
        this.f14079a = client;
    }

    public static int c(E e4, int i) throws NumberFormatException {
        String strC = E.c(e4, "Retry-After");
        if (strC == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        l.e(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strC).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strC);
        l.e(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final U9.z a(U9.E r11, Y9.c r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9.h.a(U9.E, Y9.c):U9.z");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.io.IOException r4, Y9.e r5, U9.z r6, boolean r7) {
        /*
            r3 = this;
            U9.x r0 = r3.f14079a
            boolean r0 = r0.f12755g
            r1 = 0
            if (r0 != 0) goto L9
            goto La5
        L9:
            if (r7 == 0) goto L1a
            U9.D r6 = r6.f12798d
            if (r6 == 0) goto L15
            boolean r6 = r6.isOneShot()
            if (r6 != 0) goto La5
        L15:
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L1a
            return r1
        L1a:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L1f
            return r1
        L1f:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L2a
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto La5
            if (r7 != 0) goto La5
            goto L3d
        L2a:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L38
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L38
            goto La5
        L38:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L3d
            return r1
        L3d:
            Y9.d r4 = r5.i
            kotlin.jvm.internal.l.c(r4)
            int r5 = r4.f13833g
            r6 = 1
            if (r5 != 0) goto L51
            int r7 = r4.f13834h
            if (r7 != 0) goto L51
            int r7 = r4.i
            if (r7 != 0) goto L51
            r4 = r1
            goto La3
        L51:
            U9.H r7 = r4.f13835j
            if (r7 == 0) goto L56
            goto L9e
        L56:
            r7 = 0
            if (r5 > r6) goto L89
            int r5 = r4.f13834h
            if (r5 > r6) goto L89
            int r5 = r4.i
            if (r5 <= 0) goto L62
            goto L89
        L62:
            Y9.e r5 = r4.f13829c
            Y9.g r5 = r5.f13843j
            if (r5 != 0) goto L69
            goto L89
        L69:
            monitor-enter(r5)
            int r0 = r5.f13866l     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L70
            monitor-exit(r5)
            goto L89
        L70:
            U9.H r0 = r5.f13857b     // Catch: java.lang.Throwable -> L86
            U9.a r0 = r0.f12594a     // Catch: java.lang.Throwable -> L86
            U9.t r0 = r0.f12604h     // Catch: java.lang.Throwable -> L86
            U9.a r2 = r4.f13828b     // Catch: java.lang.Throwable -> L86
            U9.t r2 = r2.f12604h     // Catch: java.lang.Throwable -> L86
            boolean r0 = V9.b.a(r0, r2)     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L82
            monitor-exit(r5)
            goto L89
        L82:
            U9.H r7 = r5.f13857b     // Catch: java.lang.Throwable -> L86
            monitor-exit(r5)
            goto L89
        L86:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L89:
            if (r7 == 0) goto L8f
            r4.f13835j = r7
        L8d:
            r4 = r6
            goto La3
        L8f:
            Y9.l$a r5 = r4.f13831e
            if (r5 == 0) goto L9a
            boolean r5 = r5.a()
            if (r5 != r6) goto L9a
            goto L9e
        L9a:
            Y9.l r4 = r4.f13832f
            if (r4 != 0) goto L9f
        L9e:
            goto L8d
        L9f:
            boolean r4 = r4.a()
        La3:
            if (r4 != 0) goto La6
        La5:
            return r1
        La6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9.h.b(java.io.IOException, Y9.e, U9.z, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r9 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        r0 = r0.e();
        r2 = r9.e();
        r2.f12581g = null;
        r2 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r2.f12568h != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        r0.f12583j = r2;
        r0 = r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        throw new java.lang.IllegalArgumentException("priorResponse.body != null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        r0 = r4.f13845l;
        r5 = a(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r5 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (r0.f13815e == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r4.f13844k != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        r4.f13844k = true;
        r4.f13840f.exit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        r4.e(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
    
        r0 = r5.f12798d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00db, code lost:
    
        if (r0.isOneShot() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dd, code lost:
    
        r4.e(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e0, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
    
        r0 = r9.f12568h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e3, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e5, code lost:
    
        V9.b.c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ec, code lost:
    
        if (r10 > 20) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0109, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r10);
     */
    @Override // U9.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final U9.E intercept(U9.u.a r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9.h.intercept(U9.u$a):U9.E");
    }
}
