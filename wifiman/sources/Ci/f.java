package Ci;

import Ci.c;
import java.util.Collection;
import java.util.List;
import nh.InterfaceC6945b;
import nh.InterfaceC6947d;

/* loaded from: classes4.dex */
public interface f extends c, Ci.b {

    public interface a extends List, Collection, InterfaceC6945b, InterfaceC6947d {
        f a();
    }

    public static final class b {
        public static c a(f fVar, int i10, int i11) {
            return c.a.a(fVar, i10, i11);
        }
    }

    @Override // java.util.List, java.util.Collection
    f addAll(Collection collection);

    a c();
}
