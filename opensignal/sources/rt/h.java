package rt;

import br.b0;
import br.l;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import m1.d0;

/* loaded from: classes.dex */
public final class h extends AbstractSet {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f21795g = 0;

    /* renamed from: a, reason: collision with root package name */
    public Object f21796a;

    /* renamed from: d, reason: collision with root package name */
    public int f21797d;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (br.b0.b(r0).add(r7) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.AbstractCollection, java.util.Collection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean add(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f21797d
            r1 = 1
            if (r0 != 0) goto L9
            r6.f21796a = r7
            goto L7c
        L9:
            r2 = 0
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r6.f21796a
            boolean r0 = br.l.a(r0, r7)
            if (r0 == 0) goto L15
            goto L7b
        L15:
            java.lang.Object r0 = r6.f21796a
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r7}
            r6.f21796a = r7
            goto L7c
        L1e:
            r3 = 5
            if (r0 >= r3) goto L6a
            java.lang.Object r0 = r6.f21796a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            br.l.c(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = mq.l.Z(r7, r0)
            if (r3 == 0) goto L31
            goto L7b
        L31:
            int r3 = r6.f21797d
            r4 = 4
            if (r3 != r4) goto L59
            int r3 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r3 = "elements"
            br.l.e(r0, r3)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            int r4 = r0.length
            int r4 = mq.b0.P(r4)
            r3.<init>(r4)
            int r4 = r0.length
        L4b:
            if (r2 >= r4) goto L55
            r5 = r0[r2]
            r3.add(r5)
            int r2 = r2 + 1
            goto L4b
        L55:
            r3.add(r7)
            goto L67
        L59:
            int r3 = r3 + r1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "copyOf(this, newSize)"
            br.l.d(r3, r0)
            int r0 = r3.length
            int r0 = r0 - r1
            r3[r0] = r7
        L67:
            r6.f21796a = r3
            goto L7c
        L6a:
            java.lang.Object r0 = r6.f21796a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            br.l.c(r0, r3)
            java.util.Set r0 = br.b0.b(r0)
            boolean r7 = r0.add(r7)
            if (r7 != 0) goto L7c
        L7b:
            return r2
        L7c:
            int r7 = r6.f21797d
            int r7 = r7 + r1
            r6.f21797d = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.h.add(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f21796a = null;
        this.f21797d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f21797d;
        if (i10 == 0) {
            return false;
        }
        if (i10 == 1) {
            return l.a(this.f21796a, obj);
        }
        if (i10 < 5) {
            Object obj2 = this.f21796a;
            l.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return mq.l.Z(obj, (Object[]) obj2);
        }
        Object obj3 = this.f21796a;
        l.c(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = this.f21797d;
        if (i10 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i10 == 1) {
            return new g(0, this.f21796a);
        }
        if (i10 < 5) {
            Object obj = this.f21796a;
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new d0((Object[]) obj);
        }
        Object obj2 = this.f21796a;
        l.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return b0.b(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21797d;
    }
}
