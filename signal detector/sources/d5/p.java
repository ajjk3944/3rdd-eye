package d5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class p extends o {
    public static void R(Iterable iterable, AbstractCollection abstractCollection) {
        q5.i.e(abstractCollection, "<this>");
        q5.i.e(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}
