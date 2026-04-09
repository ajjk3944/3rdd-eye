package kotlin.reflect.jvm.internal.impl.types.checker;

import Bh.G;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import ii.InterfaceC6164k;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import pi.S;
import pi.v0;
import ri.InterfaceC7618i;

/* loaded from: classes4.dex */
public abstract class g extends pi.r {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52146a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public InterfaceC2495e b(Zh.b classId) {
            AbstractC6492s.i(classId, "classId");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public InterfaceC6164k c(InterfaceC2495e classDescriptor, InterfaceC6824a compute) {
            AbstractC6492s.i(classDescriptor, "classDescriptor");
            AbstractC6492s.i(compute, "compute");
            return (InterfaceC6164k) compute.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public boolean d(G moduleDescriptor) {
            AbstractC6492s.i(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public boolean e(v0 typeConstructor) {
            AbstractC6492s.i(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public Collection g(InterfaceC2495e classDescriptor) {
            AbstractC6492s.i(classDescriptor, "classDescriptor");
            Collection collectionA = classDescriptor.k().a();
            AbstractC6492s.h(collectionA, "getSupertypes(...)");
            return collectionA;
        }

        @Override // pi.r
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public S a(InterfaceC7618i type) {
            AbstractC6492s.i(type, "type");
            return (S) type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC2495e f(InterfaceC2503m descriptor) {
            AbstractC6492s.i(descriptor, "descriptor");
            return null;
        }
    }

    public abstract InterfaceC2495e b(Zh.b bVar);

    public abstract InterfaceC6164k c(InterfaceC2495e interfaceC2495e, InterfaceC6824a interfaceC6824a);

    public abstract boolean d(G g10);

    public abstract boolean e(v0 v0Var);

    public abstract InterfaceC2498h f(InterfaceC2503m interfaceC2503m);

    public abstract Collection g(InterfaceC2495e interfaceC2495e);

    /* renamed from: h */
    public abstract S a(InterfaceC7618i interfaceC7618i);
}
