package Ci;

import java.util.Collection;
import java.util.Set;
import nh.InterfaceC6945b;
import nh.InterfaceC6949f;

/* loaded from: classes4.dex */
public interface h extends e, b {

    public interface a extends Set, Collection, InterfaceC6945b, InterfaceC6949f {
        h a();
    }

    @Override // java.util.Set, java.util.Collection
    h addAll(Collection collection);

    a c();
}
