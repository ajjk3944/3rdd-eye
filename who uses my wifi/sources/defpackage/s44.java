package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class s44 {
    protected int zzq;

    public static void e(Iterable iterable, List list) {
        Charset charset = y54.a;
        iterable.getClass();
        if (iterable instanceof o64) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof q64) {
                q64 q64Var = (q64) list;
                int i = q64Var.h + size;
                int length = q64Var.g.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        q64Var.g = Arrays.copyOf(q64Var.g, length);
                    } else {
                        q64Var.g = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    n54.f(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                n54.f(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final y44 a() {
        try {
            int iD = ((p54) this).d(null);
            y44 y44Var = a54.g;
            byte[] bArr = new byte[iD];
            Logger logger = g54.t;
            e54 e54Var = new e54(iD, bArr);
            ((p54) this).v(e54Var);
            e54Var.G();
            return new y44(bArr);
        } catch (IOException e) {
            throw new RuntimeException(f("ByteString"), e);
        }
    }

    public final byte[] b() {
        try {
            int iD = ((p54) this).d(null);
            byte[] bArr = new byte[iD];
            Logger logger = g54.t;
            e54 e54Var = new e54(iD, bArr);
            ((p54) this).v(e54Var);
            e54Var.G();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(f("byte array"), e);
        }
    }

    public final void c(OutputStream outputStream) {
        p54 p54Var = (p54) this;
        int iD = p54Var.d(null);
        Logger logger = g54.t;
        if (iD > 4096) {
            iD = 4096;
        }
        f54 f54Var = new f54(outputStream, iD);
        p54Var.v(f54Var);
        if (f54Var.x > 0) {
            f54Var.d0();
        }
    }

    public abstract int d(v64 v64Var);

    public final String f(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + str.length() + 44);
        ex0.q(sb, "Serializing ", name, " to a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }
}
