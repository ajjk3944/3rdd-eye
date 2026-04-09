package z7;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f38061a;

    public n(ArrayList arrayList) {
        this.f38061a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f38061a.iterator();
    }
}
