package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a44 extends b44 implements Iterable {
    public final ArrayList f = new ArrayList();

    @Override // defpackage.b44
    public final String a() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        if (size == 1) {
            return ((b44) arrayList.get(0)).a();
        }
        throw new IllegalStateException(ex0.j(new StringBuilder(String.valueOf(size).length() + 37), "Array must have size 1, but has size ", size));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof a44) && ((a44) obj).f.equals(this.f);
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f.iterator();
    }
}
