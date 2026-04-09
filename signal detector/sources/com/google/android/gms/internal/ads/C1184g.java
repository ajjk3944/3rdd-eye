package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseArray;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.ArrayDeque;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1184g implements InterfaceC0916b4 {

    /* renamed from: a, reason: collision with root package name */
    public int f14179a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14180b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14181c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14182d;

    /* renamed from: e, reason: collision with root package name */
    public Object f14183e;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1184g(android.content.Context r3) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f14179a = r0
            android.content.Context r0 = r3.getApplicationContext()
            r2.f14180b = r0
            int r0 = N.a.f2959a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L27
            r1 = 33
            if (r0 < r1) goto L4b
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            q5.i.d(r0, r1)
            java.lang.String r0 = "UpsideDownCake"
            boolean r0 = N.a.a(r0)
            if (r0 == 0) goto L4b
        L27:
            int r0 = Z4.b.a()
            r1 = 8
            if (r0 < r1) goto L4b
            boolean r0 = Y4.AbstractC0235o.v()
            if (r0 == 0) goto L46
            java.lang.Class r0 = N4.n.j()
            java.lang.Object r3 = r3.getSystemService(r0)
            android.app.sdksandbox.sdkprovider.SdkSandboxController r3 = N4.n.f(r3)
            java.lang.String r3 = com.google.android.gms.internal.ads.AbstractC1619o4.b(r3)
            goto L4f
        L46:
            java.lang.String r3 = r3.getPackageName()
            goto L4f
        L4b:
            java.lang.String r3 = r3.getPackageName()
        L4f:
            r2.f14181c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1184g.<init>(android.content.Context):void");
    }

    public synchronized void a(C1769qt c1769qt) {
        ((ArrayDeque) this.f14182d).add(c1769qt);
    }

    public boolean b() {
        return (this.f14179a != 2 || ((F7) this.f14182d) == null || ((ServiceConnectionC1565n4) this.f14183e) == null) ? false : true;
    }

    public boolean c(int i) {
        return ((C2070wO[]) this.f14180b)[i] != null;
    }

    public boolean d(C1184g c1184g, int i) {
        return c1184g != null && Objects.equals(((C2070wO[]) this.f14180b)[i], ((C2070wO[]) c1184g.f14180b)[i]) && Objects.equals(((InterfaceC1020d[]) this.f14181c)[i], ((InterfaceC1020d[]) c1184g.f14181c)[i]);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    @Override // com.google.android.gms.internal.ads.InterfaceC0916b4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(com.google.android.gms.internal.ads.C2036vr r31) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1184g.f(com.google.android.gms.internal.ads.vr):void");
    }

    public Nx g() throws RemoteException {
        if (!b()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", (String) this.f14181c);
        try {
            D7 d7 = (D7) ((F7) this.f14182d);
            Parcel parcelH0 = d7.h0();
            C7.c(parcelH0, bundle);
            Parcel parcelK0 = d7.k0(parcelH0, 1);
            Bundle bundle2 = (Bundle) C7.b(parcelK0, Bundle.CREATOR);
            parcelK0.recycle();
            return new Nx(3, bundle2);
        } catch (RemoteException e6) {
            AbstractC0709Rg.j("RemoteException getting install referrer information");
            this.f14179a = 0;
            throw e6;
        }
    }

    public synchronized void h() {
        C1769qt c1769qt;
        InterfaceC1931tu interfaceC1931tu;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Z6)).booleanValue() && !p2.j.f22785C.f22795h.i().s().f7980j) {
            ((ArrayDeque) this.f14182d).clear();
            return;
        }
        if (i()) {
            while (true) {
                ArrayDeque arrayDeque = (ArrayDeque) this.f14182d;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                c1769qt = (C1769qt) arrayDeque.pollFirst();
                if (c1769qt == null || ((interfaceC1931tu = c1769qt.f16420g) != null && ((C1338iu) this.f14180b).z(interfaceC1931tu))) {
                    break;
                }
            }
            C0907aw c0907aw = new C0907aw((C1338iu) this.f14180b, (L6) this.f14181c, c1769qt);
            this.f14183e = c0907aw;
            c0907aw.a(new C0889ae((Object) this, (Object) c1769qt, 28, false));
        }
    }

    public synchronized boolean i() {
        return ((C0907aw) this.f14183e) == null;
    }

    public C1184g(J0 j02, Rx rx, byte[] bArr, C1778r2[] c1778r2Arr, int i) {
        this.f14180b = j02;
        this.f14181c = rx;
        this.f14182d = bArr;
        this.f14183e = c1778r2Arr;
        this.f14179a = i;
    }

    public C1184g(C1079e4 c1079e4, int i) {
        Objects.requireNonNull(c1079e4);
        this.f14183e = c1079e4;
        this.f14180b = new C1443kr(new byte[5], 5);
        this.f14181c = new SparseArray();
        this.f14182d = new SparseIntArray();
        this.f14179a = i;
    }

    public C1184g(C1338iu c1338iu, C1554mu c1554mu, L6 l6) {
        this.f14179a = 1;
        this.f14180b = c1338iu;
        this.f14181c = l6;
        this.f14182d = new ArrayDeque();
        c1554mu.f15688a = new C2255zu(0, this);
    }

    public C1184g(C2070wO[] c2070wOArr, InterfaceC1020d[] interfaceC1020dArr, C2020vb c2020vb, C1129f c1129f) {
        int length = c2070wOArr.length;
        AbstractC0582Jp.m(length == interfaceC1020dArr.length);
        this.f14180b = c2070wOArr;
        this.f14181c = (InterfaceC1020d[]) interfaceC1020dArr.clone();
        this.f14182d = c2020vb;
        this.f14183e = c1129f;
        this.f14179a = length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0916b4
    public void e(C2038vt c2038vt, InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
    }
}
