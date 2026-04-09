package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mr0 {
    public m81 a;
    public ArrayList b;

    public static long a(jo joVar, long j) {
        m81 m81Var = joVar.d;
        ArrayList arrayList = joVar.k;
        if (m81Var instanceof r00) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            ho hoVar = (ho) arrayList.get(i);
            if (hoVar instanceof jo) {
                jo joVar2 = (jo) hoVar;
                if (joVar2.d != m81Var) {
                    jMin = Math.min(jMin, a(joVar2, joVar2.f + j));
                }
            }
        }
        jo joVar3 = m81Var.i;
        jo joVar4 = m81Var.h;
        if (joVar != joVar3) {
            return jMin;
        }
        long j2 = j - m81Var.j();
        return Math.min(Math.min(jMin, a(joVar4, j2)), j2 - joVar4.f);
    }

    public static long b(jo joVar, long j) {
        m81 m81Var = joVar.d;
        ArrayList arrayList = joVar.k;
        if (m81Var instanceof r00) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            ho hoVar = (ho) arrayList.get(i);
            if (hoVar instanceof jo) {
                jo joVar2 = (jo) hoVar;
                if (joVar2.d != m81Var) {
                    jMax = Math.max(jMax, b(joVar2, joVar2.f + j));
                }
            }
        }
        jo joVar3 = m81Var.h;
        jo joVar4 = m81Var.i;
        if (joVar != joVar3) {
            return jMax;
        }
        long j2 = m81Var.j() + j;
        return Math.max(Math.max(jMax, b(joVar4, j2)), j2 - joVar4.f);
    }
}
