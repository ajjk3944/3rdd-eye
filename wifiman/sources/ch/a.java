package Ch;

import Bh.InterfaceC2495e;
import Zg.AbstractC3689v;
import Zh.f;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: Ch.a$a, reason: collision with other inner class name */
    public static final class C0138a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0138a f2752a = new C0138a();

        private C0138a() {
        }

        @Override // Ch.a
        public Collection a(InterfaceC2495e classDescriptor) {
            AbstractC6492s.i(classDescriptor, "classDescriptor");
            return AbstractC3689v.l();
        }

        @Override // Ch.a
        public Collection c(InterfaceC2495e classDescriptor) {
            AbstractC6492s.i(classDescriptor, "classDescriptor");
            return AbstractC3689v.l();
        }

        @Override // Ch.a
        public Collection d(f name, InterfaceC2495e classDescriptor) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(classDescriptor, "classDescriptor");
            return AbstractC3689v.l();
        }

        @Override // Ch.a
        public Collection e(InterfaceC2495e classDescriptor) {
            AbstractC6492s.i(classDescriptor, "classDescriptor");
            return AbstractC3689v.l();
        }
    }

    Collection a(InterfaceC2495e interfaceC2495e);

    Collection c(InterfaceC2495e interfaceC2495e);

    Collection d(f fVar, InterfaceC2495e interfaceC2495e);

    Collection e(InterfaceC2495e interfaceC2495e);
}
