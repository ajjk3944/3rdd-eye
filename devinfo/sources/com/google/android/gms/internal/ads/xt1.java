package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18497e;

    public /* synthetic */ xt1(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f18493a = i4;
        this.f18494b = obj;
        this.f18495c = obj2;
        this.f18496d = obj3;
        this.f18497e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        bi biVar;
        switch (this.f18493a) {
            case 0:
                Pair pair = (Pair) this.f18495c;
                ((wu1) ((zt1) this.f18494b).f19181b.f18038i).j(((Integer) pair.first).intValue(), (jy1) pair.second, (cy1) this.f18496d, (a0.c0) this.f18497e);
                return;
            case 1:
                Pair pair2 = (Pair) this.f18495c;
                ((wu1) ((zt1) this.f18494b).f19181b.f18038i).h(((Integer) pair2.first).intValue(), (jy1) pair2.second, (cy1) this.f18496d, (a0.c0) this.f18497e);
                return;
            default:
                gi giVar = (gi) this.f18497e;
                di diVar = (di) this.f18495c;
                pq0 pq0Var = (pq0) this.f18494b;
                b5.i0 i0Var = (b5.i0) pq0Var.f15075d;
                try {
                    fi fiVar = (fi) diVar.t();
                    boolean zA = diVar.A();
                    ei eiVar = (ei) this.f18496d;
                    if (zA) {
                        Parcel parcelT = fiVar.T();
                        ng.c(parcelT, eiVar);
                        Parcel parcelR0 = fiVar.r0(parcelT, 2);
                        biVar = (bi) ng.b(parcelR0, bi.CREATOR);
                        parcelR0.recycle();
                    } else {
                        Parcel parcelT2 = fiVar.T();
                        ng.c(parcelT2, eiVar);
                        Parcel parcelR02 = fiVar.r0(parcelT2, 1);
                        biVar = (bi) ng.b(parcelR02, bi.CREATOR);
                        parcelR02.recycle();
                    }
                    if (!biVar.a()) {
                        giVar.d(new RuntimeException("No entry contents."));
                        i0Var.l();
                        return;
                    }
                    hi hiVar = new hi(pq0Var, biVar.c());
                    int i4 = hiVar.read();
                    if (i4 == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    hiVar.unread(i4);
                    giVar.b(new ji(hiVar, biVar.d(), biVar.i(), biVar.g(), biVar.f()));
                    return;
                } catch (RemoteException e2) {
                    e = e2;
                    za.i.f("Unable to obtain a cache service instance.", e);
                    giVar.d(e);
                    i0Var.l();
                    return;
                } catch (IOException e10) {
                    e = e10;
                    za.i.f("Unable to obtain a cache service instance.", e);
                    giVar.d(e);
                    i0Var.l();
                    return;
                }
        }
    }
}
