package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class im1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12380a;

    /* renamed from: b, reason: collision with root package name */
    public int f12381b;

    /* renamed from: c, reason: collision with root package name */
    public Map.Entry f12382c;

    /* renamed from: d, reason: collision with root package name */
    public Map.Entry f12383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f12384e;

    public im1(km1 km1Var) {
        this.f12380a = 0;
        Objects.requireNonNull(km1Var);
        this.f12384e = km1Var;
        this.f12382c = km1Var.f13205e.f12791d;
        this.f12383d = null;
        this.f12381b = km1Var.f13204d;
    }

    public com.google.gson.internal.l a() {
        com.google.gson.internal.l lVar = (com.google.gson.internal.l) this.f12382c;
        com.google.gson.internal.m mVar = (com.google.gson.internal.m) this.f12384e;
        if (lVar == mVar.f20862f) {
            throw new NoSuchElementException();
        }
        if (mVar.f20861e != this.f12381b) {
            throw new ConcurrentModificationException();
        }
        this.f12382c = lVar.f20851d;
        this.f12383d = lVar;
        return lVar;
    }

    public jm1 b() {
        km1 km1Var = (km1) this.f12384e;
        jm1 jm1Var = (jm1) this.f12382c;
        if (jm1Var == km1Var.f13205e) {
            throw new NoSuchElementException();
        }
        if (km1Var.f13204d != this.f12381b) {
            throw new ConcurrentModificationException();
        }
        this.f12382c = jm1Var.f12791d;
        this.f12383d = jm1Var;
        return jm1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12380a) {
            case 0:
                if (((jm1) this.f12382c) != ((km1) this.f12384e).f13205e) {
                }
                break;
            default:
                if (((com.google.gson.internal.l) this.f12382c) != ((com.google.gson.internal.m) this.f12384e).f20862f) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f12380a) {
            case 0:
                return b();
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12380a) {
            case 0:
                jm1 jm1Var = (jm1) this.f12383d;
                if (jm1Var == null) {
                    throw new IllegalStateException();
                }
                km1 km1Var = (km1) this.f12384e;
                km1Var.b(jm1Var, true);
                this.f12383d = null;
                this.f12381b = km1Var.f13204d;
                return;
            default:
                com.google.gson.internal.m mVar = (com.google.gson.internal.m) this.f12384e;
                com.google.gson.internal.l lVar = (com.google.gson.internal.l) this.f12383d;
                if (lVar == null) {
                    throw new IllegalStateException();
                }
                mVar.c(lVar, true);
                this.f12383d = null;
                this.f12381b = mVar.f20861e;
                return;
        }
    }

    public im1(com.google.gson.internal.m mVar) {
        this.f12380a = 1;
        this.f12384e = mVar;
        this.f12382c = mVar.f20862f.f20851d;
        this.f12383d = null;
        this.f12381b = mVar.f20861e;
    }
}
