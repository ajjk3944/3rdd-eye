package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.jO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1369jO implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14940c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14942e;

    public /* synthetic */ RunnableC1369jO(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f14938a = i;
        this.f14939b = obj;
        this.f14940c = obj2;
        this.f14941d = obj3;
        this.f14942e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        C1731q8 c1731q8;
        switch (this.f14938a) {
            case 0:
                Pair pair = (Pair) this.f14940c;
                ((GO) ((C1477lO) this.f14939b).f15385b.i).o(((Integer) pair.first).intValue(), (C1749qQ) pair.second, (C1319iQ) this.f14941d, (C1587nQ) this.f14942e);
                return;
            case 1:
                Pair pair2 = (Pair) this.f14940c;
                ((GO) ((C1477lO) this.f14939b).f15385b.i).j(((Integer) pair2.first).intValue(), (C1749qQ) pair2.second, (C1319iQ) this.f14941d, (C1587nQ) this.f14942e);
                return;
            default:
                C2000v8 c2000v8 = (C2000v8) this.f14942e;
                C1838s8 c1838s8 = (C1838s8) this.f14940c;
                C1338iu c1338iu = (C1338iu) this.f14939b;
                A1.s sVar = (A1.s) c1338iu.f14824d;
                try {
                    C1946u8 c1946u8 = (C1946u8) c1838s8.t();
                    boolean zA = c1838s8.A();
                    C1892t8 c1892t8 = (C1892t8) this.f14941d;
                    if (zA) {
                        Parcel parcelH0 = c1946u8.h0();
                        C7.c(parcelH0, c1892t8);
                        Parcel parcelK0 = c1946u8.k0(parcelH0, 2);
                        c1731q8 = (C1731q8) C7.b(parcelK0, C1731q8.CREATOR);
                        parcelK0.recycle();
                    } else {
                        Parcel parcelH02 = c1946u8.h0();
                        C7.c(parcelH02, c1892t8);
                        Parcel parcelK02 = c1946u8.k0(parcelH02, 1);
                        c1731q8 = (C1731q8) C7.b(parcelK02, C1731q8.CREATOR);
                        parcelK02.recycle();
                    }
                    if (!c1731q8.a()) {
                        c2000v8.c(new RuntimeException("No entry contents."));
                        sVar.i();
                        return;
                    }
                    C2054w8 c2054w8 = new C2054w8(c1338iu, c1731q8.b());
                    int i = c2054w8.read();
                    if (i == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    c2054w8.unread(i);
                    c2000v8.b(new C2162y8(c2054w8, c1731q8.c(), c1731q8.f(), c1731q8.e(), c1731q8.d()));
                    return;
                } catch (RemoteException e6) {
                    e = e6;
                    u2.k.f("Unable to obtain a cache service instance.", e);
                    c2000v8.c(e);
                    sVar.i();
                    return;
                } catch (IOException e7) {
                    e = e7;
                    u2.k.f("Unable to obtain a cache service instance.", e);
                    c2000v8.c(e);
                    sVar.i();
                    return;
                }
        }
    }
}
