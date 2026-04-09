package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.is;
import ia.C4468d;
import ia.h;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class ih0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ia.h f28668a;

    /* renamed from: b, reason: collision with root package name */
    private static final ia.h f28669b;

    static {
        ia.h hVar = ia.h.f38646e;
        f28668a = h.a.c("\"\\");
        f28669b = h.a.c("\t ,=");
    }

    public static final ArrayList a(kf0 kf0Var, String headerName) {
        kotlin.jvm.internal.l.f(kf0Var, "<this>");
        kotlin.jvm.internal.l.f(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = kf0Var.size();
        for (int i = 0; i < size; i++) {
            if (headerName.equalsIgnoreCase(kf0Var.a(i))) {
                C4468d c4468d = new C4468d();
                c4468d.R0(kf0Var.b(i));
                try {
                    a(c4468d, arrayList);
                } catch (EOFException e4) {
                    lh1.f29999a.getClass();
                    lh1.a(5, "Unable to parse challenge", e4);
                }
            }
        }
        return arrayList;
    }

    private static final boolean b(C4468d c4468d) throws EOFException {
        boolean z10 = false;
        while (!c4468d.K()) {
            byte bL = c4468d.l(0L);
            if (bL == 44) {
                c4468d.readByte();
                z10 = true;
            } else {
                if (bL != 32 && bL != 9) {
                    break;
                }
                c4468d.readByte();
            }
        }
        return z10;
    }

    public static final boolean a(pq1 pq1Var) {
        kotlin.jvm.internal.l.f(pq1Var, "<this>");
        if (kotlin.jvm.internal.l.b(pq1Var.o().f(), "HEAD")) {
            return false;
        }
        int iD = pq1Var.d();
        return (((iD >= 100 && iD < 200) || iD == 204 || iD == 304) && t82.a(pq1Var) == -1 && !"chunked".equalsIgnoreCase(pq1.a(pq1Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x010a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010a, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void a(ia.C4468d r17, java.util.ArrayList r18) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ih0.a(ia.d, java.util.ArrayList):void");
    }

    private static final String a(C4468d c4468d) {
        long jB = c4468d.B(f28669b);
        if (jB == -1) {
            jB = c4468d.f38643c;
        }
        if (jB != 0) {
            return c4468d.m0(jB, C5819a.f48359b);
        }
        return null;
    }

    public static final void a(ks ksVar, rh0 url, kf0 headers) {
        kotlin.jvm.internal.l.f(ksVar, "<this>");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(headers, "headers");
        if (ksVar == ks.f29762a) {
            return;
        }
        int i = is.f28851n;
        List<is> listA = is.a.a(url, headers);
        if (listA.isEmpty()) {
            return;
        }
        ksVar.a(url, listA);
    }
}
