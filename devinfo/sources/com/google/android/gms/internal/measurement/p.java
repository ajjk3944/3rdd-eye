package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19860a;

    /* renamed from: b, reason: collision with root package name */
    public int f19861b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19862c;

    public /* synthetic */ p(int i4, Object obj) {
        this.f19860a = i4;
        this.f19862c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f19860a) {
            case 0:
                if (this.f19861b < ((q) this.f19862c).f19867a.length()) {
                }
                break;
            case 1:
                if (this.f19861b < ((q) this.f19862c).f19867a.length()) {
                }
                break;
            default:
                if (this.f19861b < ((d) this.f19862c).m()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f19860a) {
            case 0:
                String str = ((q) this.f19862c).f19867a;
                int i4 = this.f19861b;
                if (i4 >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.f19861b = i4 + 1;
                return new q(String.valueOf(i4));
            case 1:
                q qVar = (q) this.f19862c;
                String str2 = qVar.f19867a;
                int i10 = this.f19861b;
                if (i10 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.f19861b = i10 + 1;
                return new q(String.valueOf(qVar.f19867a.charAt(i10)));
            default:
                d dVar = (d) this.f19862c;
                if (this.f19861b >= dVar.m()) {
                    int i11 = this.f19861b;
                    throw new NoSuchElementException(d.h.q(i11, "Out of bounds index: ", new StringBuilder(String.valueOf(i11).length() + 21)));
                }
                int i12 = this.f19861b;
                this.f19861b = i12 + 1;
                return dVar.o(i12);
        }
    }
}
