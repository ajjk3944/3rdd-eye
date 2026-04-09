package com.yandex.mobile.ads.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes3.dex */
public final class gr1 implements zo0 {

    /* renamed from: a, reason: collision with root package name */
    private final vd1 f27969a;

    public gr1(vd1 client) {
        kotlin.jvm.internal.l.f(client, "client");
        this.f27969a = client;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r1.intValue() > 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.yandex.mobile.ads.impl.pp1 a(com.yandex.mobile.ads.impl.pq1 r11, com.yandex.mobile.ads.impl.w50 r12) throws java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gr1.a(com.yandex.mobile.ads.impl.pq1, com.yandex.mobile.ads.impl.w50):com.yandex.mobile.ads.impl.pp1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r0 = r1.g();
        r6 = a(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r0.j() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        r1.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r1.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r0 = r7.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        com.yandex.mobile.ads.impl.t82.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r8 > 20) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r0 = r0.k().c(r7.k().a((com.yandex.mobile.ads.impl.tq1) null).a()).a();
     */
    @Override // com.yandex.mobile.ads.impl.zo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.pq1 a(com.yandex.mobile.ads.impl.xn1 r11) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.l.f(r11, r0)
            com.yandex.mobile.ads.impl.pp1 r0 = r11.f()
            com.yandex.mobile.ads.impl.tn1 r1 = r11.b()
            c9.t r2 = c9.C2099t.f18581b
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L14:
            r6 = r5
        L15:
            r1.a(r0, r6)
            boolean r6 = r1.j()     // Catch: java.lang.Throwable -> L3e
            if (r6 != 0) goto Lbe
            com.yandex.mobile.ads.impl.pq1 r0 = r11.a(r0)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L85 com.yandex.mobile.ads.impl.rs1 -> L9e
            if (r7 == 0) goto L3c
            com.yandex.mobile.ads.impl.pq1$a r0 = r0.k()     // Catch: java.lang.Throwable -> L3e
            com.yandex.mobile.ads.impl.pq1$a r6 = r7.k()     // Catch: java.lang.Throwable -> L3e
            com.yandex.mobile.ads.impl.pq1$a r6 = r6.a(r4)     // Catch: java.lang.Throwable -> L3e
            com.yandex.mobile.ads.impl.pq1 r6 = r6.a()     // Catch: java.lang.Throwable -> L3e
            com.yandex.mobile.ads.impl.pq1$a r0 = r0.c(r6)     // Catch: java.lang.Throwable -> L3e
            com.yandex.mobile.ads.impl.pq1 r0 = r0.a()     // Catch: java.lang.Throwable -> L3e
        L3c:
            r7 = r0
            goto L41
        L3e:
            r11 = move-exception
            goto Lc6
        L41:
            com.yandex.mobile.ads.impl.w50 r0 = r1.g()     // Catch: java.lang.Throwable -> L3e
            com.yandex.mobile.ads.impl.pp1 r6 = r10.a(r7, r0)     // Catch: java.lang.Throwable -> L3e
            if (r6 != 0) goto L5a
            if (r0 == 0) goto L56
            boolean r11 = r0.j()     // Catch: java.lang.Throwable -> L3e
            if (r11 == 0) goto L56
            r1.n()     // Catch: java.lang.Throwable -> L3e
        L56:
            r1.a(r3)
            return r7
        L5a:
            com.yandex.mobile.ads.impl.tq1 r0 = r7.a()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L63
            com.yandex.mobile.ads.impl.t82.a(r0)     // Catch: java.lang.Throwable -> L3e
        L63:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L6e
            r1.a(r5)
            r0 = r6
            goto L14
        L6e:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r0.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L3e
            r0.append(r8)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3e
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            throw r11     // Catch: java.lang.Throwable -> L3e
        L85:
            r6 = move-exception
            boolean r9 = r6 instanceof com.yandex.mobile.ads.impl.kr     // Catch: java.lang.Throwable -> L3e
            r9 = r9 ^ r5
            boolean r9 = r10.a(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L99
            java.util.ArrayList r2 = c9.C2097r.z0(r2, r6)     // Catch: java.lang.Throwable -> L3e
            r1.a(r5)
        L96:
            r6 = r3
            goto L15
        L99:
            java.lang.Exception r11 = com.yandex.mobile.ads.impl.t82.a(r6, r2)     // Catch: java.lang.Throwable -> L3e
            throw r11     // Catch: java.lang.Throwable -> L3e
        L9e:
            r6 = move-exception
            java.io.IOException r9 = r6.b()     // Catch: java.lang.Throwable -> L3e
            boolean r9 = r10.a(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto Lb5
            java.io.IOException r6 = r6.a()     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r2 = c9.C2097r.z0(r2, r6)     // Catch: java.lang.Throwable -> L3e
            r1.a(r5)
            goto L96
        Lb5:
            java.io.IOException r11 = r6.a()     // Catch: java.lang.Throwable -> L3e
            java.lang.Exception r11 = com.yandex.mobile.ads.impl.t82.a(r11, r2)     // Catch: java.lang.Throwable -> L3e
            throw r11     // Catch: java.lang.Throwable -> L3e
        Lbe:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            throw r11     // Catch: java.lang.Throwable -> L3e
        Lc6:
            r1.a(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gr1.a(com.yandex.mobile.ads.impl.xn1):com.yandex.mobile.ads.impl.pq1");
    }

    private final boolean a(IOException iOException, tn1 tn1Var, pp1 pp1Var, boolean z10) {
        if (this.f27969a.v()) {
            return !(z10 && (iOException instanceof FileNotFoundException)) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z10)) && tn1Var.m();
        }
        return false;
    }
}
