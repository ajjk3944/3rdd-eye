package Mh;

import Bh.InterfaceC2497g;
import Bh.InterfaceC2503m;
import Jh.E;
import Qh.z;
import Yg.q;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class c {
    private static final k c(k kVar, InterfaceC2503m interfaceC2503m, z zVar, int i10, Yg.m mVar) {
        return new k(kVar.a(), zVar != null ? new m(kVar, interfaceC2503m, zVar, i10) : kVar.f(), mVar);
    }

    public static final k d(k kVar, p typeParameterResolver) {
        AbstractC6492s.i(kVar, "<this>");
        AbstractC6492s.i(typeParameterResolver, "typeParameterResolver");
        return new k(kVar.a(), typeParameterResolver, kVar.c());
    }

    public static final k e(k kVar, InterfaceC2497g containingDeclaration, z zVar, int i10) {
        AbstractC6492s.i(kVar, "<this>");
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        return c(kVar, containingDeclaration, zVar, i10, Yg.n.a(q.NONE, new a(kVar, containingDeclaration)));
    }

    public static /* synthetic */ k f(k kVar, InterfaceC2497g interfaceC2497g, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            zVar = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(kVar, interfaceC2497g, zVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E g(k kVar, InterfaceC2497g interfaceC2497g) {
        return j(kVar, interfaceC2497g.getAnnotations());
    }

    public static final k h(k kVar, InterfaceC2503m containingDeclaration, z typeParameterOwner, int i10) {
        AbstractC6492s.i(kVar, "<this>");
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        AbstractC6492s.i(typeParameterOwner, "typeParameterOwner");
        return c(kVar, containingDeclaration, typeParameterOwner, i10, kVar.c());
    }

    public static /* synthetic */ k i(k kVar, InterfaceC2503m interfaceC2503m, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return h(kVar, interfaceC2503m, zVar, i10);
    }

    public static final E j(k kVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h additionalAnnotations) {
        AbstractC6492s.i(kVar, "<this>");
        AbstractC6492s.i(additionalAnnotations, "additionalAnnotations");
        return kVar.a().a().d(kVar.b(), additionalAnnotations);
    }

    public static final k k(k kVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h additionalAnnotations) {
        AbstractC6492s.i(kVar, "<this>");
        AbstractC6492s.i(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? kVar : new k(kVar.a(), kVar.f(), Yg.n.a(q.NONE, new b(kVar, additionalAnnotations)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E l(k kVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar) {
        return j(kVar, hVar);
    }

    public static final k m(k kVar, d components) {
        AbstractC6492s.i(kVar, "<this>");
        AbstractC6492s.i(components, "components");
        return new k(components, kVar.f(), kVar.c());
    }
}
