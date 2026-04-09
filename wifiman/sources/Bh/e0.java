package Bh;

import fi.AbstractC5833e;
import ii.InterfaceC6164k;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2495e f1780a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f1781b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.g f1782c;

    /* renamed from: d, reason: collision with root package name */
    private final oi.i f1783d;

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ th.l[] f1779f = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(e0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: e, reason: collision with root package name */
    public static final a f1778e = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e0 a(InterfaceC2495e classDescriptor, oi.n storageManager, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefinerForOwnerModule, InterfaceC6835l scopeFactory) {
            AbstractC6492s.i(classDescriptor, "classDescriptor");
            AbstractC6492s.i(storageManager, "storageManager");
            AbstractC6492s.i(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            AbstractC6492s.i(scopeFactory, "scopeFactory");
            return new e0(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }

        private a() {
        }
    }

    public /* synthetic */ e0(InterfaceC2495e interfaceC2495e, oi.n nVar, InterfaceC6835l interfaceC6835l, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2495e, nVar, interfaceC6835l, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6164k d(e0 e0Var, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        return (InterfaceC6164k) e0Var.f1781b.invoke(gVar);
    }

    private final InterfaceC6164k e() {
        return (InterfaceC6164k) oi.m.a(this.f1783d, this, f1779f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6164k f(e0 e0Var) {
        return (InterfaceC6164k) e0Var.f1781b.invoke(e0Var.f1782c);
    }

    public final InterfaceC6164k c(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.d(AbstractC5833e.s(this.f1780a))) {
            return e();
        }
        pi.v0 v0VarK = this.f1780a.k();
        AbstractC6492s.h(v0VarK, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.e(v0VarK) ? e() : kotlinTypeRefiner.c(this.f1780a, new d0(this, kotlinTypeRefiner));
    }

    private e0(InterfaceC2495e interfaceC2495e, oi.n nVar, InterfaceC6835l interfaceC6835l, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        this.f1780a = interfaceC2495e;
        this.f1781b = interfaceC6835l;
        this.f1782c = gVar;
        this.f1783d = nVar.f(new c0(this));
    }
}
