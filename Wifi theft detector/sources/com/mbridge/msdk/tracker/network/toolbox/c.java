package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f18376e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<byte[]> f18377a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f18378b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f18379c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f18380d;

    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i10) {
        this.f18380d = i10;
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f18378b.size(); i11++) {
            byte[] bArr = this.f18378b.get(i11);
            if (bArr.length >= i10) {
                this.f18379c -= bArr.length;
                this.f18378b.remove(i11);
                this.f18377a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f18380d) {
                this.f18377a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f18378b, bArr, f18376e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f18378b.add(iBinarySearch, bArr);
                this.f18379c += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f18379c > this.f18380d) {
            byte[] bArrRemove = this.f18377a.remove(0);
            this.f18378b.remove(bArrRemove);
            this.f18379c -= bArrRemove.length;
        }
    }
}
