package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class s4 {
    protected int zza;

    public static void c(Iterable iterable, List list) {
        Charset charset = n5.f19843a;
        iterable.getClass();
        if (iterable instanceof r5) {
            List listB = ((r5) iterable).b();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = listB.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof x4) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                x4.f(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof e6) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof g6) {
                g6 g6Var = (g6) list;
                int i4 = g6Var.f19758c + size;
                int length = g6Var.f19757b.length;
                if (i4 > length) {
                    if (length != 0) {
                        while (length < i4) {
                            length = com.google.android.gms.internal.ads.d7.n(length, 3, 2, 1, 10);
                        }
                        g6Var.f19757b = Arrays.copyOf(g6Var.f19757b, length);
                    } else {
                        g6Var.f19757b = new Object[Math.max(i4, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    f5.a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj2 = list2.get(i10);
            if (obj2 == null) {
                f5.a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] a() {
        try {
            g5 g5Var = (g5) this;
            int iK = g5Var.k();
            byte[] bArr = new byte[iK];
            y4 y4Var = new y4(bArr, iK);
            g5Var.d(y4Var);
            if (iK - y4Var.f20052d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(r5.c.m(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    public abstract int b(i6 i6Var);
}
