package d5;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class x extends AbstractC2276d {

    /* renamed from: a, reason: collision with root package name */
    public final List f19829a;

    public x(List list) {
        this.f19829a = list;
    }

    @Override // d5.AbstractC2276d
    public final int a() {
        return this.f19829a.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= AbstractC2283k.L(this)) {
            return this.f19829a.get(AbstractC2283k.L(this) - i);
        }
        StringBuilder sbP = AbstractC1135f5.p(i, "Element index ", " must be in range [");
        sbP.append(new v5.c(0, AbstractC2283k.L(this), 1));
        sbP.append("].");
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    @Override // d5.AbstractC2276d, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new w(this, 0);
    }

    @Override // d5.AbstractC2276d, java.util.List
    public final ListIterator listIterator() {
        return new w(this, 0);
    }

    @Override // d5.AbstractC2276d, java.util.List
    public final ListIterator listIterator(int i) {
        return new w(this, i);
    }
}
