package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tw2 extends hv1 implements d52 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw2(int i, Object obj) {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(w42.CREATOR);
        iv1.f(parcel);
        Q1(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.d52
    public final void Q1(List list) {
        int i;
        ArrayList arrayList;
        switch (this.f) {
            case 0:
                ((vw2) this.g).b(list);
                return;
            default:
                f53 f53Var = (f53) this.g;
                synchronized (f53Var.a) {
                    f53Var.c = false;
                    f53Var.d = true;
                    arrayList = new ArrayList(f53Var.b);
                    f53Var.b.clear();
                }
                f53.a(list);
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    ((sa0) arrayList.get(i)).getClass();
                }
                return;
        }
    }
}
