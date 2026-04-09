package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class O3 implements InterfaceC4357g5 {
    protected static void i(Iterable iterable, List list) {
        F4.e(iterable);
        if (iterable instanceof O4) {
            List listZza = ((O4) iterable).zza();
            O4 o42 = (O4) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    String str = "Element at index " + (o42.size() - size) + " is null.";
                    for (int size2 = o42.size() - 1; size2 >= size; size2--) {
                        o42.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof V3) {
                    o42.G0((V3) obj);
                } else if (obj instanceof byte[]) {
                    o42.G0(V3.y((byte[]) obj));
                } else {
                    o42.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC4455s5) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof C4463t5) {
                ((C4463t5) list).e(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    k(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i10 = 0; i10 < size5; i10++) {
            Object obj3 = list2.get(i10);
            if (obj3 == null) {
                k(list, size4);
            }
            list.add(obj3);
        }
    }

    private static void k(List list, int i10) {
        String str = "Element at index " + (list.size() - i10) + " is null.";
        for (int size = list.size() - 1; size >= i10; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    public abstract /* synthetic */ Object clone();

    public abstract O3 f(byte[] bArr, int i10, int i11);

    public abstract O3 h(byte[] bArr, int i10, int i11, C4431p4 c4431p4);

    @Override // com.google.android.gms.internal.measurement.InterfaceC4357g5
    public final /* synthetic */ InterfaceC4357g5 q0(byte[] bArr, C4431p4 c4431p4) {
        return h(bArr, 0, bArr.length, c4431p4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4357g5
    public final /* synthetic */ InterfaceC4357g5 zza(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }
}
