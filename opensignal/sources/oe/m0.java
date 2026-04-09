package oe;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m0 extends h1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19353a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19354d;

    public m0(Object obj) {
        this.f19354d = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f19353a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f19353a) {
            throw new NoSuchElementException();
        }
        this.f19353a = true;
        return this.f19354d;
    }
}
