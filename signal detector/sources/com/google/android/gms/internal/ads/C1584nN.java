package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.nN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1584nN extends AbstractList {

    /* renamed from: c, reason: collision with root package name */
    public static final C1476lN f15768c = C1476lN.t(C1584nN.class);

    /* renamed from: a, reason: collision with root package name */
    public final List f15769a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1422kN f15770b;

    public C1584nN(ArrayList arrayList, AbstractC1422kN abstractC1422kN) {
        this.f15769a = arrayList;
        this.f15770b = abstractC1422kN;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f15769a;
        if (list.size() > i) {
            return list.get(i);
        }
        AbstractC1422kN abstractC1422kN = this.f15770b;
        if (!abstractC1422kN.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(abstractC1422kN.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1530mN(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        C1476lN c1476lN = f15768c;
        c1476lN.h("potentially expensive size() call");
        c1476lN.h("blowup running");
        while (true) {
            AbstractC1422kN abstractC1422kN = this.f15770b;
            boolean zHasNext = abstractC1422kN.hasNext();
            List list = this.f15769a;
            if (!zHasNext) {
                return list.size();
            }
            list.add(abstractC1422kN.next());
        }
    }
}
