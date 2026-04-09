package kotlin.reflect.jvm.internal.impl.renderer;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.M;
import Bh.l0;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6500b {

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.b$a */
    public static final class a implements InterfaceC6500b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52047a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC6500b
        public String a(InterfaceC2498h classifier, n renderer) {
            AbstractC6492s.i(classifier, "classifier");
            AbstractC6492s.i(renderer, "renderer");
            if (classifier instanceof l0) {
                Zh.f name = ((l0) classifier).getName();
                AbstractC6492s.h(name, "getName(...)");
                return renderer.T(name, false);
            }
            Zh.d dVarM = bi.i.m(classifier);
            AbstractC6492s.h(dVarM, "getFqName(...)");
            return renderer.S(dVarM);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.b$b, reason: collision with other inner class name */
    public static final class C1925b implements InterfaceC6500b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1925b f52048a = new C1925b();

        private C1925b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [Bh.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v1, types: [Bh.I, Bh.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [Bh.m] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC6500b
        public String a(InterfaceC2498h classifier, n renderer) {
            AbstractC6492s.i(classifier, "classifier");
            AbstractC6492s.i(renderer, "renderer");
            if (classifier instanceof l0) {
                Zh.f name = ((l0) classifier).getName();
                AbstractC6492s.h(name, "getName(...)");
                return renderer.T(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.b();
            } while (classifier instanceof InterfaceC2495e);
            return G.c(AbstractC3689v.T(arrayList));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.b$c */
    public static final class c implements InterfaceC6500b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f52049a = new c();

        private c() {
        }

        private final String b(InterfaceC2498h interfaceC2498h) {
            Zh.f name = interfaceC2498h.getName();
            AbstractC6492s.h(name, "getName(...)");
            String strB = G.b(name);
            if (interfaceC2498h instanceof l0) {
                return strB;
            }
            InterfaceC2503m interfaceC2503mB = interfaceC2498h.b();
            AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
            String strC = c(interfaceC2503mB);
            if (strC == null || AbstractC6492s.d(strC, "")) {
                return strB;
            }
            return strC + '.' + strB;
        }

        private final String c(InterfaceC2503m interfaceC2503m) {
            if (interfaceC2503m instanceof InterfaceC2495e) {
                return b((InterfaceC2498h) interfaceC2503m);
            }
            if (!(interfaceC2503m instanceof M)) {
                return null;
            }
            Zh.d dVarJ = ((M) interfaceC2503m).e().j();
            AbstractC6492s.h(dVarJ, "toUnsafe(...)");
            return G.a(dVarJ);
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.InterfaceC6500b
        public String a(InterfaceC2498h classifier, n renderer) {
            AbstractC6492s.i(classifier, "classifier");
            AbstractC6492s.i(renderer, "renderer");
            return b(classifier);
        }
    }

    String a(InterfaceC2498h interfaceC2498h, n nVar);
}
