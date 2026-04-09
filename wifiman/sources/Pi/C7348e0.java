package pi;

import ii.InterfaceC6164k;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: pi.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C7348e0 extends AbstractC7346d0 {

    /* renamed from: b, reason: collision with root package name */
    private final v0 f58115b;

    /* renamed from: c, reason: collision with root package name */
    private final List f58116c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f58117d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6164k f58118e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6835l f58119f;

    public C7348e0(v0 constructor, List arguments, boolean z10, InterfaceC6164k memberScope, InterfaceC6835l refinedTypeFactory) {
        AbstractC6492s.i(constructor, "constructor");
        AbstractC6492s.i(arguments, "arguments");
        AbstractC6492s.i(memberScope, "memberScope");
        AbstractC6492s.i(refinedTypeFactory, "refinedTypeFactory");
        this.f58115b = constructor;
        this.f58116c = arguments;
        this.f58117d = z10;
        this.f58118e = memberScope;
        this.f58119f = refinedTypeFactory;
        if (!(r() instanceof kotlin.reflect.jvm.internal.impl.types.error.g) || (r() instanceof kotlin.reflect.jvm.internal.impl.types.error.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + r() + '\n' + N0());
    }

    @Override // pi.S
    public List L0() {
        return this.f58116c;
    }

    @Override // pi.S
    public r0 M0() {
        return r0.f58162b.j();
    }

    @Override // pi.S
    public v0 N0() {
        return this.f58115b;
    }

    @Override // pi.S
    public boolean O0() {
        return this.f58117d;
    }

    @Override // pi.M0
    /* renamed from: U0 */
    public AbstractC7346d0 R0(boolean z10) {
        return z10 == O0() ? this : z10 ? new C7342b0(this) : new Z(this);
    }

    @Override // pi.M0
    /* renamed from: V0 */
    public AbstractC7346d0 T0(r0 newAttributes) {
        AbstractC6492s.i(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new C7350f0(this, newAttributes);
    }

    @Override // pi.M0
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 X0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7346d0 abstractC7346d0 = (AbstractC7346d0) this.f58119f.invoke(kotlinTypeRefiner);
        return abstractC7346d0 == null ? this : abstractC7346d0;
    }

    @Override // pi.S
    public InterfaceC6164k r() {
        return this.f58118e;
    }
}
