package uj;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import rj.InterfaceC7733m2;

/* loaded from: classes4.dex */
public final class k implements j, InterfaceC7733m2, x {

    /* renamed from: a, reason: collision with root package name */
    private final b f63220a;

    public k(b _di) {
        AbstractC6492s.i(_di, "_di");
        this.f63220a = _di;
    }

    @Override // rj.InterfaceC7747o2
    public Object b(org.kodein.type.q argType, org.kodein.type.q type, Object obj, Object obj2) {
        AbstractC6492s.i(argType, "argType");
        AbstractC6492s.i(type, "type");
        return this.f63220a.b(argType, type, obj, obj2);
    }

    @Override // rj.InterfaceC7747o2
    public InterfaceC6835l c(org.kodein.type.q argType, org.kodein.type.q type, Object obj) {
        AbstractC6492s.i(argType, "argType");
        AbstractC6492s.i(type, "type");
        return this.f63220a.c(argType, type, obj);
    }

    @Override // rj.InterfaceC7747o2
    public DI d() {
        return this.f63220a.d();
    }

    @Override // rj.InterfaceC7747o2
    public Object e(org.kodein.type.q type, Object obj) {
        AbstractC6492s.i(type, "type");
        return this.f63220a.e(type, obj);
    }

    @Override // rj.InterfaceC7747o2
    public DI f() {
        return this.f63220a.f();
    }

    @Override // rj.InterfaceC7740n2
    public InterfaceC7733m2 g() {
        return this.f63220a.g();
    }

    @Override // rj.InterfaceC7747o2
    public InterfaceC7733m2 h(org.kodein.di.f context) {
        AbstractC6492s.i(context, "context");
        return this.f63220a.h(context);
    }
}
