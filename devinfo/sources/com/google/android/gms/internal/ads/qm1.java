package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class qm1 {
    protected transient int zzq;

    public static void e(Iterable iterable, List list) {
        Charset charset = yn1.f18811a;
        iterable.getClass();
        if (iterable instanceof do1) {
            List listB = ((do1) iterable).b();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = listB.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof bn1) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                bn1.v(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof qo1) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof so1) {
                so1 so1Var = (so1) list;
                int i4 = so1Var.f16501c + size;
                int length = so1Var.f16500b.length;
                if (i4 > length) {
                    if (length != 0) {
                        while (length < i4) {
                            length = d7.n(length, 3, 2, 1, 10);
                        }
                        so1Var.f16500b = Arrays.copyOf(so1Var.f16500b, length);
                    } else {
                        so1Var.f16500b = new Object[Math.max(i4, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    on1.g(size2, list);
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
                on1.g(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final zm1 a() {
        try {
            int iD = ((qn1) this).d(null);
            zm1 zm1Var = bn1.f9729b;
            byte[] bArr = new byte[iD];
            boolean z3 = hn1.f11928c;
            fn1 fn1Var = new fn1(bArr, iD);
            ((qn1) this).v(fn1Var);
            fn1Var.L();
            return new zm1(bArr);
        } catch (IOException e2) {
            throw new RuntimeException(f("ByteString"), e2);
        }
    }

    public final byte[] b() {
        try {
            int iD = ((qn1) this).d(null);
            byte[] bArr = new byte[iD];
            boolean z3 = hn1.f11928c;
            fn1 fn1Var = new fn1(bArr, iD);
            ((qn1) this).v(fn1Var);
            fn1Var.L();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(f("byte array"), e2);
        }
    }

    public final void c(OutputStream outputStream) {
        qn1 qn1Var = (qn1) this;
        int iD = qn1Var.d(null);
        boolean z3 = hn1.f11928c;
        if (iD > 4096) {
            iD = 4096;
        }
        gn1 gn1Var = new gn1(outputStream, iD);
        qn1Var.v(gn1Var);
        if (gn1Var.f11564f > 0) {
            gn1Var.h0();
        }
    }

    public abstract int d(xo1 xo1Var);

    public final String f(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 18 + str.length() + 44);
        je.u.B(sb2, "Serializing ", name, " to a ", str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }
}
