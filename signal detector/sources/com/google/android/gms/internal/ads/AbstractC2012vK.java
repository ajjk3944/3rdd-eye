package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.vK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2012vK implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17257a;

    /* renamed from: b, reason: collision with root package name */
    public int f17258b;

    /* renamed from: c, reason: collision with root package name */
    public Map.Entry f17259c;

    /* renamed from: d, reason: collision with root package name */
    public Map.Entry f17260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f17261e;

    public AbstractC2012vK(C2120xK c2120xK) {
        this.f17257a = 0;
        Objects.requireNonNull(c2120xK);
        this.f17261e = c2120xK;
        this.f17259c = c2120xK.f17581e.f17426d;
        this.f17260d = null;
        this.f17258b = c2120xK.f17580d;
    }

    public i4.n a() {
        i4.n nVar = (i4.n) this.f17259c;
        i4.o oVar = (i4.o) this.f17261e;
        if (nVar == oVar.f20624f) {
            throw new NoSuchElementException();
        }
        if (oVar.f20623e != this.f17258b) {
            throw new ConcurrentModificationException();
        }
        this.f17259c = nVar.f20614d;
        this.f17260d = nVar;
        return nVar;
    }

    public C2066wK b() {
        C2120xK c2120xK = (C2120xK) this.f17261e;
        C2066wK c2066wK = (C2066wK) this.f17259c;
        if (c2066wK == c2120xK.f17581e) {
            throw new NoSuchElementException();
        }
        if (c2120xK.f17580d != this.f17258b) {
            throw new ConcurrentModificationException();
        }
        this.f17259c = c2066wK.f17426d;
        this.f17260d = c2066wK;
        return c2066wK;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f17257a) {
            case 0:
                if (((C2066wK) this.f17259c) != ((C2120xK) this.f17261e).f17581e) {
                }
                break;
            default:
                if (((i4.n) this.f17259c) != ((i4.o) this.f17261e).f20624f) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f17257a) {
            case 0:
                return b();
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f17257a) {
            case 0:
                C2066wK c2066wK = (C2066wK) this.f17260d;
                if (c2066wK == null) {
                    throw new IllegalStateException();
                }
                C2120xK c2120xK = (C2120xK) this.f17261e;
                c2120xK.b(c2066wK, true);
                this.f17260d = null;
                this.f17258b = c2120xK.f17580d;
                return;
            default:
                i4.o oVar = (i4.o) this.f17261e;
                i4.n nVar = (i4.n) this.f17260d;
                if (nVar == null) {
                    throw new IllegalStateException();
                }
                oVar.c(nVar, true);
                this.f17260d = null;
                this.f17258b = oVar.f20623e;
                return;
        }
    }

    public AbstractC2012vK(i4.o oVar) {
        this.f17257a = 1;
        this.f17261e = oVar;
        this.f17259c = oVar.f20624f.f20614d;
        this.f17260d = null;
        this.f17258b = oVar.f20623e;
    }
}
