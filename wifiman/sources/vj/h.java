package vj;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.di.e;
import org.kodein.type.q;
import rj.InterfaceC7733m2;

/* loaded from: classes3.dex */
public abstract class h implements InterfaceC7733m2 {

    /* renamed from: a, reason: collision with root package name */
    private final org.kodein.di.e f63692a;

    /* renamed from: b, reason: collision with root package name */
    private final org.kodein.di.f f63693b;

    protected h(org.kodein.di.e container, org.kodein.di.f context) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(context, "context");
        this.f63692a = container;
        this.f63693b = context;
    }

    @Override // rj.InterfaceC7747o2
    public Object b(q argType, q type, Object obj, Object obj2) {
        AbstractC6492s.i(argType, "argType");
        AbstractC6492s.i(type, "type");
        org.kodein.di.e eVarI = i();
        q type2 = this.f63693b.getType();
        AbstractC6492s.g(type2, "null cannot be cast to non-null type org.kodein.type.TypeToken<in kotlin.Any>");
        return e.b.a(eVarI, new DI.e(type2, argType, type, obj), this.f63693b.getValue(), 0, 4, null).invoke(obj2);
    }

    @Override // rj.InterfaceC7747o2
    public InterfaceC6835l c(q argType, q type, Object obj) {
        AbstractC6492s.i(argType, "argType");
        AbstractC6492s.i(type, "type");
        org.kodein.di.e eVarI = i();
        q type2 = this.f63693b.getType();
        AbstractC6492s.g(type2, "null cannot be cast to non-null type org.kodein.type.TypeToken<in kotlin.Any>");
        return e.b.a(eVarI, new DI.e(type2, argType, type, obj), this.f63693b.getValue(), 0, 4, null);
    }

    @Override // rj.InterfaceC7747o2
    public DI d() {
        return InterfaceC7733m2.a.a(this);
    }

    @Override // rj.InterfaceC7747o2
    public Object e(q type, Object obj) {
        AbstractC6492s.i(type, "type");
        org.kodein.di.e eVarI = i();
        q type2 = this.f63693b.getType();
        AbstractC6492s.g(type2, "null cannot be cast to non-null type org.kodein.type.TypeToken<in kotlin.Any>");
        return e.b.c(eVarI, new DI.e(type2, q.f56966a.b(), type, obj), this.f63693b.getValue(), 0, 4, null).invoke();
    }

    @Override // rj.InterfaceC7747o2
    public DI f() {
        org.kodein.di.e eVarI = i();
        AbstractC6492s.g(eVarI, "null cannot be cast to non-null type org.kodein.di.internal.DIContainerImpl");
        return org.kodein.di.d.d(new e((d) eVarI), this.f63693b, null, 2, null);
    }

    @Override // rj.InterfaceC7740n2
    public InterfaceC7733m2 g() {
        return this;
    }

    @Override // rj.InterfaceC7747o2
    public InterfaceC7733m2 h(org.kodein.di.f context) {
        AbstractC6492s.i(context, "context");
        return new i(i(), context);
    }

    public org.kodein.di.e i() {
        return this.f63692a;
    }
}
