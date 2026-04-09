package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.impl.nm;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class vc1 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f34445a;

        /* renamed from: b, reason: collision with root package name */
        private final fi2 f34446b;

        public /* synthetic */ a(String str, fi2 fi2Var, int i) {
            this(str, fi2Var);
        }

        private a(String str, fi2 fi2Var) {
            this.f34445a = str;
            this.f34446b = fi2Var;
        }
    }

    public static void a(op1<?> op1Var, a aVar) throws fi2 {
        hr1 hr1VarH = op1Var.h();
        int iJ = op1Var.j();
        try {
            hr1VarH.a(aVar.f34446b);
            op1Var.a(aVar.f34445a + "-retry [timeout=" + iJ + "]");
        } catch (fi2 e4) {
            op1Var.a(aVar.f34445a + "-timeout-giveup [timeout=" + iJ + "]");
            throw e4;
        }
    }

    public static nc1 a(op1<?> op1Var, long j4, List<ef0> list) {
        nm.a aVarC = op1Var.c();
        if (aVarC == null) {
            return new nc1(304, (byte[]) null, true, j4, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<ef0> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<ef0> list2 = aVarC.f30936h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (ef0 ef0Var : aVarC.f30936h) {
                    if (!treeSet.contains(ef0Var.a())) {
                        arrayList.add(ef0Var);
                    }
                }
            }
        } else if (!aVarC.f30935g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVarC.f30935g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new ef0(entry.getKey(), entry.getValue()));
                }
            }
        }
        return new nc1(304, aVarC.f30929a, true, j4, (List<ef0>) arrayList);
    }

    public static byte[] a(InputStream inputStream, int i, jm jmVar) throws Throwable {
        byte[] bArrA;
        ej1 ej1Var = new ej1(jmVar, i);
        try {
            bArrA = jmVar.a(1024);
            while (true) {
                try {
                    int i10 = inputStream.read(bArrA);
                    if (i10 == -1) {
                        break;
                    }
                    ej1Var.write(bArrA, 0, i10);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        boolean z10 = gi2.f27765a;
                        fp0.e(new Object[0]);
                    }
                    jmVar.a(bArrA);
                    ej1Var.close();
                    throw th;
                }
            }
            byte[] byteArray = ej1Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                boolean z11 = gi2.f27765a;
                fp0.e(new Object[0]);
            }
            jmVar.a(bArrA);
            ej1Var.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrA = null;
        }
    }

    public static a a(op1<?> op1Var, IOException iOException, long j4, mh0 mh0Var, byte[] bArr) throws fi2 {
        int i = 0;
        if (iOException instanceof SocketTimeoutException) {
            return new a("socket", new y42(), i);
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + op1Var.l(), iOException);
        }
        if (mh0Var != null) {
            int iE = mh0Var.e();
            Object[] objArr = {Integer.valueOf(iE), op1Var.l()};
            boolean z10 = gi2.f27765a;
            fp0.b(objArr);
            if (bArr != null) {
                nc1 nc1Var = new nc1(iE, bArr, false, SystemClock.elapsedRealtime() - j4, mh0Var.d());
                if (iE == 401 || iE == 403) {
                    return new a("auth", new th(nc1Var), i);
                }
                if (iE >= 400 && iE <= 499) {
                    throw new zo(nc1Var);
                }
                if (iE >= 500 && iE <= 599 && op1Var.v()) {
                    return new a("server", new cx1(nc1Var), i);
                }
                throw new cx1(nc1Var);
            }
            return new a("network", new kc1(), i);
        }
        if (op1Var.u()) {
            return new a("connection", new dd1(), i);
        }
        throw new dd1(iOException);
    }

    public static void a(long j4, op1<?> op1Var, byte[] bArr, int i) {
        if (gi2.f27765a || j4 > 3000) {
            fp0.a(op1Var, Long.valueOf(j4), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i), Integer.valueOf(op1Var.h().b()));
        }
    }
}
