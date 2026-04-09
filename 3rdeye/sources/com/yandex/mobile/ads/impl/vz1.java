package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class vz1 {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<a> f34748h = new S2(2);
    private static final Comparator<a> i = new P2(3);

    /* renamed from: a, reason: collision with root package name */
    private final int f34749a;

    /* renamed from: e, reason: collision with root package name */
    private int f34753e;

    /* renamed from: f, reason: collision with root package name */
    private int f34754f;

    /* renamed from: g, reason: collision with root package name */
    private int f34755g;

    /* renamed from: c, reason: collision with root package name */
    private final a[] f34751c = new a[5];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f34750b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private int f34752d = -1;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f34756a;

        /* renamed from: b, reason: collision with root package name */
        public int f34757b;

        /* renamed from: c, reason: collision with root package name */
        public float f34758c;

        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
        }
    }

    public vz1(int i10) {
        this.f34749a = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(a aVar, a aVar2) {
        return Float.compare(aVar.f34758c, aVar2.f34758c);
    }

    public final void a(int i10, float f10) {
        a aVar;
        if (this.f34752d != 1) {
            Collections.sort(this.f34750b, f34748h);
            this.f34752d = 1;
        }
        int i11 = this.f34755g;
        int i12 = 0;
        if (i11 > 0) {
            a[] aVarArr = this.f34751c;
            int i13 = i11 - 1;
            this.f34755g = i13;
            aVar = aVarArr[i13];
        } else {
            aVar = new a(i12);
        }
        int i14 = this.f34753e;
        this.f34753e = i14 + 1;
        aVar.f34756a = i14;
        aVar.f34757b = i10;
        aVar.f34758c = f10;
        this.f34750b.add(aVar);
        this.f34754f += i10;
        while (true) {
            int i15 = this.f34754f;
            int i16 = this.f34749a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            a aVar2 = this.f34750b.get(0);
            int i18 = aVar2.f34757b;
            if (i18 <= i17) {
                this.f34754f -= i18;
                this.f34750b.remove(0);
                int i19 = this.f34755g;
                if (i19 < 5) {
                    a[] aVarArr2 = this.f34751c;
                    this.f34755g = i19 + 1;
                    aVarArr2[i19] = aVar2;
                }
            } else {
                aVar2.f34757b = i18 - i17;
                this.f34754f -= i17;
            }
        }
    }

    public final void b() {
        this.f34750b.clear();
        this.f34752d = -1;
        this.f34753e = 0;
        this.f34754f = 0;
    }

    public final float a() {
        if (this.f34752d != 0) {
            Collections.sort(this.f34750b, i);
            this.f34752d = 0;
        }
        float f10 = 0.5f * this.f34754f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f34750b.size(); i11++) {
            a aVar = this.f34750b.get(i11);
            i10 += aVar.f34757b;
            if (i10 >= f10) {
                return aVar.f34758c;
            }
        }
        if (this.f34750b.isEmpty()) {
            return Float.NaN;
        }
        return this.f34750b.get(r0.size() - 1).f34758c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(a aVar, a aVar2) {
        return aVar.f34756a - aVar2.f34756a;
    }
}
