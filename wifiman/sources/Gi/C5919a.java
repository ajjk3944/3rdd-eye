package gi;

import Bh.InterfaceC2495e;
import Dh.K;
import Mh.k;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: gi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5919a implements f {

    /* renamed from: b, reason: collision with root package name */
    private final List f47921b;

    public C5919a(List inner) {
        AbstractC6492s.i(inner, "inner");
        this.f47921b = inner;
    }

    @Override // gi.f
    public void a(InterfaceC2495e thisDescriptor, List result, k c10) {
        AbstractC6492s.i(thisDescriptor, "thisDescriptor");
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(c10, "c");
        Iterator it = this.f47921b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(thisDescriptor, result, c10);
        }
    }

    @Override // gi.f
    public void b(InterfaceC2495e thisDescriptor, Zh.f name, List result, k c10) {
        AbstractC6492s.i(thisDescriptor, "thisDescriptor");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(c10, "c");
        Iterator it = this.f47921b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).b(thisDescriptor, name, result, c10);
        }
    }

    @Override // gi.f
    public List c(InterfaceC2495e thisDescriptor, k c10) {
        AbstractC6492s.i(thisDescriptor, "thisDescriptor");
        AbstractC6492s.i(c10, "c");
        List list = this.f47921b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3689v.C(arrayList, ((f) it.next()).c(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // gi.f
    public K d(InterfaceC2495e thisDescriptor, K propertyDescriptor, k c10) {
        AbstractC6492s.i(thisDescriptor, "thisDescriptor");
        AbstractC6492s.i(propertyDescriptor, "propertyDescriptor");
        AbstractC6492s.i(c10, "c");
        Iterator it = this.f47921b.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((f) it.next()).d(thisDescriptor, propertyDescriptor, c10);
        }
        return propertyDescriptor;
    }

    @Override // gi.f
    public List e(InterfaceC2495e thisDescriptor, k c10) {
        AbstractC6492s.i(thisDescriptor, "thisDescriptor");
        AbstractC6492s.i(c10, "c");
        List list = this.f47921b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3689v.C(arrayList, ((f) it.next()).e(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // gi.f
    public void f(InterfaceC2495e thisDescriptor, Zh.f name, Collection result, k c10) {
        AbstractC6492s.i(thisDescriptor, "thisDescriptor");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(c10, "c");
        Iterator it = this.f47921b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).f(thisDescriptor, name, result, c10);
        }
    }

    @Override // gi.f
    public List g(InterfaceC2495e thisDescriptor, k c10) {
        AbstractC6492s.i(thisDescriptor, "thisDescriptor");
        AbstractC6492s.i(c10, "c");
        List list = this.f47921b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3689v.C(arrayList, ((f) it.next()).g(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // gi.f
    public void h(InterfaceC2495e thisDescriptor, Zh.f name, Collection result, k c10) {
        AbstractC6492s.i(thisDescriptor, "thisDescriptor");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(c10, "c");
        Iterator it = this.f47921b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).h(thisDescriptor, name, result, c10);
        }
    }
}
