package androidx.compose.ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC6484j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public interface y {

    public static final class a implements Collection, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final Set f29094a;

        public a(Set set) {
            this.f29094a = set;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.f29094a.add(obj);
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f29094a.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.f29094a.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f29094a.containsAll(collection);
        }

        public int e() {
            return this.f29094a.size();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f29094a.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f29094a.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f29094a.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            return this.f29094a.remove(collection);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            return this.f29094a.retainAll(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC6484j.a(this);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC6484j.b(this, objArr);
        }

        public /* synthetic */ a(Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
