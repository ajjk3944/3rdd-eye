package W;

import java.util.Collection;
import java.util.List;
import mh.InterfaceC6835l;
import nh.InterfaceC6945b;
import nh.InterfaceC6947d;

/* loaded from: classes.dex */
public interface e extends c, b {

    public interface a extends List, Collection, InterfaceC6945b, InterfaceC6947d {
        e a();
    }

    e T0(InterfaceC6835l interfaceC6835l);

    @Override // java.util.List
    e add(int i10, Object obj);

    @Override // java.util.List, java.util.Collection
    e add(Object obj);

    @Override // java.util.List, java.util.Collection
    e addAll(Collection collection);

    a c();

    e f0(int i10);

    @Override // java.util.List, java.util.Collection
    e remove(Object obj);

    @Override // java.util.List, java.util.Collection
    e removeAll(Collection collection);

    @Override // java.util.List
    e set(int i10, Object obj);
}
