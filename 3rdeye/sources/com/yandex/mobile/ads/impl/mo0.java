package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class mo0 {

    /* renamed from: a, reason: collision with root package name */
    private int f30468a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f30469b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f30470c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int[] f30471d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    private int f30472e = 15;

    public final void a(int i) {
        int i10 = this.f30470c;
        int[] iArr = this.f30471d;
        if (i10 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i11 = this.f30468a;
            int i12 = length2 - i11;
            System.arraycopy(iArr, i11, iArr2, 0, i12);
            System.arraycopy(this.f30471d, 0, iArr2, i12, i11);
            this.f30468a = 0;
            this.f30469b = this.f30470c - 1;
            this.f30471d = iArr2;
            this.f30472e = length - 1;
        }
        int i13 = (this.f30469b + 1) & this.f30472e;
        this.f30469b = i13;
        this.f30471d[i13] = i;
        this.f30470c++;
    }

    public final boolean b() {
        return this.f30470c == 0;
    }

    public final int c() {
        int i = this.f30470c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f30471d;
        int i10 = this.f30468a;
        int i11 = iArr[i10];
        this.f30468a = (i10 + 1) & this.f30472e;
        this.f30470c = i - 1;
        return i11;
    }

    public final void a() {
        this.f30468a = 0;
        this.f30469b = -1;
        this.f30470c = 0;
    }
}
