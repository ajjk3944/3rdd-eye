package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.kN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1422kN implements Iterator, Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final X4 f15134g = new X4("eof ", 1);

    /* renamed from: a, reason: collision with root package name */
    public S4 f15135a;

    /* renamed from: b, reason: collision with root package name */
    public C1756qg f15136b;

    /* renamed from: c, reason: collision with root package name */
    public U4 f15137c = null;

    /* renamed from: d, reason: collision with root package name */
    public long f15138d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f15139e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f15140f = new ArrayList();

    static {
        C1476lN.t(AbstractC1422kN.class);
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final U4 next() {
        U4 u4A;
        U4 u42 = this.f15137c;
        if (u42 != null && u42 != f15134g) {
            this.f15137c = null;
            return u42;
        }
        C1756qg c1756qg = this.f15136b;
        if (c1756qg == null || this.f15138d >= this.f15139e) {
            this.f15137c = f15134g;
            throw new NoSuchElementException();
        }
        try {
            synchronized (c1756qg) {
                this.f15136b.f16390a.position((int) this.f15138d);
                u4A = ((R4) this.f15135a).a(this.f15136b, this);
                this.f15138d = this.f15136b.b();
            }
            return u4A;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        U4 u42 = this.f15137c;
        X4 x42 = f15134g;
        if (u42 == x42) {
            return false;
        }
        if (u42 != null) {
            return true;
        }
        try {
            this.f15137c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f15137c = x42;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f15140f;
            if (i >= arrayList.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((U4) arrayList.get(i)).toString());
            i++;
        }
    }
}
