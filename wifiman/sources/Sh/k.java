package Sh;

import Ah.k;
import Bh.L;
import Ch.a;
import Ch.c;
import Dh.C2606l;
import Jh.InterfaceC3126u;
import Sh.D;
import Zg.AbstractC3689v;
import gi.C5921c;
import hi.C6048b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.C6636n;
import li.C6648z;
import li.InterfaceC6599B;
import li.InterfaceC6635m;
import li.InterfaceC6637o;
import li.InterfaceC6645w;
import qi.C7511a;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20772b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C6636n f20773a;

    public static final class a {

        /* renamed from: Sh.k$a$a, reason: collision with other inner class name */
        public static final class C0765a {

            /* renamed from: a, reason: collision with root package name */
            private final k f20774a;

            /* renamed from: b, reason: collision with root package name */
            private final n f20775b;

            public C0765a(k deserializationComponentsForJava, n deserializedDescriptorResolver) {
                AbstractC6492s.i(deserializationComponentsForJava, "deserializationComponentsForJava");
                AbstractC6492s.i(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f20774a = deserializationComponentsForJava;
                this.f20775b = deserializedDescriptorResolver;
            }

            public final k a() {
                return this.f20774a;
            }

            public final n b() {
                return this.f20775b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0765a a(v kotlinClassFinder, v jvmBuiltInsKotlinClassFinder, InterfaceC3126u javaClassFinder, String moduleName, InterfaceC6645w errorReporter, Ph.b javaSourceElementFactory) {
            AbstractC6492s.i(kotlinClassFinder, "kotlinClassFinder");
            AbstractC6492s.i(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            AbstractC6492s.i(javaClassFinder, "javaClassFinder");
            AbstractC6492s.i(moduleName, "moduleName");
            AbstractC6492s.i(errorReporter, "errorReporter");
            AbstractC6492s.i(javaSourceElementFactory, "javaSourceElementFactory");
            oi.f fVar = new oi.f("DeserializationComponentsForJava.ModuleData");
            Ah.k kVar = new Ah.k(fVar, k.a.FROM_DEPENDENCIES);
            Zh.f fVarN = Zh.f.n('<' + moduleName + '>');
            AbstractC6492s.h(fVarN, "special(...)");
            Dh.F f10 = new Dh.F(fVarN, fVar, kVar, null, null, null, 56, null);
            kVar.E0(f10);
            kVar.M0(f10, true);
            n nVar = new n();
            Mh.o oVar = new Mh.o();
            L l10 = new L(fVar, f10);
            Mh.j jVarB = l.b(javaClassFinder, f10, fVar, l10, kotlinClassFinder, nVar, errorReporter, javaSourceElementFactory, oVar, (512 & 512) != 0 ? D.a.f20702a : null);
            k kVarA = l.a(f10, fVar, l10, jVarB, kotlinClassFinder, nVar, errorReporter, Yh.e.f25044i);
            nVar.o(kVarA);
            Kh.j EMPTY = Kh.j.f10805a;
            AbstractC6492s.h(EMPTY, "EMPTY");
            C5921c c5921c = new C5921c(jVarB, EMPTY);
            oVar.c(c5921c);
            Ah.w wVar = new Ah.w(fVar, jvmBuiltInsKotlinClassFinder, f10, l10, kVar.L0(), kVar.L0(), InterfaceC6637o.a.f52738a, kotlin.reflect.jvm.internal.impl.types.checker.p.f52164b.a(), new C6048b(fVar, AbstractC3689v.l()));
            f10.W0(f10);
            f10.O0(new C2606l(AbstractC3689v.o(c5921c.a(), wVar), "CompositeProvider@RuntimeModuleData for " + f10));
            return new C0765a(kVarA, nVar);
        }

        private a() {
        }
    }

    public k(oi.n storageManager, Bh.G moduleDescriptor, InterfaceC6637o configuration, o classDataFinder, C3508h annotationAndConstantLoader, Mh.j packageFragmentProvider, L notFoundClasses, InterfaceC6645w errorReporter, Ih.c lookupTracker, InterfaceC6635m contractDeserializer, kotlin.reflect.jvm.internal.impl.types.checker.p kotlinTypeChecker, C7511a typeAttributeTranslators) {
        Ch.c cVarL0;
        Ch.a aVarL0;
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(moduleDescriptor, "moduleDescriptor");
        AbstractC6492s.i(configuration, "configuration");
        AbstractC6492s.i(classDataFinder, "classDataFinder");
        AbstractC6492s.i(annotationAndConstantLoader, "annotationAndConstantLoader");
        AbstractC6492s.i(packageFragmentProvider, "packageFragmentProvider");
        AbstractC6492s.i(notFoundClasses, "notFoundClasses");
        AbstractC6492s.i(errorReporter, "errorReporter");
        AbstractC6492s.i(lookupTracker, "lookupTracker");
        AbstractC6492s.i(contractDeserializer, "contractDeserializer");
        AbstractC6492s.i(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC6492s.i(typeAttributeTranslators, "typeAttributeTranslators");
        kotlin.reflect.jvm.internal.impl.builtins.i iVarQ = moduleDescriptor.q();
        Ah.k kVar = iVarQ instanceof Ah.k ? (Ah.k) iVarQ : null;
        this.f20773a = new C6636n(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, InterfaceC6599B.a.f52618a, errorReporter, lookupTracker, p.f20786a, AbstractC3689v.l(), notFoundClasses, contractDeserializer, (kVar == null || (aVarL0 = kVar.L0()) == null) ? a.C0138a.f2752a : aVarL0, (kVar == null || (cVarL0 = kVar.L0()) == null) ? c.b.f2754a : cVarL0, Yh.i.f25057a.a(), kotlinTypeChecker, new C6048b(storageManager, AbstractC3689v.l()), typeAttributeTranslators.a(), C6648z.f52767a);
    }

    public final C6636n a() {
        return this.f20773a;
    }
}
