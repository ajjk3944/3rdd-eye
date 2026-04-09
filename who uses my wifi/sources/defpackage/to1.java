package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class to1 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public to1(String str, ao1 ao1Var) {
        String str2 = ao1Var.b;
        long j = ao1Var.c;
        long j2 = ao1Var.d;
        long j3 = ao1Var.e;
        long j4 = ao1Var.f;
        List arrayList = ao1Var.h;
        if (arrayList == 0) {
            Map map = ao1Var.g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new do1((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static to1 a(uo1 uo1Var) throws IOException {
        if (wo1.g(uo1Var) != 538247942) {
            throw new IOException();
        }
        String strK = wo1.k(uo1Var);
        String strK2 = wo1.k(uo1Var);
        long jI = wo1.i(uo1Var);
        long jI2 = wo1.i(uo1Var);
        long jI3 = wo1.i(uo1Var);
        long jI4 = wo1.i(uo1Var);
        int iG = wo1.g(uo1Var);
        if (iG < 0) {
            throw new IOException(ex0.j(new StringBuilder(String.valueOf(iG).length() + 20), "readHeaderList size=", iG));
        }
        List arrayList = iG == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iG; i++) {
            arrayList.add(new do1(wo1.k(uo1Var).intern(), wo1.k(uo1Var).intern()));
        }
        return new to1(strK, strK2, jI, jI2, jI3, jI4, arrayList);
    }

    public to1(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }
}
