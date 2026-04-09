package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class xr1 implements Iterator, Closeable {
    public static final db g = new db("eof ", 1);

    /* renamed from: a, reason: collision with root package name */
    public ya f18450a;

    /* renamed from: b, reason: collision with root package name */
    public iy f18451b;

    /* renamed from: c, reason: collision with root package name */
    public ab f18452c = null;

    /* renamed from: d, reason: collision with root package name */
    public long f18453d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f18454e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f18455f = new ArrayList();

    static {
        yr1.s(xr1.class);
    }

    @Override // java.util.Iterator
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ab next() {
        ab abVarA;
        ab abVar = this.f18452c;
        if (abVar != null && abVar != g) {
            this.f18452c = null;
            return abVar;
        }
        iy iyVar = this.f18451b;
        if (iyVar == null || this.f18453d >= this.f18454e) {
            this.f18452c = g;
            throw new NoSuchElementException();
        }
        try {
            synchronized (iyVar) {
                this.f18451b.f12537a.position((int) this.f18453d);
                abVarA = ((xa) this.f18450a).a(this.f18451b, this);
                this.f18453d = this.f18451b.e();
            }
            return abVarA;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ab abVar = this.f18452c;
        db dbVar = g;
        if (abVar == dbVar) {
            return false;
        }
        if (abVar != null) {
            return true;
        }
        try {
            this.f18452c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f18452c = dbVar;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f18455f;
            if (i4 >= arrayList.size()) {
                sb2.append("]");
                return sb2.toString();
            }
            if (i4 > 0) {
                sb2.append(";");
            }
            sb2.append(((ab) arrayList.get(i4)).toString());
            i4++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
