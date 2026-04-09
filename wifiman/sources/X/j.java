package X;

import W.e;
import Zg.AbstractC3682n;
import a0.AbstractC3748a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class j extends b implements W.c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f23998c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f23999d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final j f24000e = new j(new Object[0]);

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f24001b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            return j.f24000e;
        }

        private a() {
        }
    }

    public j(Object[] objArr) {
        this.f24001b = objArr;
        AbstractC3748a.a(objArr.length <= 32);
    }

    private final Object[] y(int i10) {
        return new Object[i10];
    }

    @Override // W.e
    public W.e T0(InterfaceC6835l interfaceC6835l) {
        Object[] objArrCopyOf = this.f24001b;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.f24001b[i10];
            if (((Boolean) interfaceC6835l.invoke(obj)).booleanValue()) {
                if (!z10) {
                    Object[] objArr = this.f24001b;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    AbstractC6492s.h(objArrCopyOf, "copyOf(this, size)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f24000e : new j(AbstractC3682n.s(objArrCopyOf, 0, size));
    }

    @Override // java.util.Collection, java.util.List, W.e
    public W.e add(Object obj) {
        if (size() >= 32) {
            return new e(this.f24001b, l.c(obj), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f24001b, size() + 1);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size()] = obj;
        return new j(objArrCopyOf);
    }

    @Override // X.b, java.util.Collection, java.util.List, W.e
    public W.e addAll(Collection collection) {
        if (size() + collection.size() > 32) {
            e.a aVarC = c();
            aVarC.addAll(collection);
            return aVarC.a();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f24001b, size() + collection.size());
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new j(objArrCopyOf);
    }

    @Override // W.e
    public e.a c() {
        return new f(this, null, this.f24001b, 0);
    }

    @Override // W.e
    public W.e f0(int i10) {
        a0.d.a(i10, size());
        if (size() == 1) {
            return f24000e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f24001b, size() - 1);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
        AbstractC3682n.m(this.f24001b, objArrCopyOf, i10, i10 + 1, size());
        return new j(objArrCopyOf);
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public Object get(int i10) {
        a0.d.a(i10, size());
        return this.f24001b[i10];
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public int indexOf(Object obj) {
        return AbstractC3682n.m0(this.f24001b, obj);
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f24001b.length;
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public int lastIndexOf(Object obj) {
        return AbstractC3682n.M0(this.f24001b, obj);
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public ListIterator listIterator(int i10) {
        a0.d.b(i10, size());
        return new c(this.f24001b, i10, size());
    }

    @Override // Zg.AbstractC3672d, java.util.List, W.e
    public W.e set(int i10, Object obj) {
        a0.d.a(i10, size());
        Object[] objArr = this.f24001b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = obj;
        return new j(objArrCopyOf);
    }

    @Override // java.util.List, W.e
    public W.e add(int i10, Object obj) {
        a0.d.b(i10, size());
        if (i10 == size()) {
            return add(obj);
        }
        if (size() < 32) {
            Object[] objArrY = y(size() + 1);
            AbstractC3682n.q(this.f24001b, objArrY, 0, 0, i10, 6, null);
            AbstractC3682n.m(this.f24001b, objArrY, i10 + 1, i10, size());
            objArrY[i10] = obj;
            return new j(objArrY);
        }
        Object[] objArr = this.f24001b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, size)");
        AbstractC3682n.m(this.f24001b, objArrCopyOf, i10 + 1, i10, size() - 1);
        objArrCopyOf[i10] = obj;
        return new e(objArrCopyOf, l.c(this.f24001b[31]), size() + 1, 0);
    }
}
