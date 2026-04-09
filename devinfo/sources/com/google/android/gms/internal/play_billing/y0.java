package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.d7;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y0 extends p1 {
    private static final y0 zzb;
    private t1 zzd = j2.f20161e;

    static {
        y0 y0Var = new y0();
        zzb = y0Var;
        p1.k(y0.class, y0Var);
    }

    public static x0 n() {
        return (x0) zzb.f();
    }

    public static void o(y0 y0Var, ArrayList arrayList) {
        t1 t1Var = y0Var.zzd;
        if (!((c1) t1Var).f20095a) {
            int size = t1Var.size();
            y0Var.zzd = t1Var.e(size + size);
        }
        List list = y0Var.zzd;
        Charset charset = u1.f20233a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof j2) {
            j2 j2Var = (j2) list;
            int i4 = j2Var.f20163c + size2;
            int length = j2Var.f20162b.length;
            if (i4 > length) {
                if (length != 0) {
                    while (length < i4) {
                        length = d7.n(length, 3, 2, 1, 10);
                    }
                    j2Var.f20162b = Arrays.copyOf(j2Var.f20162b, length);
                } else {
                    j2Var.f20162b = new Object[Math.max(i4, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i10 = 0; i10 < size4; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == null) {
                String strH = r5.c.h(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(strH);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p1
    public final Object d(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new k2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", w0.class});
        }
        if (i10 == 3) {
            return new y0();
        }
        if (i10 == 4) {
            return new x0(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
