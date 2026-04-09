package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.qB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1734qB extends C1304iB implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1787rB f16329e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734qB(C1787rB c1787rB) {
        super(c1787rB);
        this.f16329e = c1787rB;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C1787rB c1787rB = this.f16329e;
        boolean zIsEmpty = c1787rB.isEmpty();
        a();
        ((ListIterator) this.f14677b).add(obj);
        c1787rB.f16484f.f13541e++;
        if (zIsEmpty) {
            c1787rB.c();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f14677b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f14677b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f14677b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f14677b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f14677b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734qB(C1787rB c1787rB, int i) {
        super(c1787rB, ((List) c1787rB.f16480b).listIterator(i));
        this.f16329e = c1787rB;
    }
}
