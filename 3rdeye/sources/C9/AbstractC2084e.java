package c9;

import java.util.AbstractList;
import java.util.List;
import q9.InterfaceC5501c;

/* compiled from: AbstractMutableList.kt */
/* renamed from: c9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2084e<E> extends AbstractList<E> implements List<E>, InterfaceC5501c {
    public abstract int c();

    public abstract E d(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return d(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return c();
    }
}
