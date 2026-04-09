package kotlin.reflect.jvm.internal.impl.types.error;

import Bh.F;
import Bh.G;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2505o;
import Bh.U;
import Yg.n;
import Zg.AbstractC3689v;
import Zg.d0;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class e implements G {

    /* renamed from: a, reason: collision with root package name */
    public static final e f52179a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final Zh.f f52180b;

    /* renamed from: c, reason: collision with root package name */
    private static final List f52181c;

    /* renamed from: d, reason: collision with root package name */
    private static final List f52182d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set f52183e;

    /* renamed from: f, reason: collision with root package name */
    private static final Yg.m f52184f;

    static {
        Zh.f fVarN = Zh.f.n(b.ERROR_MODULE.getDebugText());
        AbstractC6492s.h(fVarN, "special(...)");
        f52180b = fVarN;
        f52181c = AbstractC3689v.l();
        f52182d = AbstractC3689v.l();
        f52183e = d0.e();
        f52184f = n.b(d.f52178a);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.builtins.g i0() {
        return kotlin.reflect.jvm.internal.impl.builtins.g.f51736h.a();
    }

    public Zh.f B0() {
        return f52180b;
    }

    @Override // Bh.G
    public boolean K(G targetModule) {
        AbstractC6492s.i(targetModule, "targetModule");
        return false;
    }

    @Override // Bh.InterfaceC2503m
    public InterfaceC2503m a() {
        return this;
    }

    @Override // Bh.InterfaceC2503m
    public InterfaceC2503m b() {
        return null;
    }

    @Override // Bh.G
    public Object b0(F capability) {
        AbstractC6492s.i(capability, "capability");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b();
    }

    @Override // Bh.I
    public Zh.f getName() {
        return B0();
    }

    @Override // Bh.G
    public kotlin.reflect.jvm.internal.impl.builtins.i q() {
        return (kotlin.reflect.jvm.internal.impl.builtins.i) f52184f.getValue();
    }

    @Override // Bh.G
    public List r0() {
        return f52182d;
    }

    @Override // Bh.G
    public Collection s(Zh.c fqName, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(nameFilter, "nameFilter");
        return AbstractC3689v.l();
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o visitor, Object obj) {
        AbstractC6492s.i(visitor, "visitor");
        return null;
    }

    @Override // Bh.G
    public U y(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }
}
