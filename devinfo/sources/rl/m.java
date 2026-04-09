package rl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements Iterable, ok.a {

    /* renamed from: b, reason: collision with root package name */
    public static final m f33111b = new m(new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String[] f33112a;

    public m(String[] strArr) {
        nk.k.e(strArr, "namesAndValues");
        this.f33112a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.f33112a;
        nk.k.e(strArr, "namesAndValues");
        int length = strArr.length - 2;
        int iE = com.bumptech.glide.e.E(length, 0, -2);
        if (iE > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iE) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String c(int i4) {
        String str = (String) zj.m.a0(this.f33112a, i4 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i4 + ']');
    }

    public final km.y d() {
        km.y yVar = new km.y(17);
        zj.n.X((ArrayList) yVar.f28522b, this.f33112a);
        return yVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return Arrays.equals(this.f33112a, ((m) obj).f33112a);
        }
        return false;
    }

    public final String f(int i4) {
        String str = (String) zj.m.a0(this.f33112a, (i4 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i4 + ']');
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f33112a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        yj.i[] iVarArr = new yj.i[size];
        for (int i4 = 0; i4 < size; i4++) {
            iVarArr[i4] = new yj.i(c(i4), f(i4));
        }
        return nk.k.i(iVarArr);
    }

    public final int size() {
        return this.f33112a.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            String strC = c(i4);
            String strF = f(i4);
            sb2.append(strC);
            sb2.append(": ");
            if (sl.f.j(strC)) {
                strF = "██";
            }
            sb2.append(strF);
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
