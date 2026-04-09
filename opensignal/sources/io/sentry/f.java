package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f12245a;

    /* renamed from: d, reason: collision with root package name */
    public int f12246d = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12247g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f12248r;

    public f(g gVar) {
        this.f12248r = gVar;
        this.f12245a = gVar.f12256d;
        this.f12247g = gVar.f12258r;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12247g || this.f12245a != this.f12248r.f12257g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12247g = false;
        int i10 = this.f12245a;
        this.f12246d = i10;
        int i11 = i10 + 1;
        g gVar = this.f12248r;
        this.f12245a = i11 < gVar.f12259x ? i11 : 0;
        return gVar.f12255a[i10];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        g gVar = this.f12248r;
        int i11 = gVar.f12259x;
        Object[] objArr = gVar.f12255a;
        int i12 = this.f12246d;
        if (i12 == -1) {
            throw new IllegalStateException();
        }
        int i13 = gVar.f12256d;
        if (i12 == i13) {
            gVar.remove();
            this.f12246d = -1;
            return;
        }
        int i14 = i12 + 1;
        if (i13 >= i12 || i14 >= (i10 = gVar.f12257g)) {
            while (i14 != gVar.f12257g) {
                if (i14 >= i11) {
                    objArr[i14 - 1] = objArr[0];
                } else {
                    int i15 = i14 - 1;
                    if (i15 < 0) {
                        i15 = i11 - 1;
                    }
                    objArr[i15] = objArr[i14];
                    i14++;
                    if (i14 >= i11) {
                    }
                }
                i14 = 0;
            }
        } else {
            System.arraycopy(objArr, i14, objArr, i12, i10 - i14);
        }
        this.f12246d = -1;
        int i16 = gVar.f12257g - 1;
        if (i16 < 0) {
            i16 = i11 - 1;
        }
        gVar.f12257g = i16;
        objArr[i16] = null;
        gVar.f12258r = false;
        int i17 = this.f12245a - 1;
        if (i17 < 0) {
            i17 = i11 - 1;
        }
        this.f12245a = i17;
    }
}
