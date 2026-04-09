package L0;

import L0.C3174d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: L0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3183m {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            C3174d.c cVar = (C3174d.c) obj;
            if (AbstractC3175e.n(i10, i11, cVar.h(), cVar.f())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C3174d.c cVar2 = (C3174d.c) arrayList.get(i13);
            if (i10 > cVar2.h() || cVar2.f() > i11) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new C3174d.c(cVar2.g(), cVar2.h() - i10, cVar2.f() - i10));
        }
        return arrayList2;
    }
}
