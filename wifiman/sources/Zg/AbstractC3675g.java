package Zg;

import java.util.AbstractCollection;
import java.util.Collection;
import nh.InterfaceC6945b;

/* renamed from: Zg.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3675g extends AbstractCollection implements Collection, InterfaceC6945b {
    protected AbstractC3675g() {
    }

    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }
}
