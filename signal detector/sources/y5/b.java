package y5;

import c5.C0407d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class b implements Iterator, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public int f24253a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f24254b;

    /* renamed from: c, reason: collision with root package name */
    public int f24255c;

    /* renamed from: d, reason: collision with root package name */
    public v5.c f24256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x5.f f24257e;

    public b(x5.f fVar) {
        this.f24257e = fVar;
        int length = ((CharSequence) fVar.f24199b).length();
        if (length < 0) {
            throw new IllegalArgumentException(A.f.h(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f24254b = length;
        this.f24255c = length;
    }

    public final void a() {
        C0407d c0407d;
        x5.f fVar = this.f24257e;
        CharSequence charSequence = (CharSequence) fVar.f24199b;
        int i = this.f24255c;
        if (i < 0) {
            this.f24253a = 0;
            this.f24256d = null;
            return;
        }
        if (i <= charSequence.length() && (c0407d = (C0407d) ((k) fVar.f24200c).h(charSequence, Integer.valueOf(this.f24255c))) != null) {
            int iIntValue = ((Number) c0407d.f5921a).intValue();
            int iIntValue2 = ((Number) c0407d.f5922b).intValue();
            this.f24256d = I5.b.y(this.f24254b, iIntValue);
            int i3 = iIntValue + iIntValue2;
            this.f24254b = i3;
            this.f24255c = i3 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f24256d = new v5.c(this.f24254b, l.Y(charSequence), 1);
            this.f24255c = -1;
        }
        this.f24253a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f24253a == -1) {
            a();
        }
        return this.f24253a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f24253a == -1) {
            a();
        }
        if (this.f24253a == 0) {
            throw new NoSuchElementException();
        }
        v5.c cVar = this.f24256d;
        q5.i.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f24256d = null;
        this.f24253a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
