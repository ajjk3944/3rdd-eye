package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k5 {

    /* renamed from: a, reason: collision with root package name */
    public int f13028a;

    /* renamed from: b, reason: collision with root package name */
    public int f13029b;

    /* renamed from: c, reason: collision with root package name */
    public Cloneable f13030c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13031d;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Cloneable, long[]] */
    public k5() {
        this.f13030c = new long[10];
        this.f13031d = new Object[10];
    }

    public synchronized void a() {
        try {
            fw0 fw0Var = (fw0) this.f13031d;
            if (fw0Var.f11271b) {
                hw0 hw0Var = fw0Var.f11270a;
                hw0Var.u2((byte[]) this.f13030c);
                hw0Var.n(this.f13028a);
                hw0Var.R1(this.f13029b);
                hw0Var.y3();
                hw0Var.c();
            }
        } catch (RemoteException e2) {
            Log.d("GASS", "Clearcut log failed", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Cloneable, java.lang.Object, long[]] */
    public synchronized void b(Object obj, long j) {
        try {
            if (this.f13029b > 0) {
                if (j <= ((long[]) this.f13030c)[((this.f13028a + r0) - 1) % ((Object[]) this.f13031d).length]) {
                    c();
                }
            }
            int length = ((Object[]) this.f13031d).length;
            if (this.f13029b >= length) {
                int i4 = length + length;
                ?? r22 = new long[i4];
                Object[] objArr = new Object[i4];
                int i10 = this.f13028a;
                int i11 = length - i10;
                System.arraycopy((long[]) this.f13030c, i10, r22, 0, i11);
                System.arraycopy((Object[]) this.f13031d, this.f13028a, objArr, 0, i11);
                int i12 = this.f13028a;
                if (i12 > 0) {
                    System.arraycopy((long[]) this.f13030c, 0, r22, i11, i12);
                    System.arraycopy((Object[]) this.f13031d, 0, objArr, i11, this.f13028a);
                }
                this.f13030c = r22;
                this.f13031d = objArr;
                this.f13028a = 0;
            }
            int i13 = this.f13028a;
            int i14 = this.f13029b;
            Object[] objArr2 = (Object[]) this.f13031d;
            int length2 = (i13 + i14) % objArr2.length;
            ((long[]) this.f13030c)[length2] = j;
            objArr2[length2] = obj;
            this.f13029b = i14 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c() {
        this.f13028a = 0;
        this.f13029b = 0;
        Arrays.fill((Object[]) this.f13031d, (Object) null);
    }

    public synchronized int d() {
        return this.f13029b;
    }

    public synchronized Object e() {
        if (this.f13029b == 0) {
            return null;
        }
        return g();
    }

    public synchronized Object f(long j) {
        Object objG;
        objG = null;
        while (this.f13029b > 0 && j - ((long[]) this.f13030c)[this.f13028a] >= 0) {
            objG = g();
        }
        return objG;
    }

    public Object g() {
        mq0.c0(this.f13029b > 0);
        Object[] objArr = (Object[]) this.f13031d;
        int i4 = this.f13028a;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f13028a = (i4 + 1) % objArr.length;
        this.f13029b--;
        return obj;
    }

    public k5(int i4, ArrayList arrayList, int i10, ta taVar) {
        this.f13028a = i4;
        this.f13030c = arrayList;
        this.f13029b = i10;
        this.f13031d = taVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k5(fw0 fw0Var, byte[] bArr) {
        this.f13031d = fw0Var;
        this.f13030c = bArr;
    }
}
