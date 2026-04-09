package x5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p5.l;

/* loaded from: classes3.dex */
public final class e implements Iterator, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f24195a;

    /* renamed from: b, reason: collision with root package name */
    public int f24196b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f24197c;

    public e(f fVar) {
        this.f24197c = fVar;
    }

    public final void a() {
        Object objF;
        int i = this.f24196b;
        f fVar = this.f24197c;
        if (i == -2) {
            objF = ((p5.a) fVar.f24199b).b();
        } else {
            l lVar = (l) fVar.f24200c;
            Object obj = this.f24195a;
            q5.i.b(obj);
            objF = lVar.f(obj);
        }
        this.f24195a = objF;
        this.f24196b = objF == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f24196b < 0) {
            a();
        }
        return this.f24196b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f24196b < 0) {
            a();
        }
        if (this.f24196b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f24195a;
        q5.i.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f24196b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
