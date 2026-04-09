package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class s4 {
    protected int zza;

    public static void c(Iterable iterable, List list) {
        Charset charset = o5.f5148a;
        iterable.getClass();
        if (iterable instanceof s5) {
            List listZza = ((s5) iterable).zza();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = listZza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof y4) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                y4.d(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof f6) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof h6) {
                h6 h6Var = (h6) list;
                int i10 = h6Var.f5061g + size;
                int length = h6Var.f5060d.length;
                if (i10 > length) {
                    if (length != 0) {
                        while (length < i10) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        h6Var.f5060d = Arrays.copyOf(h6Var.f5060d, length);
                    } else {
                        h6Var.f5060d = new Object[Math.max(i10, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    g5.a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object obj2 = list2.get(i11);
            if (obj2 == null) {
                g5.a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] a() {
        try {
            h5 h5Var = (h5) this;
            int iK = h5Var.k();
            byte[] bArr = new byte[iK];
            z4 z4Var = new z4(iK, bArr);
            h5Var.d(z4Var);
            if (iK - z4Var.f5285f == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            String name = getClass().getName();
            throw new RuntimeException(h0.b.s(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e4);
        }
    }

    public abstract int b(j6 j6Var);
}
