package Ch;

import Bh.InterfaceC2495e;
import Bh.f0;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2753a = new a();

        private a() {
        }

        @Override // Ch.c
        public boolean b(InterfaceC2495e classDescriptor, f0 functionDescriptor) {
            AbstractC6492s.i(classDescriptor, "classDescriptor");
            AbstractC6492s.i(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2754a = new b();

        private b() {
        }

        @Override // Ch.c
        public boolean b(InterfaceC2495e classDescriptor, f0 functionDescriptor) {
            AbstractC6492s.i(classDescriptor, "classDescriptor");
            AbstractC6492s.i(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().P(d.a());
        }
    }

    boolean b(InterfaceC2495e interfaceC2495e, f0 f0Var);
}
