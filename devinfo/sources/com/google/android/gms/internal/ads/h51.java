package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h51 extends h61 {

    /* renamed from: b, reason: collision with root package name */
    public Object f11712b;

    /* renamed from: c, reason: collision with root package name */
    public int f11713c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11714d;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f11715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11716f;

    public h51() {
        super(0);
        this.f11713c = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        d31 d31Var;
        Object next;
        Set set;
        mq0.c0(this.f11713c != 4);
        int i4 = this.f11713c;
        int i10 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        if (i10 == 0) {
            return true;
        }
        if (i10 != 2) {
            this.f11713c = 4;
            switch (this.f11714d) {
                case 0:
                    do {
                        Iterator it = this.f11715e;
                        if (!it.hasNext()) {
                            this.f11713c = 3;
                            next = null;
                            break;
                        } else {
                            d31Var = (d31) this.f11716f;
                            next = it.next();
                        }
                    } while (!d31Var.c(next));
                default:
                    do {
                        Iterator it2 = this.f11715e;
                        if (!it2.hasNext()) {
                            this.f11713c = 3;
                            next = null;
                            break;
                        } else {
                            set = (Set) this.f11716f;
                            next = it2.next();
                        }
                    } while (!set.contains(next));
            }
            this.f11712b = next;
            if (this.f11713c != 3) {
                this.f11713c = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.h61, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f11713c = 2;
        Object obj = this.f11712b;
        this.f11712b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h51(c61 c61Var, Set set, Set set2) {
        this();
        this.f11714d = 1;
        this.f11716f = set2;
        this.f11715e = set.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h51(Iterator it, d31 d31Var) {
        this();
        this.f11714d = 0;
        this.f11715e = it;
        this.f11716f = d31Var;
    }
}
