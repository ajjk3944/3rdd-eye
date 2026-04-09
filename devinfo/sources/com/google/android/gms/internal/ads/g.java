package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements c9 {

    /* renamed from: a, reason: collision with root package name */
    public int f11324a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11325b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11326c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11327d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11328e;

    public g(k2 k2Var, mx0 mx0Var, byte[] bArr, s5[] s5VarArr, int i4) {
        this.f11325b = k2Var;
        this.f11326c = mx0Var;
        this.f11327d = bArr;
        this.f11328e = s5VarArr;
        this.f11324a = i4;
    }

    public synchronized void a(uo0 uo0Var) {
        ((ArrayDeque) this.f11327d).add(uo0Var);
    }

    public boolean b(int i4) {
        return ((ku1[]) this.f11325b)[i4] != null;
    }

    public boolean c(g gVar, int i4) {
        return gVar != null && Objects.equals(((ku1[]) this.f11325b)[i4], ((ku1[]) gVar.f11325b)[i4]) && Objects.equals(((d[]) this.f11326c)[i4], ((d[]) gVar.f11326c)[i4]);
    }

    public synchronized void e() {
        uo0 uo0Var;
        br0 br0Var;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Z6)).booleanValue() && !ua.j.C.f35265h.i().s().j) {
            ((ArrayDeque) this.f11327d).clear();
            return;
        }
        if (f()) {
            while (true) {
                ArrayDeque arrayDeque = (ArrayDeque) this.f11327d;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                uo0Var = (uo0) arrayDeque.pollFirst();
                if (uo0Var == null || ((br0Var = uo0Var.g) != null && ((pq0) this.f11325b).y(br0Var))) {
                    break;
                }
            }
            fu0 fu0Var = new fu0((pq0) this.f11325b, (rg0) this.f11326c, uo0Var);
            this.f11328e = fu0Var;
            fu0Var.a(new rt((Object) this, false, (Object) uo0Var, 20));
        }
    }

    public synchronized boolean f() {
        return ((fu0) this.f11328e) == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    @Override // com.google.android.gms.internal.ads.c9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(com.google.android.gms.internal.ads.sk0 r31) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g.l(com.google.android.gms.internal.ads.sk0):void");
    }

    public g(f9 f9Var, int i4) {
        Objects.requireNonNull(f9Var);
        this.f11328e = f9Var;
        this.f11325b = new hk0(new byte[5], 5);
        this.f11326c = new SparseArray();
        this.f11327d = new SparseIntArray();
        this.f11324a = i4;
    }

    public g(pq0 pq0Var, tq0 tq0Var, rg0 rg0Var) {
        this.f11324a = 1;
        this.f11325b = pq0Var;
        this.f11326c = rg0Var;
        this.f11327d = new ArrayDeque();
        tq0Var.f16922a = new ne0(14, this);
    }

    public g(ku1[] ku1VarArr, d[] dVarArr, go goVar, f fVar) {
        int length = ku1VarArr.length;
        mq0.m(length == dVarArr.length);
        this.f11325b = ku1VarArr;
        this.f11326c = (d[]) dVarArr.clone();
        this.f11327d = goVar;
        this.f11328e = fVar;
        this.f11324a = length;
    }

    @Override // com.google.android.gms.internal.ads.c9
    public void d(zo0 zo0Var, z1 z1Var, h9 h9Var) {
    }
}
