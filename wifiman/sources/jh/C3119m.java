package Jh;

import Bh.InterfaceC2492b;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Jh.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3119m {

    /* renamed from: a, reason: collision with root package name */
    public static final C3119m f10196a = new C3119m();

    private C3119m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(InterfaceC2492b it) {
        AbstractC6492s.i(it, "it");
        return f10196a.d(it);
    }

    private final boolean e(InterfaceC2492b interfaceC2492b) {
        if (AbstractC3689v.f0(C3116j.f10189a.c(), AbstractC5833e.k(interfaceC2492b)) && interfaceC2492b.i().isEmpty()) {
            return true;
        }
        if (!kotlin.reflect.jvm.internal.impl.builtins.i.g0(interfaceC2492b)) {
            return false;
        }
        Collection collectionF = interfaceC2492b.f();
        AbstractC6492s.h(collectionF, "getOverriddenDescriptors(...)");
        Collection<InterfaceC2492b> collection = collectionF;
        if (!collection.isEmpty()) {
            for (InterfaceC2492b interfaceC2492b2 : collection) {
                C3119m c3119m = f10196a;
                AbstractC6492s.f(interfaceC2492b2);
                if (c3119m.d(interfaceC2492b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String b(InterfaceC2492b interfaceC2492b) {
        Zh.f fVar;
        AbstractC6492s.i(interfaceC2492b, "<this>");
        kotlin.reflect.jvm.internal.impl.builtins.i.g0(interfaceC2492b);
        InterfaceC2492b interfaceC2492bI = AbstractC5833e.i(AbstractC5833e.w(interfaceC2492b), false, C3118l.f10195a, 1, null);
        if (interfaceC2492bI == null || (fVar = (Zh.f) C3116j.f10189a.a().get(AbstractC5833e.o(interfaceC2492bI))) == null) {
            return null;
        }
        return fVar.b();
    }

    public final boolean d(InterfaceC2492b callableMemberDescriptor) {
        AbstractC6492s.i(callableMemberDescriptor, "callableMemberDescriptor");
        if (C3116j.f10189a.d().contains(callableMemberDescriptor.getName())) {
            return e(callableMemberDescriptor);
        }
        return false;
    }
}
