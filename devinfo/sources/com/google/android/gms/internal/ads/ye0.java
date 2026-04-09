package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ye0 extends mg implements mp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18720b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye0(int i4, Object obj) {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        this.f18719a = i4;
        this.f18720b = obj;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(ip.CREATOR);
        ng.f(parcel);
        p3(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final void p3(List list) {
        int i4;
        ArrayList arrayList;
        switch (this.f18719a) {
            case 0:
                ((bf0) this.f18720b).b(list);
                return;
            default:
                va.h2 h2Var = (va.h2) this.f18720b;
                synchronized (h2Var.f36110d) {
                    h2Var.f36112f = false;
                    h2Var.g = true;
                    arrayList = new ArrayList(h2Var.f36111e);
                    h2Var.f36111e.clear();
                }
                va.h2.a(list);
                int size = arrayList.size();
                for (i4 = 0; i4 < size; i4++) {
                    ((pi.d) arrayList.get(i4)).getClass();
                    ci.b.f2887i = true;
                }
                return;
        }
    }
}
