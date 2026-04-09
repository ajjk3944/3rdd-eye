package Di;

import Ci.f;
import Zg.AbstractC3682n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class j extends b implements Ci.c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3588c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final j f3589d = new j(new Object[0]);

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f3590b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            return j.f3589d;
        }

        private a() {
        }
    }

    public j(Object[] buffer) {
        AbstractC6492s.i(buffer, "buffer");
        this.f3590b = buffer;
        Hi.a.a(buffer.length <= 32);
    }

    @Override // Di.b, java.util.Collection, java.util.List, Ci.f
    public Ci.f addAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        if (elements.isEmpty()) {
            return this;
        }
        if (size() + elements.size() > 32) {
            f.a aVarC = c();
            aVarC.addAll(elements);
            return aVarC.a();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f3590b, size() + elements.size());
        AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
        int size = size();
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new j(objArrCopyOf);
    }

    @Override // Ci.f
    public f.a c() {
        return new f(this, null, this.f3590b, 0);
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public Object get(int i10) {
        Hi.d.a(i10, size());
        return this.f3590b[i10];
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public int indexOf(Object obj) {
        return AbstractC3682n.m0(this.f3590b, obj);
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f3590b.length;
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public int lastIndexOf(Object obj) {
        return AbstractC3682n.M0(this.f3590b, obj);
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public ListIterator listIterator(int i10) {
        Hi.d.b(i10, size());
        return new c(this.f3590b, i10, size());
    }
}
