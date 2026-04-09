package Zg;

import java.util.AbstractList;
import java.util.List;
import nh.InterfaceC6947d;

/* renamed from: Zg.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3676h extends AbstractList implements List, InterfaceC6947d {
    protected AbstractC3676h() {
    }

    public abstract int g();

    public abstract Object j(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return j(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return g();
    }
}
