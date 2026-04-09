package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class jm {

    /* renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f29204e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f29205a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f29206b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f29207c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f29208d = 4096;

    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public final synchronized byte[] a(int i) {
        for (int i10 = 0; i10 < this.f29206b.size(); i10++) {
            byte[] bArr = (byte[]) this.f29206b.get(i10);
            if (bArr.length >= i) {
                this.f29207c -= bArr.length;
                this.f29206b.remove(i10);
                this.f29205a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f29208d) {
                this.f29205a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f29206b, bArr, f29204e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f29206b.add(iBinarySearch, bArr);
                this.f29207c += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f29207c > this.f29208d) {
            byte[] bArr = (byte[]) this.f29205a.remove(0);
            this.f29206b.remove(bArr);
            this.f29207c -= bArr.length;
        }
    }
}
