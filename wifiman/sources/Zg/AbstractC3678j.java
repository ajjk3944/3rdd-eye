package Zg;

import java.util.AbstractSet;
import java.util.Set;
import nh.InterfaceC6949f;

/* renamed from: Zg.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3678j extends AbstractSet implements Set, InterfaceC6949f {
    protected AbstractC3678j() {
    }

    public abstract int g();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return g();
    }
}
