package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class p implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5154a;

    /* renamed from: d, reason: collision with root package name */
    public int f5155d = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5156g;

    public /* synthetic */ p(int i10, Object obj) {
        this.f5154a = i10;
        this.f5156g = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5154a) {
            case 0:
                if (this.f5155d < ((q) this.f5156g).f5166a.length()) {
                }
                break;
            case 1:
                if (this.f5155d < ((q) this.f5156g).f5166a.length()) {
                }
                break;
            default:
                if (this.f5155d < ((d) this.f5156g).p()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f5154a) {
            case 0:
                String str = ((q) this.f5156g).f5166a;
                int i10 = this.f5155d;
                if (i10 >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.f5155d = i10 + 1;
                return new q(String.valueOf(i10));
            case 1:
                q qVar = (q) this.f5156g;
                String str2 = qVar.f5166a;
                int i11 = this.f5155d;
                if (i11 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.f5155d = i11 + 1;
                return new q(String.valueOf(qVar.f5166a.charAt(i11)));
            default:
                d dVar = (d) this.f5156g;
                if (this.f5155d >= dVar.p()) {
                    int i12 = this.f5155d;
                    throw new NoSuchElementException(c7.a.l(i12, "Out of bounds index: ", new StringBuilder(String.valueOf(i12).length() + 21)));
                }
                int i13 = this.f5155d;
                this.f5155d = i13 + 1;
                return dVar.r(i13);
        }
    }
}
