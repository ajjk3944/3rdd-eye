package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.lefan.signal.MyApplication;
import java.util.ArrayList;
import java.util.List;
import p4.C2774a;

/* renamed from: com.google.android.gms.internal.ads.Co, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0462Co extends B7 implements InterfaceC0840Zb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7661b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0462Co(int i, Object obj) {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        this.f7660a = i;
        this.f7661b = obj;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C0772Vb.CREATOR);
        C7.f(parcel);
        S2(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0840Zb
    public final void S2(List list) {
        int i;
        ArrayList arrayList;
        switch (this.f7660a) {
            case 0:
                ((C0513Fo) this.f7661b).b(list);
                return;
            default:
                q2.I0 i02 = (q2.I0) this.f7661b;
                synchronized (i02.f23121d) {
                    i02.f23123f = false;
                    i02.f23124g = true;
                    arrayList = new ArrayList(i02.f23122e);
                    i02.f23122e.clear();
                }
                q2.I0.a(list);
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    ((C2774a) arrayList.get(i)).getClass();
                    Z3.c cVar = MyApplication.f18814f;
                    if (cVar != null) {
                        cVar.a(MyApplication.i);
                    }
                }
                return;
        }
    }
}
