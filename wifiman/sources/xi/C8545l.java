package xi;

import Zg.AbstractC3678j;
import Zg.AbstractC3682n;
import Zg.d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import nh.InterfaceC6944a;

/* renamed from: xi.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8545l extends AbstractC3678j {

    /* renamed from: c, reason: collision with root package name */
    public static final b f66170c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private Object f66171a;

    /* renamed from: b, reason: collision with root package name */
    private int f66172b;

    /* renamed from: xi.l$a */
    private static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f66173a;

        public a(Object[] array) {
            AbstractC6492s.i(array, "array");
            this.f66173a = AbstractC6477c.a(array);
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66173a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f66173a.next();
        }
    }

    /* renamed from: xi.l$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8545l a() {
            return new C8545l(null);
        }

        public final C8545l b(Collection set) {
            AbstractC6492s.i(set, "set");
            C8545l c8545l = new C8545l(null);
            c8545l.addAll(set);
            return c8545l;
        }

        private b() {
        }
    }

    /* renamed from: xi.l$c */
    private static final class c implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f66174a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f66175b = true;

        public c(Object obj) {
            this.f66174a = obj;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66175b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f66175b) {
                throw new NoSuchElementException();
            }
            this.f66175b = false;
            return this.f66174a;
        }
    }

    public /* synthetic */ C8545l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final C8545l j() {
        return f66170c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object[] objArr;
        if (size() == 0) {
            this.f66171a = obj;
        } else if (size() == 1) {
            if (AbstractC6492s.d(this.f66171a, obj)) {
                return false;
            }
            this.f66171a = new Object[]{this.f66171a, obj};
        } else if (size() < 5) {
            Object obj2 = this.f66171a;
            AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj2;
            if (AbstractC3682n.U(objArr2, obj)) {
                return false;
            }
            if (size() == 4) {
                ?? G10 = d0.g(Arrays.copyOf(objArr2, objArr2.length));
                G10.add(obj);
                objArr = G10;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, size() + 1);
                AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                objArr = objArrCopyOf;
            }
            this.f66171a = objArr;
        } else {
            Object obj3 = this.f66171a;
            AbstractC6492s.g(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!V.e(obj3).add(obj)) {
                return false;
            }
        }
        s(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f66171a = null;
        s(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return AbstractC6492s.d(this.f66171a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f66171a;
            AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return AbstractC3682n.U((Object[]) obj2, obj);
        }
        Object obj3 = this.f66171a;
        AbstractC6492s.g(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // Zg.AbstractC3678j
    public int g() {
        return this.f66172b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new c(this.f66171a);
        }
        if (size() < 5) {
            Object obj = this.f66171a;
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f66171a;
        AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return V.e(obj2).iterator();
    }

    public void s(int i10) {
        this.f66172b = i10;
    }

    private C8545l() {
    }
}
