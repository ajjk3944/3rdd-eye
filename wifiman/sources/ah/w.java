package Ah;

import Bh.G;
import Bh.L;
import Ih.c;
import Zg.AbstractC3689v;
import hi.InterfaceC6047a;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.AbstractC6625c;
import li.AbstractC6640r;
import li.C6628f;
import li.C6636n;
import li.C6639q;
import li.C6648z;
import li.InterfaceC6599B;
import li.InterfaceC6635m;
import li.InterfaceC6637o;
import li.InterfaceC6645w;
import li.InterfaceC6646x;
import mi.C6840a;
import mi.C6842c;
import zh.C8762a;

/* loaded from: classes4.dex */
public final class w extends AbstractC6625c {

    /* renamed from: f, reason: collision with root package name */
    public static final a f840f = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(oi.n storageManager, Sh.v finder, G moduleDescriptor, L notFoundClasses, Ch.a additionalClassPartsProvider, Ch.c platformDependentDeclarationFilter, InterfaceC6637o deserializationConfiguration, kotlin.reflect.jvm.internal.impl.types.checker.p kotlinTypeChecker, InterfaceC6047a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(finder, "finder");
        AbstractC6492s.i(moduleDescriptor, "moduleDescriptor");
        AbstractC6492s.i(notFoundClasses, "notFoundClasses");
        AbstractC6492s.i(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC6492s.i(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC6492s.i(deserializationConfiguration, "deserializationConfiguration");
        AbstractC6492s.i(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC6492s.i(samConversionResolver, "samConversionResolver");
        C6639q c6639q = new C6639q(this);
        C6840a c6840a = C6840a.f54038r;
        C6628f c6628f = new C6628f(moduleDescriptor, notFoundClasses, c6840a);
        InterfaceC6599B.a aVar = InterfaceC6599B.a.f52618a;
        InterfaceC6645w DO_NOTHING = InterfaceC6645w.f52759a;
        AbstractC6492s.h(DO_NOTHING, "DO_NOTHING");
        k(new C6636n(storageManager, moduleDescriptor, deserializationConfiguration, c6639q, c6628f, this, aVar, DO_NOTHING, c.a.f9229a, InterfaceC6646x.a.f52760a, AbstractC3689v.o(new C8762a(storageManager, moduleDescriptor), new g(storageManager, moduleDescriptor, null, 4, null)), notFoundClasses, InterfaceC6635m.f52714a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c6840a.e(), kotlinTypeChecker, samConversionResolver, null, C6648z.f52767a, 262144, null));
    }

    @Override // li.AbstractC6625c
    protected AbstractC6640r e(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        InputStream inputStreamC = h().c(fqName);
        if (inputStreamC != null) {
            return C6842c.f54040o.a(fqName, j(), i(), inputStreamC, false);
        }
        return null;
    }
}
