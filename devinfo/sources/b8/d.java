package b8;

import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import b5.i0;
import ec.b1;
import ec.o1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import km.y;
import nk.k;
import nm.d0;
import w4.m;
import yb.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public long f2073a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2074b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2075c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2076d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2077e;

    public void a(u6.h hVar) {
        Runnable runnable;
        k.e(hVar, "token");
        synchronized (this.f2076d) {
            runnable = (Runnable) ((LinkedHashMap) this.f2077e).remove(hVar);
        }
        if (runnable != null) {
            ((Handler) ((y) this.f2074b).f28522b).removeCallbacks(runnable);
        }
    }

    public synchronized v7.c b() {
        try {
            if (((v7.c) this.f2077e) == null) {
                this.f2077e = v7.c.y((File) this.f2075c, this.f2073a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (v7.c) this.f2077e;
    }

    public int c() {
        return ((ArrayList) this.f2077e).size() + ((ArrayList) this.f2076d).size() + ((ArrayList) this.f2075c).size() + ((ArrayList) this.f2074b).size();
    }

    public void d() {
        this.f2073a = 0L;
        ArrayList arrayList = (ArrayList) this.f2074b;
        int size = arrayList.size();
        int i4 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            this.f2073a += ((aj.b) obj).f406a;
        }
        ArrayList arrayList2 = (ArrayList) this.f2075c;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            this.f2073a += ((aj.b) obj2).f406a;
        }
        ArrayList arrayList3 = (ArrayList) this.f2076d;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            this.f2073a += ((aj.b) obj3).f406a;
        }
        ArrayList arrayList4 = (ArrayList) this.f2077e;
        int size4 = arrayList4.size();
        while (i4 < size4) {
            Object obj4 = arrayList4.get(i4);
            i4++;
            this.f2073a += ((aj.b) obj4).f406a;
        }
    }

    public void e(u6.h hVar) {
        k.e(hVar, "token");
        k1.b bVar = new k1.b(26, this, hVar);
        synchronized (this.f2076d) {
        }
        y yVar = (y) this.f2074b;
        ((Handler) yVar.f28522b).postDelayed(bVar, this.f2073a);
    }

    @Override // b8.a
    public File f(x7.e eVar) {
        String strG = ((i) this.f2074b).G(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strG + " for for Key: " + eVar);
        }
        try {
            d0 d0VarV = b().v(strG);
            if (d0VarV != null) {
                return ((File[]) d0VarV.f30011b)[0];
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }

    @Override // b8.a
    public void g(x7.e eVar, m mVar) {
        b bVarA;
        boolean z3;
        String strG = ((i) this.f2074b).G(eVar);
        y4.a aVar = (y4.a) this.f2076d;
        synchronized (aVar) {
            try {
                bVarA = (b) ((HashMap) aVar.f37323a).get(strG);
                if (bVarA == null) {
                    bVarA = ((c) aVar.f37324b).a();
                    ((HashMap) aVar.f37323a).put(strG, bVarA);
                }
                bVarA.f2071b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bVarA.f2070a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strG + " for for Key: " + eVar);
            }
            try {
                v7.c cVarB = b();
                if (cVarB.v(strG) == null) {
                    i0 i0VarM = cVarB.m(strG);
                    if (i0VarM == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strG));
                    }
                    try {
                        if (((x7.b) mVar.f36442a).g(mVar.f36443b, i0VarM.d(), (x7.h) mVar.f36444c)) {
                            v7.c.c((v7.c) i0VarM.f1823d, i0VarM, true);
                            i0VarM.f1820a = true;
                        }
                        if (!z3) {
                            try {
                                i0VarM.a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!i0VarM.f1820a) {
                            try {
                                i0VarM.a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
        } finally {
            ((y4.a) this.f2076d).u(strG);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(long r11, com.google.android.gms.internal.measurement.b3 r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f2076d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f2076d = r0
        Ld:
            java.lang.Object r0 = r10.f2075c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f2075c = r0
        L1a:
            java.lang.Object r0 = r10.f2076d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L45
            java.lang.Object r0 = r10.f2076d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.b3 r0 = (com.google.android.gms.internal.measurement.b3) r0
            long r2 = r0.u()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6 = 60
            long r2 = r2 / r6
            long r2 = r2 / r6
            long r8 = r13.u()
            long r8 = r8 / r4
            long r8 = r8 / r6
            long r8 = r8 / r6
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto Lcc
        L45:
            long r2 = r10.f2073a
            int r0 = r13.k()
            long r4 = (long) r0
            long r2 = r2 + r4
            java.lang.Object r0 = r10.f2077e
            ec.g4 r0 = (ec.g4) r0
            ec.g r4 = r0.e0()
            ec.c0 r5 = ec.d0.f22630e1
            r6 = 0
            boolean r4 = r4.L(r6, r5)
            if (r4 == 0) goto L81
            java.lang.Object r4 = r10.f2076d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9a
            r0.e0()
            ec.c0 r4 = ec.d0.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto Lcc
            goto L9a
        L81:
            r0.e0()
            ec.c0 r4 = ec.d0.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L9a
            goto Lcc
        L9a:
            r10.f2073a = r2
            java.lang.Object r2 = r10.f2076d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r13)
            java.lang.Object r13 = r10.f2075c
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.add(r11)
            java.lang.Object r11 = r10.f2076d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            r0.e0()
            ec.c0 r12 = ec.d0.f22644k
            java.lang.Object r12 = r12.a(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r13 = 1
            int r12 = java.lang.Math.max(r13, r12)
            if (r11 < r12) goto Lcd
        Lcc:
            return r1
        Lcd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.d.h(long, com.google.android.gms.internal.measurement.b3):boolean");
    }

    public void i() {
        b1 b1Var = (b1) this.f2077e;
        b1Var.B();
        ((o1) b1Var.f218b).f22957k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = b1Var.F().edit();
        editorEdit.remove((String) this.f2075c);
        editorEdit.remove((String) this.f2076d);
        editorEdit.putLong((String) this.f2074b, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
