package com.yandex.mobile.ads.impl;

import android.util.SparseArray;

/* loaded from: classes3.dex */
final class d12<V> {

    /* renamed from: c, reason: collision with root package name */
    private final sr<V> f25928c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f25927b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    private int f25926a = -1;

    public d12(sr<V> srVar) {
        this.f25928c = srVar;
    }

    public final void a(int i, V v10) {
        if (this.f25926a == -1) {
            if (this.f25927b.size() != 0) {
                throw new IllegalStateException();
            }
            this.f25926a = 0;
        }
        if (this.f25927b.size() > 0) {
            int iKeyAt = this.f25927b.keyAt(r0.size() - 1);
            if (i < iKeyAt) {
                throw new IllegalArgumentException();
            }
            if (iKeyAt == i) {
                this.f25928c.accept(this.f25927b.valueAt(r1.size() - 1));
            }
        }
        this.f25927b.append(i, v10);
    }

    public final V b(int i) {
        if (this.f25926a == -1) {
            this.f25926a = 0;
        }
        while (true) {
            int i10 = this.f25926a;
            if (i10 <= 0 || i >= this.f25927b.keyAt(i10)) {
                break;
            }
            this.f25926a--;
        }
        while (this.f25926a < this.f25927b.size() - 1 && i >= this.f25927b.keyAt(this.f25926a + 1)) {
            this.f25926a++;
        }
        return this.f25927b.valueAt(this.f25926a);
    }

    public final boolean c() {
        return this.f25927b.size() == 0;
    }

    public final V b() {
        return this.f25927b.valueAt(r0.size() - 1);
    }

    public final void a() {
        for (int i = 0; i < this.f25927b.size(); i++) {
            this.f25928c.accept(this.f25927b.valueAt(i));
        }
        this.f25926a = -1;
        this.f25927b.clear();
    }

    public final void a(int i) {
        int i10 = 0;
        while (i10 < this.f25927b.size() - 1) {
            int i11 = i10 + 1;
            if (i < this.f25927b.keyAt(i11)) {
                return;
            }
            this.f25928c.accept(this.f25927b.valueAt(i10));
            this.f25927b.removeAt(i10);
            int i12 = this.f25926a;
            if (i12 > 0) {
                this.f25926a = i12 - 1;
            }
            i10 = i11;
        }
    }
}
