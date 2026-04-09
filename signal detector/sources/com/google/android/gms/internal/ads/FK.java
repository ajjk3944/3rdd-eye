package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class FK {
    protected transient int zzq;

    public static void e(Iterable iterable, List list) {
        Charset charset = AbstractC1528mL.f15610a;
        iterable.getClass();
        if (iterable instanceof DL) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof FL) {
                FL fl = (FL) list;
                int i = ((FL) list).f8090c + size;
                int length = fl.f8089b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        fl.f8089b = Arrays.copyOf(fl.f8089b, length);
                    } else {
                        fl.f8089b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    AbstractC0987cL.f(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list2.get(i3);
            if (obj2 == null) {
                AbstractC0987cL.f(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final OK a() {
        try {
            int iD = ((AbstractC1096eL) this).d(null);
            OK ok = QK.f10609b;
            byte[] bArr = new byte[iD];
            boolean z6 = VK.f11982c;
            TK tk = new TK(bArr, iD);
            ((AbstractC1096eL) this).v(tk);
            tk.L();
            return new OK(bArr);
        } catch (IOException e6) {
            throw new RuntimeException(f("ByteString"), e6);
        }
    }

    public final byte[] b() {
        try {
            int iD = ((AbstractC1096eL) this).d(null);
            byte[] bArr = new byte[iD];
            boolean z6 = VK.f11982c;
            TK tk = new TK(bArr, iD);
            ((AbstractC1096eL) this).v(tk);
            tk.L();
            return bArr;
        } catch (IOException e6) {
            throw new RuntimeException(f("byte array"), e6);
        }
    }

    public final void c(OutputStream outputStream) {
        AbstractC1096eL abstractC1096eL = (AbstractC1096eL) this;
        int iD = abstractC1096eL.d(null);
        boolean z6 = VK.f11982c;
        if (iD > 4096) {
            iD = 4096;
        }
        UK uk = new UK(outputStream, iD);
        abstractC1096eL.v(uk);
        if (uk.f11642f > 0) {
            uk.h0();
        }
    }

    public abstract int d(JL jl);

    public final String f(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + str.length() + 44);
        A.f.w(sb, "Serializing ", name, " to a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }
}
