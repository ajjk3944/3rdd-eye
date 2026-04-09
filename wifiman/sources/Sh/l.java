package Sh;

import Bh.L;
import Bh.j0;
import Ih.c;
import Jh.C3110d;
import Jh.D;
import Jh.InterfaceC3126u;
import Jh.InterfaceC3127v;
import Kh.i;
import Mh.e;
import Rh.C3479g;
import Rh.e0;
import Zg.AbstractC3689v;
import hi.C6048b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import li.InterfaceC6635m;
import li.InterfaceC6637o;
import li.InterfaceC6645w;
import pi.C7376x;
import qi.C7511a;

/* loaded from: classes4.dex */
public abstract class l {

    public static final class a implements Jh.A {
        a() {
        }

        @Override // Jh.A
        public List a(Zh.b classId) {
            AbstractC6492s.i(classId, "classId");
            return null;
        }
    }

    public static final k a(Bh.G module, oi.n storageManager, L notFoundClasses, Mh.j lazyJavaPackageFragmentProvider, v reflectKotlinClassFinder, n deserializedDescriptorResolver, InterfaceC6645w errorReporter, Yh.e jvmMetadataVersion) {
        AbstractC6492s.i(module, "module");
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(notFoundClasses, "notFoundClasses");
        AbstractC6492s.i(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        AbstractC6492s.i(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        AbstractC6492s.i(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC6492s.i(errorReporter, "errorReporter");
        AbstractC6492s.i(jvmMetadataVersion, "jvmMetadataVersion");
        return new k(storageManager, module, InterfaceC6637o.a.f52738a, new o(reflectKotlinClassFinder, deserializedDescriptorResolver), AbstractC3509i.a(module, notFoundClasses, storageManager, reflectKotlinClassFinder, jvmMetadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, c.a.f9229a, InterfaceC6635m.f52714a.a(), kotlin.reflect.jvm.internal.impl.types.checker.p.f52164b.a(), new C7511a(AbstractC3689v.e(C7376x.f58188a)));
    }

    public static final Mh.j b(InterfaceC3126u javaClassFinder, Bh.G module, oi.n storageManager, L notFoundClasses, v reflectKotlinClassFinder, n deserializedDescriptorResolver, InterfaceC6645w errorReporter, Ph.b javaSourceElementFactory, Mh.n singleModuleClassResolver, D packagePartProvider) {
        AbstractC6492s.i(javaClassFinder, "javaClassFinder");
        AbstractC6492s.i(module, "module");
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(notFoundClasses, "notFoundClasses");
        AbstractC6492s.i(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        AbstractC6492s.i(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC6492s.i(errorReporter, "errorReporter");
        AbstractC6492s.i(javaSourceElementFactory, "javaSourceElementFactory");
        AbstractC6492s.i(singleModuleClassResolver, "singleModuleClassResolver");
        AbstractC6492s.i(packagePartProvider, "packagePartProvider");
        Kh.o DO_NOTHING = Kh.o.f10812a;
        AbstractC6492s.h(DO_NOTHING, "DO_NOTHING");
        Kh.j EMPTY = Kh.j.f10805a;
        AbstractC6492s.h(EMPTY, "EMPTY");
        i.a aVar = i.a.f10804a;
        C6048b c6048b = new C6048b(storageManager, AbstractC3689v.l());
        j0.a aVar2 = j0.a.f1787a;
        c.a aVar3 = c.a.f9229a;
        kotlin.reflect.jvm.internal.impl.builtins.n nVar = new kotlin.reflect.jvm.internal.impl.builtins.n(module, notFoundClasses);
        D.b bVar = Jh.D.f10084d;
        C3110d c3110d = new C3110d(bVar.a());
        e.a aVar4 = e.a.f13202a;
        return new Mh.j(new Mh.d(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, aVar, c6048b, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, aVar2, aVar3, module, nVar, c3110d, new e0(new C3479g(aVar4)), InterfaceC3127v.a.f10206a, aVar4, kotlin.reflect.jvm.internal.impl.types.checker.p.f52164b.a(), bVar.a(), new a(), null, 8388608, null));
    }
}
