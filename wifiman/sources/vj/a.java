package vj;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.q;
import rj.InterfaceC7733m2;

/* loaded from: classes3.dex */
public class a implements InterfaceC7733m2, uj.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7733m2 f63634a;

    /* renamed from: b, reason: collision with root package name */
    private final DI.e f63635b;

    /* renamed from: c, reason: collision with root package name */
    private final int f63636c;

    public a(InterfaceC7733m2 directDI, DI.e key, int i10) {
        AbstractC6492s.i(directDI, "directDI");
        AbstractC6492s.i(key, "key");
        this.f63634a = directDI;
        this.f63635b = key;
        this.f63636c = i10;
    }

    @Override // uj.b
    public uj.b a() {
        return new a(g().h(uj.f.f63189b), this.f63635b, this.f63636c);
    }

    @Override // rj.InterfaceC7747o2
    public Object b(q argType, q type, Object obj, Object obj2) {
        AbstractC6492s.i(argType, "argType");
        AbstractC6492s.i(type, "type");
        return this.f63634a.b(argType, type, obj, obj2);
    }

    @Override // rj.InterfaceC7747o2
    public InterfaceC6835l c(q argType, q type, Object obj) {
        AbstractC6492s.i(argType, "argType");
        AbstractC6492s.i(type, "type");
        return this.f63634a.c(argType, type, obj);
    }

    @Override // rj.InterfaceC7747o2
    public DI d() {
        return this.f63634a.d();
    }

    @Override // rj.InterfaceC7747o2
    public Object e(q type, Object obj) {
        AbstractC6492s.i(type, "type");
        return this.f63634a.e(type, obj);
    }

    @Override // rj.InterfaceC7747o2
    public DI f() {
        return this.f63634a.f();
    }

    @Override // rj.InterfaceC7740n2
    public InterfaceC7733m2 g() {
        return this.f63634a;
    }

    @Override // uj.x
    public Object getContext() {
        Object value = g().d().I().getValue();
        AbstractC6492s.g(value, "null cannot be cast to non-null type C of org.kodein.di.internal.BindingDIImpl");
        return value;
    }

    @Override // rj.InterfaceC7747o2
    public InterfaceC7733m2 h(org.kodein.di.f context) {
        AbstractC6492s.i(context, "context");
        return this.f63634a.h(context);
    }
}
