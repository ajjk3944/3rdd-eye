package Zg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: Zg.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3692y extends AbstractC3691x {
    public static int w(Iterable iterable, int i10) {
        AbstractC6492s.i(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static final Integer x(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static List y(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC3689v.C(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
