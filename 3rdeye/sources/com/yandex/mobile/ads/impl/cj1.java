package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class cj1 extends AbstractC4089d {

    /* renamed from: f, reason: collision with root package name */
    private final int f25671f;

    /* renamed from: g, reason: collision with root package name */
    private final int f25672g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f25673h;
    private final int[] i;

    /* renamed from: j, reason: collision with root package name */
    private final v42[] f25674j;

    /* renamed from: k, reason: collision with root package name */
    private final Object[] f25675k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<Object, Integer> f25676l;

    public cj1(List list, xx1 xx1Var) {
        super(xx1Var);
        int size = list.size();
        this.f25673h = new int[size];
        this.i = new int[size];
        this.f25674j = new v42[size];
        this.f25675k = new Object[size];
        this.f25676l = new HashMap<>();
        Iterator it = list.iterator();
        int iB = 0;
        int iA = 0;
        int i = 0;
        while (it.hasNext()) {
            lw0 lw0Var = (lw0) it.next();
            this.f25674j[i] = lw0Var.b();
            this.i[i] = iB;
            this.f25673h[i] = iA;
            iB += this.f25674j[i].b();
            iA += this.f25674j[i].a();
            this.f25675k[i] = lw0Var.a();
            this.f25676l.put(this.f25675k[i], Integer.valueOf(i));
            i++;
        }
        this.f25671f = iB;
        this.f25672g = iA;
    }

    @Override // com.yandex.mobile.ads.impl.v42
    public final int a() {
        return this.f25672g;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4089d
    public final int b(Object obj) {
        Integer num = this.f25676l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4089d
    public final int c(int i) {
        return s82.a(this.i, i + 1, false, false);
    }

    public final List<v42> d() {
        return Arrays.asList(this.f25674j);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4089d
    public final int e(int i) {
        return this.f25673h[i];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4089d
    public final int f(int i) {
        return this.i[i];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4089d
    public final v42 g(int i) {
        return this.f25674j[i];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4089d
    public final Object d(int i) {
        return this.f25675k[i];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4089d
    public final int b(int i) {
        return s82.a(this.f25673h, i + 1, false, false);
    }

    @Override // com.yandex.mobile.ads.impl.v42
    public final int b() {
        return this.f25671f;
    }
}
