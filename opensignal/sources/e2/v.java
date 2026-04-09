package e2;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator[] f7767a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f7768b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            comparatorArr[i10] = new u(1, new u(i10 == 0 ? d.f7680g : d.f7679d));
            i10++;
        }
        f7767a = comparatorArr;
        f7768b = o.O;
    }

    public static final void a(k kVar, ArrayList arrayList, j1.a aVar, j1.a aVar2, u.t tVar) {
        SemanticsConfiguration semanticsConfiguration = kVar.f7717d;
        Object objG = semanticsConfiguration.f1191a.g(p.f7742l);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) aVar2.a(kVar)).booleanValue()) && ((Boolean) aVar.a(kVar)).booleanValue()) {
            arrayList.add(kVar);
        }
        if (zBooleanValue) {
            tVar.h(kVar.f7720g, b(kVar, aVar, aVar2, k.j(7, kVar)));
            return;
        }
        List listJ = k.j(7, kVar);
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((k) listJ.get(i10), arrayList, aVar, aVar2, tVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce A[EDGE_INSN: B:57:0x00ce->B:32:0x00ce BREAK  A[LOOP:2: B:21:0x0066->B:31:0x00cb]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5 A[LOOP:1: B:12:0x0044->B:38:0x00f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9 A[EDGE_INSN: B:55:0x00f9->B:39:0x00f9 BREAK  A[LOOP:1: B:12:0x0044->B:38:0x00f5], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList b(e2.k r17, j1.a r18, j1.a r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.v.b(e2.k, j1.a, j1.a, java.util.List):java.util.ArrayList");
    }
}
