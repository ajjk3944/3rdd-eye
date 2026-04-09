package n1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22256a;

    public o(ArrayList arrayList) {
        this.f22256a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f22256a.iterator();
    }
}
