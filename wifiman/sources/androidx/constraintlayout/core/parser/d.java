package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* loaded from: classes.dex */
public class d extends androidx.constraintlayout.core.parser.a implements Iterable {

    private static class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        d f30038a;

        /* renamed from: b, reason: collision with root package name */
        int f30039b = 0;

        a(d dVar) {
            this.f30038a = dVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c next() {
            c cVar = (c) this.f30038a.f30031f.get(this.f30039b);
            this.f30039b++;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30039b < this.f30038a.size();
        }
    }

    public d(char[] cArr) {
        super(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.a
    /* renamed from: g0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d b() {
        return (d) super.b();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }
}
