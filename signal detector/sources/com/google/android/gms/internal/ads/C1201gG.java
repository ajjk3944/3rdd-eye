package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.gG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1201gG implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14245a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14246b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14247c;

    public /* synthetic */ C1201gG(Iterator it, Iterator it2) {
        this.f14246b = it;
        this.f14247c = it2;
    }

    public NK a() {
        NK nk;
        ArrayDeque arrayDeque = (ArrayDeque) this.f14246b;
        NK nk2 = (NK) this.f14247c;
        if (nk2 == null) {
            throw new NoSuchElementException();
        }
        do {
            nk = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            QK qk = ((IL) arrayDeque.pop()).f9090e;
            while (qk instanceof IL) {
                IL il = (IL) qk;
                arrayDeque.push(il);
                qk = il.f9089d;
            }
            nk = (NK) qk;
        } while (nk.f() == 0);
        this.f14247c = nk;
        return nk2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14245a) {
            case 0:
                return ((Iterator) this.f14246b).hasNext() || ((Iterator) this.f14247c).hasNext();
            default:
                return ((NK) this.f14247c) != null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14245a) {
            case 0:
                Iterator it = (Iterator) this.f14246b;
                return it.hasNext() ? it.next() : ((Iterator) this.f14247c).next();
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public C1201gG(QK qk) {
        if (!(qk instanceof IL)) {
            this.f14246b = null;
            this.f14247c = (NK) qk;
            return;
        }
        IL il = (IL) qk;
        ArrayDeque arrayDeque = new ArrayDeque(il.f9092g);
        this.f14246b = arrayDeque;
        arrayDeque.push(il);
        QK qk2 = il.f9089d;
        while (qk2 instanceof IL) {
            IL il2 = (IL) qk2;
            ((ArrayDeque) this.f14246b).push(il2);
            qk2 = il2.f9089d;
        }
        this.f14247c = (NK) qk2;
    }
}
