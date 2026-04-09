package com.yandex.mobile.ads.impl;

import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public final class vb0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f34436a;

    public /* synthetic */ vb0(SparseBooleanArray sparseBooleanArray, int i) {
        this(sparseBooleanArray);
    }

    public final int b(int i) {
        zf.a(i, this.f34436a.size());
        return this.f34436a.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb0)) {
            return false;
        }
        vb0 vb0Var = (vb0) obj;
        if (s82.f32899a >= 24) {
            return this.f34436a.equals(vb0Var.f34436a);
        }
        if (this.f34436a.size() != vb0Var.f34436a.size()) {
            return false;
        }
        for (int i = 0; i < this.f34436a.size(); i++) {
            if (b(i) != vb0Var.b(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (s82.f32899a >= 24) {
            return this.f34436a.hashCode();
        }
        int size = this.f34436a.size();
        for (int i = 0; i < this.f34436a.size(); i++) {
            size = (size * 31) + b(i);
        }
        return size;
    }

    private vb0(SparseBooleanArray sparseBooleanArray) {
        this.f34436a = sparseBooleanArray;
    }

    public final boolean a(int i) {
        return this.f34436a.get(i);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f34437a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        private boolean f34438b;

        public final a a(int i) {
            if (this.f34438b) {
                throw new IllegalStateException();
            }
            this.f34437a.append(i, true);
            return this;
        }

        public final void a(vb0 vb0Var) {
            for (int i = 0; i < vb0Var.f34436a.size(); i++) {
                a(vb0Var.b(i));
            }
        }

        public final vb0 a() {
            if (!this.f34438b) {
                this.f34438b = true;
                return new vb0(this.f34437a, 0);
            }
            throw new IllegalStateException();
        }
    }

    public final int a() {
        return this.f34436a.size();
    }
}
