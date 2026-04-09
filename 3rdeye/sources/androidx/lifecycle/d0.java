package androidx.lifecycle;

import androidx.lifecycle.b0;
import b9.InterfaceC2000g;
import j1.AbstractC5165a;
import p9.InterfaceC5480a;

/* compiled from: ViewModelLazy.kt */
/* loaded from: classes.dex */
public final class d0<VM extends b0> implements InterfaceC2000g<VM> {

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.e f16135b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.internal.m f16136c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.jvm.internal.m f16137d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.jvm.internal.m f16138e;

    /* renamed from: f, reason: collision with root package name */
    public VM f16139f;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(kotlin.jvm.internal.e eVar, InterfaceC5480a interfaceC5480a, InterfaceC5480a interfaceC5480a2, InterfaceC5480a interfaceC5480a3) {
        this.f16135b = eVar;
        this.f16136c = (kotlin.jvm.internal.m) interfaceC5480a;
        this.f16137d = (kotlin.jvm.internal.m) interfaceC5480a2;
        this.f16138e = (kotlin.jvm.internal.m) interfaceC5480a3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.m, p9.a] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.m, p9.a] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.m, p9.a] */
    @Override // b9.InterfaceC2000g
    public final Object getValue() {
        VM vm = this.f16139f;
        if (vm != null) {
            return vm;
        }
        i0 store = (i0) this.f16136c.invoke();
        f0 factory = (f0) this.f16137d.invoke();
        AbstractC5165a extras = (AbstractC5165a) this.f16138e.invoke();
        kotlin.jvm.internal.l.f(store, "store");
        kotlin.jvm.internal.l.f(factory, "factory");
        kotlin.jvm.internal.l.f(extras, "extras");
        N5.c cVar = new N5.c(store, factory, extras);
        kotlin.jvm.internal.e eVar = this.f16135b;
        String strA = eVar.a();
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        VM vm2 = (VM) cVar.f(eVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strA));
        this.f16139f = vm2;
        return vm2;
    }
}
