package mi;

import Bh.G;
import Bh.L;
import Bh.N;
import Bh.Q;
import Ih.c;
import Zg.AbstractC3689v;
import com.google.ar.core.ImageMetadata;
import hi.C6048b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6489o;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import li.C6628f;
import li.C6636n;
import li.C6639q;
import li.InterfaceC6599B;
import li.InterfaceC6635m;
import li.InterfaceC6637o;
import li.InterfaceC6645w;
import li.InterfaceC6646x;
import mh.InterfaceC6835l;
import oi.n;
import th.f;

/* renamed from: mi.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6841b implements kotlin.reflect.jvm.internal.impl.builtins.b {

    /* renamed from: b, reason: collision with root package name */
    private final C6843d f54039b = new C6843d();

    /* renamed from: mi.b$a */
    /* synthetic */ class a extends AbstractC6489o implements InterfaceC6835l {
        a(Object obj) {
            super(1, obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String p02) {
            AbstractC6492s.i(p02, "p0");
            return ((C6843d) this.receiver).a(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final f getOwner() {
            return O.b(C6843d.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.b
    public N a(n storageManager, G builtInsModule, Iterable classDescriptorFactories, Ch.c platformDependentDeclarationFilter, Ch.a additionalClassPartsProvider, boolean z10) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(builtInsModule, "builtInsModule");
        AbstractC6492s.i(classDescriptorFactories, "classDescriptorFactories");
        AbstractC6492s.i(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC6492s.i(additionalClassPartsProvider, "additionalClassPartsProvider");
        return b(storageManager, builtInsModule, o.f51776H, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z10, new a(this.f54039b));
    }

    public final N b(n storageManager, G module, Set packageFqNames, Iterable classDescriptorFactories, Ch.c platformDependentDeclarationFilter, Ch.a additionalClassPartsProvider, boolean z10, InterfaceC6835l loadResource) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(module, "module");
        AbstractC6492s.i(packageFqNames, "packageFqNames");
        AbstractC6492s.i(classDescriptorFactories, "classDescriptorFactories");
        AbstractC6492s.i(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC6492s.i(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC6492s.i(loadResource, "loadResource");
        Set<Zh.c> set = packageFqNames;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(set, 10));
        for (Zh.c cVar : set) {
            String strR = C6840a.f54038r.r(cVar);
            InputStream inputStream = (InputStream) loadResource.invoke(strR);
            if (inputStream == null) {
                throw new IllegalStateException("Resource not found in classpath: " + strR);
            }
            arrayList.add(C6842c.f54040o.a(cVar, storageManager, module, inputStream, z10));
        }
        Q q10 = new Q(arrayList);
        L l10 = new L(storageManager, module);
        InterfaceC6637o.a aVar = InterfaceC6637o.a.f52738a;
        C6639q c6639q = new C6639q(q10);
        C6840a c6840a = C6840a.f54038r;
        C6628f c6628f = new C6628f(module, l10, c6840a);
        InterfaceC6599B.a aVar2 = InterfaceC6599B.a.f52618a;
        InterfaceC6645w DO_NOTHING = InterfaceC6645w.f52759a;
        AbstractC6492s.h(DO_NOTHING, "DO_NOTHING");
        C6636n c6636n = new C6636n(storageManager, module, aVar, c6639q, c6628f, q10, aVar2, DO_NOTHING, c.a.f9229a, InterfaceC6646x.a.f52760a, classDescriptorFactories, l10, InterfaceC6635m.f52714a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c6840a.e(), null, new C6048b(storageManager, AbstractC3689v.l()), null, null, ImageMetadata.SCALER_CROP_REGION, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C6842c) it.next()).L0(c6636n);
        }
        return q10;
    }
}
