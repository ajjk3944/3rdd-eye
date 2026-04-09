package c9;

import java.util.AbstractSet;
import java.util.Set;
import q9.InterfaceC5500b;

/* compiled from: AbstractMutableSet.kt */
/* renamed from: c9.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2085f<E> extends AbstractSet<E> implements Set<E>, InterfaceC5500b {
    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}
