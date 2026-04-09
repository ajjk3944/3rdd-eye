package kotlin.reflect.jvm.internal.impl.types.error;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.D;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.b0;
import Bh.f0;
import Bh.g0;
import Dh.AbstractC2612s;
import Dh.O;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.E0;
import pi.S;

/* loaded from: classes4.dex */
public final class c extends O {

    public static final class a implements InterfaceC2515z.a {
        a() {
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a b() {
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a c(b0 b0Var) {
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a d(List parameters) {
            AbstractC6492s.i(parameters, "parameters");
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a e(b0 b0Var) {
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a f(AbstractC2510u visibility) {
            AbstractC6492s.i(visibility, "visibility");
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a g(S type) {
            AbstractC6492s.i(type, "type");
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a h(D modality) {
            AbstractC6492s.i(modality, "modality");
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a i() {
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a j(InterfaceC2492b interfaceC2492b) {
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a k(InterfaceC2491a.InterfaceC0071a userDataKey, Object obj) {
            AbstractC6492s.i(userDataKey, "userDataKey");
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a l() {
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a m(boolean z10) {
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a n(Zh.f name) {
            AbstractC6492s.i(name, "name");
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a o(List parameters) {
            AbstractC6492s.i(parameters, "parameters");
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a p(InterfaceC2503m owner) {
            AbstractC6492s.i(owner, "owner");
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a q() {
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a r(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h additionalAnnotations) {
            AbstractC6492s.i(additionalAnnotations, "additionalAnnotations");
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a s(InterfaceC2492b.a kind) {
            AbstractC6492s.i(kind, "kind");
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a t(E0 substitution) {
            AbstractC6492s.i(substitution, "substitution");
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a u() {
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public f0 a() {
            return c.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC2495e containingDeclaration) {
        super(containingDeclaration, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), Zh.f.n(b.ERROR_FUNCTION.getDebugText()), InterfaceC2492b.a.DECLARATION, g0.f1784a);
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        R0(null, null, AbstractC3689v.l(), AbstractC3689v.l(), AbstractC3689v.l(), l.d(k.RETURN_TYPE_FOR_FUNCTION, new String[0]), D.OPEN, AbstractC2509t.f1796e);
    }

    @Override // Dh.O, Dh.AbstractC2612s
    protected AbstractC2612s L0(InterfaceC2503m newOwner, InterfaceC2515z interfaceC2515z, InterfaceC2492b.a kind, Zh.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, g0 source) {
        AbstractC6492s.i(newOwner, "newOwner");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(source, "source");
        return this;
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2491a
    public Object e0(InterfaceC2491a.InterfaceC0071a key) {
        AbstractC6492s.i(key, "key");
        return null;
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2515z
    public boolean isSuspend() {
        return false;
    }

    @Override // Dh.O, Bh.InterfaceC2492b
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public f0 c0(InterfaceC2503m newOwner, D modality, AbstractC2510u visibility, InterfaceC2492b.a kind, boolean z10) {
        AbstractC6492s.i(newOwner, "newOwner");
        AbstractC6492s.i(modality, "modality");
        AbstractC6492s.i(visibility, "visibility");
        AbstractC6492s.i(kind, "kind");
        return this;
    }

    @Override // Dh.O, Dh.AbstractC2612s, Bh.InterfaceC2515z
    public InterfaceC2515z.a v() {
        return new a();
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2492b
    public void x0(Collection overriddenDescriptors) {
        AbstractC6492s.i(overriddenDescriptors, "overriddenDescriptors");
    }
}
