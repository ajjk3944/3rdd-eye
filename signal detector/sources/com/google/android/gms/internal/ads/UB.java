package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class UB extends AbstractC1896tC {

    /* renamed from: b, reason: collision with root package name */
    public Object f11618b;

    /* renamed from: c, reason: collision with root package name */
    public int f11619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11620d;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f11621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11622f;

    public UB() {
        super(0);
        this.f11619c = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        RA ra;
        Object next;
        Set set;
        AbstractC0582Jp.h0(this.f11619c != 4);
        int i = this.f11619c;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.f11619c = 4;
            switch (this.f11620d) {
                case 0:
                    do {
                        Iterator it = this.f11621e;
                        if (!it.hasNext()) {
                            this.f11619c = 3;
                            next = null;
                            break;
                        } else {
                            ra = (RA) this.f11622f;
                            next = it.next();
                        }
                    } while (!ra.b(next));
                default:
                    do {
                        Iterator it2 = this.f11621e;
                        if (!it2.hasNext()) {
                            this.f11619c = 3;
                            next = null;
                            break;
                        } else {
                            set = (Set) this.f11622f;
                            next = it2.next();
                        }
                    } while (!set.contains(next));
            }
            this.f11618b = next;
            if (this.f11619c != 3) {
                this.f11619c = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1896tC, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f11619c = 2;
        Object obj = this.f11618b;
        this.f11618b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UB(C1627oC c1627oC, Set set, Set set2) {
        this();
        this.f11620d = 1;
        this.f11622f = set2;
        this.f11621e = set.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UB(Iterator it, RA ra) {
        this();
        this.f11620d = 0;
        this.f11621e = it;
        this.f11622f = ra;
    }
}
