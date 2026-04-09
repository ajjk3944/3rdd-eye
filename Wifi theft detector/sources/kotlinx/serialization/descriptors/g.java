package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class g {

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public int f22778a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f22779b;

        public a(f fVar) {
            this.f22779b = fVar;
            this.f22778a = fVar.d();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f22779b;
            int iD = fVar.d();
            int i10 = this.f22778a;
            this.f22778a = i10 - 1;
            return fVar.g(iD - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22778a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public int f22780a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f22781b;

        public b(f fVar) {
            this.f22781b = fVar;
            this.f22780a = fVar.d();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f22781b;
            int iD = fVar.d();
            int i10 = this.f22780a;
            this.f22780a = i10 - 1;
            return fVar.e(iD - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22780a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f22782a;

        public c(f fVar) {
            this.f22782a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f22782a);
        }
    }

    public static final class d implements Iterable, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f22783a;

        public d(f fVar) {
            this.f22783a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f22783a);
        }
    }

    public static final Iterable a(f fVar) {
        p.e(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        p.e(fVar, "<this>");
        return new d(fVar);
    }
}
