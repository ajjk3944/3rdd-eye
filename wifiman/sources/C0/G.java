package C0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface G {
    D b(androidx.compose.ui.layout.m mVar, List list, long j10);

    default int c(InterfaceC2535o interfaceC2535o, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C2530j((InterfaceC2534n) list2.get(i12), EnumC2536p.Max, EnumC2537q.Height));
            }
            arrayList.add(arrayList2);
        }
        return b(new androidx.compose.ui.layout.e(interfaceC2535o, interfaceC2535o.getLayoutDirection()), arrayList, Y0.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int e(InterfaceC2535o interfaceC2535o, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C2530j((InterfaceC2534n) list2.get(i12), EnumC2536p.Max, EnumC2537q.Width));
            }
            arrayList.add(arrayList2);
        }
        return b(new androidx.compose.ui.layout.e(interfaceC2535o, interfaceC2535o.getLayoutDirection()), arrayList, Y0.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    default int f(InterfaceC2535o interfaceC2535o, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C2530j((InterfaceC2534n) list2.get(i12), EnumC2536p.Min, EnumC2537q.Width));
            }
            arrayList.add(arrayList2);
        }
        return b(new androidx.compose.ui.layout.e(interfaceC2535o, interfaceC2535o.getLayoutDirection()), arrayList, Y0.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    default int i(InterfaceC2535o interfaceC2535o, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C2530j((InterfaceC2534n) list2.get(i12), EnumC2536p.Min, EnumC2537q.Height));
            }
            arrayList.add(arrayList2);
        }
        return b(new androidx.compose.ui.layout.e(interfaceC2535o, interfaceC2535o.getLayoutDirection()), arrayList, Y0.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }
}
