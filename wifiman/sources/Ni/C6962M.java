package ni;

import Bh.InterfaceC2498h;
import Wh.h;
import Zg.AbstractC3689v;
import Zg.d0;
import ii.C6157d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import li.C6636n;
import li.C6638p;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* renamed from: ni.M, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6962M extends AbstractC6991w {

    /* renamed from: g, reason: collision with root package name */
    private final Bh.M f54709g;

    /* renamed from: h, reason: collision with root package name */
    private final String f54710h;

    /* renamed from: i, reason: collision with root package name */
    private final Zh.c f54711i;

    public C6962M(Bh.M packageDescriptor, Uh.l proto, Wh.c nameResolver, Wh.a metadataVersion, InterfaceC6987s interfaceC6987s, C6636n components, String debugName, InterfaceC6824a classNames) {
        AbstractC6492s.i(packageDescriptor, "packageDescriptor");
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(metadataVersion, "metadataVersion");
        AbstractC6492s.i(components, "components");
        AbstractC6492s.i(debugName, "debugName");
        AbstractC6492s.i(classNames, "classNames");
        Uh.t tVarF1 = proto.f1();
        AbstractC6492s.h(tVarF1, "getTypeTable(...)");
        Wh.g gVar = new Wh.g(tVarF1);
        h.a aVar = Wh.h.f23970b;
        Uh.w wVarG1 = proto.g1();
        AbstractC6492s.h(wVarG1, "getVersionRequirementTable(...)");
        C6638p c6638pA = components.a(packageDescriptor, nameResolver, gVar, aVar.a(wVarG1), metadataVersion, interfaceC6987s);
        List listY0 = proto.Y0();
        AbstractC6492s.h(listY0, "getFunctionList(...)");
        List listB1 = proto.b1();
        AbstractC6492s.h(listB1, "getPropertyList(...)");
        List listE1 = proto.e1();
        AbstractC6492s.h(listE1, "getTypeAliasList(...)");
        super(c6638pA, listY0, listB1, listE1, classNames);
        this.f54709g = packageDescriptor;
        this.f54710h = debugName;
        this.f54711i = packageDescriptor.e();
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6167n
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public List e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        Collection collectionM = m(kindFilter, nameFilter, Ih.d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable iterableL = s().c().l();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            AbstractC3689v.C(arrayList, ((Ch.b) it.next()).c(this.f54711i));
        }
        return AbstractC3689v.M0(collectionM, arrayList);
    }

    public void C(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        Hh.a.b(s().c().p(), location, this.f54709g, name);
    }

    @Override // ni.AbstractC6991w, ii.AbstractC6165l, ii.InterfaceC6167n
    public InterfaceC2498h g(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        C(name, location);
        return super.g(name, location);
    }

    @Override // ni.AbstractC6991w
    protected void j(Collection result, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(nameFilter, "nameFilter");
    }

    @Override // ni.AbstractC6991w
    protected Zh.b p(Zh.f name) {
        AbstractC6492s.i(name, "name");
        return new Zh.b(this.f54711i, name);
    }

    public String toString() {
        return this.f54710h;
    }

    @Override // ni.AbstractC6991w
    protected Set v() {
        return d0.e();
    }

    @Override // ni.AbstractC6991w
    protected Set w() {
        return d0.e();
    }

    @Override // ni.AbstractC6991w
    protected Set x() {
        return d0.e();
    }

    @Override // ni.AbstractC6991w
    protected boolean z(Zh.f name) {
        AbstractC6492s.i(name, "name");
        if (!super.z(name)) {
            Iterable iterableL = s().c().l();
            if (!(iterableL instanceof Collection) || !((Collection) iterableL).isEmpty()) {
                Iterator it = iterableL.iterator();
                while (it.hasNext()) {
                    if (((Ch.b) it.next()).a(this.f54711i, name)) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
