package Xi;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public abstract class j {

    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private int f24462a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f24463b;

        a(f fVar) {
            this.f24463b = fVar;
            this.f24462a = fVar.e();
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f24463b;
            int iE = fVar.e();
            int i10 = this.f24462a;
            this.f24462a = i10 - 1;
            return fVar.i(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24462a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private int f24464a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f24465b;

        b(f fVar) {
            this.f24465b = fVar;
            this.f24464a = fVar.e();
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f24465b;
            int iE = fVar.e();
            int i10 = this.f24464a;
            this.f24464a = i10 - 1;
            return fVar.f(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24464a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f24466a;

        public c(f fVar) {
            this.f24466a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f24466a);
        }
    }

    public static final class d implements Iterable, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f24467a;

        public d(f fVar) {
            this.f24467a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f24467a);
        }
    }

    public static final Iterable a(f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        return new d(fVar);
    }
}
