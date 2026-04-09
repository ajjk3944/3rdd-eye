package V;

import Yg.J;
import dh.InterfaceC5380e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.AbstractC6484j;
import mh.InterfaceC6839p;
import nh.InterfaceC6944a;
import o.T;
import zi.AbstractC8782l;
import zi.AbstractC8783m;

/* loaded from: classes.dex */
public final class d implements Set, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final T f22947a;

    static final class a extends k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        Object f22948b;

        /* renamed from: c, reason: collision with root package name */
        Object f22949c;

        /* renamed from: d, reason: collision with root package name */
        int f22950d;

        /* renamed from: e, reason: collision with root package name */
        int f22951e;

        /* renamed from: f, reason: collision with root package name */
        int f22952f;

        /* renamed from: g, reason: collision with root package name */
        int f22953g;

        /* renamed from: h, reason: collision with root package name */
        long f22954h;

        /* renamed from: i, reason: collision with root package name */
        int f22955i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f22956j;

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = d.this.new a(interfaceC5380e);
            aVar.f22956j = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:23:0x009d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:20:0x0094). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:20:0x0094). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f22955i
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L33
                if (r2 != r5) goto L2b
                int r2 = r0.f22953g
                int r6 = r0.f22952f
                long r7 = r0.f22954h
                int r9 = r0.f22951e
                int r10 = r0.f22950d
                java.lang.Object r11 = r0.f22949c
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f22948b
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f22956j
                zi.l r13 = (zi.AbstractC8782l) r13
                Yg.v.b(r21)
                goto L94
            L2b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L33:
                Yg.v.b(r21)
                java.lang.Object r2 = r0.f22956j
                zi.l r2 = (zi.AbstractC8782l) r2
                V.d r6 = V.d.this
                o.T r6 = r6.b()
                java.lang.Object[] r7 = r6.f54929b
                long[] r6 = r6.f54928a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto La2
                r9 = r3
            L4a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L9d
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6b:
                if (r2 >= r6) goto L97
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L94
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f22956j = r13
                r0.f22948b = r12
                r0.f22949c = r11
                r0.f22950d = r10
                r0.f22951e = r9
                r0.f22954h = r7
                r0.f22952f = r6
                r0.f22953g = r2
                r0.f22955i = r5
                java.lang.Object r14 = r13.d(r14, r0)
                if (r14 != r1) goto L94
                return r1
            L94:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L6b
            L97:
                if (r6 != r4) goto La2
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L9d:
                if (r9 == r8) goto La2
                int r9 = r9 + 1
                goto L4a
            La2:
                Yg.J r1 = Yg.J.f24997a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: V.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC8782l abstractC8782l, InterfaceC5380e interfaceC5380e) {
            return ((a) create(abstractC8782l, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public d(T t10) {
        this.f22947a = t10;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final T b() {
        return this.f22947a;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f22947a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f22947a.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.f22947a.c();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f22947a.d();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC8783m.a(new a(null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC6484j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC6484j.b(this, objArr);
    }
}
