package ah;

import Zg.AbstractC3678j;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6949f;

/* renamed from: ah.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3858h extends AbstractC3678j implements Set, Serializable, InterfaceC6949f {

    /* renamed from: b, reason: collision with root package name */
    private static final a f26314b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final C3858h f26315c = new C3858h(C3854d.f26289n.e());

    /* renamed from: a, reason: collision with root package name */
    private final C3854d f26316a;

    /* renamed from: ah.h$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3858h(C3854d backing) {
        AbstractC6492s.i(backing, "backing");
        this.f26316a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f26316a.t(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        this.f26316a.B();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f26316a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f26316a.containsKey(obj);
    }

    @Override // Zg.AbstractC3678j
    public int g() {
        return this.f26316a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f26316a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f26316a.U0();
    }

    public final Set j() {
        this.f26316a.y();
        return size() > 0 ? this : f26315c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f26316a.d1(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        this.f26316a.B();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        this.f26316a.B();
        return super.retainAll(elements);
    }

    public C3858h() {
        this(new C3854d());
    }
}
